
package bancoabc;


public class Cola<tipo> {
    
    private Nodo frente;
    private Nodo ultimo;
    
    private int size;
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Cola() {
        this.frente = null;
        this.ultimo = null;
        this.size = 0;
    }

    public Cola(Cola c) {
        this.frente = c.frente;
        this.ultimo = c.ultimo;
        this.size = c.size;
    }
    
    public boolean isVacia() {
        return this.frente == null;
    }
    
    public void ingresarACola(tipo dato){
        
        Nodo<tipo> nuevo = new Nodo<>(dato);
        
        if (this.frente == null) {
            this.frente = nuevo;
            this.ultimo = nuevo;
        }else{
            this.ultimo.setEnlace(nuevo);
            this.ultimo = nuevo;
        }
        
        size++;
    }
    
    
    public tipo sacarDeCola(){
        if (this.frente != null) {
            @SuppressWarnings("unchecked")
            tipo aux = (tipo) this.frente.getDato();
            this.frente = this.frente.getEnlace();
            size--;
            return aux;
        }else{
            return null;
        }
        
    }
    
    public void imprCola(){
        
        Nodo frenteAux = this.frente;
        
        while (frenteAux != null) {            
            System.out.println(frenteAux.getDato().toString());
            frenteAux = frenteAux.getEnlace(); 
        }
    }
    
}
