import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> produtos = new ArrayList<>();
         
        int opcao;

        do {
            System.out.println("\n 1 - Adicionar produto: ");
            System.out.println(" 2 - Listar produtos: ");
            System.out.println(" 3 - Sair: ");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpar o buffer do scanner    
    
        switch (opcao) {
            case 1: 
            System.out.println("Digite o nome do produto: ");
            String produto = sc.nextLine();
            produtos.add(produto);
            System.out.println("Produto adicionado com sucesso!");
        break;

        case 2:
            System.out.println("Lista de produtos: ");
            for (String p : produtos) {
                System.out.println(p);
            }
        break;

        case 3:
            System.out.println("Saindo do programa...");
        break;
        default:
        System.out.println("Opção inválida. Tente novamente.");
        }
    } while (opcao != 3);
    sc.close();
    }
}