
package bancoabc;

import java.util.ArrayList;

/**
 * Clase Nodo para crear estructuras de datos con
 * tres atributos: enlace anterior, enlace siguiente y dato.
 *
 * @param <tipo> El tipo de elementos que se guardara en el Nodo.
 * 
 * @author Allan Nunez Brenes
 */
public class NodoDoble<tipo> {
    
    /**
     * Atributo que almacena el tipo de dato en el nodo
     */
    private tipo dato;
    
    /**
     * Atributo que almacena el enlace al nodo anterior
     */
    private NodoDoble<tipo> enlaceIzq;
    
    /**
     * Atributo que almacena el enlace al siguiente nodo
     */
    private NodoDoble<tipo> enlaceDer;
    
    /**
     * Obtiene el dato almacenado en el Nodo.
     * @return El dato almacenado en el Nodo.
     */
    public tipo getDato() {
        return dato;
    }
    
    /**
     * Establece el dato a almacenar en el Nodo.
     * @param dato El nuevo dato a almacenar en el Nodo.
     */
    public void setDato(tipo dato) {
        this.dato = dato;
    }

    /**
     * Obtiene el enlace anterior del Nodo.
     *@return El enlace anterior del Nodo.
     */
    public NodoDoble<tipo> getEnlaceIzq() {
        return enlaceIzq;
    }

    /**
     * Establece el enlace anterior Nodo.
     * @param enlaceIzq El nuevo enlace anterior al Nodo.
     */
    public void setEnlaceIzq(NodoDoble<tipo> enlaceIzq) {
        this.enlaceIzq = enlaceIzq;
    }
    
    /**
     * Obtiene el enlace siguiente del Nodo.
     *@return El enlace siguiente del Nodo.
     */
    public NodoDoble<tipo> getEnlaceDer() {
        return enlaceDer;
    }

    /**
     * Establece el enlace siguiente Nodo.
     * @param enlaceDer El nuevo enlace al Nodo.
     */
    public void setEnlaceDer(NodoDoble<tipo> enlaceDer) {
        this.enlaceDer = enlaceDer;
    }

    /**
     * crea un objeto de tipo Nodo
     * @param dato la informacion que guarda el nodo.
     */
    public NodoDoble(tipo dato) {
        this.dato = dato;
    }
    
    /**
     * Comprueba si tanto `enlaceDer` como `enlaceIzq` no son nulos.
     * 
     * @return Verdadero si ambos enlaces no 
     * son nulos; Falso en caso contrario
     */
    public boolean isEnlaces(){
        return enlaceDer != null && enlaceIzq != null;
    }
    
    /**
     * Crea una matriz de cadenas que contienen los datos de
     * `enlaceDer` y `enlaceIzq`, y agrega "Volver" al final en caso de que 
     * el `enlaceDer` y `enlaceIzq` sea ´null´.
     * 
     * @return Un array de cadenas que contienen 
     * los datos de ambos enlaces y "Volver"
     */
    public String[] getEnlacesString(){
        
        ArrayList<String> botones = new ArrayList<>();
        
        
        if (enlaceIzq != null && enlaceIzq.getDato() != null) {
            botones.add(enlaceIzq.getDato().toString());
        }
        
        if (enlaceDer != null && enlaceDer.getDato() != null) {
            botones.add(enlaceDer.getDato().toString());
        }
        
        botones.add("Volver");
        
        String[] retorno = new String[botones.size()];
        
        
        return botones.toArray(retorno);
    }
}
