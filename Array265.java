import java.util.Scanner;
public class Array265 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        double[] media = new double[5];

        int aprovados = 0;
        int reprovados = 0;
        double maiorMedia = 0;
        String melhorAluno = "";

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            nomes[i] = sc.nextLine();

            System.out.print("Digite a primeira nota: ");
            double nota1 = sc.nextDouble();

            while (nota1 < 0 || nota1 > 10  ) {
                System.out.println("Nota inválida!" );
                System.out.print("Digite novamente! ");
                nota1 = sc.nextDouble(); 
                }
             System.out.print("Digite a segunda nota: ");
            double nota2 = sc.nextDouble();

            while (nota2 < 0 || nota2 > 10  ) {
                System.out.println("Nota inválida!" );
                System.out.print("Digite novamente! ");
                nota2 = sc.nextDouble(); 
                }
                sc.nextLine();
                media[i] = (nota1 + nota2) / 2;

                if (media[i] >= 7) {
              System.out.println("Aluno aprovado!");
                aprovados++; }
          
              else if (media[i] >= 5) { 
                      System.out.println("Aluno em recuperação!"); }
                else {
                  System.out.println("Aluno reprovado!");
                    reprovados++; }

                    if (media[i] > maiorMedia) {
                        maiorMedia = media[i];
                        melhorAluno = nomes[i];
                    }
                }
                System.out.println("\n     RESULTADOS FINAIS     ");
                for (int i = 0; i < nomes.length; i++) {
                    System.out.println("Aluno: " + nomes[i] + " - Média: " + media[i]);
                }
                System.out.println("Quantidade de alunos aprovados: " + aprovados);
                System.out.println("Quantidade de alunos reprovados: " + reprovados);
                System.out.println("Melhor aluno: " + melhorAluno);
        }
    }

