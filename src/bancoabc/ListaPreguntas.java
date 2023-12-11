
package bancoabc;

/**
 * Representa una lista de preguntas y respuestas 
 * utilizando una lista enlazada circular simple.
 * 
 * @author Allan Nunez Brenes, Anyelo Vargas Merlo
 */
public class ListaPreguntas {
    
  /**
   * El nodo cabeza de la lista.
   */
    private Nodo<DatoPregunta> cabeza;
    
  /**
   * El último nodo de la lista.
   */
    private Nodo<DatoPregunta> ultimo;

    /**
     * Obtiene el nodo cabeza de la lista.
     * 
     * @return El nodo cabeza de la lista.
     */
    public Nodo<DatoPregunta> getCabeza() {
        return cabeza;
    }

    /**
     * Establece el nodo cabeza de la lista.
     * 
     * @param cabeza El nuevo nodo cabeza de la lista.
     */
    public void setCabeza(Nodo<DatoPregunta> cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * Obtiene el nodo último de la lista.
     * 
     * @return El nodo último de la lista.
     */
    public Nodo<DatoPregunta> getUltimo() {
        return ultimo;
    }

    /**
     * Establece el nodo último de la lista.
     * 
     * @param ultimo El nuevo nodo último de la lista.
     */
    public void setUltimo(Nodo<DatoPregunta> ultimo) {
        this.ultimo = ultimo;
    }

    /**
     * Crea una nueva lista vacía.
     */
    public ListaPreguntas() {
        this.cabeza = null;
        this.ultimo = null;
    }
    
    
    /**
     * Inserta una nueva pregunta y respuesta al final la lista, o al principio
     * si la lista esta vacia.
     * 
     * @param pregunta La pregunta a insertar.
     * @param respuesta La respuesta a la pregunta.
     */
    public void insertar(String pregunta, String respuesta){
        
        Nodo<DatoPregunta> nuevo = new Nodo<>(new DatoPregunta(pregunta, respuesta));
        
        if (cabeza == null) {
            cabeza = nuevo;
            ultimo = cabeza;
            ultimo.setEnlace(cabeza);
        }else{
            nuevo.getDato().setId(ultimo.getDato().getId() + 1);
            
            ultimo.setEnlace(nuevo);
            ultimo = ultimo.getEnlace();
            ultimo.setEnlace(cabeza);
            
        }
        
    }
    
    /**
     * Obtiene una representación en String de todas las preguntas de la lista.
     * 
     * @return Un String que contiene todas las preguntas de la lista.
     */
    public String getPreguntas(){
        
        if (cabeza == null) {
            return null;
        }
        
        
        String retorno = "";
        Nodo<DatoPregunta> aux = cabeza;
        
        retorno += (aux.getDato().getId() + 1) + ". " + aux.getDato().getPregunta() + "\n";
        aux = aux.getEnlace();
        
        while (aux != cabeza) {            
            retorno += (aux.getDato().getId() + 1) + ". " + aux.getDato().getPregunta() + "\n";
            aux = aux.getEnlace();
        }
        
        return retorno;
    }
    
    /**
     * Obtiene la respuesta para la pregunta en la posición dada.
     * 
     * @param pos La posición de la pregunta.
     * @return La respuesta a la pregunta.
     */
    public String getRespuesta(int pos){
        
        if (pos > ultimo.getDato().getId() || pos < 0) {
            return null;
        }
        
        Nodo<DatoPregunta> aux = cabeza;
        
        while (aux.getDato().getId() < pos) {            
            aux = aux.getEnlace();
        }
        
        return aux.getDato().getRespuesta();
    }
    
    
    /**
     * Imprime los ID de todas las preguntas en la lista 
     * (para fines de depuración).
     * 
     * @deprecated Este método está desactualizado porque 
     * solo imprime los ID de las preguntas y no incluye las respuestas.
     * Se recomienda usar el método `getPreguntas()` en su lugar.
     */
    @Deprecated
    public void imprimr(){
        Nodo<DatoPregunta> aux = cabeza;
        
        System.out.println(aux.getDato().getId());
        aux = aux.getEnlace();
        while (aux != cabeza) {            
            System.out.println(aux.getDato().getId());
            aux = aux.getEnlace();
        }
    }
    
    
    
    
}
