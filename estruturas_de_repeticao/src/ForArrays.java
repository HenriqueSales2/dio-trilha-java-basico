public class ForArrays {
    public static void main(String[] args) {
        
        String alunos[] = {"Henrique", "Kevin", "Gabriel", "Ana", };

        for (int x=0; x<alunos.length; x++) { // lenght = tamanho
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        // forma abreviada

        String alunos2[] = {"Henrique", "Kevin", "Gabriel", "Ana", };

        for(String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
