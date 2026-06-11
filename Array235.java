import java.util.Scanner;
public class Array235 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[5];
        double[] nota1 = new double[5];
        double[] nota2 = new double[5];

        String maiorNota = "";
        double maiorMedia = 0;
        int aprovados = 0;
        int reprovados = 0;
        
        for (int i = 0; i < nome.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            nome[i] = sc.nextLine();
            System.out.print("Digite a primeira nota: ");
            nota1[i] = sc.nextDouble();

            while (nota1[i] < 0 || nota1[i] > 10) {
                System.out.print("Nota inválida. Digite a primeira nota novamente: ");
                nota1[i] = sc.nextDouble();
            }
            System.out.print("Digite a segunda nota: ");
            nota2[i] = sc.nextDouble();

            while (nota2[i] < 0 || nota2[i] > 10) {
                System.out.print("Nota inválida. Digite a segunda nota novamente: ");
                nota2[i] = sc.nextDouble();
            }

            sc.nextLine(); // Limpar o buffer do scanner
            double media = (nota1[i] + nota2[i]) / 2;

            if (media >= 7) {
                aprovados++; }
            else {
                reprovados++;
            }
            if (media > maiorMedia) {
                maiorMedia = media;
                maiorNota = nome[i];
            }
        }

        System.out.println("\n====== RESULTADOS ======");

        for (int i = 0; i < nome.length; i++) {
            double media = (nota1[i] + nota2[i]) / 2;
            System.out.println("Nome do Aluno: " + nome[i] + " - Média: " + media);
        }

        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Aluno com a maior nota: " + maiorNota);
        System.out.println("Número de alunos aprovados: " + aprovados);
        System.out.println("Número de alunos reprovados: " + reprovados);

        sc.close();

    }
}
