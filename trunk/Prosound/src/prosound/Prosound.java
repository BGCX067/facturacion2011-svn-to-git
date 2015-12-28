/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prosound;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author MAT
 */
public class Prosound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        // TODO code application logic here
        UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
         api.form.Prosound p = new api.form.Prosound();
         p.setVisible(true);
    }
}
