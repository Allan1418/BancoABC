package bancoabc;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Ficha {

    //Variables Globlales
    private static int contNormal = 1;
    private static int contPreferencial = 1;

    //Atributos
    //Número de ficha, Número de Cédula del cliente, Nombre del cliente, Fecha y hora de llegada(Formato timestamp)
    private String numero;
    private String cedula;
    private String nombre;
    private Timestamp llegada;
    private boolean preferencial;

    //Metodos Get y set
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Timestamp getLlegada() {
        return llegada;
    }

    public String getLlegadaStr() {
        return new SimpleDateFormat("dd-MM-yyyy HH:mm").format(this.llegada);
    }

    public void setLlegada(Timestamp llegada) {
        this.llegada = llegada;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }

    //Constructores
    
    /**
     * Crea un objeto Cheque sin valores iniciales.
     */
    public Ficha() {
    }

    /**
     * Construye un nuevo ticket con los valores dados.
     *
     * @param nombre El nombre del cliente.
     * @param cedula El número de identificación del cliente.
     * @param preferencial Si el cliente es un cliente prioritario o normal.
     */
    public Ficha(String nombre, String cedula, boolean preferencial) {

        if (preferencial) {
            this.numero = "P" + contPreferencial;
            contPreferencial++;
        } else {
            this.numero = "R" + contNormal;
            contNormal++;
        }

        this.nombre = nombre;
        this.cedula = cedula;
        this.llegada = new Timestamp(System.currentTimeMillis());
        this.preferencial = preferencial;
    }

    //Otros Metodos
    @Override
    public String toString() {
        String verde = "\u001B[32m";
        String naranja = "\u001B[33m";
        String reset = "\u001B[0m";
        String color;

        if (preferencial) {
            color = naranja;
        } else {
            color = verde;
        }

        return color + "Numero[" + numero + "] Nombre[" + nombre + "] Cedula[" + cedula + "] Llegada[" + getLlegadaStr() + "]" + reset;
    }

}
