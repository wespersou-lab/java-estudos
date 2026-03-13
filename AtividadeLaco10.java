import java.util.Scanner;
public class AtividadeLaco10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Me dê um número inteiro: ");
        int numero = sc.nextInt();
        int soma = 0;
        for (int i = 1; i <= numero; i++) {
      System.out.println(i);
            soma += numero; }
    System.out.println("\nNúmeros pares: ");
    for (int i = 1; i <= numero; i++) {
        if (i % 2 == 0) {
            System.out.println(i);
        }
    }
    System.out.println("\nSoma total: " + soma);
    }
}