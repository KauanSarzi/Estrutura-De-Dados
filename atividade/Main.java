import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Fila clientes = new Fila(10000); 
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

       
        int totalAtendidos = 0;
        int tempoTotalEspera = 0;
        int maiorTempoEspera = 0;

       
        System.out.print("Digite a duração da simulação (em minutos): ");
        int duracao = scanner.nextInt();

        for (int minuto = 0; minuto < duracao; minuto++) {
            if (!clientes.estaVazia()) {
                
                int entrada = clientes.desenfileirar();

               
                totalAtendidos++;

                int tempoEspera = minuto - entrada;
                tempoTotalEspera += tempoEspera;
                if (tempoEspera > maiorTempoEspera) {
                    maiorTempoEspera = tempoEspera;
                }
            }

           
            int k = random.nextInt(3); 
            for (int i = 0; i < k; i++) {
                clientes.enfileirar(minuto); 
            }
        }

        //  totais solicitados
        double tempoMedio = totalAtendidos > 0 ? (double) tempoTotalEspera / totalAtendidos : 0;
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Duração da simulação: " + duracao + " minutos");
        System.out.println("Clientes atendidos: " + totalAtendidos);
        System.out.printf("Tempo médio de espera: %.2f minutos\n", tempoMedio);
        System.out.println("Maior tempo de espera: " + maiorTempoEspera + " minutos");
    }
}
