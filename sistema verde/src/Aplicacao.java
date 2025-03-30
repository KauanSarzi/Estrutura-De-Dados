import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente[] clientes = new Cliente[10];
        int totalClientes = 0;
        while (true) {
            System.out.println("\nSISTEMA DE LOCAÇÃO DE BICICLETAS");
            System.out.println("1 - Cadastrar novo cliente");
            System.out.println("2 - Locar bicicleta");
            System.out.println("3 - Devolver bicicleta");
            System.out.println("4 - Remover cliente");
            System.out.println("5 - Exibir dados do cliente");
            System.out.println("6 - Listar clientes em ordem decrescente de gastos");
            System.out.println("7 - Exibir cliente mais rentável");
            System.out.println("8 - Encerrar");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();
    
            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    Cliente novo = new Cliente(nome, cpf);
                    cadastrar(novo, clientes, totalClientes);
                    totalClientes++; //atualiza aq pois é um void
                    break;
                case 2:
                    System.out.print("CPF do cliente: ");
                    cpf = sc.nextLine();
                    if (locar(cpf, clientes)) System.out.println("Bicicleta alugada!");
                    else System.out.println("Não foi possível alugar.");
                    break;
                case 3:
                    System.out.print("CPF do cliente: ");
                    cpf = sc.nextLine();
                    if (devolver(cpf, clientes)) System.out.println("Bicicleta devolvida!");
                    else System.out.println("Erro na devolução.");
                    break;
                case 4:
                    System.out.print("CPF do cliente: ");
                    cpf = sc.nextLine();
                    totalClientes = remover(cpf, clientes, totalClientes);
                    break;
                case 5:
                    System.out.print("CPF do cliente: ");
                    cpf = sc.nextLine();
                    exibirCliente(cpf, clientes);
                    break;
                case 6:
                    listarClientes(clientes);
                    break;
                case 7:
                    Cliente rentavel = clienteMaisRentavel(clientes);
                    if (rentavel != null) System.out.println("Cliente mais rentável:\n" + rentavel);
                    else System.out.println("Nenhum cliente encontrado.");
                    break;
                case 8:
                    System.out.println("PROJETO FEITO POR:");
                    System.out.println("NOME 1 - RA");
                    System.out.println("NOME 2 - RA");
                    System.out.println("NOME 3 - RA");
                    System.out.println("Vídeo: https://www.youtube.com/SEU-LINK-AQUI");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

                       ///METODOS STATICS ///
                    

     //metodo cadastrar, atualização sera feita no switch case
    public static void cadastrar(Cliente c, Cliente[] clientes, int totalClientes ) { 
        if (totalClientes < 10) {
            clientes[totalClientes] = c; // adciona a lista o cliente cadastrado
            System.out.println("Cliente cadastrado com sucesso");
        } else {
            System.out.println("Máximo de clientes atingidos");
        }
    }  



    public static boolean locar(String cpf, Cliente[] clientes){ 

        //verifica se o cliente esta cadastrado
        for(Cliente c : clientes){
            if(c != null && c.getCpf().equals(cpf)){  // se o cliente tem o cpf procurado
                if(c.isBicicletaAlugada()) return false; // se o cliente ja esta com uma biciclenta alugada ele retorna fals, pq nao pode alugar outra 
                c.setTotalGasto(c.getTotalGasto() + 5.0);
                c.setQuantidadeLocacoes(c.getQuantidadeLocacoes() + 1);
                c.setBicicletaAlugada(true);
                return true; // alugamento feito
            }
        }
        return false; //para caso o o cpf do cliente n ser encontrado
    }



    public static boolean devolver (String cpf, Cliente[] clientes){ 

        //verifica se o cliente esta cadastrado
        for(Cliente c : clientes){
            if(c != null && c.getCpf().equals(cpf)){  //se o cliente tem o cpf procurado
                if(!c.isBicicletaAlugada()) 
                return false;
                c.setBicicletaAlugada(false);
                return true;
            }
        }
        return false;
    }
	

    public static int remover(String cpf, Cliente[] clientes, int totalClientes) {
        for (int i = 0; i < totalClientes; i++) {
            if (clientes[i] != null && clientes[i].getCpf().equals(cpf)) { //ve se o vet clientes na posição i nao é null e se o cpf do cliente é igual
                for (int j = i; j < totalClientes - 1; j++) {  // se encontrar o cliente que vai ser removido esse for deslocara os outros elemrntoos para esquerda. conceito de remoção de elementos que aprendemos em lista linear
                    clientes[j] = clientes[j + 1]; 
                }
                clientes[totalClientes - 1] = null;
                System.out.println("Cliente removido.");
                return totalClientes - 1;
            }
        }
        System.out.println("Cliente não encontrado."); // prevençao para se percorrer todo o for e nao encontrar o cpf 
        return totalClientes;
    }


    public static void exibirCliente(String cpf, Cliente[] clientes) {
        for (Cliente c : clientes) {  // variavel c representa o cliente atual
            if (c != null && c.getCpf().equals(cpf)) {
                System.out.println(c);
                return; //apenas para parar ao encontrar o cliene

            }
        }
        System.out.println("Cliente não encontrado."); // mesma coisa dos outros
    }


    public static void listarClientes(Cliente[] clientes) {
        Cliente[] copia = clientes.clone(); //copia para manter o vetor do main normal
        ordenarPorGasto(copia);
        for (Cliente c : copia) { //percorre clientes da copia
            if (c != null) {
                System.out.println(c);
            }
        }
    }


    public static Cliente clienteMaisRentavel(Cliente[] clientes) {
        Cliente maisRentavel = null;
        for (Cliente c : clientes) {
            if (c != null) {
                if (maisRentavel == null || c.getTotalGasto() > maisRentavel.getTotalGasto()) {
                    maisRentavel = c;
                }
            }
        }
        return maisRentavel;
    }

       
    
    // metodo de ordenaçao visto em aula, ( bubble sort e ver exemplo do TADlista) vai organizar os clientes em forma decrescente de total gasto
    public static void ordenarPorGasto(Cliente[] clientes) {
        for (int i = 0; i < clientes.length - 1; i++) {
            for (int j = 0; j < clientes.length - i - 1; j++) {
                if (clientes[j] != null && clientes[j + 1] != null &&
                    clientes[j].getTotalGasto() < clientes[j + 1].getTotalGasto()) {
                    Cliente temp = clientes[j];
                    clientes[j] = clientes[j + 1];
                    clientes[j + 1] = temp;
                }
            }
        }
    }


    //o null foi utilizado em todos com a funçao de verificar se tem cliente naquela posiçao, apenas para otimizar 
   

}

