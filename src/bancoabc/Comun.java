
package bancoabc;

import javax.swing.JOptionPane;


public class Comun {
    
    
    public static String regexConfirm(String regex, String ask, String err) {
        
        String confirm;
        while (true) {
            confirm = JOptionPane.showInputDialog(ask);
            if (confirm == null) {
                return confirm;
            }
            if (confirm.matches(regex)) {
                return confirm;
            } else if (err != null){
                JOptionPane.showMessageDialog(null, err, "Banco ABC", 0);
            }
        }
    }
    
}
