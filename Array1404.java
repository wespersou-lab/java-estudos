import java.util.Scanner;
public class Array1404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[5];
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        int maior = numeros[0];
        int menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
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
        System.out.println("Média final: " + media);
        sc.close();
    }
}