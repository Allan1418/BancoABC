
package bancoabc;


public class BitacoraFichas {
    
    private Nodo<Ficha> cabeza;

    public Nodo<Ficha> getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo<Ficha> cabeza) {
        this.cabeza = cabeza;
    }

    public BitacoraFichas() {
        this.cabeza = null;
    }
    
    public void insertar(Ficha nuevo) {

        Nodo<Ficha> nuevoNodo = new Nodo<>(nuevo);

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else if (nuevoNodo.getDato().getAtencion().before(cabeza.getDato().getAtencion())) {
            nuevoNodo.setEnlace(cabeza);
            cabeza = nuevoNodo;
        } else {
            Nodo<Ficha> aux = cabeza;
            insertar(nuevoNodo, aux);
        }
    }


    private void insertar(Nodo<Ficha> nuevoNodo, Nodo<Ficha> nodoActual) {
        if (nodoActual.getEnlace() == null || nuevoNodo.getDato().getAtencion().before(nodoActual.getEnlace().getDato().getAtencion())) {
            nuevoNodo.setEnlace(nodoActual.getEnlace());
            nodoActual.setEnlace(nuevoNodo);
        } else {
            insertar(nuevoNodo, nodoActual.getEnlace());
        }
        
    }
    
    public void imprimir() {
        Nodo<Ficha> aux = cabeza;
        imprimir(aux);
        
    }
    private void imprimir(Nodo actual) {
        if (actual != null) {
            System.out.println(((Ficha) actual.getDato()).getAtencionStr());
            imprimir(actual.getEnlace());
        }
        
    }
    
    public void imprimirAlreves() {
        Nodo<Ficha> aux = cabeza;
        imprimirAlreves(aux);
        
    }
    private void imprimirAlreves(Nodo actual) {
        if (actual != null) {
            imprimirAlreves(actual.getEnlace());
            System.out.println(((Ficha) actual.getDato()).getAtencionStr());
        }
        
    }
    
    
}
