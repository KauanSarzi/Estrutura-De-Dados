public class ListaEncadeada {
    private No inicio;

    public ListaEncadeada(){
        this.inicio = null;
    }

    //inserir no inicio da lista 
    public void inserirInicio(int valor){
        No novo = new No(valor); // crio um novo no
        novo.proximo = inicio; // atribuo o valor de inicio ao novo
        inicio = novo; // inicio recebe o novo
    }
    


    //inserir no fim da lista
    public void inserirNoFim(int valor){
        No novo = new No(valor);
        if(inicio == null){
            inicio = novo;
        }
        else{
            No.atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }            

            atual.proximo = novo;
        }
    }

    // Remover um elemento (primeira ocorrência)
    public void remover(int valor) {
        if (inicio == null) return;

        if (inicio.dado == valor) {
            inicio = inicio.proximo;
            return;
        }

        No anterior = inicio;
        No atual = inicio.proximo;

        while (atual != null && atual.dado != valor) {
            anterior = atual;
            atual = atual.proximo;
        }

        if (atual != null) {
            anterior.proximo = atual.proximo;
        }
    }
    
    // imprime todos os elementos
    public void imprimir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.dado + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }







    
}
