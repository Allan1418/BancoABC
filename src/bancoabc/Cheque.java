
package bancoabc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * La clase Cheque representa un cheque financiero con atributos como
 * el número de cheque, el nombre del titular de la cuenta, la fecha de emisión
 * y el monto del cheque.
 * 
 * @author Allan Nunez Brenes, Anyelo Vargas Merlo
 */

public class Cheque {

    //Variable Global
    
    /**
     * Variable privada estatica que registra un total de instancias que se
     * han creado
     */
    private static int contador = 1;

    // Atributos
    // Número de cheque, nombre, fecha de emisión, monto.
    
    /**
     * Atributo de tipo entero que representa el identificador único del chque.
     */
    private int numero;
    
    /**
     * Atributo de tipo String que representa el titular del cheque.
     */
    private String nombre;
    
    /**
     * Atributo de tipo String que representa la fecha de emition del cheque.
     */
    private String date;
    
    /**
     * Atributo de tipo entero que representa el monto especifico del cheque.
     */
    private double monto;

    
    //Metodos Get y set
    
    /**
     * Obtiene el número único que identifica este cheque.
     * @return Número de cheque.
     */
    public int getNumero() {
        return numero;
    }
    
    /**
     * Establece un nuevo numero unico para el titular del cheque.
     * @param numero del titular del cheque
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /**
     * Obtiene el nombre del titular de la cuenta asociada al cheque.
     * @return Nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Establece un nuevo nombre para el titular de la cuenta asociada al cheque.
     * @param nombre Nuevo nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtiene la fecha de emisión del cheque
     * @return Fecha de emisión del cheque.
     */
    public String getDate() {
        return date;
    }
    
    /**
     * Establece una nueva fecha de emisión para el cheque.
     * @param date Nueva fecha de emisión 
     */
    public void setDate(String date) {
        this.date = date;
    }
    
    /**
     * Obtiene el monto monetario especificado en el cheque.
     * @return Monto del cheque.
     */
    public double getMonto() {
        return monto;
    }
    
    /**
     * Establece un nuevo monto monetario para el cheque.
     * @param monto Nuevo monto del cheque.
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }

    
    //Constructores

    /**
     * Crea un objeto Cheque con los valores por defecto de cada atributo.
     */
    public Cheque() {
    }

    /**
     * Crea un objeto Cheque con el nombre del titular y el monto especificados.
     *
     * @param nombre El nombre del titular del cheque.
     * @param monto El monto del cheque.
     * 
     * atributo date se establece con la fecha actual del sistema
     * atributo numero se establece con la variable estatica contador
     * se suma 1 a la varible estatica contador
     */
    public Cheque(String nombre, double monto) {
        this.nombre = nombre;
        this.date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.monto = monto;

        this.numero = contador;
        contador++;
    }

    
    //Otros Metodos
    
    /**
     * @return string en formato con todos los atributos de la clase
     */
    @Override
    public String toString() {
        return "Numero[" + numero + "] Nombre[" + nombre + "] Fecha[" + date + "] Monto[" + monto + "]";
    }

}
