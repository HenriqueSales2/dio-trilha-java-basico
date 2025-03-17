import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {
        
        // podemos usar o switch case sem o break, para acrescentarmos algo na lista em ordem decrescente

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um plano de celular, digite 'B' para o plano Basic, 'M' para o Midia e o 'T' para Turbo");
        String planoOperadora = scanner.next();

        switch (planoOperadora) {
            case "T": {
                System.out.println("5GB de Youtube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram Grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            }
            default:
                System.out.println("Opção Inválida");
        }
    }
}
