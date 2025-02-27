public class Operadores1 {
    public static void main(String[] args) {
        int numero = 10;
        numero = -numero;
        
        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);


        // x repetição

        int numero2 = 5;
        // é a mesma representação só que usando outro operador
        numero2 = numero2 + 1;
        numero2++;
        System.out.println(numero2);
        // essa é a forma de incrementar +1 ou decrementar -1 no print
        System.out.println(++numero2);
        System.out.println(numero2 --);
        System.out.println(numero2);


        // boolean

        boolean variavel = true;

        System.out.println(!variavel);

        variavel = !variavel;
        System.out.println(variavel);
    }
}
