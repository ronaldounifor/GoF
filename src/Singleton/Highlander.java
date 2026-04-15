package Singleton;
public class Highlander {
    private String nome;
    private int idade;
    private static Highlander instancia;

    private Highlander() {
        System.out.println("NOVO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public synchronized static Highlander getInstancia() {
        if(instancia != null)
            return instancia;
        
        return instancia = new Highlander();
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

}