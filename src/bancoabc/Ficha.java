package bancoabc;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * 
 * @author 
 */

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
    private Timestamp atencion;
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

    /**
     * Devuelve la fecha de llegada del vuelo en formato "dd-MM-yyyy HH:mm".
     * 
     * @return La fehca de llegada formateada como cadena de caracteres.
     */
    public String getLlegadaStr() {
        return new SimpleDateFormat("dd-MM-yyyy HH:mm").format(this.llegada);
    }

    public void setLlegada(Timestamp llegada) {
        this.llegada = llegada;
    }

    public Timestamp getAtencion() {
        return atencion;
    }

    public void setAtencion(Timestamp atencion) {
        this.atencion = atencion;
    }

    /**
     * Devuelve la fecha de Atencion del vuelo en formato "dd-MM-yyyy HH:mm".
     * 
     * @return La fehca de Atencion formateada como cadena de caracteres.
     */
    public String getAtencionStr() {
        return new SimpleDateFormat("dd-MM-yyyy HH:mm").format(this.atencion);
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }

    //Constructores
    /**
     * Crea un objeto Ficha con los valores por defecto de cada atributo.
     */
    public Ficha() {
    }

    /**
     * Crea un objeto Ficha con los valores dados.
     *
     * @param nombre El nombre del cliente.
     * @param cedula El número de identificación del cliente.
     * @param preferencial Si el cliente es un cliente preferencial (true) o
     * normal (false).
     *
     * atributo llegada se obtiene del la fecha actual del sistema
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
        this.atencion = null;
        this.preferencial = preferencial;
    }

    //Otros Metodos
    
    /**
     * Devuelve una representación en cadena de la ficha, resaltando en color la
     * información según su tipo (preferencial o regular).
     *
     * Este método genera una representación en cadena de la ficha, utilizando
     * colores ANSI para resaltar ciertos elementos según si la ficha es
     * preferencial o regular. La información incluye el número de la ficha, el
     * nombre, la cédula, la hora de llegada y, si está disponible, la hora de
     * atención.
     *
     * @return Una cadena que representa la ficha con información resaltada en
     * color.
     */
    @Override
    public String toString() {
        String verde = "\u001B[32m";
        String rojo = "\u001B[31m";
        String reset = "\u001B[0m";
        String color;
        String m;

        if (preferencial) {
            color = rojo;
        } else {
            color = verde;
        }

        m = color + "Numero[" + numero + "] Nombre[" + nombre + "] Cedula[" + cedula + "] Llegada[" + getLlegadaStr() + "]";

        if (atencion != null) {
            m += " Atencion[" + getAtencionStr() + "]";
        }

        m += reset;

        return m;
    }

}
