package bancoabc;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * La clase Ficha representa la información de un ficha en un sistema,
 * con atributos como el número de ficha, el nombre del cliente, 
 * el número de cédula,la fecha y hora de llegada,
 * la fecha y hora de atención (si aplica), y si el cliente es preferencial o no.
 * 
 * @author Allan Nunez Brenes, Anyelo Vargas Merlo
 */

public class Ficha {

    //Variables Globlales
    
    /**
     * Variable privada estatica que registra un total de instancias que se
     * han creado de fichas normales, se inicializa en 1
     */
    private static int contNormal = 1;
    
    /**
     * Variable privada estatica que registra un total de instancias que se
     * han creado de fichas preferenciales, se inicializa en 1
     */
    private static int contPreferencial = 1;

    //Atributos
    //Número de ficha, Número de Cédula del cliente, Nombre del cliente, Fecha y hora de llegada(Formato timestamp)
    
    /**
     * Atributo tipo String que representa el codigo la ficha
     */
    private String numero;
    
    /**
     * Atributo tipo String que representa la cedula asociada a la ficha
     */
    private String cedula;
    
    /**
     * Atributo tipo String que representa el nombre asociada a la ficha
     */
    private String nombre;
    
    /**
     * Atributo Timestamp que representa la Fecha y hora de llegada al sistema 
     */
    private Timestamp llegada;
    
    /**
     * Atributo Timestamp que representa la Fecha y hora de atencion al sistema 
     */
    private Timestamp atencion;
    
    /**
     * Atributo tipo boolean que representa indica si la ficha es preferencial (true)
     * o regular (false).
     */
    private boolean preferencial;

    //Metodos Get y set
    
    /**
     * Obtiene el codigo de la ficha.
     * @return El codigo de la ficha.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Establece el número de cédula del cliente.
     * @param numero El nuevo número de la ficha.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Obtiene el número de cédula del cliente.
     * @return El número de cédula del cliente.
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Establece el número de cédula del cliente.
     * @param cedula El nuevo número de cédula del cliente.
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Obtiene el nombre del cliente.
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     * @param nombre El nuevo nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la fecha y hora de llegada del cliente en formato de timestamp.
     * @return La fecha y hora de llegada del cliente.
     */
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

    /**
     * Establece la fecha y hora de llegada del cliente.
     * @param llegada La nueva fecha y hora de llegada del cliente.
     */
    public void setLlegada(Timestamp llegada) {
        this.llegada = llegada;
    }

    /**
     * Obtiene la fecha y hora de atención del cliente en formato de timestamp.
     * @return La fecha y hora de atención del cliente.
     */
    public Timestamp getAtencion() {
        return atencion;
    }

    /**
     * Establece la fecha y hora de llegada del cliente.
     * @param atencion La nueva fecha y hora de llegada del cliente.
     */
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

    /**
     * Verifica si el cliente es preferencial.
     * 
     * @return {@code true} si el cliente es preferencial, {@code false} si es regular.
     */
    public boolean isPreferencial() {
        return preferencial;
    }

    /**
     * Establece si el cliente es preferencial o no.
     * @param preferencial Indica si el cliente es preferencial (true) o no (false).
     */
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
     * Devuelve una string de la ficha, resaltando en color la
     * información según su tipo (preferencial o regular).
     *
     * Este método genera una representación en cadena de la ficha, utilizando
     * colores ANSI según si la ficha es preferencial (rojo) o regular (verde).
     * La información incluye el número de la ficha, el nombre, la cédula, 
     * la hora de llegada y (si está disponible) la hora de atención.
     *
     * @return Una string que representa la ficha con información resaltada en
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
