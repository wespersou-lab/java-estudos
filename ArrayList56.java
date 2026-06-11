import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("1 - Adicionar nome");
            System.out.println("2 - Listar nomes");
            System.out.println("3 - Remover nome");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();
            
            if (opcao == 1) {
                System.out.print("Digite um nome: ");   
                String nome = sc.nextLine();
                nomes.add(nome);
                System.out.println("Nome adicionado com sucesso!");
            } else if (opcao == 2) {
                System.out.println("Lista de nomes:");
                for (String nome : nomes) {
                    System.out.println(nome);
                }
            } else if (opcao == 3) {
               System.out.print("Digite o nome a ser removido: ");
               String nome = sc.nextLine();
               if (nomes.remove(nome)) {
                     System.out.println("Nome removido com sucesso!");
                } else {
                     System.out.println("Nome não encontrado na lista.");
               }
            } else if (opcao == 4) {
                System.out.println("Saindo do programa...");
            } else { 
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
        sc.close();
    }
}
