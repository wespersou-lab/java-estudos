import java.util.Scanner;
public class Condicionais {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Digite sua idade: ");
int idade = sc.nextInt();
if (idade < 0 || idade > 122) { // idade da pessoa mais velha já registrada
System.out.println("Idade inválida. ");
} else if (idade <= 12) {
    System.out.print("Criança. ");
} else if (idade <= 17) {
    System.out.print("Adolescente. ");
} else if (idade <= 59) {
    System.out.print("Adulto. ");
} else {
System.out.print("Idoso. ");
}
sc.close();

}
}
    
