/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios.forms;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Enrico
 */
public class NachaMain {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
       try{
          
            UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");;
           Nacha p = new Nacha();
           p.setVisible(true);
     
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Error en Look and Feel", "Error", JOptionPane.ERROR_MESSAGE);
       
       }
            
        //asdasda
       
       
        
        
    }
}
