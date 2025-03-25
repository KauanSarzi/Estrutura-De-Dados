import java.util.*;

public class Aplicacao{
    
    public static void main(String[] args){
        Cliente [] clientes = new Cliente [10];

        
    

   }

  }


   //metodo de ordenaçao visto em aula, ( bubble sort e ver exemplo do TADlista)
   public static void ordenarporGasto(Cliente[] clientes){
    int n = clientes.length;
    for(i = 0; i < n - 1; i++){
        for(j = 0; j < n - 1 - i; j++){
            if(clientes[j].totalGasto > clientes[j+1].totalGasto){
                int temp = clientes[j];
                clientes[j] = clientes[j+1];
                clientes[j+1]= temp;  
                return;

            }
        }
    }
    

   }