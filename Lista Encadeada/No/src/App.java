public class App {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.inserirInicio(10);
        lista.inserirNoFim(20);
        lista.inserirNoFim(30);
        lista.inserirInicio(5);

        lista.imprimir(); // 5 -> 10 -> 20 -> 30 -> null

        lista.remover(10);
        lista.imprimir(); // 5 -> 20 -> 30 -> null
    }
}
