
package bancoabc;

/**
 * Clase Nodo para crear estructuras de datos con dos atributos: enlace y dato.
 *
 * @param <tipo> El tipo de elementos que se guardara en el Nodo.
 * 
 * @author Allan Nunez Brenes
 */
public class Nodo<tipo> {
    
    /**
     * 
     */
    private tipo dato;
    
    /**
     * 
     */
    private Nodo<tipo> enlace;
    
    /**
     * 
     * @return 
     */
    public tipo getDato() {
        return dato;
    }
    
    /**
     * 
     * @param dato 
     */
    public void setDato(tipo dato) {
        this.dato = dato;
    }

    /**
     * 
     * @return 
     */
    public Nodo<tipo> getEnlace() {
        return enlace;
    }

    /**
     * 
     * @param enlace 
     */
    public void setEnlace(Nodo<tipo> enlace) {
        this.enlace = enlace;
    }

    /**
     * crea un objeto de tipo Nodo
     * @param dato la informacion que guarda el nodo.
     */
    public Nodo(tipo dato) {
        this.dato = dato;
    }

}
