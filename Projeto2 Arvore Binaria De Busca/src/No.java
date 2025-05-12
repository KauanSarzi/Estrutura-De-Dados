public class No<T extends Comparable<T>> {
    private T dado;
    private No<T> esq;
    private No<T> dir;

    public No(T dado) {
        this.dado = dado;
    }

    public T getDado() {
        return dado;
    }

    public No<T> getEsq() {
        return esq;
    }

    public void setEsq(No<T> esq) {
        this.esq = esq;
    }

    public No<T> getDir() {
        return dir;
    }

    public void setDir(No<T> dir) {
        this.dir = dir;
    }
}