import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Time {
    private int anoFundacao;
    private Pessoa treinador;
    private List<Pessoa> jogadores;
    private Camisa camisa;
    public Time() {
        System.out.println("Criei o time!");
    }
    public Time(int anoFundacao, Pessoa treinador, List<Pessoa> jogadores, Camisa camisa) {
        this.anoFundacao = anoFundacao;
        this.treinador = treinador;
        this.jogadores = jogadores;
        this.camisa = camisa;

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Criei o time!");
    }
    public Time clone() {
        Time novoTime = new Time();

        novoTime.setAnoFundacao(this.getAnoFundacao());
        novoTime.setTreinador(treinador.clone());
        novoTime.setCamisa(camisa.clone());
        
        List<Pessoa> novosJogadores = new ArrayList<>();
        for (Pessoa jogador : jogadores)
            novosJogadores.add(jogador.clone());

        novoTime.setJogadores(novosJogadores);

        return novoTime;
    }
    public Pessoa getTreinador() {
        return treinador;
    }
    public void setTreinador(Pessoa treinador) {
        this.treinador = treinador;
    }
    public List<Pessoa> getJogadores() {
        return jogadores;
    }
    public void setJogadores(List<Pessoa> jogadores) {
        this.jogadores = jogadores;
    }
    public Camisa getCamisa() {
        return camisa;
    }
    public void setCamisa(Camisa camisa) {
        this.camisa = camisa;
    }
    public int getAnoFundacao() {
        return anoFundacao;
    }
    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
    @Override
    public String toString() {
        return "Time{" +
                "anoFundacao=" + anoFundacao +
                ", treinador=" + treinador +
                ", jogadores=" + jogadores +
                ", camisa=" + camisa +
                '}';
    }
}
