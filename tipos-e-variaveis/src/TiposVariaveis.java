public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        // o ponto serve para usar números decimais
        double salarioMinimo = 2500.33;

        // exemplo de cast
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // variáveis, pode ser alterada a qualquer momento
        int numero = 5;

        numero  = 10;

        System.out.println(numero);

        // constantes (final) não pode ser alterada
        final double PI = 3.14;

        System.out.println(PI);
    }
}
