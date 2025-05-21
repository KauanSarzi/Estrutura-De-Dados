public class Palavra {
    private String palavra;
    private int ocorrencias;
    private int numeroCaracteres;

    public Palavra(String palavra) {
        this.palavra = palavra;
        this.ocorrencias = 1;
        this.numeroCaracteres = palavra.length();
    }

    public String getPalavra() {
        return palavra;
    }

    public int getOcorrencias() {
        return ocorrencias;
    }

    public int getNumeroCaracteres() {
        return numeroCaracteres;
    }

    public void incrementarOcorrencias() {
        ocorrencias++;
    }
}
