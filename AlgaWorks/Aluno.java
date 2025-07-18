public class Aluno {
    public static void main(String[] args) {
        String nome = "Lays fernanda";
         double nota = 7.0;
        boolean aprovado = nota >= 7.0;
        boolean reprovado = nota < 7.0;

       if (nota >= 7.0) {
            System.out.println("Aluna " + nome + " aprovado com nota: " + nota);
        } else if (nota < 7.0 && nota >= 5.0) {
            System.out.println("Aluno " + nome + " em recuperação com nota: " + nota);
        } else {
            System.out.println("Aluno " + nome + " reprovado com nota: " + nota);
        
       }
    }
}
