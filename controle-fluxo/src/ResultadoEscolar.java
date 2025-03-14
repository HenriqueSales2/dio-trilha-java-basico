import java.util.Scanner;


public class ResultadoEscolar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua nota: ");
        int nota = scanner.nextInt();

        if (nota >= 7 && nota <= 10) // está condição tem que retornar True
            System.out.println("Aprovado");

            else if (nota >= 5 && nota < 7) // está expressão sempre tem que retornar ou True ou False
                System.out.println("Aluno de recuperação");

            else if (nota < 5)
                System.out.println("Reprovado");
        
        else // está tem que retornar False
         System.out.println("Nota Inválida");
     }
 }
