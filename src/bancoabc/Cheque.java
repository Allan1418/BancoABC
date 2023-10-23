
package bancoabc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Cheque {

    //Variable Global
    private static int contador = 1;

    // Atributos
    // Número de cheque, nombre, fecha de emisión, monto.
    private int numero;
    private String nombre;
    private String date;
    private double monto;

    
    //Metodos Get y set
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMonto() {
        return monto;
    }

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
