public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Henrique " + "Oliveira" + " Sales";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1" +(1+1+1);
        System.out.println(concatenacao);

    }
}
