public class Fila {
    private int[] elementos;
    private int inicio;
    private int fim;
    private int tamanhoMaximo;

    public Fila(int capacidade) {
        elementos = new int[capacidade];
        inicio = 0;
        fim = 0;
        tamanhoMaximo = 0;
    }

    public void enfileirar(int valor) {
        if (fim < elementos.length) {
            elementos[fim] = valor;
            fim++;
            tamanhoMaximo++;
        } else {
            System.out.println("Fila cheia! Aumente a capacidade.");
        }
    }

    public int desenfileirar() {
        if (!estaVazia()) {
            int valor = elementos[inicio];
            inicio++;
            return valor;
        } else {
            System.out.println("Fila vazia!");
            return -1;
        }
    }

    public boolean estaVazia() {
        return fim == inicio;
    }
}
