
import java.util.ArrayList;
import java.util.List;

public class Aluguel {
    private List<Filme> filmes;
    private Cliente cliente;
    private DescontoStrategy estrategia;
    
    public Aluguel(Cliente cliente) {
        this.cliente = cliente;
        this.filmes = new ArrayList<>();

        if (cliente.getPontos() >= 1000)
            this.estrategia = new DescontoPlatina();
        else if (cliente.getPontos() >= 500)
            this.estrategia = new DescontoOuro();
        else
            this.estrategia = new PrimeiroAluguelStrategy();
        
    }
    
    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }
    
    public double getTotal() {
        double total = 0;
        // for (Filme filme : filmes) {
        //     if(cliente.getPontos() >= 1000) {
        //         total += filme.getPreco()*0.9;
        //     } else if(cliente.getPontos() >= 500) {
        //         total += filme.getPreco()*0.95;
        //     } else {
        //         total c+= filme.getPreo();
        //     }
        // }
        for (Filme filme : filmes)
            total += estrategia.aplicarDesconto(filme.getPreco());
        
        return total;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }
    public Cliente getCliente() {
        return cliente;
    }
}
