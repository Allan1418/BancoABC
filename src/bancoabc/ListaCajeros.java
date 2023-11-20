package bancoabc;

import static bancoabc.estTer.*;
import java.util.ArrayList;

/**
 * -m
 * 
 * @author Allan Nunez Brenes
 */
public class ListaCajeros {

    /**
     * Nodo cabeza de la lista que contiene los cajeros.
     */
    private Nodo<Cajero> cabeza;

    /**
     * Tamaño actual de la lista (número de cajeros).
     */
    private int size;

    /**
     * Obtiene el nodo cabeza de la lista de cajeros.
     *
     * @return El nodo cabeza de la lista.
     */
    public Nodo<Cajero> getCabeza() {
        return cabeza;
    }

    /**
     * Establece el nodo cabeza de la lista de cajeros.
     *
     * @param cabeza El nuevo nodo cabeza de la lista.
     */
    public void setCabeza(Nodo<Cajero> cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * Obtiene el tamaño actual de la lista de cajeros.
     *
     * @return El tamaño actual de la lista.
     */
    public int getSize() {
        return size;
    }

    /**
     * Establece el tamaño actual de la lista de cajeros.
     *
     * @param size El nuevo tamaño actual de la lista.
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Constructor que inicializa una lista de cajeros con la cantidad
     * especificada.
     *
     * @param cantidad La cantidad de cajeros en la lista.
     */
    public ListaCajeros(int cantidad) {
        crearLista(cantidad);
    }

    /**
     * Crea una nueva lista de cajeros con la cantidad especificada.
     *
     * @param cant La cantidad de cajeros en la lista.
     */
    public void crearLista(int cant) {
        this.cabeza = null;

        Nodo<Cajero> anterior = null;

        for (int i = 0; i < cant; i++) {

            Nodo<Cajero> nuevoNodo = new Nodo<>(new Cajero(i + 1));

            if (cabeza == null) {
                cabeza = nuevoNodo;
                anterior = nuevoNodo;
            } else {
                anterior.setEnlace(nuevoNodo);
                anterior = nuevoNodo;
            }

        }
        this.size = cant;

    }

    /**
     * Busca un cajero en la lista por su identificador único.
     *
     * @param id El identificador único del cajero a buscar.
     * @return El cajero con el identificador proporcionado o {@code null} si no
     * se encuentra.
     */
    public Cajero buscar(int id) {

        Nodo<Cajero> aux = cabeza;

        if (aux == null || aux.getDato().getId() > id) {
            return null;
        }

        while (aux != null) {
            if (aux.getDato().getId() == id) {
                return aux.getDato();
            }
            aux = aux.getEnlace();
        }

        return null;
    }

    /**
     * Imprime el estado actual de los cajeros en la lista, incluyendo si están
     * atendiendo una ficha.
     */
    public void imprimirAtendiendo() {
        Nodo<Cajero> aux = cabeza;
        String m;

        while (aux != null) {

            m = "Caja #" + aux.getDato().getId() + ": ";

            if (!aux.getDato().isLibre()) {
                m += aux.getDato().getAtendiendo().toString();
                m = m.replaceFirst("\\[\\d{2}m", "[33m");
            } else {
                m += "Caja Vacia!";
            }

            System.out.println(m);

            aux = aux.getEnlace();
        }
    }

    /**
     * Obtiene un array de identificadores de cajeros en formato de string,
     * filtrando por si estan atendiendo, si estan libres o sin filtro. 
     * se pueden añadir opciónes adicionales al final del array.
     *
     * @param volver Indica si se debe incluir la opción "Volver" en el array.
     * @param todos Indica si se debe incluir la opción "Todos" en el array.
     * @param op La opción específica que se debe aplicar al filtrar la lista
     * (TRUE, FALSE, NO_APLICA).
     * @return Un array de identificadores de cajeros en formato de string.
     */
    public String[] getArrayStr(boolean volver, boolean todos, estTer op) {

        Nodo<Cajero> aux = cabeza;
        ArrayList<String> botones = new ArrayList<>();

        while (aux != null) {
            if (op == FALSE && !aux.getDato().isLibre()) {
                botones.add(String.valueOf(aux.getDato().getId()));
            } else if (op == TRUE && aux.getDato().isLibre()) {
                botones.add(String.valueOf(aux.getDato().getId()));
            } else if (op == NO_APLICA) {
                botones.add(String.valueOf(aux.getDato().getId()));
            }
            aux = aux.getEnlace();
        }

        if (todos) {
            botones.add("Todos");
        }
        if (volver) {
            botones.add("Volver");
        }

        String[] retorno = new String[botones.size()];

        return botones.toArray(retorno);
    }
    
    
}
