import java.util.ArrayList;
import java.util.HashSet;

public class ListaLigada<E extends Comparable<E>> {
    private Node<E> inicio; //"inicio"
    private Node<E> fim; //"final" 
    private int tamanho;

    public ListaLigada(){
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    //1 EXERCICIO. INSERÇÃO ORDENADA
    public void inserirOrdenado(E elemento){
        Node<E> novo = new Node<>(elemento);

        if(inicio == null){
            inicio = novo;
            fim = novo;
        }
        else{
            Node<E> anterior = null;
            Node<E> atual = inicio;
            while (atual != null && atual.getElemento().compareTo(elemento) < 0) {
                anterior = atual;
                atual = atual.getProximo();
            }

            if (anterior == null) {
                novo.setProximo(inicio);
                inicio = novo;
            }
            else{
                novo.setProximo(atual);
                anterior.setProximo(novo);   
            }
        }
        tamanho++;
    }

    //EXERCICIO 2. INVERTER A LISTA
    public void inverter(){
        if(inicio == null || inicio.getProximo() == null){
            return; // lista vazia ou com apenas 1 no
        }
        Node<E> atual = inicio;
        Node<E> anterior = null;
        Node<E> proximo = null;

        while (atual != null) { 
            proximo = atual.getProximo(); //salva o proximo no
            atual.setProximo(anterior); // inverti a referencia
            anterior = atual; // movi o ponteiro anterior
            atual = proximo; // movi para o proximo no
        }
        inicio = anterior; //novo inocio é o ultimo nó valido
    }

    //EXERCICO 3. VERIFICAR PALINDROMO
    public boolean isPalindromo() {
        ArrayList<E> lista = new ArrayList<>();
        Node<E> atual = inicio;

        // Copia os elementos para o arraylist
        while (atual != null) {
            lista.add(atual.getElemento());
            atual = atual.getProximo();
        }

        // Compara inicio e fim
        int i = 0;
        int j = lista.size() - 1;
        while (i < j) {
            if (!lista.get(i).equals(lista.get(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //EXERCICIO 4. MESCLAR LISTAS
    public static <E extends Comparable<E>> ListaLigada<E> mesclarListas(ListaLigada<E> lista1, ListaLigada<E> lista2) {
        ListaLigada<E> listaResultante = new ListaLigada<>();
        Node<E> atual1 = lista1.inicio;
        Node<E> atual2 = lista2.inicio;
    
        while (atual1 != null && atual2 != null) {
            if (atual1.getElemento().compareTo(atual2.getElemento()) <= 0) {
                listaResultante.inserirOrdenado(atual1.getElemento());
                atual1 = atual1.getProximo();
            } else {
                listaResultante.inserirOrdenado(atual2.getElemento());
                atual2 = atual2.getProximo();
            }
        }
    
        // adc os elementos restantes da lista1
        while (atual1 != null) {
            listaResultante.inserirOrdenado(atual1.getElemento());
            atual1 = atual1.getProximo();
        }
    
        // Adc os elementos restantes da lista2
        while (atual2 != null) {
            listaResultante.inserirOrdenado(atual2.getElemento());
            atual2 = atual2.getProximo();
        }
    
        return listaResultante;
    }

    //EXERCICIO 5. REMOVER DUPLICATAS
    public ListaLigada<E> removerDuplicatas() {
        HashSet<E> conjunto = new HashSet<>();
        ListaLigada<E> novaLista = new ListaLigada<>();
        Node<E> atual = inicio;
    
        while (atual != null) {
            E elemento = atual.getElemento();
            if (conjunto.add(elemento)) { // se ainda não foi adicionado
                novaLista.inserirOrdenado(elemento); // adiciona de forma ordenada
            }
            atual = atual.getProximo();
        }
    
        return novaLista;
    }

    // funçao para imprimir a lista
    public static <E extends Comparable<E>> void imprimir(ListaLigada<E> lista) {
        Node<E> atual = lista.inicio; 
        while (atual != null) {
            System.out.print(atual.getElemento() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
}
