import java.util.Scanner;
public class AtividadeLaco2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
int numero;
int soma = 0;
int maior = Integer.MIN_VALUE;
int menor = Integer.MAX_VALUE;
int pares = 0;
for (int i=1; i<=10; i++) {
    System.out.print("Digite o " + i + "º número: ");
    numero = sc.nextInt();
    soma += numero;
    if (numero > maior) {
        maior = numero;
    }
    if (numero < menor) {
        menor = numero;
    }
    if (numero % 2 == 0) {
        pares++;
    }
    double media = (double) soma / 10.0;
    System.out.println("\nSoma: " + soma);
    System.out.println("Média: " + media);
    System.out.println("Maior número: " + maior);
    System.out.println("Menor número: " + menor);
    System.out.println("Quantidade de números pares: " + pares);
}
sc.close();
}
}
