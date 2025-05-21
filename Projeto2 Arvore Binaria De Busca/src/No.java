public class No {
    private Palavra dado;
    private No esquerda;
    private No direita;

    public No(Palavra dado) {
        this.dado = dado;
    }

    public Palavra getDado() {
        return dado;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }
}
