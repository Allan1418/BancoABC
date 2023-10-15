
package bancoabc;


public class Nodo<tipo> {
    
    private tipo dato;
    private Nodo enlace;

    public tipo getDato() {
        return dato;
    }

    public void setDato(tipo dato) {
        this.dato = dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

    public Nodo(tipo dato) {
        this.dato = dato;
    }
    
    
    
    
}
