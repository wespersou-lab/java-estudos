import java.util.Scanner;
public class Array125 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String[] nomes = new String[5];
       double[] medias = new double[5];
       for (int i = 0; i < nomes.length; i++) {
        System.out.print("Digite o nome do aluno: ");
        nomes[i] = sc.nextLine();
        System.out.print("Digite a primeira nota do aluno:");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota do aluno:");
        double nota2 = sc.nextDouble();
        sc.nextLine(); // Limpar o buffer do scanner
        medias[i] = (nota1 + nota2) / 2;
       }
       System.out.println("\nResultado final: ");
       for (int i = 0; i < nomes.length; i++) {
        
        System.out.println("\nAluno: " + nomes[i]);
        System.out.println("Média: " + medias[i]);
        if (medias[i] > 10 || medias[i] < 0) {
            System.out.println("Média inválida!");
        } else if (medias[i] >= 7) {
            System.out.println("Aprovado!");
        } else if (medias[i] >= 5) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }
        sc.close();
       }
}
