/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmListadoClientes.java
 *
 * Created on 20-oct-2011, 10:53:16
 */
package Formularios.forms;

import javax.swing.table.DefaultTableModel;
import tsl_nacha.dominio.Clientes;
import tsl_nacha.dominio.Utilitaria;
import tsl_nacha.gestoras.GestClientes;

/**
 *
 * @author Luis
 */
public class FrmListadoClientes extends javax.swing.JInternalFrame {

    /** Creates new form FrmListadoClientes */
    public FrmListadoClientes() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
         Utilitaria.limpiarJtables((DefaultTableModel)this.jTable2.getModel());
         Utilitaria.listarClientes((DefaultTableModel)this.jTable2.getModel());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setNormalBounds(new java.awt.Rectangle(0, 0, 698, 581));
        setPreferredSize(new java.awt.Dimension(698, 581));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setText("Salir");
        btnBuscar.setMaximumSize(new java.awt.Dimension(580, 570));
        btnBuscar.setMinimumSize(new java.awt.Dimension(580, 570));
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 90, 30));

        jPanel1.setBackground(new java.awt.Color(153, 180, 209));
        jPanel1.setMaximumSize(new java.awt.Dimension(581, 570));
        jPanel1.setMinimumSize(new java.awt.Dimension(581, 570));
        jPanel1.setPreferredSize(new java.awt.Dimension(698, 71));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(51, 255, 51));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 48));
        jLabel15.setText("Lista de clientes");
        jLabel15.setToolTipText("");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 49));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 698, 71));

        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nombre", "Direccion", "Telefono"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 670, 370));

        jLabel2.setText("Ingrese Nombre del cliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 170, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:

        //txtfingreso.sets
}//GEN-LAST:event_jTable2MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
                try {
            DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
            modelo.setRowCount(0);
            String nombre = this.jTextField1.getText();
            int i = nombre.length();
            String nombre2;
            for (Clientes objc : GestClientes.getInstance().devolverClientes()) {
                nombre2 = objc.getcNombre();
                String cortado = nombre2.substring(0, i);
                if (cortado.equalsIgnoreCase(nombre)) {
                   Object[] objcli = {objc.getcNumero(), objc.getcNombre(), objc.getcDireccion(), objc.getcTelefono()};
                    modelo.addRow(objcli);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTextField1KeyReleased
        
    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}