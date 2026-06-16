import java.util.ArrayList;
public class ArrayList126 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Maria");

        System.out.println("\nLista de nomes:");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        System.out.println("\nQuantidade de nomes: " + nomes.size());
        System.out.println("O primeiro nome da lista é: " +  nomes.get(0));
        System.out.println("O último nome da lista é: " +  nomes.get(nomes.size() - 1));
    }
}