package bancoabc;

/**
 * Una clase para representar una cola.
 *
 * @param <tipo> El tipo de elementos en la cola.
 */
public class Cola<tipo> {

    /**
     * El primer nodo de la cola.
     */
    private Nodo frente;

    /**
     * El ultimo nodo de la cola.
     */
    private Nodo ultimo;

    /**
     * El tamaño de la cola.
     */
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Cola() {
        this.frente = null;
        this.ultimo = null;
        this.size = 0;
    }

    
    /**
     * Crea una nueva cola copiando los valores del objeto Cola proporcionado.
     *
     * @param c cola desde la cual se copiarán los valores.
     */
    public Cola(Cola c) {
        this.frente = c.frente;
        this.ultimo = c.ultimo;
        this.size = c.size;
    }

    public boolean isVacia() {
        return this.frente == null;
    }

    /**
     * Pone en cola un nuevo elemento al final de la cola.
     *
     * @param dato El elemento a poner en la cola.
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
     */
    public tipo sacarDeCola() {
        if (this.frente != null) {
            @SuppressWarnings("unchecked")
            tipo aux = (tipo) this.frente.getDato();
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
