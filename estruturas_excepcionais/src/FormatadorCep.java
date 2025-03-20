public class FormatadorCep {
    public static void main(String[] args) {
    try {
        String cepFormatado = formatarCep("15365467");
        System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
        // TODO Auto-generated catch block
        System.out.println("O cep precisa ter 8 números");
    }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
        throw new CepInvalidoException();

        return "23.765-312";
    }
}
