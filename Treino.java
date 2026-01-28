import java.util.Scanner;
public class Treino{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Digite o primeiro número: ");
            int n1 = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int n2 = sc.nextInt();
            if (n1 > n2) {
                System.out.println("O primeiro número é maior. ");
            } else if (n2 > n1) { 
                System.out.println("O segundo número é maior. ");
            } else {
                System.out.println("Os dois números são iguais. ");
            }
        }
    }
}