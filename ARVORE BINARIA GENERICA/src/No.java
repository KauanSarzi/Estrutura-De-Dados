public class No {
    private int valor;
    private No esquerda;
    private No direita;
    private No pai;

    public No(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
        this.pai = null;
    }
    
    public int getValor() {
        return this.valor;
    }
    
    public No getEsquerda() {
        return this.esquerda;
    }
    
    public No getDireita() {
        return this.direita;
    }
    
    public No getPai(){
        return this.pai;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void setEsquerda(No no) {
        this.esquerda = no;
    }
    
    public void setDireita(No no) {
        this.direita = no;
    }
    
    public void setPai(No no) {
        this.pai = no;
    }
}
