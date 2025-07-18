package Atividades;

import java.util.Scanner;

public class atv02 {
    // Praticando Constantes em Java
    public static void main(String[] args) {
        Scanner acesso = new Scanner(System.in);

        System.out.print("Digite o número de colaboradores da sua empresa: ");
        final int MAX_COLABORADORES = acesso.nextInt();

        System.out.println("Quantidade máxima de colaboradores permitidos: " + MAX_COLABORADORES);
        if (MAX_COLABORADORES >= 50) {
            System.out.println("Todos os colaboradores estão dentro do limite permitido.");
        } else {
            System.out.println("Não alcançou o número máximo de colaboradores permitidos.");
        }
        

    }
}
