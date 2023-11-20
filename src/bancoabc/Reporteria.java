
package bancoabc;

import static bancoabc.estTer.*;

/**
 * Clase que gestiona la generación de informes de fichas de la Bitacora de los cajeros, 
 * permitiendo opciones de filtrado y ordenamiento.
 * La clase almacena las fichas en una lista enlazada simple y brinda métodos 
 * para insertar las fichas una por una o de una lista enlazada simple completa,
 * así como imprimir el contenido del informe.
 * 
 * @author Allan Nunez Brenes
 */

public class Reporteria {
    
    /**
     * Nodo cabeza de la lista que contiene las fichas para el reporte.
     */
    private Nodo<Ficha> cabeza;
    
    /**
     * Atributo de tipo boleano que indica si el reporte se ordena por tiempo
     * de llegada (true) o tiempo de atencion (false)
     */
    private boolean llegada;
    
    /**
     Atributo de tipo boleano que indica si el reporte se ordena
     * ascendentemente (true) o descendente (false)
     */
    private boolean ascendente;
    
   /**
     * Tipo de ficha a considerar en el reporte 
     * (TRUE para preferencial, FALSE para regular, NO_APLICA para ambas).
     */
    private estTer tipoFicha;

    /**
     * Obtiene el nodo cabeza de la lista de fichas para el reporte.
     * 
     * @return El nodo cabeza de la lista.
     */
    public Nodo<Ficha> getCabeza() {
        return cabeza;
    }

    /**
     * Establece el nodo cabeza de la lista de fichas para el reporte.
     * @param cabeza El nuevo nodo cabeza de la lista.
     */
    public void setCabeza(Nodo<Ficha> cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * Verifica si el reporte se ordena por tiempo de llegada.
     * @return {@code true} si el reporte se ordena por tiempo de llegada, 
     * {@code false} si el reporte se ordena por timepo de atencion.
     */
    public boolean isLlegada() {
        return llegada;
    }

    /**
     * Establece si el nuevo ordenamiento del reporte.
     *  @param llegada {@code true} se ordena por tiempo de llegada,
     * {@code false} se ordena por tiempo de atencion.
     */
    public void setLlegada(boolean llegada) {
        this.llegada = llegada;
    }

    /**
     * Verifica si el ordenamiento es ascendente.
     * @return {@code true} si el ordenamiento es ascendente,
     * {@code false} si el ordenamiento es descendente.
     */
    public boolean isAscendente() {
        return ascendente;
    }

    /**
     * Establece el ordenamiento del reporte
     * @param ascendente Indica si el ordenamiento es ascendente o descendente.
     */
    public void setAscendente(boolean ascendente) {
        this.ascendente = ascendente;
    }
    
    /**
     * Obtiene el tipo de ficha a considerar en el reporte.
     * @return El tipo de ficha a considerar en el reporte 
     * 
     * (TRUE para preferencial, FALSE para regular, NO_APLICA para ambas).
     */
    public estTer getTipoFicha() {
        return tipoFicha;
    }
    
    /**
     * Establece el tipo de ficha a considerar en el reporte.
     * @param tipoFicha El nuevo tipo de ficha a considerar en el reporte
     * (TRUE para preferencial, FALSE para regular, NO_APLICA para ambas).
     */
    public void setTipoFicha(estTer tipoFicha) {
        this.tipoFicha = tipoFicha;
    }
    
    /**
     * Constructor que inicializa un objeto de tipo Reporteria 
     * con opciones de filtrado y ordenamiento.
     * 
     * @param llegada Indica si el reporte se ordena por hora de llegada (true)
     * o por hora de atencion (false).
     * @param ascendente Indica si el ordenamiento es ascendente (true)
     * o descendente (false).
     * @param tipoFicha El tipo de ficha a considerar en el reporte 
     * (TRUE para preferencial, FALSE para regular, NO_APLICA para ambas).
     */
    public Reporteria(boolean llegada, boolean ascendente, estTer tipoFicha) {
        this.cabeza = null;
        this.llegada = llegada;
        this.ascendente = ascendente;
        this.tipoFicha = tipoFicha;
    }
    
    
    /**
     * Metodo que inserta una nueva Ficha en la lista simple enlazada simple,
     * aplicando los filtros previamente definidos al momento de construir el
     * objeto.
     * 
     * si la lista esta vacia o el nuevo objeto debe ir al prinicipio de esta
     * ejecuta los algoritmos necesarios, 
     * caso contrario ejecuta {@code void insertar(Nodo<Ficha> nuevoNodo, Nodo<Ficha> nodoActual)}
     * 
     * @param nuevo La nueva ficha a insertar en el reporte.
     */
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
    
    
    /**
     * Método privado recursivo que realiza la inserción en la lista de un nuevo nodo, 
     * que debe ir en una posicion especifica o al final de la lista.
     * 
     * El metodo apilica los algoritmos de evaluacion necesarios segun
     * los filtros definidos al momento de crear el objeto.
     *
     * @param nuevoNodo   El nuevo nodo a insertar.
     * @param nodoActual  El nodo actual que se está evaluando.
     */
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
    
    /**
     * Inserta una lista completa de fichas en la lista actual.
     * 
     * el metodo llama a {@code insertar(Ficha nuevo)} por cada Ficha que
     * encuentre en la lista.
     *
     * @param nuevo cabeza de la lista de fichas a insertar.
     */
    public void insertarLista(Nodo<Ficha> nuevo){
        
        while (nuevo != null) {
            insertar(nuevo.getDato());
            nuevo = nuevo.getEnlace();
        }
        
    }
    
    /**
     * Imprime el contenido de la lista de fichas.
     * o indica un mensaje si la cabeza esta vacia.
     */
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
