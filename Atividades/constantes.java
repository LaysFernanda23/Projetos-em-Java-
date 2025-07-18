package Atividades;
import java.util.Scanner;


public class constantes {
    

    // Para declarar uma constante em Java, usamos a palavra-chave `final`.
    
    public static void main(String[] args) {

        Scanner permitido = new Scanner(System.in);

        System.out.print("Digite o número máximo de usuários permitidos: ");
        final int MAX_USERS = permitido.nextInt();

 // Declara uma constante para o número máximo de usuários
         // Declara uma constante para o número máximo de usuários

        System.out.println("Quantidade máxima de usuários permitidos: " + MAX_USERS );

        if (MAX_USERS >= 50) {
            System.out.println("Todos os usuários estão dentro do limite permitido.");
        } else {
            System.out.println("Não alcançou o número máximo de usuários permitidos.");
            
        }
    }
}
