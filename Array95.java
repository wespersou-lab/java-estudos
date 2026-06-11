import java.util.Scanner;
public class Array95 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
int[] numeros = new int[5];
int soma = 0;
int maior = Integer.MIN_VALUE;
System.out.println("Digite 5 números: ");
for (int i = 0; i < numeros.length; i++) {
    numeros[i] = sc.nextInt();
    soma += numeros[i];
    if (numeros[i] > maior) {
        maior = numeros[i];
    }
}
double media = (double) soma / numeros.length;
System.out.println("Soma: " + soma);
System.out.println("Maior: " + maior);
System.out.println("Média: " + media);
sc.close();
}
}
