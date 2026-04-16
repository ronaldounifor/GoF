public class Pessoa {
    private String nome;
    private int idade;
    public Pessoa() {
    }
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa clone() {
        Pessoa novaPessoa = new Pessoa();

        novaPessoa.setIdade(this.getIdade());
        novaPessoa.setNome(this.getNome());

        return novaPessoa;
    }
    @Override
    public String toString() {
        return nome + " (" + idade + " anos)";
    }
}
