import java.util.Scanner;

public class AplicacaoPilhaGenerica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha<Integer> minhaPilha = new Pilha<>(10);
        Integer valor;
        int opcao;

        do {
            System.out.println("\n====== MENU PILHA ======");
            System.out.println("1 - Empilhar");
            System.out.println("2 - Desempilhar");
            System.out.println("3 - Exibir pilha");
            System.out.println("4 - Ver topo");
            System.out.println("5 - Limpar pilha");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            try {
                switch (opcao) {
                    case 1:
                        System.out.print("Digite um valor para empilhar: ");
                        valor = sc.nextInt();
                        minhaPilha.empilhar(valor);
                        System.out.println("Valor empilhado com sucesso!");
                        break;
                    case 2:
                        valor = minhaPilha.desempilhar();
                        System.out.println("Valor desempilhado: " + valor);
                        break;
                    case 3:
                        System.out.println("Elementos na pilha (do topo para base):");
                        System.out.println(minhaPilha.elementos());
                        break;
                    case 4:
                        System.out.println("Topo da pilha: " + minhaPilha.topo());
                        break;
                    case 5:
                        minhaPilha.limpar();
                        System.out.println("Pilha limpa com sucesso.");
                        break;
                    case 6:
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcao != 6);

        sc.close();
    }
}
