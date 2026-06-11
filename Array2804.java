import java.util.Scanner;
public class Array2804 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        int par = 0;
        int impar = 0;

        System.out.println("Digite 10 números: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();

            soma += numeros[i];

            if (numeros[i] % 2 == 0) {
            par++;
            } else { impar++;
            }
            if (numeros[i] > maior) {
            maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        double media = (double) soma/numeros.length;
        
        String acima = "";
        String abaixo = "";
            for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i] > media) {
                        acima += numeros[i] + " ";
                    } else if (numeros[i] < media) {
                        abaixo += numeros[i] + " ";
                    }
            }
            System.out.println("=====RESULTADO=====");
            System.out.println("Números acima da média: " + acima);
            System.out.println("Número abaixo da média: " + abaixo);
            System.out.println("Número maior: " + maior);
            System.out.println("Número menor: " + menor);
                System.out.println("Números pares: " + par);
            System.out.println("Números ímpares: " + impar);
                System.out.println("Média: " + media);
                sc.close();
        }
    }
