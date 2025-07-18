package Atividades;


import java.util. Scanner;


public class Calculadora {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite o primeiro número : ");
        double number1 = dados.nextDouble();

        
        System.out.println("Digite o segundo número : ");
        double number2 = dados.nextDouble();

        System.out.print("Operação [1 = + | 2 = - | 3 = * | 4 = /]: ");
		Integer operacao = dados.nextInt();

    

        Double resultado = null; 


        if (operacao.equals(1)) {
            resultado = number1 + number2;
            
        }

        if (operacao.equals(2)) {
             resultado = number1 - number2;  
        }

        
        if (operacao.equals(3)) {
             resultado = number1 * number2;  
        }

        
        if (operacao.equals(4)) {
             resultado = number1 / number2;  
        }

        System.out.println(" Resultado " + resultado);


    }

}
