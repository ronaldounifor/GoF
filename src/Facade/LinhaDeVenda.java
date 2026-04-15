package Facade;
public class LinhaDeVenda {
    private Produto produto;
    private int quantidade;

    public LinhaDeVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public LinhaDeVenda(Produto produto) {
        this.produto = produto;
        this.quantidade = 1;
    }

    public double getSubtotal() {
        return produto.getPreco()*quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
