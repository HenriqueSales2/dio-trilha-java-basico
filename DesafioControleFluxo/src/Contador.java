
public class Contador {
    public static void main(String[] args) throws Exception {
        // Scanner terminal = ??;

        // int parametroUm = terminal??;
        // int parametroDois = terminal.??;

        try {
            // chamando o método contendo a lógica de contagem
            contar(12, 10);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
            }
        else {
        // int contagem = parametroDois - parametroUm;
        for(int contagem = parametroUm; contagem <= parametroDois; contagem++){
            System.out.println("Contando " + contagem);
        }
        }
    }
    }

