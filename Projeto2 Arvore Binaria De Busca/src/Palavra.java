public class Palavra implements Comparable<Palavra> {
    private String texto;
    private int ocorrencias;
    private int numeroCaracteres;

    public Palavra(String texto) {
        this.texto = texto;
        this.ocorrencias = 1;
        this.numeroCaracteres = texto.length();
    }

    public String getTexto() {
        return texto;
    }

    public int getOcorrencias() {
        return ocorrencias;
    }

    public int getNumeroCaracteres() {
        return numeroCaracteres;
    }

    public void incrementarOcorrencia() {
        ocorrencias++;
    }

    @Override
    public int compareTo(Palavra outra) {
        return this.texto.compareToIgnoreCase(outra.texto);
    }

    @Override
    public String toString() {
        return texto + " (ocorrências: " + ocorrencias + ", caracteres: " + numeroCaracteres + ")";
    }
}
