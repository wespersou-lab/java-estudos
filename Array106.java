import java.util.Scanner;
public class Array106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0.0;

        for (int i = 0; i < notas.length; i++) {
        System.out.print("Digite a " + (i + 1) + "ª nota: ");
        notas[i] = sc.nextDouble();
        soma += notas[i];
        }
        double media = soma / notas.length;

        System.out.println();
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota º" + (i + 1) + ": " + notas[i]);
    } 
    System.out.println("\nResultados finais: ");
    System.out.println("Soma: " + soma);
    System.out.println("Média: " + media);
    sc.close();
    }
}