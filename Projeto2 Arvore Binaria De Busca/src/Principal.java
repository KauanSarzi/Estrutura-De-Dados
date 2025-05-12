// Classe principal com menu interativo e operações conforme enunciado
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArvoreBinariaBusca abb = new ArvoreBinariaBusca();
        Scanner sc = new Scanner(System.in);
        int opc;
        while (true) {
            try {
                System.out.println("\n--- MENU ---");
                System.out.println("1- Carregar o texto");
                System.out.println("2- Estatísticas");
                System.out.println("3- Busca por palavra");
                System.out.println("4- Busca por parte da palavra");
                System.out.println("5- Exibição do texto");
                System.out.println("6- Função inventada pelo grupo");
                System.out.println("7- Encerrar");
                System.out.print("Escolha: ");
                opc = sc.nextInt(); sc.nextLine();

                switch (opc) {
                    case 1:
                        System.out.print("Caminho do arquivo .txt: ");
                        String caminho = sc.nextLine();
                        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
                            String linha;
                            while ((linha = br.readLine()) != null) {
                                abb.incrementaLinhas();
                                String[] palavras = linha
                                    .replaceAll("[\\p{Punct}0-9]", " ")
                                    .toLowerCase()
                                    .split("\\s+");
                                for (String w : palavras) {
                                    if (!w.isBlank()) abb.inserir(w);
                                }
                            }
                            System.out.println("TEXTO CARREGADO");
                        } catch (IOException e) {
                            System.err.println("Erro ao ler arquivo: " + e.getMessage());
                        }
                        break;

                    case 2:
                        System.out.println("Total de linhas: " + abb.getTotalLinhas());
                        System.out.println("Total de palavras: " + abb.getTotalPalavras());
                        System.out.println("Total de palavras distintas: " + abb.getTotalDistintas());
                        System.out.printf("Média de caracteres por palavra: %.2f\n", abb.mediaCaracteres());
                        System.out.printf("Taxa de redundância: %.2f%%\n", abb.taxaRedundancia());
                        break;

                    case 3:
                        System.out.print("Digite a palavra: ");
                        String busca = sc.nextLine().toLowerCase();
                        Palavra res = abb.buscar(busca);
                        if (res != null) {
                            System.out.printf("'%s' encontrada: %d ocorrências\n", busca, res.getOcorrencias());
                        } else {
                            System.out.println("Palavra não encontrada.");
                        }
                        break;

                    case 4:
                        System.out.print("Digite parte da palavra: ");
                        String parte = sc.nextLine().toLowerCase();
                        List<Palavra> encontradas = abb.buscaPorParte(parte);
                        if (encontradas.isEmpty()) {
                            System.out.println("Nenhuma palavra contém essa sequência.");
                        } else {
                            encontradas.forEach(pw -> System.out.printf("%s -> %d oc., %d chars\n",
                                pw.getTexto(), pw.getOcorrencias(), pw.getNumeroCaracteres()));
                        }
                        break;

                    case 5:
                        System.out.println("=== Árvore (ordem alfabética reversa) ===");
                        abb.emOrdemReversa();
                        break;

                    case 6:
                        abb.funcaoInventada();
                        break;

                    case 7:
                        System.out.println("Encerrando...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número de 1 a 7.");
                sc.nextLine(); // limpa entrada inválida
            }
        }
    }
}

