
package bancoabc;

/**
 * Clase Nodo para crear estructuras de datos con dos atributos: enlace y dato.
 *
 * @param <tipo> El tipo de elementos que se guardara en el Nodo.
 */
public class Nodo<tipo> {

    private tipo dato;
    private Nodo enlace;

    public tipo getDato() {
        return dato;
    }

    public void setDato(tipo dato) {
        this.dato = dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
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
