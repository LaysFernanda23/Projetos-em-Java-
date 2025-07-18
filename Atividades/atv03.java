package Atividades;

import java.util.Scanner;

public class atv03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantos colaboradores tem na sua empresa :  ");
        int empresa = scanner.nextInt();

        final int colaboradoresMicro = 20;
        final int colaboradoresPequena = 49;
        final int colaboradoresMedia = 79;
        final int colaboradoresGrande = 100;

        if (empresa <20) {
            
            System.out.println(" Você se enquadra as Microempresa");
        } else if (empresa >=20) {
            System.out.println(" Você  tem uma pequena Empresa");
            
        } else if (empresa >=79) {
            System.out.println("Você se enquadra na Média Empresa");
            
        } else{
            System.out.println("Nenhum perfil se enquadra a você");
        }
        
        


    }
}
