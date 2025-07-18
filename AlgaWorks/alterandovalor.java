import java.util.Scanner;

public class alterandovalor {
 public static void main(String[] args) {
   
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Digite o valor do produto desejado: ");
    double produto = entrada.nextDouble();

    int opcao;

    do{
        System.out.println("Escolha uma opção de pagamento:");
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Cartão");
        System.out.println("3 - Pix");
        System.out.println("4 - Sair");
        
        opcao = entrada.nextInt();
        
        switch (opcao) {
                case 1:
                    double descontoDinheiro = produto * 0.10;
                    double valorFinalDinheiro = produto - descontoDinheiro;
                    System.out.printf("Pagamento em dinheiro. Valor final: R$ %.2f%n", valorFinalDinheiro);
                    break;
                case 2:
                    double acrescimoCartao = produto * 0.05;
                    double valorFinalCartao = produto + acrescimoCartao;
                    System.out.printf("Pagamento com cartão. Valor final: R$ %.2f%n", valorFinalCartao);
                    break;
                case 3:
                    double descontoPix = produto * 0.02;
                    double valorFinalPix = produto - descontoPix;
                    System.out.printf("Pagamento via Pix. Valor final: R$ %.2f%n", valorFinalPix);
                    break;
                case 4:
                    System.out.println("Operação encerrada.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        
    } while (opcao != 4); {
        
    }
   
}
 }

