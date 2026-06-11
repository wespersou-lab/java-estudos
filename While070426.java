import java.util.Scanner;
public class While070426 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int numero = -1;
        int contador = 0;
        while (numero != 0) {
            System.out.print("Digite um número (0 para parar): ");
            numero = sc.nextInt();

            if (numero != 0) {
                soma += numero;
                contador++;
            }
        }
        System.out.println("Soma total: " + soma);
        System.out.println("A quantidade de números totais é: " + contador);
sc.close();
    }
}
