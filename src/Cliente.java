public class Cliente {
    private String nome;
    private int pontos;

    public Cliente(int pontos, String nome) {
        this.pontos = pontos;
        this.nome = nome;
    }
    
    public Cliente(String nome) {
        pontos = 0;
        this.nome = nome;
    }

    public void aplicarBonificacaoRebobinar() {
        pontos += 20;
    }

    public void aplicarPenalidadeRebobinar() {
        pontos -= 20;
    }

    public int getPontos() {
        return pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
