/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmCuenta.java
 *
 * Created on 2/11/2011, 11:08:51 AM
 */
package Formularios.forms;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tsl_nacha.dominio.Clientes;
import tsl_nacha.dominio.Cuentas;
import tsl_nacha.dominio.Pagos;
import tsl_nacha.dominio.Utilitaria;
import tsl_nacha.gestoras.GestCuentas;
import tsl_nacha.gestoras.GestPagos;

/**
 *
 * @author Luis
 */
public class FrmPagos extends javax.swing.JInternalFrame {

    /** Creates new form FrmCuenta */
    public FrmPagos() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        Utilitaria.limpiarJtables((DefaultTableModel) this.jTable2.getModel());
        Utilitaria.listarCuentas((DefaultTableModel) this.jTable2.getModel());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtNombre11 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(698, 581));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Cliente", "Saldo", "Fecha"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 680, 140));

        jPanel1.setBackground(new java.awt.Color(153, 180, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(698, 71));

        jLabel6.setBackground(new java.awt.Color(51, 255, 51));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48));
        jLabel6.setText("Pagos");
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 565, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 71));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setFont(new java.awt.Font("Verdana", 0, 10));
        btnBuscar.setText("Buscar");
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 90, 40));

        txtNombre11.setFont(new java.awt.Font("Verdana", 0, 10));
        txtNombre11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombre11KeyReleased(evt);
            }
        });
        jPanel2.add(txtNombre11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 40));

        jLabel1.setText("Monto ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 90, 30));

        jButton1.setText(">>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 60, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuenta", "Monto", "Fecha", "IdPago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 680, 250));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 160, 30));

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, -1, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        try{
        String s = String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 0));
        int numero = Integer.parseInt(s);
        ArrayList<Pagos> colPagos = GestPagos.getInstance().devolverPagosCuenta(numero);

        DefaultTableModel modelo = (DefaultTableModel) this.jTable1.getModel();
        Utilitaria.limpiarJtables(modelo);
        Utilitaria.listarPagosCuenta(modelo, colPagos);
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(rootPane, "Seleccione denuevo la cuenta");
        }
}//GEN-LAST:event_jTable2MouseClicked

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    try {
        String s = String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 0));
        int numero = Integer.parseInt(s);
        Cuentas c = GestCuentas.getInstance().devolverCuentaPorNumero(numero);
        String fecha = Utilitaria.convertirDateString(this.jDateChooser1.getDate());
        Pagos objPago = new Pagos(GestPagos.getInstance().devolverNumeroPago(), c, Integer.parseInt(this.jTextField1.getText()), fecha);
        if (c.getSaldo() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "No se puede ingresar un pago porque el cliente no tiene ninguna deuda");
        } else {
            if(c.getSaldo()<objPago.getMonto()){
                 JOptionPane.showMessageDialog(rootPane, "No puede pagar un monto mayor a la deuda");
            }else{
            if (GestPagos.getInstance().agregarPagos(objPago)) {
                ArrayList<Pagos> colPagos = GestPagos.getInstance().devolverPagosCuenta(numero);

                DefaultTableModel modelo = (DefaultTableModel) this.jTable1.getModel();
                Utilitaria.limpiarJtables(modelo);
                Utilitaria.listarPagosCuenta(modelo, colPagos);
                System.out.println("Pago agregado");
                GestCuentas.getInstance().disminuirSaldoCuenta(objPago);
                Utilitaria.limpiarJtables((DefaultTableModel) this.jTable2.getModel());
                Utilitaria.listarCuentas((DefaultTableModel) this.jTable2.getModel());
                this.txtNombre11.setText("");
                this.jTextField1.setText("");

            }
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(rootPane, "El monto ingresado es incorrecto");
    } catch (ArrayIndexOutOfBoundsException e) {
        JOptionPane.showMessageDialog(rootPane, "Seleccione una cuenta primero");
    } catch (NullPointerException e) {
        JOptionPane.showMessageDialog(rootPane, "Complete Fecha y Monto del Pago");
    }
}//GEN-LAST:event_jButton1ActionPerformed

private void txtNombre11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre11KeyReleased
// TODO add your handling code here:
    try {
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        modelo.setRowCount(0);
        String nombre = txtNombre11.getText();
        int i = nombre.length();
        String nombre2;
        for (Cuentas objC : GestCuentas.getInstance().devolverTodasCuentas()) {
            nombre2 = objC.getObjCliente().getcNombre();
            String cortado = nombre2.substring(0, i);
            if (cortado.equalsIgnoreCase(nombre)) {
                Object[] objCue = {objC.getIdCuenta(), objC.getObjCliente().getcNombre(), objC.getSaldo(), objC.getFechaUltimaEntrega()};
                modelo.addRow(objCue);
            }
        }
    } catch (Exception e) {
    }
}//GEN-LAST:event_txtNombre11KeyReleased

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String s = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(),3));
        int numero = Integer.parseInt(s);
        Pagos objPago  = GestPagos.getInstance().devolverPagoPorNum(numero);
        if(GestPagos.getInstance().eliminarPago(objPago)){
            GestCuentas.getInstance().RestaurarSaldoCuenta(objPago);
             Utilitaria.limpiarJtables((DefaultTableModel) this.jTable2.getModel());
             Utilitaria.listarCuentas((DefaultTableModel) this.jTable2.getModel());
             Utilitaria.limpiarJtables((DefaultTableModel) this.jTable1.getModel());   
            JOptionPane.showMessageDialog(rootPane,"Pago eliminado");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtNombre11;
    // End of variables declaration//GEN-END:variables
}
