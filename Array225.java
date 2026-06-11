import java.util.Scanner;
public class Array225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] usuarios = new String[5];
        String[] senhas = new String[5];

        for (int i = 0; i < usuarios.length; i++){
            System.out.println("Cadastre um usuário: ");
            usuarios[i] = sc.nextLine();
            System.out.println("Cadastre a senha do usuário: ");   
            senhas[i] = sc.nextLine();
        }
           System.out.println("------LOGIN------");
        System.out.println("Digite o usuário: ");   
        String usuarioLogin = sc.nextLine();
        System.out.println("Digite a senha: ");
        String senhaLogin = sc.nextLine();

        boolean usuarioEncontrado = false;
        boolean senhaCorreta = false;

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equalsIgnoreCase(usuarioLogin)) {
                usuarioEncontrado = true; 
            
                if (senhas[i].equals(senhaLogin)) {
                    senhaCorreta = true;
                }
            }
        }
        if (usuarioEncontrado && senhaCorreta) {
            System.out.println("Login bem-sucedido!");
        } else if (usuarioEncontrado) {
            System.out.println("Senha incorreta!");
        } else {
            System.out.println("Usuário não encontrado!");
        }
        sc.close();
    }
}