public class ArvoreBinaria {
    private No raiz;
    
    public void excluirArvore() {
        this.raiz = null;
    }
    
    // Inserção em nível (sem busca), mantendo referência ao pai
    public void inserir(int valor) {
        No novo = new No(valor);
        if (this.raiz == null) {
            this.raiz = novo;
            return;
        }

        Fila fila = new Fila();
        fila.inserir(raiz);

        while (!fila.filaVazia()) {
            No atual = fila.remover();

            if (atual.getEsquerda() == null) {
                atual.setEsquerda(novo);
                novo.setPai(atual);
                break;
            } else {
                fila.inserir(atual.getEsquerda());
            }

            if (atual.getDireita() == null) {
                atual.setDireita(novo);
                novo.setPai(atual);
                break;
            } else {
                fila.inserir(atual.getDireita());
            }
        }
    }
        
     public void exibirArvore() {
        exibirArvore(this.raiz, 0);
    }
    
    private void exibirArvore(No no, int nivel) {
        if(no != null) {
            exibirArvore(no.getDireita(), nivel + 1);
            for(int r = 1; r <= nivel; r++)
              System.out.print(" - ");
            System.out.println(no.getValor());
            exibirArvore(no.getEsquerda(), nivel + 1);
        }
    }
    
        
    
     public void ancestrais(int elemento) {
        No no = this.buscar(elemento);
        System.out.println("Ancestrais de " + elemento + ":");
        while(no.getPai() != null) {
            System.out.println(no.getPai().getValor());
            no = no.getPai();
        }
    }
    
    public void emOrdem() {
        this.emOrdem(this.raiz);
    }
    
    private void emOrdem(No no) {
        if (no != null) {
            this.emOrdem(no.getEsquerda());
            System.out.print("Nó: " + no.getValor());
            if (no.getPai() != null) {
                System.out.print(" (Pai: " + no.getPai().getValor() + ")");
            } else {
                System.out.print(" (Pai: null)");
            }
            System.out.println();
            this.emOrdem(no.getDireita());
        }
    }
   
    public void preOrdem() {
        this.preOrdem(raiz);
    }
    
    private void preOrdem(No no) {
        if (no != null) {
            System.out.print("Nó: " + no.getValor());
            if (no.getPai() != null) {
                System.out.print(" (Pai: " + no.getPai().getValor() + ")");
            } else {
                System.out.print(" (Pai: null)");
            }
            System.out.println();
            this.preOrdem(no.getEsquerda());
            this.preOrdem(no.getDireita());
        }
        
    }
    public void posOrdem() {
        this.posOrdem(raiz);
    }
     
    private void posOrdem(No no) {
     
        if (no != null) {
            this.posOrdem(no.getEsquerda());
            this.posOrdem(no.getDireita());
            System.out.print("Nó: " + no.getValor());
            if (no.getPai() != null) {
                System.out.print(" (Pai: " + no.getPai().getValor() + ")");
            } else {
                System.out.print(" (Pai: null)");
            }
            System.out.println();
        }
    }
    
    public int quantidadeDeNos() {
        return quantidadeDeNos(this.raiz);
    }
    
    private int quantidadeDeNos(No raiz) {
        if(raiz == null)
            return 0;
        else
            return 1 + this.quantidadeDeNos(raiz.getEsquerda()) + this.quantidadeDeNos(raiz.getDireita());
    }
    
    public void emLargura() {
        Fila fila = new Fila();
        No no;
        String emlargura = "";
        
        
        if(this.raiz == null) // árvore vazia
            return;
        fila.inserir(this.raiz);
        while(!fila.filaVazia()) {
            no = fila.remover();
            emlargura += no.getValor();
            emlargura += " ";
            if(no.getEsquerda() != null)
                fila.inserir(no.getEsquerda());
            if(no.getDireita() != null)
                fila.inserir(no.getDireita());
        }
        System.out.println(emlargura);    
    }
    
    // busca um nó da árvore binária
    public No buscar(int valor) {
        Fila fila = new Fila();
        No no;
        String emlargura = "";
        
        
        if(this.raiz == null) // árvore vazia
            return null;
        fila.inserir(this.raiz);
        while(!fila.filaVazia()) {
            no = fila.remover();
            if(no.getValor() == valor) // encontrou o elemento de busca
                return no;
            if(no.getEsquerda() != null)
                fila.inserir(no.getEsquerda());
            if(no.getDireita() != null)
                fila.inserir(no.getDireita());
        }
        return null;    
    }
}
