public class Node<E> {
    E elemento;
    Node proximo;
    Node anterior;

    public Node(E elemento) {
        this.elemento = elemento;
        this.proximo = null;
        this.anterior = null;
    }

    public E getElemento() {
        return elemento;
    }

    public void setElemento(E elemento) {
        this.elemento = elemento;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node no) {
        this.proximo = no;
    }

    public Node<E> getAnterior() {
        return anterior;
    }

    public void setAnterior(Node<E> anterior) {
        this.anterior = anterior;
    }

}
