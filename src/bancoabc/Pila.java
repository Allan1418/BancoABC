
package bancoabc;

/**
 * Una clase para representar una pila.
 *
 * @param <tipo> El tipo de elemento que almacena la pila.
 * 
 * @author Anyelo Vargas Merlo
 */
public class Pila<tipo> {
    
    /**
     * Atributo de tipo Nodo<tipo> que representa la cabeza del pila
     */
    private Nodo<tipo> cima;

    /**
     * Crea una pila vacía.
     */
    public Pila() {
        this.cima = null;
    }
    
    /**
     * Verifica si la pila está vacía.
     * @return {@code true} si la pila está vacía, 
     * {@code false} en caso contrario
     */
    public boolean isVacia() {
        return this.cima == null;
    }
    
    
    /**
     * Empuja un nuevo elemento a la pila.
     *
     * @param dato El elemento a empujar.
     */
    public void push(tipo dato) {
        
        Nodo<tipo> nuevo = new Nodo<>(dato);
        
        if (cima == null) {
            cima = nuevo;
        }else{
            nuevo.setEnlace(cima);
            cima = nuevo;
            
        }
        
    }
    
    /**
     * Saca el elemento superior de la pila.
     *
     * @return El elemento superior de la pila, o nulo si la pila está vacía.
     */
    public tipo pop(){
        
        if (cima != null) {
            tipo aux = cima.getDato();
            cima = cima.getEnlace();
            return aux;
            
        }else{
            return null;
        }
        
    }
    
    
    /**
     * Imprime el contenido de la pila en la consola.
     */
    public void impPila(){
        Nodo aux = cima;
        
        while (aux != null) {            
            System.out.println(aux.getDato().toString());
            aux = aux.getEnlace();
        }
    }
    
}
