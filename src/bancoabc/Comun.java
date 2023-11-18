
package bancoabc;

import javax.swing.JOptionPane;


public class Comun {

    /**
     * Solicita al usuario una cadena que coincida con la expresión regular
     * dada.
     *
     * @param regex La expresión regular que debe coincidir.
     * @param ask El mensaje que se mostrará al usuario.
     * @param err El mensaje de error que se mostrará si el usuario ingresa una
     * cadena que no coincide con la expresión regular, o nulo si no se debe
     * mostrar ningún mensaje de error.
     * @return La cadena ingresada por el usuario, o nula si el usuario cancela
     * la operación.
     */
    public static String regexConfirm(String regex, String ask, String err) {

        String confirm;
        while (true) {
            confirm = JOptionPane.showInputDialog(ask);
            if (confirm == null) {
                return confirm;
            }
            if (confirm.matches(regex)) {
                return confirm;
            } else if (err != null) {
                JOptionPane.showMessageDialog(null, err, "Banco ABC", 0);
            }
        }
    }
    
    
    /**
     * -m
     * @param opciones
     * @param ask
     * @return 
     */
    public static int mostrarBotones(String[] opciones, String ask) {
        
        //revisar
        if (opciones == null || opciones.length == 0) {
            throw new IllegalArgumentException("El array de opciones no puede ser nulo o vacío.");
        }
        
        
        int opt = JOptionPane.showOptionDialog(
                null,
                ask,
                "Banco ABC",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[opciones.length-1]);
        
        if (opt == opciones.length-1 && opciones[opciones.length-1] == "Volver") {
            return -1;
        }
        
        return opt;
    }

}
