/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmEstadodecuenta.java
 *
 * Created on 11-oct-2011, 9:54:17
 */
package apiformularios.form;

import api.dom.Cliente;
import api.dom.Utilitaria;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable.PrintMode;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis
 */
public class FrmEstadodecuenta extends javax.swing.JInternalFrame {

    /** Creates new form FrmEstadodecuenta */
    public FrmEstadodecuenta() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        jComboBox4.setModel(Utilitaria.listarClientesCombo((DefaultComboBoxModel) jComboBox4.getModel()));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnporpantalla = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        lblFacturado = new javax.swing.JLabel();
        lblPagado = new javax.swing.JLabel();
        lblFacturado1 = new javax.swing.JLabel();
        lblFacturado2 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMinimumSize(new java.awt.Dimension(24, 32));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(652, 592));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 180, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(580, 71));

        jLabel6.setBackground(new java.awt.Color(51, 255, 51));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48));
        jLabel6.setText("Estado de cuenta");
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 70));

        jLabel1.setText("Dede fecha:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel2.setText("Hasta fecha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        jLabel3.setText("PAGADO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        btnporpantalla.setText("Por pantalla");
        btnporpantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnporpantallaActionPerformed(evt);
            }
        });
        getContentPane().add(btnporpantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, -1, 40));

        btnimprimir.setText("Imprimir");
        btnimprimir.setEnabled(false);
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 80, 40));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num", "Fecha Factura", "Lugar de Carga", "Lugar de Descarga", "Importe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 630, 140));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 220, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 240, -1));

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num", "Fecha Pago", "Nro Factura", "Importe pago", "Saldo Factura"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 630, 130));

        jLabel5.setText("FACTURADO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 550, -1));

        jLabel18.setText("Cliente : ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        lblFacturado.setFont(new java.awt.Font("Tahoma", 1, 18));
        lblFacturado.setText("0");
        getContentPane().add(lblFacturado, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        lblPagado.setFont(new java.awt.Font("Tahoma", 1, 18));
        lblPagado.setText("0");
        getContentPane().add(lblPagado, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, -1, -1));

        lblFacturado1.setFont(new java.awt.Font("Tahoma", 1, 18));
        lblFacturado1.setText("Total Pagado:  $");
        getContentPane().add(lblFacturado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, -1, -1));

        lblFacturado2.setFont(new java.awt.Font("Tahoma", 1, 18));
        lblFacturado2.setText("Total Facturado:  $");
        getContentPane().add(lblFacturado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jComboBox4ActionPerformed

    private void btnporpantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnporpantallaActionPerformed
        // TODO add your handling code here:-,
        
        try {
            if (jComboBox4.getSelectedIndex() < -1) {
                JOptionPane.showMessageDialog(rootPane, "Seleccione un cliente");
            } else {
                
                Cliente objc = (Cliente) jComboBox4.getSelectedItem();
                Date fechaini = jDateChooser1.getDate();
                Date fechafin = jDateChooser2.getDate();
                jTable1.setModel(Utilitaria.EstadoCuentaFacturado((DefaultTableModel) jTable1.getModel(), objc, fechaini, fechafin));
                jTable2.setModel(Utilitaria.EstadoCuentaPagado((DefaultTableModel) jTable2.getModel(), objc, fechaini, fechafin));
                lblFacturado.setText(String.valueOf(Utilitaria.EstadoCuentaTotalFacturado(objc, fechaini, fechafin)));
                lblPagado.setText(String.valueOf(Utilitaria.EstadoCuentaTotalPagado(objc, fechaini, fechafin)));
                btnimprimir.setEnabled(true);
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione las fechas entre las cuales se va a consultar");
        }

    }//GEN-LAST:event_btnporpantallaActionPerformed

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
        MessageFormat encabezado1 = new MessageFormat("Facturado");
        MessageFormat encabezado2 = new MessageFormat("Pagado");
        if (jTable1.getRowCount() == 0 && jTable2.getRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "No se puede imprimir. . \n Ambas listas estan en blanco");
        } else {
            try {
                // TODO add your handling code here:
                
                jTable1.print(PrintMode.FIT_WIDTH, encabezado1, null);
                jTable2.print(PrintMode.FIT_WIDTH, encabezado2, null);
            } catch (PrinterException ex) {
                Logger.getLogger(FrmEstadodecuenta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnimprimirActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnporpantalla;
    private javax.swing.JComboBox jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblFacturado;
    private javax.swing.JLabel lblFacturado1;
    private javax.swing.JLabel lblFacturado2;
    private javax.swing.JLabel lblPagado;
    // End of variables declaration//GEN-END:variables
}