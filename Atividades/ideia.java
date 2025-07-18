package Atividades;

import java.util.Scanner;


public class ideia {
    public static void main(String[] args) {
        Scanner informacao = new Scanner (System.in);

        System.out.print("Digite a senha que foi gerada: ");
        int numero = informacao.nextInt();

        System.out.println(" Especialistas : 1 = Cardiologista, | 2 = Pediatra , | 3 = Genicologista, | 4 = Dentista ");
        Integer consulta = informacao.nextInt();

        if (consulta.equals(1)) {
            System.out.println(" Sua será consulta com o Cardiologista, Doutor Pedro Gomes .");
        }

        if (consulta.equals(2)) {
            System.out.println(" Sua será consulta com a Pediatra, Doutora Juliana Camil .");

        }

         if (consulta.equals(3)) {
            System.out.println(" Sua será consulta com a Genicologista, Doutora Lays Fernanda .");

        }
        
         if (consulta.equals(4)) {
            System.out.println(" Sua será consulta com a Dentista, Doutora Patricia Diniz .");

        }else{
            System.out.println("Não temos esse especialista ");
        }
            
    }
}
