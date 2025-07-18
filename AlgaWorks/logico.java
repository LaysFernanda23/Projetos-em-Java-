public class logico {
    public static void main(String[] args) {
       /*  boolean habilitado = true;
        boolean desabilitado = false;

        int idade =  14;
        boolean podeTirarCarteira = (habilitado && idade >= 18) || desabilitado;
        System.out.println("Pode tirar carteira: " + podeTirarCarteira);
    }*/
         boolean mulher = true;    boolean homem = false;
    boolean entrada  = true; boolean saida = false;
    boolean verificar = (mulher && entrada) || homem;

    System.out.println("São mulheres ? " + verificar);


    }
   
}
