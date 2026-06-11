import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList285 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um nome: ");
            nomes.add(sc.nextLine());
        }
        System.out.println("\nLista de nomes: ");
        System.out.println(nomes);
        
        System.out.println("\nQuantidade: " + nomes.size());
        System.out.println("Primeiro nome: " + nomes.get(0));
        System.out.println("Último nome: " + nomes.get(nomes.size() - 1));
sc.close();

    }
}