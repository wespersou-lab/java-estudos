import java.util.Scanner;
public class Array1204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        int maior, menor;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        maior = numeros[0];
        menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
            double media = (double) soma / numeros.length;
            System.out.println("\nNúmeros digitados: ");
            for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            }
             System.out.println("\nSoma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        sc.close();
    }
}