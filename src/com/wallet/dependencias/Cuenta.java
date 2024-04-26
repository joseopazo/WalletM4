package com.wallet.dependencias;

/**
 * Clase cuenta la cuel tenemos concentrada casi toda la logica ya que es la encargada de recibir los datos del cliente ,
 * y tambien poder hacer las transacciones correspondientes.
 * esta clase esta recibiendo la implementacion de la interfaz Transacciones para usar sus metodos creados en esa interfaz por norma
 * la clase esta compuesta por los atributos numeroCuenta ,titular,saldo y cliente que conecta con la Clase Cliente para obtener su nombre y Id si se requiere.
 */
public class Cuenta implements Transacciones{

    private int numeroCuenta;
    private String titular;
    private double saldo;
    private Cliente cliente;

    /**
     * creamos nuestro constructor con los atributos correspondientes
     * @param numeroCuenta
     * @param titular
     * @param saldo
     * @param cliente
     */
    public Cuenta(int numeroCuenta, String titular, double saldo, Cliente cliente) {
        super();
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    /**
     * creamos el constructor vacio para evitar errores de tipeo o compilacion.
     */
    public Cuenta() {

    }

    /**
     * creamos nuetros getters y setters
     * @return con sus respectivos atributos
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    /**
     * metodo mostrarInformacion el cual tiene como instruccion entregarnos por intermedio de print de pantalla,
     * los datos de nuestra cuenta
     */
    public void mostrarInformacion() {
        System.out.println("El numero de Cuenta es: " + numeroCuenta);
        System.out.println("El nombre del Titular es: " + titular);
        System.out.println("Su saldo es :$" + saldo);
    }

    /**
     *metedodo depositar, el cual tiene como funcion poder relizar una transaccion de adicionar un monto,
     * el saldo de la cuenta utilizando como parametro.
     * @param cantidad para mandarle a niestro metodo la cantidad a depositar
     * @return cantidad , el cual es el valor trabajo con la logica introducida en el metodo
     */
    @Override
    public double depositar(double cantidad) {
        if(cantidad > 0) {
            saldo+=cantidad;
            System.out.println("Se depocitaron :$" + cantidad + " en la cuenta");
        }else {
            System.out.println("favor ingrese cantidad para depocitar");
        }
        return cantidad;
    }

    /**
     *metodo retirar , el cual tiene como funcion poder retirar una cantidad especifica del saldo
     * @param cantidad el cual se manda a este metodo para luego retornar
     * @return la cantidad enviada por el usuario.
     */
    @Override
    public double retirar(double cantidad) {
        if(saldo > 0) {
            saldo-=cantidad;
            System.out.println("se retiro :" + cantidad + " de su saldo ");
        }else {
            System.out.println("no dispone de saldo en su cuenta ");
        }
        return cantidad;
    }
}
