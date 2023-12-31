package bancoabc;

/**
 * Una clase para representar una cola.
 *
 * @author Allan Nunez Brenes
 * 
 * @param <tipo> El tipo de elemento que almacena la cola.
 */
public class Cola<tipo> {

    /**
     * El primer nodo de la cola.
     */
    private Nodo<tipo> frente;

    /**
     * El ultimo nodo de la cola.
     */
    private Nodo<tipo> ultimo;

    /**
     * El tamaño de la cola.
     */
    private int size;
    
    /**
     * Obtiene el tamaño actual de la cola.
     * @return El tamaño actual de la cola.
     */
    public int getSize() {
        return size;
    }
    
    /**
     * Establece el tamaño de la cola
     * @param size El nuevo tamaño de la cola.
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * crea un objeto de tipo Cola con los valores por defecto de cada atributo.
     */
    public Cola() {
        this.frente = null;
        this.ultimo = null;
        this.size = 0;
    }
    
    /**
     * parametro que retorna si la cola esta vacia o no.
     * 
     * 
     * @return {@code true} si la cola esta vacia, {@code false} si la cola tiene contenido.
     */
    public boolean isVacia() {
        return this.frente == null;
    }

    /**
     * Pone en cola un nuevo elemento al final de la cola.
     *
     * @param dato El elemento a poner en la cola.
     * 
     * se aumenta el atributo size en 1 para llevar un control del tamaño de la
     * cola
     */
    public void ingresarACola(tipo dato) {

        Nodo<tipo> nuevo = new Nodo<>(dato);

        if (this.frente == null) {
            this.frente = nuevo;
            this.ultimo = nuevo;
        } else {
            this.ultimo.setEnlace(nuevo);
            this.ultimo = nuevo;
        }

        size++;
    }

    /**
     * Quita de la cola el primer elemento.
     *
     * @return El primer elemento de la cola, o nulo si la cola está vacía.
     * 
     * se disminuye el atributo size en 1 para llevar un control del 
     * tamaño de la cola
     */
    
    public tipo sacarDeCola() {
        if (this.frente != null) {
            tipo aux = this.frente.getDato();
            this.frente = this.frente.getEnlace();
            size--;
            return aux;
        } else {
            return null;
        }

    }

    /**
     * Imprime el contenido de la cola en la consola.
     */
    public void imprCola() {

        Nodo frenteAux = this.frente;

        while (frenteAux != null) {
            System.out.println(frenteAux.getDato().toString());
            frenteAux = frenteAux.getEnlace();
        }
    }

}
