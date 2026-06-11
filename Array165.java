import java.util.Scanner;
public class Array165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] products = new String[5];
        double[] prices = new double[5];
        int[] quantities = new int[5];
        double[] totalEstoque = new double[5];
        for (int i = 0; i < products.length; i++) {
            System.out.print("Nome do produto: ");
            products[i] = sc.nextLine();
            System.out.print("Preço do produto: "); 
            prices[i] = sc.nextDouble();
            System.out.print("Quantidade do produto: ");
            quantities[i] = sc.nextInt();
            sc.nextLine(); // Limpar o buffer
            totalEstoque[i] = prices[i] * quantities[i];
        }
        System.out.println("\nProdutos em estoque:");
        for (int i = 0; i < products.length; i++) {
            System.out.println("Produto: " + products[i]);
            System.out.println("Valor total em estoque: R$: " + totalEstoque[i]);
            if (totalEstoque[i] > 1000) {
                System.out.println("Estoque alto. ");
            }else if (totalEstoque[i] < 500) {
                System.out.println("Estoque baixo. ");
            }
            else if (totalEstoque[i] < 0) {
                System.out.println("Estoque negativo. ");
            } else {
                System.out.println("Estoque médio. ");
        }
        }
        sc.close();
    }
}