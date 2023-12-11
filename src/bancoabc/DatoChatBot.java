
package bancoabc;

/**
 *Esta clase representa un objeto de datos utilizado en el chatbot.
 * Almacena información sobre un nodo en el árbol del chatbot, incluido su ID,
 * nombre y lista de preguntas (si es un nodo de preguntas).
 * @author Anyelo Vargas Merlo
 */
public class DatoChatBot {
    
    /**
     * Una String que representa el identificador único del nodo.
     */
    private String id;
    
    /**
     * Un String que representa el nombre del nodo.
     */
    private String name;
    
    /**
     * Un objeto ListaPreguntas que contiene una lista de preguntas y 
     * respuestas para este nodo (si es un nodo de preguntas).
     */
    private ListaPreguntas preguntas;

    /**
     * Recupera el identificador único del nodo.
     * 
     * @return El ID del nodo (String).
     */
    public String getId() {
        return id;
    }

    /**
     * establece el identificador único del nodo.
     * 
     * @param id El nuevo ID del nodo (String).
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * (String) Recupera el nombre del nodo
     * 
     * @return El nombre del nodo
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del nodo.
     * 
     * @param name El nuevo nombre del nodo
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * (ListaPreguntas) Recupera la lista de preguntas y respuestas del nodo.
     * 
     * @return Lista de preguntas y respuestas
     */
    public ListaPreguntas getPreguntas() {
        return preguntas;
    }

    /**
     * Establece la lista de preguntas y respuestas para el nodo.
     * 
     * @param preguntas La nueva lista de preguntas preguntas para el nodo
     */
    public void setPreguntas(ListaPreguntas preguntas) {
        this.preguntas = preguntas;
    }

    /**
     * Crea un nuevo objeto DatoChatBot con
     * valores nulos para todos los atributos.
     */
    public DatoChatBot() {
        this.id = null;
        this.name = null;
        this.preguntas = null;
    }

    /**
     * Crea un nuevo objeto DatoChatBot con el ID y el nombre especificados.
     * 
     * @param id (String) El ID del nodo.
     * @param name (String) El nombre del nodo
     */
    public DatoChatBot(String id, String name) {
        this.id = id;
        this.name = name;
        this.preguntas = null;
    }
    
    /**
     * (booleano) Comprueba si la lista de preguntas es un objeto o nulo 
     * (tiene una lista de preguntas).
     * 
     * @return true si la lista de preguntas es un objeto, falso en caso de que
     * sea nulo.
     */
    public boolean isPreguntas(){
        return preguntas != null;
    }

    /**
     * (String) sobrescribe el método toString() predeterminado 
     * para devolver el nombre del nodo.
     * 
     * @return El nombre del nodo (String).
     */
    @Override
    public String toString() {
        return getName();
    }
    
    
    
    
}
