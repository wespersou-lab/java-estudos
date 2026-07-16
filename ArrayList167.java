
import java.util.ArrayList;

public class ArrayList167 {

    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("João");
        alunos.add("Maria");
        alunos.add("Pedro");
        alunos.add("Ana");

        System.out.println("=====LISTA INICIAL=====");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
        System.out.println("\nQuantidade de alunos: " + alunos.size());
        System.out.println("\nTerceiro aluno: " + alunos.get(2));
        alunos.remove("Pedro");
        System.out.println("\n=====APÓS REMOVER PEDRO=====");

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
        System.out.println("Maria está na lista? " + alunos.contains("Maria"));
        System.out.println("Quantidade final: " + alunos.size());
    }
}
