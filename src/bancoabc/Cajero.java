
package bancoabc;

/**
 * La clase Cajero representa un cajero del banco con un identificador unico,
 * una ficha que esta siendo atentidoy una bitacora que registra su actividad.
 * 
 * @author Anyelo Vargas Merlo
 */
public class Cajero {

     /**
     * Atributo de tipo entero que representa el identificador único del cajero.
     * 
     */
    private int id;
    
    /**
     * Atributo de tipo Ficha que representa la ficha que el cajero esta 
     * atentiendo
     */
    private Ficha atendiendo;
    
    /**
     * Atributo de tipo BitacoraFichas que representa la bitacora de fichas
     * del cajero
     */
    private BitacoraFichas listaBitacora;

    /**
     * Obtiene el identificador único del cajero.
     * @return El identificador único del cajero.
     */
    public int getId() {
        return id;
    }
    
    /**
     * Establece el identificador único del cajero.
     * @param id El identificador único del cajero.

     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Obtiene la ficha que el cajero está actualmente atendiendo.
     * @return La ficha que el cajero está atendiendo, o null si no 
     * está atendiendo ninguna.
     */
    public Ficha getAtendiendo() {
        return atendiendo;
    }

    /**
     * Establece la ficha que el cajero está atendiendo.
     * 
     * @param atendiendo La nueva ficha que el cajero va a atender.
     */
    public void setAtendiendo(Ficha atendiendo) {
        this.atendiendo = atendiendo;
    }

    /**
     * Obtiene la bitácora que registra la actividad del cajero.
     * 
     * @return La bitácora del cajero.
     */
    public BitacoraFichas getListaBitacora() {
        return listaBitacora;
    }

    /**
     * Establece la bitácora del cajero.
     * 
     * @param listaBitacora La nueva bitácora del cajero.
     */
    public void setListaBitacora(BitacoraFichas listaBitacora) {
        this.listaBitacora = listaBitacora;
    }

    /**
     * Constructor que inicializa un cajero con un identificador único, 
     * sin ficha asignada y con una nueva bitácora vacia.
     * 
     * @param id El identificador único del cajero.
     */
    public Cajero(int id) {
        this.id = id;
        this.atendiendo = null;
        this.listaBitacora = new BitacoraFichas();
    }

    /**
     * Verifica si el cajero está libre para atender una nueva ficha.
     * 
     * @return {@code true} si el cajero está libre, 
     * {@code false} en caso contrario.
     */
    public boolean isLibre() {
        return atendiendo == null;
    }
}

