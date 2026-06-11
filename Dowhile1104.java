import java.util.Scanner;
public class Dowhile1104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int soma = 0;
do {
    System.out.print("Digite um número (0 para parar): ");
    numero = sc.nextInt();
if (numero > 0) {
    soma += numero;
}
} while (numero != 0);
System.out.print("Soma dos números positivos: " + soma);
sc.close();
    }
}
