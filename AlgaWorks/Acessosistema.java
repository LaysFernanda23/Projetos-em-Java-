import java.util.Scanner;
public class Acessosistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
    
       boolean podeVotar = true;

       if (idade >= 18 && podeVotar) {
           System.out.println("Você pode votar.");
       } else if (idade <= 18) {
           System.out.println("Você não pode votar.");
       } else {
           System.out.println("Verifique sua situação de voto.");
        
       }
    }
}
