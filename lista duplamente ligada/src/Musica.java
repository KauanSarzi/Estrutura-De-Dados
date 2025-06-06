public class Musica {
    private String titulo;
    private String artista;
    private int duracao;

    public Musica(String titulo, String artista, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getTitulo() { return titulo; }
    public String getArtista() { return artista; }
    public int getDuracao() { return duracao; }

    public String toString() {
        return titulo + " - " + artista + " (" + duracao + "s)";
    }
}
