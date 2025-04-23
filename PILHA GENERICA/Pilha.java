public class Pilha<T> {
    private T[] pilha;
    private int topo;

    public Pilha(int tamanho) {
        this.pilha = (T[]) new Object[tamanho];
        this.topo = -1;
    }

    public Pilha() {
        this(10);
    }

    public void empilhar(T valor) throws Exception {
        if (!pilhaCheia()) {
            topo++;
            pilha[topo] = valor;
        } else {
            throw new Exception("Impossível empilhar. Pilha cheia!\n");
        }
    }

    public T desempilhar() throws Exception {
        if (!pilhaVazia()) {
            T valor = pilha[topo];
            topo--;
            return valor;
        }
        throw new Exception("Impossível desempilhar. Pilha vazia!\n");
    }

    public T topo() throws Exception {
        if (!pilhaVazia()) {
            return pilha[topo];
        }
        throw new Exception("Impossível acessar o topo. Pilha vazia!\n");
    }

    public boolean pilhaVazia() {
        return topo == -1;
    }

    public boolean pilhaCheia() {
        return topo == pilha.length - 1;
    }

    public void limpar() {
        topo = -1;
    }

    public String elementos() throws Exception {
        if (pilhaVazia()) {
            throw new Exception("Pilha vazia. Nada a exibir.\n");
        }

        String elementos = "";
        for (int i = topo; i >= 0; i--) {
            elementos += pilha[i];
            if (i > 0) {
                elementos += " ";
            }
        }
        return elementos;
    }
}
