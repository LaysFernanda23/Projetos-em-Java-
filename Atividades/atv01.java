package Atividades;

import java.util.Scanner;

public class atv01 {
    public static void main(String[] args) {
        
        //Crie um programa que vai receber do usuário o valor do produto 
        //e a quantidade do produto que se deseja. 
        //Com essas informações encontre o subtotal que será o valor do produto 
        //multiplicado pela quantidade.


        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valorProduto = entrada.nextDouble();
        System.out.print("Digite a quantidade do produto: ");
        int quantidadeProduto = entrada.nextInt();
        double subtotal = valorProduto * quantidadeProduto;
        System.out.printf("O subtotal é: R$ %.2f%n", subtotal);
        

        double desconto = 0.1;  
        
        if (quantidadeProduto > 10) {
            subtotal -= subtotal * desconto; // Aplica o desconto de 10%
            System.out.printf("Com desconto, o subtotal é: R$ %.2f%n", subtotal);
        } else {
            System.out.println("Nenhum desconto aplicado.");
        }
        if (quantidadeProduto >10) {
            System.out.println();
            
        }


    }
}
