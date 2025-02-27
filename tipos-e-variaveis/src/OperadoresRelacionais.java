



public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeUm = "Henrique";
        String nomeDois = new String("Henrique");

        // o método equals compara conteúdos se os dois objetos são iguais
        System.out.println(nomeUm.equals(nomeDois));



        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("NúmeroUm é igual ao númeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("NúmeroUm é igual ao númeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("NúmeroUm é igual ao númeroDois? " + simNao);

        simNao = numero1 < numero2;
        System.out.println("NúmeroUm é igual ao númeroDois? " + simNao);


        boolean condicao1 = true;
        boolean condicao2 = true;

            // && condições verdadeiras
            if (condicao1 && (7 > 4) ) {
                System.out.println("As duas condições são verdadeiras");
            }
            // || uma das condições é verdadeira
            if (condicao1 || condicao2) {
                System.out.println("Uma das condições são verdadeiras");
            }
    }
}
