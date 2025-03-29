import java.util.*;

public class Aplicacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente[] clientes = new Cliente[10];
        int totalClientes = 0;

        System.out.println("SISTEMA DE LOCAÇÃO DE BICICLETAS" +
                           "1 - CADASTRAR NOVO CLIENTE" +
                           "2 - LOCAR BICICLETA" +
                           "3 - DEVOLVER BICICLETA" +
                           "4 - REMOVER CLIENTE" +
                           "5 - EXIBIR DADOS DO CLIENTE" +
                           "6 - LISTAR CLIENTES EM ORDEM DECRESCENTE DE GASTOS" +
                           "7 - EXIBIR CLIENTE MAIS RENTAVEL" +
                           "8 - ENCERRAR");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("Insira o nome:");
                String nome = sc.nextLine();
                System.out.println("Insira o cpf: ");
                String cpf = sc.nextLine();
                break;
            case 2:
                ;
            case 3:
                ;
            case 4:
                ;
            case 5:
                ;
            case 6:
                ;
            case 7:
                ;
            case 8:
                ;
            default:
                System.out.println("Opção inválida");
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
                if(c.isBicicletaAlugada()) 
                return false;
                c.setTotalGasto(c.getTotalGasto() + 5.0);
                c.setQuantidadeLocacoes(c.getQuantidadeLocacoes() + 1);
                c.setBicicletaAlugada(true);
                return true;
            }
        }
        return false;
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
	

    public static int remover (String cpf){
	int n = clientes.length;
	for (int i = 0; int i < n-1; i++){
		if (cpf == clientes[i].cpf()){
			clientes[i].remove();
		}
	 }
    }

    public static void exibirCliente (String cpf){
	int n = clientes.length;
	for (int i = 0; int i < n-1; i++){
		if (cpf == clientes[i].cpf()){
            System.out.println(clientes[i].toString());
		}
	 }
    }
      
    
    
    // metodo de ordenaçao visto em aula, ( bubble sort e ver exemplo do TADlista)
     public static void ordenarporGasto(Cliente[] clientes, int totalClientes) {
        for (int i = 0; i < totalClientes; i++) {
            for (int j = 0; j <totalClientes - i - 1; j++) {
                if (clientes[j].getTotalGasto() > clientes[j + 1].getTotalGasto()) {
                    Cliente temp = clientes[j];
                    clientes[j] = clientes[j + 1];
                    clientes[j + 1] = temp;               
                }
            }
        }
    }

   

}


    

