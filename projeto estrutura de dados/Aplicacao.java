import java.util.*;

public class Aplicacao{
    
    public static void main(String[] args){
        Scanner sc = new Scanner();
	    System.out.println("SISTEMA DE LOCAÇÃO DE BICICLETAS"+
	                       "1 - CADASTRAR NOVO CLIENTE"+
                           "2 - LOCAR BICICLETA"+
                           "3 - DEVOLVER BICICLETA"+
                           "4 - REMOVER CLIENTE"+
                           "5 - EXIBIR DADOS DO CLIENTE"+
                           "6 - LISTAR CLIENTES EM ORDEM DECRESCENTE DE GASTOS"+
                           "7 - EXIBIR CLIENTE MAIS RENTAVEL"+
                           "8 - ENCERRAR");
	    int a = sc.nextInt(System.in):
	    
	    switch(a){
	        case 1 : ;
	        
	        case 2 : ;
	        
	        case 3 : ;
	        
	        case 4 : ;
	        
	        case 5 : ;
	        
	        case 6 : ;
	        
	        case 7 : ;
	        
	        case 8 : ;
	        
	        default : System.out.println("Opção inválida");
        }
        
        Cliente [] clientes = new Cliente [10];

        
    

   }

  }


   //metodo de ordenaçao visto em aula, ( bubble sort e ver exemplo do TADlista)
   public static void ordenarporGasto(Cliente[] clientes){
    int n = clientes.length;
    for(int i = 0; i < n - 1; i++){
        for(int j = 0; j < n - 1 - i; j++){
            if(clientes[j].totalGasto > clientes[j+1].totalGasto){
                int temp = clientes[j];
                clientes[j] = clientes[j+1];
                clientes[j+1]= temp;  
                return;

            }
        }
    }
static int remover (String cpf){
	int n = clientes.length;
	for (int i = 0; int i < n-1; i++){
		if (cpf == clientes[i].cpf()){
			clientes[i].remove();
		}
	}
}

    

   }
