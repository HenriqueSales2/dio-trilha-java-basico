import java.util.Scanner;


public class ResultadoEscolarVariacao2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua nota: ");
        int nota = scanner.nextInt();

        String resultado = nota >= 7 && nota <=10 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : nota >= 0 && nota < 5 ? "Reprovado" : "Nota Inválida";
        System.out.println(resultado);
    }
}
