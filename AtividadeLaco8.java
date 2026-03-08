import java.util.Scanner;
public class AtividadeLaco8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero;
        int soma = 0;
        int pares = 0;
        int impares = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            soma += numero;
            if (numero % 2 == 0) {
                pares++; 
            } else {
                impares++;
            }
        }
        double media = soma / 10.0;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        sc.close();
    }
}