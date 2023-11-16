
package bancoabc;


public class Cajero {
    
    private int id;
    
    private Ficha atendiendo;
    private BitacoraFichas listaBitacora;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ficha getAtendiendo() {
        return atendiendo;
    }

    public void setAtendiendo(Ficha atendiendo) {
        this.atendiendo = atendiendo;
    }

    public BitacoraFichas getListaBitacora() {
        return listaBitacora;
    }

    public void setListaBitacora(BitacoraFichas listaBitacora) {
        this.listaBitacora = listaBitacora;
    }

    public Cajero(int id) {
        this.id = id;
        this.atendiendo = null;
        this.listaBitacora = new BitacoraFichas();
    }
    
    public boolean isLibre(){
        return atendiendo == null;
    }
    
}
