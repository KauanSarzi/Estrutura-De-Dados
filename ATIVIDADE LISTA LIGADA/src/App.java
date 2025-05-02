public class App {
    public static void main(String[] args) {
        
        // inserção ordenada
        ListaLigada<Integer> lista = new ListaLigada<>();
        lista.inserirOrdenado(5);
        lista.inserirOrdenado(2);
        lista.inserirOrdenado(8);
        lista.inserirOrdenado(1);
        
        System.out.println("Lista ordenada:");
        ListaLigada.imprimir(lista);  

        // inversão
        lista.inverter();
        System.out.println("Lista invertida:");
        ListaLigada.imprimir(lista);

        //palíndromo
        ListaLigada<Character> letras = new ListaLigada<>();
        letras.inserirOrdenado('a');
        letras.inserirOrdenado('r');
        letras.inserirOrdenado('a');
        letras.inserirOrdenado('r');
        letras.inserirOrdenado('a');

        System.out.println("É palíndromo?");
        System.out.println(letras.isPalindromo() ? "Sim!" : "Não!");

        //mesclagem
        ListaLigada<Integer> l1 = new ListaLigada<>();
        ListaLigada<Integer> l2 = new ListaLigada<>();
        l1.inserirOrdenado(1);
        l1.inserirOrdenado(4);
        l2.inserirOrdenado(2);
        l2.inserirOrdenado(3);

        ListaLigada<Integer> mesclada = ListaLigada.mesclarListas(l1, l2);
        System.out.println("Lista mesclada:");
        ListaLigada.imprimir(mesclada);

        //remover duplicatas
        ListaLigada<Integer> duplicados = new ListaLigada<>();
        duplicados.inserirOrdenado(2);
        duplicados.inserirOrdenado(2);
        duplicados.inserirOrdenado(3);
        duplicados.inserirOrdenado(3);
        duplicados.inserirOrdenado(4);

        System.out.println("Com duplicatas:");
        ListaLigada.imprimir(duplicados);

        ListaLigada<Integer> semDuplicatas = duplicados.removerDuplicatas();
        System.out.println("Sem duplicatas:");
        ListaLigada.imprimir(semDuplicatas);
    }
}
