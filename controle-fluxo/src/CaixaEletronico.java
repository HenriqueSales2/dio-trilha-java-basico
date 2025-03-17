public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolicitado = 22.0;

        
        // devemos usar chaves caso tenha mais de uma intrução no IF
        if(valorSolicitado < saldo){
        saldo = saldo - valorSolicitado;
        System.out.println("Novo Saldo: " + "R$" + saldo);
    }
        else
        System.out.println("Saldo insuficiente " + "R$" + saldo);

    }
}
