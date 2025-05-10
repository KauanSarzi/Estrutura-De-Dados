public class ArvoreBinaria<T extends Comparable<T>> {
    private No<T> raiz;

    public void inserir(T valor) {
        raiz = inserirRec(raiz, valor);
    }

    private No<T> inserirRec(No<T> atual, T valor) {
        if (atual == null) {
            return new No<>(valor);
        }
        if (valor.compareTo(atual.valor) < 0) {
            atual.esquerda = inserirRec(atual.esquerda, valor);
        } else if (valor.compareTo(atual.valor) > 0) {
            atual.direita = inserirRec(atual.direita, valor);
        }
        return atual;
    }

    public boolean buscar(T valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(No<T> atual, T valor) {
        if (atual == null) return false;
        if (valor.compareTo(atual.valor) == 0) return true;
        return valor.compareTo(atual.valor) < 0
            ? buscarRec(atual.esquerda, valor)
            : buscarRec(atual.direita, valor);
    }

    public void emOrdem() {
        emOrdemRec(raiz);
        System.out.println();
    }

    private void emOrdemRec(No<T> no) {
        if (no != null) {
            emOrdemRec(no.esquerda);
            System.out.print(no.valor + " ");
            emOrdemRec(no.direita);
        }
    }

    public void preOrdem() {
        preOrdemRec(raiz);
        System.out.println();
    }

    private void preOrdemRec(No<T> no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            preOrdemRec(no.esquerda);
            preOrdemRec(no.direita);
        }
    }

    public void posOrdem() {
        posOrdemRec(raiz);
        System.out.println();
    }

    private void posOrdemRec(No<T> no) {
        if (no != null) {
            posOrdemRec(no.esquerda);
            posOrdemRec(no.direita);
            System.out.print(no.valor + " ");
        }
    }
}
