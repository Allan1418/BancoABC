
package bancoabc;

/**
 * Esta clase representa un objeto de datos utilizado en el chatbot. 
 * Almacena información sobre una pregunta, incluido su ID,
 * pregunta y respuesta.
 * 
 * @author allan
 */
public class DatoPregunta {
    
    /**
     * (int) El identificador único de la pregunta.
     */
    private int id;
    
    /**
     * (String) La pregunta.
     */
    private String pregunta;
    
    /**
     * (String) La respuesta
     */
    private String respuesta;

    /**
     * Recupera el ID de la pregunta.
     *
     * @return El ID de la pregunta (int).
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID de la pregunta.
     * 
     * @param id El nuevo ID de la pregunta (int).
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Recupera la pregunta.
     * 
     * @return La pregunta (String).
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * Plantea la pregunta.
     * 
     * @param pregunta La nueva pregunta (String).
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * Recupera la respuesta.
     * 
     * @return  La respuesta (String)
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Establece la respuesta.
     * 
     * @param respuesta La nueva respuesta (String)
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * Crea un nuevo objeto DatoPregunta con la 
     * pregunta y respuesta especificadas.
     * 
     * @param pregunta La pregunta (String).
     * @param respuesta La respuesta (String).
     */
    public DatoPregunta(String pregunta, String respuesta) {
        this.id = 0;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    /**
     * Crea un nuevo objeto DatoPregunta con 
     * valores predeterminados para todos los atributos.
     */
    public DatoPregunta() {
        this.id = 0;
        this.pregunta = null;
        this.respuesta = null;
    }
    
    
    
}
