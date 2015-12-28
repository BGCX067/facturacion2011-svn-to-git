/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package softtruck;

import api.gest.GestCambio;
import api.gest.GestCamiones;
import api.gest.GestCliente;
import api.gest.GestEmpleado;
import api.gest.GestFactura;
import api.gest.GestGastos;
import api.gest.GestPago;
import api.gest.GestPersona;
import apiformularios.form.Principal;
import java.io.File;
import java.io.IOException;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Enrico
 */
public class SoftTruck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, IOException {
        // TODO code application logic here

        String sFichero = "C:\\Windows\\addins\\ficheadasdasdasdro.txt";
        File fichero = new File(sFichero);
        if (fichero.exists()) {
            System.out.println("El fichero " + sFichero + " existe");

            try {

                UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");;
                Principal p = new Principal();

                GestCamiones.getInstance().devolverCamiones();
                GestCliente.getInstance().devolverCliente();
                GestEmpleado.getInstance().devolverEmpleado();
                GestFactura.getInstance().devolverFacturas();
                GestGastos.getInstance().devolverGastos();
                GestPago.getInstance().devolverPagos();
                GestPersona.getInstance().devolverCamiones();
                GestCambio.getInstance().devolverCambio();
                p.setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en Look and Feel", "Error", JOptionPane.ERROR_MESSAGE);

            }



        } else {
            JOptionPane.showMessageDialog(null, "Por favor comuniquese con el soporte tecnico. \n 099575960 \n 099525680 \n 099782809", "Error", JOptionPane.ERROR_MESSAGE);

        }



    }
}
