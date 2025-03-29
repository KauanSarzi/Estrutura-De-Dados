import java.util.*;

public class Cliente {
    private String nome;
    private String cpf;
    private double totalGasto;
    private boolean bicicletaAlugada;
    private int quantidadeLocacoes;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.totalGasto = 0.0;
        this.bicicletaAlugada = false;
        this.quantidadeLocacoes = 0;
    }

    @Override
    public String toString() {
        return "Cliente:\n" +
               "Nome: " + nome + "\n" +
               "CPF: " + cpf + "\n" +
               "Total Gasto: " + totalGasto + "\n" +
               "Bicicleta Alugada: " + bicicletaAlugada + "\n" +
               "Quantidade de Locações: " + quantidadeLocacoes;
}
}