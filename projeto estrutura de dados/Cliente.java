import java.util.*;

public class Cliente{
    private String nome;
    private String cpf;
    private double totalGasto;
    private boolean bicicletaAlugada;
    private int quantidadeLocacoes;

    public Cliente(String nome, String cpf, double totalGasto, boolean bicicletaAlugada, int quantidadeLocacoes){
        this.nome = nome;
        this.cpf = cpf;
        this.totalGasto = totalGasto;
        this.bicicletaAlugada = bicicletaAlugada;
        this.quantidadeLocacoes = quantidadeLocacoes;
    }

    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public double getTotalGasto() {
        return totalGasto;
    }
    
    public boolean isBicicletaAlugada() {
        return bicicletaAlugada;
    }
    
    public int getQuantidadeLocacoes() {
        return quantidadeLocacoes;
    }
    

    
}