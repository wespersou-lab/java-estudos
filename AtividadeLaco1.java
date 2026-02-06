import java.util.Scanner;
public class AtividadeLaco1 {
    public static void main(String[] args) {
     try (Scanner scanner = new Scanner(System.in)) {
            int soma = 0;
            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;
            for (int i = 1; i <= 10; i++) {
                System.out.print("Digite o número " + i + " º número: ");
                int numero = scanner.nextInt();
                soma += numero;
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
                double media = soma / 10.0;
                System.out.println("Soma: " + soma);
                System.out.println("Média: " + media);
                System.out.println("Maior número: " + maior);
                System.out.println("Menor número: " + menor);   

            }
        }
        }
        }