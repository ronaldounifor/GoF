public class Fachada {
    Venda vendaAtual;
    Pagamento pagamentoAtual;

    public Fachada() {
        vendaAtual = new Venda();
        pagamentoAtual = new Pagamento();
    }

    private void iniciarNovaVenda() {
        vendaAtual = new Venda();
        pagamentoAtual = new Pagamento();
    }

    public void adicionarProduto(String nome, double preco, int quantidade) {

    }
    // imprimirVenda
    // efetuarPagamento
    
}
