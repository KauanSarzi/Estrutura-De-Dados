public class Playlist {
    private NoDuplo inicio; //CABEÇA
    private NoDuplo fim;    // CALDA
    private NoDuplo atual;

    public void adicionarMusica(Musica musica) {
        NoDuplo novo = new NoDuplo(musica);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.setProximo(novo);
            novo.setAnterior(fim);
            fim = novo;
        }
        if (atual == null) atual = inicio;
    }


   public boolean removerPorTitulo(String titulo) {
        NoDuplo aux = inicio;
        while (aux != null) {
            if (aux.getMusica().getTitulo().equalsIgnoreCase(titulo)) {
                if (aux == inicio) inicio = aux.getProximo();
                if (aux == fim) fim = aux.getAnterior();
                if (aux.getAnterior() != null) aux.getAnterior().setProximo(aux.getProximo());
                if (aux.getProximo() != null) aux.getProximo().setAnterior(aux.getAnterior());
                if (aux == atual) atual = aux.getProximo() != null ? aux.getProximo() : aux.getAnterior();
            
                return true;
            }
            aux = aux.getProximo();
        }
        return false; // se não encontrou nenhuma música com o título
    }

    public void exibirOrdemNormal() {
        NoDuplo aux = inicio;
        while (aux != null) {
            System.out.println(aux.getMusica());
            aux = aux.getProximo();
        }
    }

    public void exibirOrdemInversa() {
        NoDuplo aux = fim;
        while (aux != null) {
            System.out.println(aux.getMusica());
            aux = aux.getAnterior();
        }
    }

    public void buscarMusica(String titulo) {
        NoDuplo aux = inicio;
        while (aux != null) {
            if (aux.getMusica().getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Encontrada: " + aux.getMusica());
                return;
            }
            aux = aux.getProximo();
        }
        System.out.println("Musica não encontrada");
    }

    public void avancar() {
        if (atual != null && atual.getProximo() != null) {
            atual = atual.getProximo();
            System.out.println("Tocando agora: " + atual.getMusica());
        } else {
            System.out.println("Fim da playlist");
        }
    }

    public void retroceder() {
        if (atual != null && atual.getAnterior() != null) {
            atual = atual.getAnterior();
            System.out.println("Voltando para: " + atual.getMusica());
        } else {
            System.out.println("Inicio da playlist");
        }
    }
}
