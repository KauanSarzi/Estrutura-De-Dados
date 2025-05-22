import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AplicacaoABB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
        boolean continua = true;
        int opcao;
        int totalLinhas = 0;
        int totalPalavras = 0;

        do {
            System.out.println(" MENU ");
            System.out.println("1 - Carregar texto");
            System.out.println("2 - Estatísticas");
            System.out.println("3 - Busca por palavra (exata)");
            System.out.println("4 - Busca por parte da palavra");
            System.out.println("5 - Exibir ABB (ordem reversa)");
            System.out.println("6 - Frequência de letras");
            System.out.println("7 - Sair");
            System.out.print("Opçao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Caminho do arquivo TXT: ");
                    String caminho = scanner.nextLine();
                    try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
                        arvore = new ArvoreBinariaBusca();
                        totalLinhas = 0;
                        totalPalavras = 0;
                        String linha;
                        while ((linha = br.readLine()) != null) {
                            totalLinhas++;
                            String[] tokens = linha.toLowerCase().split("\\s+");
                            for (String tok : tokens) {
                                if (tok.isEmpty()) continue;
                                Palavra p = arvore.buscar(tok);
                                if (p != null) {
                                    p.incrementarOcorrencias();
                                } else {
                                    arvore.inserir(new Palavra(tok));
                                }
                                totalPalavras++;
                            }
                        }
                        System.out.println("texto carregado com sucesso.");
                    } catch (IOException e) {
                        System.out.println("erro ao ler arquivo: " + e.getMessage());
                    }
                    break;

                case 2:
                    if (totalPalavras == 0) {
                        System.out.println("Nenhum texto carregado.");
                    } else {
                        int distintas = arvore.contarDistintas();
                        int somaChars = arvore.somaCaracteresTotal();
                        double media = (double) somaChars / totalPalavras;
                        double taxa = (1 - ((double) distintas / totalPalavras)) * 100;
                        System.out.printf("Linhas: %d, Palavras: %d, Distintas: %d%n",
                                          totalLinhas, totalPalavras, distintas);
                        System.out.printf("Média charac/palavra: %.2f, Redundância: %.2f%%%n",
                                          media, taxa);
                    }
                    break;

                case 3:
                    if (totalPalavras == 0) {
                        System.out.println("Nenhum texto carregado.");
                    } else {
                        System.out.print("Palavra exata: ");
                        String exata = scanner.nextLine().toLowerCase();
                        Palavra p = arvore.buscar(exata);
                        System.out.println(p != null
                                           ? "Ocorrencias: " + p.getOcorrencias()
                                           : "Não encontrada");
                    }
                    break;

                case 4:
                    if (totalPalavras == 0) {
                        System.out.println("Nenhum texto carregado.");
                    } else {
                        System.out.print("Parte da palavra: ");
                        String parte = scanner.nextLine().toLowerCase();
                        arvore.buscarPorParte(parte);
                    }
                    break;

                case 5:
                    if (totalPalavras == 0) {
                        System.out.println("Nenhum texto carregado");
                    } else {
                        arvore.exibirOrdemReversa();
                    }
                    break;

                case 6:
                    if (totalPalavras == 0) {
                        System.out.println("Nenhum texto carregado");
                    } else {
                        int[] freq = new int[26];
                        arvore.contarLetras(freq);
                        for (int i = 0; i < 26; i++) {
                            System.out.printf("%c: %d%n", (char)('a' + i), freq[i]);
                        }
                    }
                    break;

                case 7:
                    continua = false;
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (continua);

        scanner.close();
    }
}
