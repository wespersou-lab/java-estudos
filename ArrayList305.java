import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList305 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int numero = -1;

        while (numero != 0) {
            System.out.print("Digite um número (0 para parar): ");
            numero = sc.nextInt();
            if (numero != 0) {
            numeros.add(numero);
            soma += numero;
            }
        }

        System.out.println("\nNúmeros digitados: " + numeros);
        System.out.println("Quantidade de números digitados: " + numeros.size());
        System.out.println("Soma dos números digitados: " + soma);

        sc.close();
    }
}

