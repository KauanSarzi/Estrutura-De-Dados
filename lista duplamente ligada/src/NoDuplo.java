public class NoDuplo {
    private Musica musica;
    private NoDuplo proximo;
    private NoDuplo anterior;

    public NoDuplo(Musica musica) {
        this.musica = musica;
        this.proximo = null;
        this.anterior = null;
    }

    public Musica getMusica() {
        return musica;
    }

    public NoDuplo getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }

    public NoDuplo getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }
}