
public class Classes47 {

    String titular;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente. ");
        }
    }

    void mostrarSaldo() {
        System.out.println("Titular da conta: " + titular);
        System.out.println("Saldo da conta: " + saldo);
    }

    public static void main(String[] args) {
        Classes47 c = new Classes47();
        c.titular = "Wesley";
        c.depositar(500);
        c.sacar(200);

        c.mostrarSaldo();
    }
}
