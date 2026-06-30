class Produto {
    String nome;
    double preco;
    int quantidade;

    public void exibirDados() {
System.out.println("Nome " + nome);
System.out.println("Preço " + preco);
System.out.println("Quantidade " + quantidade);
    }
}
public class Classes306 {
    public static void main(String[] args) {
    Produto produto = new Produto();
    produto.nome = "Geléia";
    produto.preco = 19.99;
    produto.quantidade = 13;
    
    produto.exibirDados();
    }
}