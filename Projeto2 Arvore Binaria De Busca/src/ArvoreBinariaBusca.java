public class ArvoreBinariaBusca {
    private No raiz;

   

    // INSERÇAO
    public void inserirOuAtualizar(Palavra p) {
        raiz = inserirRec(raiz, p);
    }

    private No inserirRec(No atual, Palavra p) {
        if (atual == null) {
            return new No(p);
        }
        int comparacao = p.getPalavra().compareTo(atual.getDado().getPalavra());
        if (comparacao < 0) {
            atual.setEsquerda(inserirRec(atual.getEsquerda(), p));
        } else if (comparacao > 0) {
            atual.setDireita(inserirRec(atual.getDireita(), p));
        } else {
            atual.getDado().incrementarOcorrencias();
        }
        return atual;
    }

    // BUSCA EXATA
    public Palavra buscar(String texto) {
        return buscarRec(raiz, texto);
    }

    private Palavra buscarRec(No atual, String texto) {
        if (atual == null) return null;
        int comparacao = texto.compareTo(atual.getDado().getPalavra());
        if (comparacao < 0) {
            return buscarRec(atual.getEsquerda(), texto);
        } else if (comparacao > 0) {
            return buscarRec(atual.getDireita(), texto);
        } else {
            return atual.getDado();
        }
    }

    // BUSCA POR PARTE
    public void buscarPorParte(String parte) {
        buscarPorParteRec(raiz, parte);
    }

    private void buscarPorParteRec(No atual, String parte) {
        if (atual == null) return;
        buscarPorParteRec(atual.getEsquerda(), parte);
        if (atual.getDado().getPalavra().contains(parte)) {
            System.out.printf("%s – ocorrências: %d, caracteres: %d%n",
                atual.getDado().getPalavra(),
                atual.getDado().getOcorrencias(),
                atual.getDado().getNumeroCaracteres());
        }
        buscarPorParteRec(atual.getDireita(), parte);
    }

    // EXIBIÇÃO ORDEM ALFABÉTICA REVERSA
    public void exibirOrdemReversa() {
        exibirOrdemReversaRec(raiz);
    }

    private void exibirOrdemReversaRec(No atual) {
        if (atual == null) return;
        exibirOrdemReversaRec(atual.getDireita());
        System.out.printf("%s – ocorrências: %d, caracteres: %d%n", atual.getDado().getPalavra(), atual.getDado().getOcorrencias(), atual.getDado().getNumeroCaracteres());
        exibirOrdemReversaRec(atual.getEsquerda());
    }

    // ESTATÍSTICAS
    public int contarDistintas() {
        return contarNosRec(raiz);
    }

    private int contarNosRec(No atual) {
        if (atual == null) return 0;
        return 1 + contarNosRec(atual.getEsquerda()) + contarNosRec(atual.getDireita());
    }

    public int somaCaracteresTotal() {
        return somaCaracteresRec(raiz);
    }

    private int somaCaracteresRec(No atual) {
        if (atual == null) return 0;
        Palavra p = atual.getDado();
        return p.getNumeroCaracteres() * p.getOcorrencias()
             + somaCaracteresRec(atual.getEsquerda())
             + somaCaracteresRec(atual.getDireita());
    }

    // FUNÇÃO INVENTADA: CONTAGEM DE FREQUÊNCIA DE LETRAS
    public void contarLetras(int[] freq) {
        contarLetrasRec(raiz, freq);
    }

    private void contarLetrasRec(No atual, int[] freq) {
        if (atual == null) return;
        contarLetrasRec(atual.getEsquerda(), freq);
        String w = atual.getDado().getPalavra();
        int vezes = atual.getDado().getOcorrencias();
        for (char c : w.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a'] += vezes;
            }
        }
        contarLetrasRec(atual.getDireita(), freq);
    }
    

}

