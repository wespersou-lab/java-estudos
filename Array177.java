
import java.util.Scanner;

public class Array177 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];

        double soma = 0;
        double maior = 0;
        double menor = 0;
        int aprovados = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = sc.nextDouble();
            soma += notas[i];

            if (i == 0) {
                maior = notas[i];
                menor = notas[i];
            }
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
            if (notas[i] >= 7) {
                aprovados++;
            }
        }
        double media = soma / notas.length;
        System.out.println("\nNotas digitadas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
        System.out.println("Média das notas: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Notas maiores ou igual a 7: " + aprovados);
        sc.close();
    }
}
