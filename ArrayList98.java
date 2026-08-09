
import java.util.ArrayList;

public class ArrayList98 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("José");
        nomes.add("Ana");
        nomes.add("Pedro");

        System.out.println("Lista inicial");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("\nQuantidade de nomes: " + nomes.size());
        nomes.remove("João");
        System.out.println("\nLista após remover João");
        System.out.println();
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
