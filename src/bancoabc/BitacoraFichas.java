package bancoabc;

/**
 * 
 * @author 
 */
public class BitacoraFichas {

    /**
     * Nodo cabeza de la estructura que contiene las fichas registradas en la bitácora.
     */
    private Nodo<Ficha> cabeza;
 
    /**
     * Obtiene el nodo cabeza de la estructura de la bitácora.
     * 
     * @return El nodo cabeza de la bitácora.
     */
    public Nodo<Ficha> getCabeza() {
        return cabeza;
    } 

    /**
     * Establece el nodo cabeza de la estructura de la bitácora.
     * 
     * @param cabeza El nuevo nodo cabeza de la bitácora.
     */
    public void setCabeza(Nodo<Ficha> cabeza) {
        this.cabeza = cabeza;
    }
    
    /**
     * Constructor que inicializa una bitácora sin fichas registradas (cabeza nula).
     */
    public BitacoraFichas() {
        this.cabeza = null;
    }

    /**
     * Inserta una nueva ficha en la lista enlazada de manera ordenada según la
     * fecha de atención.
     *
     * Este método público crea un nuevo nodo con la ficha proporcionada y lo
     * inserta en la lista enlazada de manera que se mantenga el orden
     * ascendente de las fechas de atención. Si la lista está vacía, el nuevo
     * nodo se convierte en la cabeza.
     *
     * @param nuevo La nueva ficha que se va a insertar en la lista.
     */
    public void insertar(Ficha nuevo) {

        Nodo<Ficha> nuevoNodo = new Nodo<>(nuevo);

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else if (nuevoNodo.getDato().getAtencion().before(cabeza.getDato().getAtencion())) {
            nuevoNodo.setEnlace(cabeza);
            cabeza = nuevoNodo;
        } else {
            Nodo<Ficha> aux = cabeza;
            insertar(nuevoNodo, aux);
        }
    }

    /**
     * Método privado utilizado para insertar un nuevo nodo con una ficha en una
     * posición ordenada dentro de una estructura de nodos.
     *
     * Este método realiza la inserción ordenada de un nuevo nodo en una
     * estructura de nodos, comparando las fechas de atención de las fichas. El
     * nuevo nodo se inserta en la posición correcta para mantener el orden
     * ascendente de las fechas de atención.
     *
     * @param nuevoNodo El nuevo nodo que se va a insertar en la estructura.
     * @param nodoActual El nodo actual desde el cual se inicia la búsqueda e
     * inserción.
     */
    private void insertar(Nodo<Ficha> nuevoNodo, Nodo<Ficha> nodoActual) {
        if (nodoActual.getEnlace() == null || nuevoNodo.getDato().getAtencion().before(nodoActual.getEnlace().getDato().getAtencion())) {
            nuevoNodo.setEnlace(nodoActual.getEnlace());
            nodoActual.setEnlace(nuevoNodo);
        } else {
            insertar(nuevoNodo, nodoActual.getEnlace());
        }

    }

    /**
     * Imprime por la consola la información de las fichas almacenadas en la
     * lista enlazada.
     *
     * Este método público inicia la impresión de la lista enlazada, verificando
     * si la lista está vacía y, en ese caso, mostrando un mensaje indicando que
     * la bitácora está vacía. En caso contrario, llama al método privado de
     * impresión.
     */
    public void imprimir() {
        Nodo<Ficha> aux = cabeza;

        if (aux == null) {
            System.out.println("Bitacora Vacia!");
            return;
        }

        imprimir(aux);

    }

    /**
     * Método privado utilizado para imprimir recursivamente la información de
     * las fichas almacenadas en una estructura de nodos.
     *
     * Este método realiza una impresión en profundidad (recursiva) de la
     * información de las fichas almacenadas en la estructura de nodos. Se
     * utiliza principalmente para imprimir el contenido de una lista enlazada u
     * otra estructura similar.
     *
     * @param actual El nodo actual desde el cual se inicia la impresión. Puede
     * ser el nodo cabeza de una lista enlazada.
     */
    private void imprimir(Nodo actual) {
        if (actual != null) {
            System.out.println(((Ficha) actual.getDato()).toString());
            imprimir(actual.getEnlace());
        }

    }

}
