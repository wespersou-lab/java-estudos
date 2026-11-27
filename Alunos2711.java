import java.util.Scanner;
public class Alunos2711 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprovados = 0;
        int reprovados = 0;
        double somarMedia = 0;
        
        for (int i = 0; i <= 2; i++) {
            System.out.println("\n=====ALUNO " + (i + 1) + "=====");
            System.out.println("Digite o nome do aluno: ");
            String nome = sc.nextLine();

            System.out.println("Digite a primeira nota: ");
            double nota1 = sc.nextDouble();

            System.out.println("Digite a segunda nota: ");
            double nota2 = sc.nextDouble();

            double media = (nota1 + nota2) / 2;

            somarMedia += media;    

            System.out.println("Aluno: " + nome);
            System.out.println("Média: " + media);  
             
            if (media >= 7) {
                System.out.println("Situação: Aprovado");
                aprovados++;
            } else {
                System.out.println("Situação: Reprovado");
                reprovados++;
            }
            sc.nextLine(); // Limpar o buffer do scanner    
        }
        double mediaTurma = somarMedia / 3;

        System.out.println("\n=====RESULTADOS DA TURMA=====");  

        System.out.println("Número de alunos aprovados: " + aprovados);
        System.out.println("Número de alunos reprovados: " + reprovados);
        System.out.println("Média da turma: " + mediaTurma);

        sc.close();
    }
}

