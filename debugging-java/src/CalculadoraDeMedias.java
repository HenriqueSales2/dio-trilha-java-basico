import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraDeMedias {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alunos = {"Henrique", "Lucas", "Sophia", "Luiza"};

        double media = calculaMediaDaTurma(alunos, scanner);

        // existem duas formas de formatar, não sei se existem mais formas
        // as duas eu aprendi no youtube

        (new DecimalFormat(".#")).format(media);

        System.out.println("Média da turma: " + media);
        System.out.printf("Média da turma: " + media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for(String aluno : alunos) {
            System.out.println("Nota do aluno: " + aluno);
            double nota = scanner.nextDouble();
            soma += nota;
            
        }
        return soma / alunos.length;
        
    }

}
