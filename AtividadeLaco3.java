import java.util.Scanner;
public class AtividadeLaco3 {
    public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
System.out.print("Digite um número: ");
int numero = sc.nextInt();
int soma = 0;
    for (int i = 1; i <= 10; i++) {
        int resultado = numero * i;
        System.out.println(numero + "*" + i + "=" + resultado);
        soma += resultado;
        System.out.println("Soma =" + soma);
        sc.close();

    }
    }
}