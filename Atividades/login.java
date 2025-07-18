package Atividades;
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu usuário: ");
        String usuario = scan.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = scan.nextLine();
       
        boolean loginSucesso = false;

        if (usuario.equals("laysfernanda") && senha.equals("fernanda123")
            || usuario.equals("outrousuario") && senha.equals("fernanda123")  ) {
            loginSucesso = true;
        } else {
            System.out.println("Usuário ou senha inválidos.");
        }

        if (loginSucesso) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Falha no login. Tente novamente.");
        }

    }
}
