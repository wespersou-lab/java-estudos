import java.util.Scanner;
public class Array185 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        double[] media = new double[5];

        double maiorMedia = 0;
        String melhorAluno = "";

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            nomes[i] = sc.nextLine();
            
            double soma = 0;

            for (int j = 1; j <= 3; j++) {
                System.out.print("Digite a nota " + j + ": ");
                soma += sc.nextDouble();
                }
            sc.nextLine(); // Limpar o buffer   
            media[i] = soma /3;

           if (media[i] > maiorMedia) {
                maiorMedia = media[i];
                melhorAluno = nomes[i];
            }   
        }
        System.out.println("\nResultado final: ");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("\nAluno: " + nomes[i]);
            System.out.println("Média: " + media[i]);

            if (media[i] < 0 || media[i] > 10) {
                System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
        }else if (media[i] > 7) {
                System.out.println("Aluno aprovado.");
            } else if (media[i] >= 5) {
                System.out.println("Aluno em recuperação.");
            } else {
                System.out.println("Aluno reprovado.");
            }
        }
        System.out.println("\n===== MELHOR ALUNO =====");
        System.out.println("\nO aluno com a maior média é: " + melhorAluno + " com média " + maiorMedia);
    sc.close();
    }
}
                
