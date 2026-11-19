import java.util.Scanner;
public class Notas1711 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aprovado = 0;
        int reprovado = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o nome do aluno: ");
            String nome = teclado.nextLine();
            System.out.print("Digite a primeira nota: ");
            double nota1 = teclado.nextDouble();
            System.out.print("Digite a segunda nota: ");
            double nota2 =  teclado.nextDouble();
            System.out.print("Digite a terceira nota: ");
            double nota3 = teclado.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;

            System.out.println("Aluno: " + nome);
            System.out.printf("Média: %.2f%n", media);

            if (media >= 7) {
                System.out.println("Situação: Aprovado");
                aprovado++;
            } else {
                System.out.println("Situação: Reprovado");
                reprovado++;
            } 
            teclado.nextLine(); // Limpar o buffer do teclado
        }
        System.out.println("\n================================");
        System.out.println("Resultado Final");
        System.out.println("================================");
        System.out.println("Total de alunos aprovados: " + aprovado);
        System.out.println("Total de alunos reprovados: " + reprovado);
    teclado.close();
    }
}