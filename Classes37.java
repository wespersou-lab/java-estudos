
class Pessoa {

    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Carro {

    String modelo;
    Pessoa dono;

    public Carro(String modelo, Pessoa dono) {
        this.modelo = modelo;
        this.dono = dono;
    }

    public void mostrarCarro() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Dono: " + dono.nome);
        System.out.println("Idade: " + dono.idade);
    }
}

public class Classes37 {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Wesley", 30);
        Carro c = new Carro("Civic", p);
        c.mostrarCarro();
    }
}
