import java.util.Scanner;
public class AtividadeLaco4{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Digite um número: ");
int numero = sc.nextInt();
int soma = 0;
for (int i = 0; i <= numero; i++) {
    System.out.println(i);
    soma += i;
}
System.out.println("Soma: " + soma);
sc.close(); 
    }
}