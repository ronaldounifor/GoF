import java.util.Scanner;

public class Front {
    public static void main(String[] args) {
        Venda venda = new Venda();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome do produto (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o preço do produto: ");
            double preco = scanner.nextDouble();

            Produto produto = new Produto(preco, nome);

            System.out.print("Digite a quantidade: ");
            int quantidade = scanner.nextInt();

            LinhaDeVenda linhaAtual = new LinhaDeVenda(produto, quantidade);

            scanner.nextLine(); // limpar buffer

            venda.adicionar(linhaAtual);
        }

        Pagamento pagamento = new Pagamento();
        pagamento.efetuar();

        System.out.println("Resumo de vendas:");
        venda.imprimir();
        scanner.close();
    }
}