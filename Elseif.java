import java.util.Scanner;
public class Elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.print("Qual a nota: ");
        nota = sc.nextDouble();
        if (nota <= 5) {
            System.out.println("Reprovado. ");
        } else if (nota >= 7 && nota <= 10) {
            System.out.println("Aprovado. ");
        } else { System.out.println("Recuperação. ");
        }
        sc.close();
    }
}
