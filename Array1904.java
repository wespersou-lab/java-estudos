import java.util.Scanner;
public class Array1904 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número de posição " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        if (numeros[i] > maior) {
            maior = numeros[i];
        }
        if (numeros[i] < menor) {
            menor = numeros[i];
        }
        soma += numeros[i];
        }
        double media = (double) soma / numeros.length;
        System.out.println("Número maior: " + maior);
        System.out.println("Número menor: " + menor);
        System.out.println("A média: " + media);
        sc.close();
    }
}