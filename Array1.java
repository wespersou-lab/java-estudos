import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int [5];
        int soma = 0;
        int maior;
        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite os números: ");
            n[i] = sc.nextInt();
        }
        maior = n[0];
        for (int i = 0; i < n.length; i++) {
            soma += n[i];
            if (n[i] > maior) {
                maior = n[i];
            }
        }
System.out.println("Números digitados: "); 
for (int i = 0; i < n.length; i++) {
    System.out.print(n[i] + " ");
}
System.out.println("\nSoma: " + soma);
        System.out.println("Maior número: " + maior);
        sc.close();
    }
}