public class Palavra {
    private String texto;
    private int ocorrencias;
    private int numeroCaracteres;

    // Construtor: recebe o texto e já define ocorrências = 1
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
}
