

public class Cliente{
    private String nome;
    private String cpf;
    private double totalGasto;
    private boolean bicicletaAlugada;
    private int quantidadeLocacoes;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.totalGasto = 0.0;
        this.bicicletaAlugada = false;
        this.quantidadeLocacoes = 0;
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
    



      // Setters
    public void setTotalGasto(double totalGasto) {
        this.totalGasto = totalGasto;
    }

    public void setBicicletaAlugada(boolean bicicletaAlugada) {
        this.bicicletaAlugada = bicicletaAlugada;
    }

    public void setQuantidadeLocacoes(int quantidadeLocacoes) {
        this.quantidadeLocacoes = quantidadeLocacoes;
    }

    

public class Cliente{
    private String nome;
    private String cpf;
    private double totalGasto;
    private boolean bicicletaAlugada;
    private int quantidadeLocacoes;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.totalGasto = 0.0;
        this.bicicletaAlugada = false;
        this.quantidadeLocacoes = 0;
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
    



      // Setters
    public void setTotalGasto(double totalGasto) {
        this.totalGasto = totalGasto;
    }

    public void setBicicletaAlugada(boolean bicicletaAlugada) {
        this.bicicletaAlugada = bicicletaAlugada;
    }

    public void setQuantidadeLocacoes(int quantidadeLocacoes) {
        this.quantidadeLocacoes = quantidadeLocacoes;
    }

        
    @Override
    public String toString() {
        return "Nome: " + nome + 
               "\nCPF: " + cpf + 
               "\nTotal gasto: R$ " + totalGasto +
               "\nQuantidade de locações: " + quantidadeLocacoes +
               "\nBicicleta alugada: " + (bicicletaAlugada ? "Sim" : "Não") + "\n";
    }


    
}
