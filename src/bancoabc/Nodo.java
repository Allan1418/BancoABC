
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
     * Atributo que almacena el tipo de dato en el nodo
     */
    private tipo dato;
    
    /**
     * Atributo que almacena el enlace al siguiente nodo
     */
    private Nodo<tipo> enlace;
    
    /**
     * Obtiene el dato almacenado en el Nodo.
     * @return El dato almacenado en el Nodo.
     */
    public tipo getDato() {
        return dato;
    }
    
    /**
     * Establece el dato a almacenar en el Nodo.
     * @param dato El nuevo dato a almacenar en el Nodo.
     */
    public void setDato(tipo dato) {
        this.dato = dato;
    }

    /**
     * Obtiene el enlace del Nodo.
     *@return El enlace del Nodo.
     */
    public Nodo<tipo> getEnlace() {
        return enlace;
    }

    /**
     * Establece el enlace al Nodo.
     * @param enlace El nuevo enlace al Nodo.
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
