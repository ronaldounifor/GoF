package Facade;
public class Fachada {
    private Venda vendaAtual;
    private Pagamento pagamentoAtual;

    public Fachada() {
        vendaAtual = new Venda();
        pagamentoAtual = new Pagamento();
    }

    private void iniciarNovaVenda() {
        vendaAtual = new Venda();
        pagamentoAtual = new Pagamento();
    }

    public void adicionarProduto(String nome, double preco, int quantidade) {
        vendaAtual.adicionar(new LinhaDeVenda(new Produto(preco, nome), quantidade));
    }

    public void imprimirVenda() {
        vendaAtual.imprimir();
    }

    public void efetuarPagamento() {
        pagamentoAtual.efetuar();
        iniciarNovaVenda();
    }
    
}
