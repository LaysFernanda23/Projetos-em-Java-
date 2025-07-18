package Atividades;

import java.util.Scanner;

public class atv07 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite sua idade: ");


         boolean podeContribuir = true;
        int idade = dados.nextInt();
        
        int idadeMaxima = 55;
        int tempoContribuicao = 25;

        if (idade >= 18 && idade <= idadeMaxima && podeContribuir) {
            System.out.println("Você pode contribuir para a previdência social.");
        } else if (idade < 18) {
            System.out.println("Você ainda não pode contribuir para a previdência social.");
        } else if (idade > idadeMaxima) {
            System.out.println("Você ultrapassou a idade máxima para contribuição.");
        } else {
            System.out.println("Verifique sua situação de contribuição.");
        }




    }
    
}
