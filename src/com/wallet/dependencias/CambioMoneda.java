package com.wallet.dependencias;
/**
 *Clase cambio moneda, la cual tiene como funcion poder convertir el saldo de peso chileno"clp"
 * a dolar"us".
 * atributos para este objeto : dolar con tipo de dato "double",
 * cuenta la cual conecta con mi clase Cuenta y traer datos de esa clase especfica.
 */
public class CambioMoneda {
    private double dolar;
    private Cuenta cuenta;

    /**
     * creamos el constructor para poder inciar insertar datos a nuestro objeto
     * @param dolar
     * @param cuenta
     */
    public CambioMoneda(double dolar, Cuenta cuenta) {

        this.dolar = dolar;
        this.cuenta = cuenta;
    }

    /**
     * aca se contruyeron nuestros getters y setters para la manipulacion de nuestros atributos privados:
     * @return atributo dolar el cual tiene como tipo de valor double
     */
    public double getDolar() {
        return dolar;
    }


    public void setDolar(double dolar) {
        this.dolar = dolar;
    }



    public Cuenta getCuenta() {
        return cuenta;
    }


    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * creamos metodo monedaDolar el cual permite pasar nuestro saldo y convertirlo a valor de dolar
     * @param saldo este sera pasado como parametro para que la logica del metodo haga la convercion
     * @return conversorDolar devolvera el valor calculado entre el saldo y el valor del dolar
     * devolviendonos como resultado el saldo en dolares
     */
    public double monedaDolar(double saldo) {

        this.dolar = 850;
        double coversorDolar = saldo * dolar;
        return coversorDolar;

    }
}
