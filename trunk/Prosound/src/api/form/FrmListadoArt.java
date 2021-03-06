/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmListadoCli.java
 *
 * Created on 18-oct-2011, 9:50:41
 */
package api.form;

import api.dom.Articulos;
import api.dom.Cliente;
import api.dom.Utilitaria;
import api.gest.GestArticulos;
import api.gest.GestCliente;
import java.awt.Component;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MAT
 */
public class FrmListadoArt extends javax.swing.JFrame {

    JInternalFrame i;

    /** Creates new form FrmListadoCli */

    public FrmListadoArt(JInternalFrame i) {
          initComponents();
        this.jTable2.setModel(Utilitaria.listarArticulos((DefaultTableModel) jTable2.getModel()));
        
        this.i = i;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre1.setMaximumSize(new java.awt.Dimension(580, 570));
        txtNombre1.setMinimumSize(new java.awt.Dimension(580, 570));
        txtNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombre1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombre1KeyReleased(evt);
            }
        });
        getContentPane().add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 150, -1));

        jPanel1.setBackground(new java.awt.Color(153, 180, 209));
        jPanel1.setMaximumSize(new java.awt.Dimension(720, 74));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 74));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 74));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(51, 255, 51));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 48));
        jLabel15.setText("Lista de Articulos");
        jLabel15.setToolTipText("");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 49));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 74));

        jLabel1.setText("Para seleccionar un cliente debe dar doble click sobre el mismo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, -1, 20));

        jLabel2.setText("Filtro por Nombre: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Precio", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable2MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 700, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombre1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1KeyPressed

    private void txtNombre1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre1KeyReleased
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
            modelo.setRowCount(0);
            String nombre = txtNombre1.getText();
            int i = nombre.length();
            String nombre2;
            for (Articulos objA : GestArticulos.getInstance().devolverArticulo()) {
                nombre2 = objA.getArtNom();
                String cortado = nombre2.substring(0, i);
                if (cortado.equalsIgnoreCase(nombre)) {
                    Object[] objcli = {objA.getArtCod(), objA.getArtNom(), objA.getArtDesc(), objA.getArtPrecio(), objA.getArtStock()};
                    modelo.addRow(objcli);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtNombre1KeyReleased

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
         for (Component e : i.getContentPane().getComponents()) {
                if ("class javax.swing.JTextField".equals(e.getClass().toString())) {
                    //  System.out.println(((JTextField)e).getText());
                    if ("0".equals(((JTextField) e).getText()) || "articulo".equals(((JTextField) e).getName())) {
                        ((JTextField) e).setText(String.valueOf(this.jTable2.getValueAt(jTable2.getSelectedRow(), 0)));
                        (((JTextField) e)).setName("articulo");
                        break;
                    }
                }
            }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MousePressed
        // TODO add your handling code here:
         if (evt.getClickCount() == 2) {
                this.dispose();
            
        }
    }//GEN-LAST:event_jTable2MousePressed
    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
    
    public void run() {
    new FrmListadoCli().setVisible(true);
    }
    });
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtNombre1;
    // End of variables declaration//GEN-END:variables
}
