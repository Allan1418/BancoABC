
package bancoabc;

/**
 *-m
 * @author allan
 */
public class DatoChatBot {
    
    private String id;
    private String name;
    private ListaPreguntas preguntas;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListaPreguntas getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ListaPreguntas preguntas) {
        this.preguntas = preguntas;
    }

    public DatoChatBot() {
        this.id = null;
        this.name = null;
        this.preguntas = null;
    }

    public DatoChatBot(String id, String name) {
        this.id = id;
        this.name = name;
        this.preguntas = null;
    }
    
    public boolean isPreguntas(){
        return preguntas != null;
    }

    @Override
    public String toString() {
        return getName();
    }
    
    
    
    
}
