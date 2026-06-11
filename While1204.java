import java.util.Scanner;
public class While1204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero  = -1;
        int soma = 0;
        while (numero != 0) {
        System.out.println("Digite um número (0 para parar): ");
        numero = sc.nextInt();
        soma += numero;
        }
        System.out.println("A soma total é: " + soma);
        sc.close();
    }
}