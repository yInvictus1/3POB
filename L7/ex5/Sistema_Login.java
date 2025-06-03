package L7.ex5;

import java.util.Scanner;

class LoginInvalidoException extends Exception {
    public LoginInvalidoException(String mensagem) {
        super(mensagem);
    }
}

public class Sistema_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o nome de usuário: ");
            String usuario = scanner.nextLine();
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            if (usuario.isEmpty() || senha.isEmpty()) {
                throw new LoginInvalidoException("Erro: Nome de usuário e senha não podem estar vazios.");
            }

            System.out.println("Login bem-sucedido!");
        } catch (LoginInvalidoException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}
