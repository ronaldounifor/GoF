package Facade;

import java.util.ArrayList;

public class Venda {
    protected ArrayList<LinhaDeVenda> linhas;

    public Venda() {
        linhas = new ArrayList<>();
    }

    public double getTotal(){
        double total = 0;
        for (LinhaDeVenda linhaDeVenda : linhas)
            total += linhaDeVenda.getSubtotal();

        return total;
    }

    public void adicionar(LinhaDeVenda linha){
        linhas.add(linha);
    }

    public void imprimir() {
        for (LinhaDeVenda linha : linhas) {
            System.out.println("\nProduto cadastrado:");
            System.out.println("Nome: " + linha.getProduto().getNome());
            System.out.println("Preço: R$ " + linha.getProduto().getPreco());
            System.out.println("Quantidade: " + linha.getQuantidade());
            System.out.println("---------------------------");
        }
        System.out.println("---------R$ "+this.getTotal()+"--------------");
    }
}
