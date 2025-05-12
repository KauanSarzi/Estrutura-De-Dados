import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArvoreBinariaBusca abb = new ArvoreBinariaBusca();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n=== MENU Árvore Binária de Busca ===");
            System.out.println("1 - Inserir palavra");
            System.out.println("2 - Buscar palavra exata");
            System.out.println("3 - Buscar por parte da palavra");
            System.out.println("4 - Exibir ordem alfabética reversa");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                // Lê escolha e converte pra inteiro
                opcao = Integer.parseInt(sc.nextLine().trim());

                switch (opcao) {
                    case 1:
                        // Inserção
                        System.out.print("Digite a palavra a inserir: ");
                        String toInsert = sc.nextLine().trim().toUpperCase();
                        abb.inserir(toInsert);
                        System.out.println("Palavra inserida/atualizada com sucesso!");
                        break;

                    case 2:
                        // Busca exata
                        System.out.print("Digite a palavra para busca exata: ");
                        String chave = sc.nextLine().trim().toUpperCase();
                        No resultado = abb.buscar(chave);
                        if (resultado != null) {
                            System.out.printf(
                                "→ '%s' ocorreu %d vezes.%n",
                                resultado.dado.getTexto(),
                                resultado.dado.getOcorrencias()
                            );
                        } else {
                            System.out.println("→ Palavra não encontrada.");
                        }
                        break;

                    case 3:
                        // Busca por parte
                        System.out.print("Digite o fragmento para busca: ");
                        String parte = sc.nextLine().trim().toLowerCase();
                        System.out.println("Resultados da busca por parte:");
                        abb.buscarPorParte(parte);
                        break;

                    case 4:
                        // Exibir ordem reversa
                        System.out.println("Árvore (ordem alfabética reversa):");
                        abb.exibirOrdemReversa();
                        break;

                    case 5:
                        System.out.println("Saindo... até a próxima!");
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida: digite um número de 1 a 5.");
            } catch (Exception e) {
                // Captura qualquer outro erro inesperado
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }

        } while (opcao != 5);

        sc.close();
    }
}
