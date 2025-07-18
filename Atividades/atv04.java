package Atividades;


import java.util.Scanner;

public class atv04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    System.out.println("Digite o valor do produto");
    double produto = scan.nextDouble();

    if (produto >100) {
        System.out.println(" Você tem 10% de desconto no valor das compras");
        
    }else{
        System.out.println("Desconton não aplicado ");
    }
        
    }
    
}
