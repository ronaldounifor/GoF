
public class Front {
    public static void main(String[] args) {
        Filme topGun = new Filme("Top Gun", 1986);
        Filme quartetoFantastico = new Filme("Quarteto Fantastico IV", 2025);
        Filme mickaelJackson = new Filme("Mickael Jackson", 2026);

        Cliente ricardo = new Cliente(550, "Ricardo");

        Aluguel aluguel = new Aluguel(ricardo);
        aluguel.adicionarFilme(topGun);
        aluguel.adicionarFilme(quartetoFantastico);
        aluguel.adicionarFilme(mickaelJackson);

        System.out.println(aluguel.getTotal());
    }
}