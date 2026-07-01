
class Aluno {

    String nome;
    int idade;
    String curso;

    Aluno(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
    }
}

public class Classes3061 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 25, "Ads");
        aluno.exibirDados();
    }
}
