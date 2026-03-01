import java.util.Scanner;
public class AtividadeLaco5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        int soma = 0;
        int quantidade = 0;
        System.out.println("Digite números (0 para parar): ");
        numero = sc.nextInt();
        while (numero != 0) {
            soma += numero;
            quantidade++;
            numero = sc.nextInt();
        }
        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("Quantidade: "+ quantidade);
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
        } else {
            System.out.println("Nenhum número digitado válido. ");
        }
        sc.close();
    }
}