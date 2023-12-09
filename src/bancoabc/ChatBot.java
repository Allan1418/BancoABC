
package bancoabc;

/**
 *-m
 * @author allan
 */
public class ChatBot {
    
    private NodoDoble<DatoChatBot> raiz;

    public NodoDoble<DatoChatBot> getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoDoble<DatoChatBot> raiz) {
        this.raiz = raiz;
    }

    public ChatBot() {
        NodoDoble<DatoChatBot> nuevo = new NodoDoble<>(new DatoChatBot("1", "Preguntas Frecuentes (FAQ)"));
        this.raiz = nuevo;
    }
    
    private NodoDoble<DatoChatBot> getNodo(String idNodo) {

        NodoDoble<DatoChatBot> retorno = null;

        try {
            retorno = getNodo(idNodo, raiz);
        } catch (IndexOutOfBoundsException | NullPointerException e) {

        }

        return retorno;
    }

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
    
    public ListaPreguntas getListapreguntas(String idNodo) {

        NodoDoble<DatoChatBot> nodo = getNodo(idNodo);
        
        if (nodo == null) {
            return null;
        }
        
        return nodo.getDato().getPreguntas();

    }

}
