
package bancoabc;

/**
 * -m
 * 
 * @author Anyelo Vargas Merlo
 */
public class Cajero {

    /**
     * 
     */
    private int id;
    
    /**
     * 
     */
    private Ficha atendiendo;
    
    /**
     * 
     */
    private BitacoraFichas listaBitacora;

    /**
     * 
     * @return 
     */
    public int getId() {
        return id;
    }
    
    /**
     * 
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * 
     * @return 
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

