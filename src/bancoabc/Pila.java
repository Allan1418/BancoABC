
package bancoabc;


public class Pila<tipo> {
    
    private Nodo cima;

    public Pila() {
        this.cima = null;
    }

    public Pila(Pila p) {
        this.cima = p.cima;
    }

    public boolean isVacia() {
        return this.cima == null;
    }
    
    
    
    public void push(tipo dato) {
        
        Nodo<tipo> nuevo = new Nodo<>(dato);
        
        if (cima == null) {
            cima = nuevo;
        }else{
            nuevo.setEnlace(cima);
            cima = nuevo;
            
        }
        
    }
    
    public tipo pop(){
        
        if (cima != null) {
            
            @SuppressWarnings("unchecked")
            tipo aux = (tipo) cima.getDato();
            cima = cima.getEnlace();
            return aux;
            
        }else{
            return null;
        }
        
    }
    
    
    public void impPila(){
        Nodo aux = cima;
        
        while (aux != null) {            
            System.out.println(aux.getDato().toString());
            aux = aux.getEnlace();
        }
    }
    
}
