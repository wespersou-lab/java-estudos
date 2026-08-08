
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList317 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Produto " + i + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            sc.nextLine(); // Limpar o buffer do scanner
            produtos.add(new Produto(nome, preco));
            System.out.println();
        }
        double soma = 0;
        Produto maisCaro = produtos.get(0);
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - R$" + produto.getPreco());
            soma += produto.getPreco();
            if (produto.getPreco() > maisCaro.getPreco()) {
                maisCaro = produto;
            }
        }
        double media = soma / produtos.size();
        System.out.println("\n====PRODUTOS CADASTRADOS====:");
        System.out.println("\nTotal de produtos cadastrados: " + produtos.size());
        System.out.println("Produto mais caro: " + maisCaro.getNome());
        System.out.println("Preço do produto mais caro: R$ " + maisCaro.getPreco());
        System.out.println("Média de preços: R$ " + media);
        sc.close();
    }
}
