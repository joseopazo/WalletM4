package ejecutarMetodos;
import com.wallet.dependencias.CambioMoneda;
import com.wallet.dependencias.Cliente;
import com.wallet.dependencias.Cuenta;


/**
 * @author jopaz
 * poyecto Wallet , billetera digital el cual permite a un usuario ,
 * crear,depocitar y retirar fundos de su cuenta y tambien saber su monto en dolares
 */
public class Main {
    /**
     * metodo main, el cul permite ejecutar mis metodos
     * y sus conecciones entre si para poder obtener los datos segun el requerimiento
     *
     */
    public static void main(String[] args){
        Cliente cliente1 =  new Cliente(14,"José Opazo");
        Cuenta cuenta1 = new Cuenta(1234,"Jose", 1225.4, cliente1);
        cuenta1.mostrarInformacion();
        System.out.println("===============================================================");
        cuenta1.depositar(2000);
        System.out.println("el saldo actual es $" + cuenta1.getSaldo());
        System.out.println("===============================================================");
        cuenta1.retirar(1000);
        System.out.println("el saldo actual es $" + cuenta1.getSaldo());
        System.out.println("===============================================================");
        CambioMoneda dolar = new CambioMoneda(0, cuenta1);
        System.out.println("tu saldo en dolares es:" + dolar.monedaDolar(2225.4));
        System.out.println("***************************************************************");
    }
}
