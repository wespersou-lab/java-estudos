import java.util.Scanner;
public class Array205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        double[] precos = new double[5];
int[] quantidades = new int[5];

double valorTotalEstoque = 0;
double maiorPreco = 0;
String maisCaro = "";   

for (int i = 0; i < names.length; i++) {
    System.out.print("Digite o nome do produto: ");
    names[i] = sc.nextLine();
    System.out.print("Digite o preço do produto: ");
    precos[i] = sc.nextDouble();
    System.out.print("Digite a quantidade do produto: ");
    quantidades[i] = sc.nextInt();

    sc.nextLine();
    
    double valorProduto = precos[i] * quantidades[i];
    valorTotalEstoque += valorProduto;

    if (precos[i] > maiorPreco) {
        maiorPreco = precos[i];
        maisCaro = names[i];
    }
}

System.out.println("\nResultado:");

for (int i = 0; i < names.length; i++) {
    double valorProduto = precos[i] * quantidades[i];
    System.out.println("Produto: " + names[i]);
    System.out.println("Preço: R$ " + precos[i]);
    System.out.println("Quantidade: " + quantidades[i]);
    System.out.println("Valor total do produto: R$ " + valorProduto);
}
System.out.println("\n====OBSERVAÇÃO=====");
System.out.println("\nValor total do estoque: R$ " + valorTotalEstoque);
System.out.println("O produto mais caro é: " + maisCaro);
System.out.println("Seu preço é: R$ " + maiorPreco);

sc.close();
    }
}


