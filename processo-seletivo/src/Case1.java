import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Case1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        selecaoCandidatos();
        // Vamos imaginar que em um processo seletivo existe o valor base
        // salarial de R$ 2.000,00 e o salário pretendido pelo candidato. Vamos elaborar
        // um controle de fluxo onde:

        // Se o valor salario base for maior que o valor pretendido, imprima
        // LIGAR PARA O CANDIDATO;

        // Senão Se o valor salario base for igual ao valor salario pretendido, imprima:
        // LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA;

        // Senão imprima: AGUARDANDO RESULTADO DEMAIS CANDIDATOS


        // System.out.println("------------Processo Seletivo------------");
        // System.out.println("Bem vindo ao nosso Processo Seletivo para entrar na Empresa (*******)");
        // System.out.println("Por favor, digite o salário que gostaria de receber? (Ex: 2000)");
        // double salario = scanner.nextDouble();
        // analisarCandidato(salario);
        // analisarCandidato(1900.0);
        // analisarCandidato(2300.0);
        // analisarCandidato(2000.0);

    }
    static void selecaoCandidatos(){
        // Array com a lista de candidatos

        String [] candidatos = {"HENRIQUE" , "ANA", "LETICIA", "JULIA", "SOPHIA", "MALU", "GABRIELLY", "GIOVANNA", "LUIZA", "RUANA"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido) {
            double salarioBase = 2000.0;
            if (salarioBase > salarioPretendido){
                System.out.println("Ligar para o candidato!");
            }
            else if (salarioBase == salarioPretendido) {
                System.out.println("Ligar para o candidato com contra proposta!");
            }
            else {
                System.out.println("Aguardando resultado demais candidatos");
            }
    }
}
