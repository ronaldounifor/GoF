public class Filme {
    private String nome;
    private int anoLancamento;

    public Filme(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        if(anoLancamento > 2025)
            return 8;
        if(anoLancamento == 2025)
            return 6;
        
        return 4;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

}
