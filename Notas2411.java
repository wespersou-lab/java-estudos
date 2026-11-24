import java.util.Scanner;
public class Notas2411 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aprovados = 0;
       int reprovados = 0;

        for (int i = 0; i <= 1; i++) {
            System.out.print("Digite o nome do aluno: ");
            String nome = teclado.nextLine();
            System.out.print("Digite a primeira nota: ");
            double nota1 = teclado.nextDouble();
            System.out.print("Digite a segunda nota: ");
            double nota2 = teclado.nextDouble();
            teclado.nextLine(); 
               
            double media = (nota1 + nota2) / 2;
             
            if (media >= 7) {
                System.out.println("O aluno " + nome + " foi aprovado com média: " + media);
                aprovados++;
            } else {
                System.out.println("O aluno " + nome + " foi reprovado com média: " + media);
                reprovados++;
            }
         }
        System.out.println("Total de alunos aprovados: " + aprovados);
        System.out.println("Total de alunos reprovados: " + reprovados);
        teclado.close();
}
}