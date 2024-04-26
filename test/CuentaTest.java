import com.wallet.dependencias.Cuenta;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase cuentaTest , esta clase tiene la finalidad de relizar test unitarios
 * la cual podremos probar nuestros metodos mas relevantes
 */
public class CuentaTest {
    private static Cuenta cuentas;

    @BeforeAll
    public static void setUpObject() {
        System.out.println("configuracion inicial de Objetos");
        cuentas = new Cuenta();
    }

    @Test
    public void testDepositar() {
        System.out.println("Prueba de depocitar negativo");
        assertEquals(7000,cuentas.depositar(-8000));
    }

    @Test
    public void testDepositar2() {
        System.out.println("Prueba de depocitar caso exitoso");
        assertEquals(7500,cuentas.depositar(7500));
    }

    @Test
    public void testRetirar() {
        System.out.println("Prueba de retirar caso exitoso");
        assertEquals(1500,cuentas.retirar(1500));
    }

    @Test
    public void testRetirar2() {
        System.out.println("Prueba de retirar caso fallido");
        assertEquals(1500,cuentas.retirar(0));
    }

    @Test
    public void testSeters() {
        System.out.println("Prueba getter");
        cuentas.setNumeroCuenta(123);
        assertEquals(123, cuentas.getNumeroCuenta());
        cuentas.setTitular("jose");
        assertEquals("jose",cuentas.getTitular());
    }
}
