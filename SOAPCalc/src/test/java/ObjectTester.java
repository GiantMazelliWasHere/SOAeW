import br.com.fiap3espa.service.Div;
import br.com.fiap3espa.service.Mult;
import br.com.fiap3espa.service.Sub;
import br.com.fiap3espa.service.Sum;

public class ObjectTester {
    public static void main(String[] args) {
        Sum soma = new Sum();
        Sub sub = new Sub();
        Mult mult = new Mult();
        Div div = new Div();

        System.out.println(div.showMessage(5,10));
        System.out.println(div.showName());
        System.out.println(div.calculate(300, 366));
        System.out.println(div.showSymbol());
    }
}
