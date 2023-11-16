
package bancoabc;

/**
 * Una clase para representar una pila.
 *
 * @param <tipo> El tipo de elemento que almacena la pila.
 */
public class Pila<tipo> {
    
    private Nodo<tipo> cima;

    public Pila() {
        this.cima = null;
    }
    

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
