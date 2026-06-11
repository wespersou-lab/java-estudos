import java.util.Scanner;
public class Array951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[9];
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        System.out.println("Digite 9 números inteiros:");
        for (int i =0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        if (numeros[i] > maior) {
            maior = numeros[i];
        }
        if (numeros[i] < menor) {
            menor = numeros[i];
        }
    }
        double media = (double) soma / numeros.length;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        sc.close();
    }
}