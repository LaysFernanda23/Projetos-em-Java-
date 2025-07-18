package Atividades;

import java.util.Scanner;

public class atv06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao controle de gastos mensais!");
        System.out.println("---------------------------------------------------------------");

        
        double valor = 0.0;


            System.out.print("Digite o valor do aluguel: R$" );
            valor += scanner.nextDouble();
             System.out.print("Digite o valor da luz: R$" );
            valor += scanner.nextDouble();
             System.out.print("Digite o valor da água R$" );
            valor += scanner.nextDouble();
             System.out.print("Digite o valor do gás: R$" );
            valor += scanner.nextDouble();
             System.out.print("Digite o valor da internet: R$" );
            valor += scanner.nextDouble();

            if (valor > 1000) {
                System.out.println("Você ultrapassou o limite de R$1000,00 este mês.");
            } else {
                System.out.println("Você gastou menos de R$1000,00 este mês.");
                
            }
             
            System.out.println("O gasto total foi de: " + valor);
    }
    
}
