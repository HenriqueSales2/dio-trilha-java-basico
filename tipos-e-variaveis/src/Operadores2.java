public class Operadores2 {
    public static void main(String[] args) {
            int a, b;

            a = 5;
            b = 6;
            String resultado;

            // usando if, else
            if (a==b)
                resultado = "verdadeiro";
            else
                resultado = "falso";

            System.out.println(resultado);

            // usando expressão boolean

            String resultado2 = a==b ?"verdadeiro" : "falso";
            System.out.println(resultado2);

        
        }
}
