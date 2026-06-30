class Aluno {
    String nome;
    int idade;
    String curso;
public void exibirDados() {
System.out.println("Nome: " + nome);
System.out.println("Idade: " + idade);
System.out.println("Curso: " + curso);
}
}
public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Wesley";
        aluno.idade = 30;
        aluno.curso = "ADS";
        aluno.exibirDados();
    }
}