import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75");
        System.out.println(valor);

        Number valor2;
        try {
            valor2 = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor2);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
