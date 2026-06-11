import java.util.Scanner;
public class Array105 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String[] nomes = new String[3];
        double[] notas = new double[3];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            nomes[i] = sc.nextLine();
            System.out.print("Digite a nota do aluno: ");
            notas[i] = sc.nextDouble();
            sc.nextLine();
            System.out.println();
        }
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Aluno: " + nomes[i]);
            System.out.println("Nota: " + notas[i]);
         if (notas[i] < 0 || notas[i] > 10) {
                System.out.println("Nota inválida");
            } else if (notas[i] >= 7){
                System.out.println("Situação: Aprovado");
            } else if (notas[i] >= 5) {
                System.out.println("Situação: Recuperação");
            } else {
                System.out.println("Situação: Reprovado");
            }
            sc.close();
        }
    }
}
