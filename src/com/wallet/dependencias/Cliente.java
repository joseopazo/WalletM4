package com.wallet.dependencias;

import java.util.Scanner;

public class Cliente {

    /**
     *  Clase cliente la cual genera un nuevo cliente para una cuenta bancaria
     * este esta compuesto de 3 atrubutos  id, nombre y cuenta la cuel se conecta a la clase Cuenta
     * para poder obtener datos especieficos de dicha clase.
     */
    private long id;
    private String nombre;
    private Cuenta cuenta;

    /**
     * creamos constructor con los sieguientes atributos .
     * @param id
     * @param nombre
     */

    public Cliente(long id, String nombre) {
        super();
        this.id = id;
        this.nombre = nombre;

    }
    /**
     * metodo crearUsuarioteclado nos permite crear un nuevo cliente por intermedio de seleccion por teclado
     * utilisando la clase Scanner nos permite interactuar dinamicamente con el usuario.
     * este nos pide ingresar un ID y luego el nombre del cliente
     * @return finalmente retorna el objeto cliente con el ID y nombre solicitados por el Scanner.
     * actualmente este metodo se encuantra sin ser llamado por Main ya que no esta en el requerimieto ,
     * pero esta funcionando sin problemas y puede ser llamado para probar su funcionameinto.
     */

    public static Cliente crearUsuarioteclado(){
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese id de cliente: ");
        long id = scan.nextLong();
        scan.nextLine();
        System.out.println("ingrese nombre del cliente: ");
        String nombre = scan.nextLine();
        scan.close();
        return new Cliente(id,nombre);
    }

    /**
     * metodo mostrarInformacion, como su nombre lo indica, este metodo al invocarlo en Main
     * nos muestra por consola la informacion de los datos del cleinte creado por teclado.
     */

    public void mostrarInformacion() {
        System.out.println("ID Cliente: " + id);
        System.out.println("Nombre cliente: " + nombre);
        cuenta.mostrarInformacion();
    }

    /**
     * creamos nustros getters y setters respectivamente
     * @return cada atributo de estos
     */
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
