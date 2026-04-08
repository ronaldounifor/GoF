import java.util.Scanner;

public class Front {
    public static void main(String[] args) {
        Fachada fachada = new Fachada();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome do produto (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair"))
                break;

            System.out.print("Digite o preço do produto: ");
            double preco = scanner.nextDouble();
            System.out.print("Digite a quantidade: ");
            int quantidade = scanner.nextInt();

            fachada.adicionarProduto(nome, preco, quantidade);
            scanner.nextLine();
        }

        fachada.efetuarPagamento();
        fachada.imprimirVenda();
        System.out.println("Resumo de vendas:");
        scanner.close();
    }
}