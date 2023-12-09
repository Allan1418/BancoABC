
package bancoabc;

/**
 *-m
 * @author allan
 */
public class ListaPreguntas {
    
    private Nodo<DatoPregunta> cabeza;
    private Nodo<DatoPregunta> ultimo;

    public Nodo<DatoPregunta> getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo<DatoPregunta> cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo<DatoPregunta> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo<DatoPregunta> ultimo) {
        this.ultimo = ultimo;
    }

    public ListaPreguntas() {
        this.cabeza = null;
        this.ultimo = null;
    }
    
    
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
