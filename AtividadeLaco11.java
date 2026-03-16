import java.util.Scanner;
public class AtividadeLaco11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Me dê um número inteiro positivo: ");
        int numero = sc.nextInt();
        int soma = 0;
        for (int i = 1; i <= numero; i++) {
        System.out.println(i);
        soma += i;
    }
    System.out.println("A soma de todos os números é; " + soma);
    sc.close();
}
}