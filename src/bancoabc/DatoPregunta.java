
package bancoabc;

/**
 *-m
 * @author allan
 */
public class DatoPregunta {
    
    private int id;
    private String pregunta;
    private String respuesta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public DatoPregunta(String pregunta, String respuesta) {
        this.id = 0;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public DatoPregunta() {
        this.id = 0;
        this.pregunta = null;
        this.respuesta = null;
    }
    
    
    
}
