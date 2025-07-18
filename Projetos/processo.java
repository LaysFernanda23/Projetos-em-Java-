package Projetos;

import java.util.concurrent.ThreadLocalRandom;

public class processo {

    public static void main(String[] args) {
        divulgarSelecionados();
          // Chamando o método
    }

    static void divulgarSelecionados() {
        String[] candidatosSelecionados = {"João", "Maria", "José", "Ana", "Pedro"};

        System.out.println("os Candidatos Selecionados informando o indice :");

        for (int indice = 0; indice < candidatosSelecionados.length; indice++) {
            System.out.println("Candidato " + (indice + 1) + ": " + candidatosSelecionados[indice]);
        }
    }

    static void avaliarCandidato() {
        String[] candidatos = {"João", "Maria", "José", "Ana", "Pedro", "Luiza", "Carla", "Rafael", "Fernanda", "Lucas"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("Candidato: " + candidato + ", Salário Pretendido: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("Candidato " + candidato + " selecionado.");
                candidatosSelecionados++;
            } else {
                System.out.println("Candidato " + candidato + " não selecionado.");
            }

            candidatosAtual++;
            if (candidatosAtual >= candidatos.length) {
                System.out.println("Todos os candidatos foram avaliados.");
                break;
            }
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1500.0, 3000.0);
    }

    static void selecionarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO E NEGOCIAR SALÁRIO");
        } else {
            System.out.println("NÃO LIGAR PARA O CANDIDATO");
        }
    }
}
