package com.wallet.dependencias;
/**
 * creamos nuestra interfaz Transacciones para pasar 2 metodos a las clases que lo requieran,
 * en este caso para la Clase Cuenta en donde se hara la logica de depositar dinero y retirarlo.
 * mandando como parametro la cantidad tanto para depositar como para retirar dinero.
 */
public interface Transacciones {

    double depositar(double cantidad);
    double retirar(double cantidad);
}
