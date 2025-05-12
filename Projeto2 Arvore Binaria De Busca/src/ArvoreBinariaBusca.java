public class ArvoreBinariaBusca {
    private No raiz;

    public ArvoreBinariaBusca() {
        raiz = null;
    }

    // Inserção pública: recebe uma String, busca se já existe, senão insere
    public void inserir(String palavra) {
        raiz = inserirRec(raiz, palavra);
    }

    // Método recursivo de inserção/busca
    private No inserirRec(No atual, String palavra) {
        if (atual == null) {
            // criar novo nó com palavra
            return new No(new Palavra(palavra));
        }

        int cmp = palavra.compareToIgnoreCase(atual.dado.getTexto());
        if (cmp == 0) {
            // palavra já existe → incrementar contador
            atual.dado.incrementarOcorrencia();
        } else if (cmp < 0) {
            atual.esquerda = inserirRec(atual.esquerda, palavra);
        } else {
            atual.direita  = inserirRec(atual.direita, palavra);
        }
        return atual;
    }

    // Busca exata: RETORNA O NO OU NULL
    public No buscar(String chave) {
        return buscarRec(raiz, chave);
    }

    private No buscarRec(No atual, String chave) {
        if (atual == null) return null;
        int cmp = chave.compareToIgnoreCase(atual.dado.getTexto());
        if (cmp == 0) return atual;
        if (cmp < 0) return buscarRec(atual.esquerda, chave);
        else           return buscarRec(atual.direita, chave);
    }

    // Busca por parte da palavra: PERCORRE TODA A ARVORE
    public void buscarPorParte(String parte) {
        buscarParteRec(raiz, parte.toLowerCase());
    }

    private void buscarParteRec(No atual, String parte) {
        if (atual == null) return;
        // verificar o nó atual
        String txt = atual.dado.getTexto().toLowerCase();
        if (txt.contains(parte)) {
            System.out.printf(
              "Encontrada: %s (ocorrências: %d, caracteres: %d)%n",
              atual.dado.getTexto(),
              atual.dado.getOcorrencias(),
              atual.dado.getNumeroCaracteres()
            );
        }
        //continuar o percurso
        buscarParteRec(atual.esquerda, parte);
        buscarParteRec(atual.direita, parte);
    }

    //(direita → raiz → esquerda)
    public void exibirOrdemReversa() {
        exibirRevRec(raiz);
    }

    private void exibirRevRec(No atual) {
        if (atual == null) return;
        exibirRevRec(atual.direita);
        System.out.printf(
          "%s (ocor:%d, chars:%d)%n",
          atual.dado.getTexto(),
          atual.dado.getOcorrencias(),
          atual.dado.getNumeroCaracteres()
        );
        exibirRevRec(atual.esquerda);
    }
}
