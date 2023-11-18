
package bancoabc;

import static bancoabc.estTer.*;
import java.util.ArrayList;


public class ListaCajeros {
    
    private Nodo<Cajero> cabeza;
    private int size;

    public Nodo<Cajero> getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo<Cajero> cabeza) {
        this.cabeza = cabeza;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    

    public ListaCajeros(int cantidad) {
        crearLista(cantidad);
    }
    
    
    public void crearLista(int cant){
        this.cabeza = null;
        
        Nodo<Cajero> anterior = null;
        
        for (int i = 0; i < cant; i++) {
            
            Nodo<Cajero> nuevoNodo = new Nodo<>(new Cajero(i+1));
            
            if (cabeza == null) {
                cabeza = nuevoNodo;
                anterior = nuevoNodo;
            }else{
                anterior.setEnlace(nuevoNodo);
                anterior = nuevoNodo;
            }
            
        }
        this.size = cant;
         
    }
    

    public Cajero buscar(int id){
        
        Nodo<Cajero> aux = cabeza;
        
        if (aux == null || aux.getDato().getId() > id) {
            return null;
        }
        
        while (aux != null) {            
            if (aux.getDato().getId() == id) {
                return aux.getDato();
            }
            aux = aux.getEnlace();
        }
        
        return null;
    }
    
    
    public void imprimirAtendiendo(){
        Nodo<Cajero> aux = cabeza;
        String m;
        
        while (aux != null) {            
            
            m = "Caja #" + aux.getDato().getId() + ": ";
            
            if (!aux.getDato().isLibre()) {
                m += aux.getDato().getAtendiendo().toString();
                m = m.replaceFirst("\\[\\d{2}m", "[33m");
            }else{
                m += "Caja Vacia!";
            }
            
            System.out.println(m);
            
            aux = aux.getEnlace();
        }
    }
    
    
    public String[] getArrayStr(boolean volver, boolean todos, estTer op){
        
        Nodo<Cajero> aux = cabeza;
        ArrayList<String> botones = new ArrayList<>();
        
        while (aux != null) {            
            if (op == FALSE && !aux.getDato().isLibre()) {
                botones.add(String.valueOf(aux.getDato().getId()));
            }else if (op == TRUE && aux.getDato().isLibre()) {
                botones.add(String.valueOf(aux.getDato().getId()));
            }else if (op == NO_APLICA) {
                botones.add(String.valueOf(aux.getDato().getId()));
            }
            aux = aux.getEnlace();
        }
        
        if (todos) {
            botones.add("Todos");
        }
        if (volver) {
            botones.add("Volver");
        }
        
        String[] retorno = new String[botones.size()];
        
        return botones.toArray(retorno);
    }
    
    
    
    @Deprecated
    public void imprimir(){
        Nodo aux = cabeza;
        
        while (aux != null) {            
            System.out.println(((Cajero) aux.getDato()).getId());
            aux = aux.getEnlace();
        }
        
    }
    
    
    
}
