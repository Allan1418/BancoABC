
package bancoabc;

/**
 * Esta clase representa un chatbot con una estructura 
 * de datos de tipo arbol binario.
 * Proporciona métodos para insertar nodos, preguntas y 
 * recuperar lista de preguntas de un nodo.
 * 
 * @author Allan Nunez Brenes.
 */
public class ChatBot {
    
    /**
     * Un objeto NodoDoble que representa el nodo raíz del árbol del chatbot.
     */
    private NodoDoble<DatoChatBot> raiz;

    /**
     * Obtiene el nodo raíz del árbol del chatbot.
     * 
     * @return El nodo raíz.
     */
    public NodoDoble<DatoChatBot> getRaiz() {
        return raiz;
    }

    /**
     * Establece el nodo raíz del árbol del chatbot.
     * 
     * @param raiz  El nuevo nodo raíz
     */
    public void setRaiz(NodoDoble<DatoChatBot> raiz) {
        this.raiz = raiz;
    }

    /**
     * Construye un nuevo objeto ChatBot con un nodo raíz predeterminado.
     */
    public ChatBot() {
        NodoDoble<DatoChatBot> nuevo = new NodoDoble<>(new DatoChatBot("1", "Preguntas Frecuentes (FAQ)"));
        this.raiz = nuevo;
    }
    
    /**
     * Este método privado intenta recuperar el nodo con la ID especificada
     * del árbol del chatbot. Primero intenta llamar al método
     * getNodo(String idNodo, NodoDoble<DatoChatBot> actual),
     * comenzando desde el nodo raíz. Si se encuentra el nodo, 
     * se devuelve. De lo contrario, se devuelve nulo.
     * 
     * @param idNodo El ID del nodo a buscar.
     * @return El nodo con el ID especificado, o nulo si no se encuentra el nodo.
     */
    private NodoDoble<DatoChatBot> getNodo(String idNodo) {

        NodoDoble<DatoChatBot> retorno = null;

        try {
            retorno = getNodo(idNodo, raiz);
        } catch (IndexOutOfBoundsException | NullPointerException e) {

        }

        return retorno;
    }

    /**
     * Este método auxiliar privado busca recursivamente 
     * el nodo con el ID especificado dentro del subárbol
     * con raíz en el nodo real proporcionado.
     * 
     * @param idNodo El ID del nodo a buscar.
     * @param actual El nodo actual en el subárbol que se está buscando.
     * @return El nodo con el ID especificado, o nulo si no se encuentra el nodo.
     */
    private NodoDoble<DatoChatBot> getNodo(String idNodo, NodoDoble<DatoChatBot> actual) {

        if (actual == null) {
            return null;
        }

        if (actual.getDato().getId().equals(idNodo)) {

            return actual;

        } else {
            String llamada = idNodo.substring(actual.getDato().getId().length(), actual.getDato().getId().length() + 1);

            if (llamada.equals("1")) {
                return getNodo(idNodo, actual.getEnlaceIzq());
            } else if (llamada.equals("2")) {
                return getNodo(idNodo, actual.getEnlaceDer());
            } else {

            }
        }

        return null;
    }
    
    /**
     * Este método público inserta un nuevo nodo como hijo 
     * del nodo especificado.
     * 
     * @param idPadre El ID del nodo padre.
     * @param nombre El nombre del nuevo nodo.
     * @return El ID del nodo recién insertado,
     * o nulo si el nodo no se pudo insertar.
     */
    public String insertar(String idPadre, String nombre) {

        NodoDoble<DatoChatBot> nodo = getNodo(idPadre);
        if (nodo == null || nodo.getDato().isPreguntas()) {
            return null;
        }

        NodoDoble<DatoChatBot> nuevo = new NodoDoble<>(new DatoChatBot(null, nombre));

        if (nodo.getEnlaceIzq() == null) {
            nuevo.getDato().setId(idPadre + "1");
            nodo.setEnlaceIzq(nuevo);
            return nuevo.getDato().getId();

        }
        if (nodo.getEnlaceDer() == null) {
            nuevo.getDato().setId(idPadre + "2");
            nodo.setEnlaceDer(nuevo);
            return nuevo.getDato().getId();

        }
        return null;

    }
    
    /**
     * Este método público agrega una nueva pregunta y 
     * su respuesta al nodo con el ID especificado.
     * 
     * @param idNodo El ID del nodo donde se quiere insertar la nueva pregunta.
     * @param pregunta La nueva pregunta.
     * @param respuesta La nueva respuesta.
     * @return  Es verdadero si la pregunta se agregó correctamente o
     * falso si no se pudo encontrar el nodo o no es una hoja.
     */
    public boolean insertarPregunta(String idNodo, String pregunta, String respuesta) {

        NodoDoble<DatoChatBot> nodo = getNodo(idNodo);

        if (nodo == null || nodo.isEnlaces()) {
            return false;
        }

        if (!nodo.getDato().isPreguntas()) {
            nodo.getDato().setPreguntas(new ListaPreguntas());
        }
        nodo.getDato().getPreguntas().insertar(pregunta, respuesta);

        return true;

    }
    
    /**
     * Este método público recupera la lista de preguntas y 
     * respuestas asociadas con el nodo con el ID especificado.
     * 
     * @param idNodo El ID del nodo.
     * @return La lista de preguntas y respuestas asociadas con el nodo, 
     * o nulo si no se pudo encontrar el nodo o no tiene lista de preguntas.
     */
    public ListaPreguntas getListapreguntas(String idNodo) {

        NodoDoble<DatoChatBot> nodo = getNodo(idNodo);
        
        if (nodo == null) {
            return null;
        }
        
        return nodo.getDato().getPreguntas();

    }

}
