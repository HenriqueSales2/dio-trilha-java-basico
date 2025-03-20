import java.util.Locale;
import java.util.Scanner;


public class AboutMe {
    public static void main(String[] args) throws Exception {

        try{

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        // imprimindo os dados obtidos
    
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + " Anos");
        System.out.println("Minha altura é " + altura + "cm");
        scanner.close(); 
    }
    // tratamento de exceção
    catch (java.util.InputMismatchException e) {
        System.out.println("Os campos idade e altura precisam ser numéricos");
    }
}
}
