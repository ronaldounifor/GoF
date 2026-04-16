import java.util.List;

public class Front {
    public static void main(String[] args) {
        Pessoa treinador = new Pessoa("Ronaldo", 49);
        Time saoPaulo = new Time(1930, treinador, 
                            List.of(new Pessoa("Lucas Moura", 33), new Pessoa("Calleri", 32), new Pessoa("Rafael", 36)), 
                            new Camisa("Vermelho", "Preto e branco"));

        // Time flamengo = new Time(1895, treinador, 
        //                     List.of(new Pessoa("Arrascaeta", 31), new Pessoa("Pedro", 28), new Pessoa("Gerson", 28)), 
        //                     new Camisa("Vermelho", "Preto"));
        // Time sailors = new Time(1991, treinador, 
        //                     List.of(new Pessoa("Usagi Tsukino", 14), new Pessoa("Ami Mizuno", 14), new Pessoa("Rei Hino", 14)), 
        //                     new Camisa("Branco", "Azul"));
        // Time hunters = new Time(1998, treinador, 
        //                     List.of(new Pessoa("Gon Freecss", 12), new Pessoa("Killua Zoldyck", 12), new Pessoa("Kurapika", 17), new Pessoa("Leorio", 19)), 
        //                     new Camisa("Verde", "Branco"));

        Time flamengo = saoPaulo.clone();
        flamengo.setAnoFundacao(1895);
        flamengo.setJogadores(List.of(new Pessoa("Arrascaeta", 31), new Pessoa("Pedro", 28), new Pessoa("Gerson", 28)));
        flamengo.setCamisa(new Camisa("Vermelho", "Preto"));

        Time sailors = saoPaulo.clone();
        sailors.setAnoFundacao(1991);
        sailors.setJogadores(List.of(new Pessoa("Usagi Tsukino", 14), new Pessoa("Ami Mizuno", 14), new Pessoa("Rei Hino", 14)));
        sailors.setCamisa(new Camisa("Branco", "Azul"));
        
        Time hunters = saoPaulo.clone();
        hunters.setAnoFundacao(1998);
        hunters.setJogadores(List.of(new Pessoa("Gon Freecss", 12), new Pessoa("Killua Zoldyck", 12), new Pessoa("Kurapika", 17), new Pessoa("Leorio", 19)));
        hunters.setCamisa(new Camisa("Verde", "Branco"));

        System.out.println(saoPaulo);
        System.out.println(flamengo);
        System.out.println(sailors);
        System.out.println(hunters);
    }
}