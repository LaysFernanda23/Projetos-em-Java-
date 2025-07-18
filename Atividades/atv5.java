package Atividades;

import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner recebendo = new Scanner(System.in);

        final double FRETE = 25.00;

        System.out.print("Digite o valor do produto: R$ ");
        double produto = recebendo.nextDouble();

        double valor;

        if (produto <= 100.00) {
            valor = produto;
        } else {

            valor = produto + FRETE;
        }

        System.out.printf("Valor do produto com o frete incluso: R$ %.2f%n", valor);

        recebendo.close();
    }
}
