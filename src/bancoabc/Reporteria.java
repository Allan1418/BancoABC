
package bancoabc;

import static bancoabc.estTer.*;

public class Reporteria {
    
    
    private Nodo<Ficha> cabeza;
    
    private boolean llegada;
    private boolean ascendente;
    private estTer tipoFicha;

    public Nodo<Ficha> getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo<Ficha> cabeza) {
        this.cabeza = cabeza;
    }

    public boolean isLlegada() {
        return llegada;
    }

    public void setLlegada(boolean llegada) {
        this.llegada = llegada;
    }

    public boolean isAscendente() {
        return ascendente;
    }

    public void setAscendente(boolean ascendente) {
        this.ascendente = ascendente;
    }
    
    public estTer getTipoFicha() {
        return tipoFicha;
    }

    public void setTipoFicha(estTer tipoFicha) {
        this.tipoFicha = tipoFicha;
    }
    

    public Reporteria(boolean llegada, boolean ascendente, estTer tipoFicha) {
        this.cabeza = null;
        this.llegada = llegada;
        this.ascendente = ascendente;
        this.tipoFicha = tipoFicha;
    }
    
    
    public void insertar(Ficha nuevo){
        
        if (tipoFicha != NO_APLICA) {
            if (tipoFicha == TRUE) {
                if (!nuevo.isPreferencial()) {
                    return;
                }
            }else{
                if (nuevo.isPreferencial()) {
                    return;
                }
            }
        }
        
        
        boolean primero = false;
        Nodo<Ficha> nuevoNodo = new Nodo<>(nuevo);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            return;
        }
        
        if (llegada) {
            if (ascendente) {
                //llegada ascendente
                if (nuevoNodo.getDato().getLlegada().before(cabeza.getDato().getLlegada())) {
                    primero = true;
                }
            }else{
                //llegada descendente
                if (nuevoNodo.getDato().getLlegada().after(cabeza.getDato().getLlegada())) {
                    primero = true;
                }
                
            }
        } else{
            if (ascendente) {
                //atencion ascendente
                if (nuevoNodo.getDato().getAtencion().before(cabeza.getDato().getAtencion())) {
                    primero = true;
                }
            }else{
                //atencion descendente
                if (nuevoNodo.getDato().getAtencion().after(cabeza.getDato().getAtencion())) {
                    primero = true;
                }
                
            }
        }
        
        
        if (primero) {
            nuevoNodo.setEnlace(cabeza);
            cabeza = nuevoNodo;
        }else{
            Nodo<Ficha> aux = cabeza;
            insertar(nuevoNodo, aux);
        }
        
        
    }
    
    private void insertar(Nodo<Ficha> nuevoNodo, Nodo<Ficha> nodoActual) {
        
        boolean agregar = false;
        
        if (nodoActual.getEnlace() == null) {
            agregar = true;
        }else{
            if (llegada) {
                if (ascendente) {
                    //llegada ascendente
                    if (nuevoNodo.getDato().getLlegada().before(nodoActual.getEnlace().getDato().getLlegada())) {
                        agregar = true;
                    }
                } else {
                    //llegada descendente
                    if (nuevoNodo.getDato().getLlegada().after(nodoActual.getEnlace().getDato().getLlegada())) {
                        agregar = true;
                    }

                }
            } else {
                if (ascendente) {
                    //atencion ascendente
                    if (nuevoNodo.getDato().getAtencion().before(nodoActual.getEnlace().getDato().getAtencion())) {
                        agregar = true;
                    }
                } else {
                    //atencion descendente
                    if (nuevoNodo.getDato().getAtencion().after(nodoActual.getEnlace().getDato().getAtencion())) {
                        agregar = true;
                    }
                }
            }
        }
        
        if (agregar) {
            nuevoNodo.setEnlace(nodoActual.getEnlace());
            nodoActual.setEnlace(nuevoNodo);
        }else{
            insertar(nuevoNodo, nodoActual.getEnlace());
        }
        
        
        
    }
    
    public void insertarLista(Nodo<Ficha> nuevo){
        
        while (nuevo != null) {
            insertar(nuevo.getDato());
            nuevo = nuevo.getEnlace();
        }
        
        
    }
    
    public void imprimir(){
        
        Nodo<Ficha> aux = cabeza;
        
        if (aux == null) {
            System.out.println("Reporte Vacio!");
            return;
        }
        
        while (aux != null) {            
            System.out.println(aux.getDato().toString());
            aux = aux.getEnlace();
        }
        
    }

    
    
}
