/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmDeudoresentrefechas.java
 *
 * Created on 11-oct-2011, 10:12:40
 */
package apiformularios.form;

import api.dom.Cliente;
import api.dom.Factura;
import api.dom.Utilitaria;
import api.gest.GestFactura;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable.PrintMode;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Luis
 */
public class FrmDeudoresentrefechas extends javax.swing.JInternalFrame {

    /** Creates new form FrmDeudoresentrefechas */
    public FrmDeudoresentrefechas() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        TableColumn columna = jTable1.getColumn("Nro");
        /*TableColumn columna1 = jTable1.getColumn("Fecha");*/
        columna.setPreferredWidth(45);
        /*columna1.setPreferredWidth(90);*/
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnporpantalla = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        lbldeuda = new javax.swing.JLabel();
        lblFacturado2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(652, 592));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 180, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 71));

        jLabel6.setBackground(new java.awt.Color(51, 255, 51));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48));
        jLabel6.setText("Deudores entre fechas");
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        jLabel1.setText("Dede fecha:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel2.setText("Seleccione un cliente para tener su lista detallada: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        btnporpantalla.setText("Por pantalla");
        btnporpantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnporpantallaActionPerformed(evt);
            }
        });
        getContentPane().add(btnporpantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 512, -1, 50));

        btnimprimir.setText("Imprimir");
        btnimprimir.setEnabled(false);
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 512, 80, 50));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro", "Fecha Factura", "Cliente Nom", "Debe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setMinWidth(45);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(45);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(45);
        jTable1.getColumnModel().getColumn(1).setMinWidth(100);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(1).setMaxWidth(100);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setMinWidth(150);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(3).setMaxWidth(150);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 630, 350));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 130, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 140, -1));

        lbldeuda.setFont(new java.awt.Font("Tahoma", 1, 18));
        lbldeuda.setText("0");
        getContentPane().add(lbldeuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, -1, -1));

        lblFacturado2.setFont(new java.awt.Font("Tahoma", 1, 18));
        lblFacturado2.setText("Total deuda:  $");
        getContentPane().add(lblFacturado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 240, -1));

        jLabel3.setText("Hasta fecha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnporpantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnporpantallaActionPerformed
         // TODO add your handling code here:
        try {
            Utilitaria.limpiarJtables((DefaultTableModel) jTable1.getModel());
            Date fechadesde = this.jDateChooser1.getDate();
            Date fechahasta = this.jDateChooser2.getDate();
            jComboBox1.setModel(Utilitaria.listarClientesDeudoresCombo((DefaultComboBoxModel)jComboBox1.getModel(), fechadesde, fechahasta ));
            Utilitaria.deudoresEntre2Fechas((DefaultTableModel) this.jTable1.getModel(), fechadesde, fechahasta);
            lbldeuda.setText(String.valueOf(Utilitaria.deudoresEntre2Fechastotal(fechadesde, fechahasta)));
            btnimprimir.setEnabled(true);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione las fechas entre las cuales se va a consultar");
        }
    }//GEN-LAST:event_btnporpantallaActionPerformed

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
        // TODO add your handling code here:
        try {
            String fini = Utilitaria.convertirDateString(jDateChooser1.getDate());
            String ffin = Utilitaria.convertirDateString(jDateChooser2.getDate());
            MessageFormat encabezado = new MessageFormat("Deudores desde:" + fini + " hasta: " + ffin);
            //MessageFormat pie = new MessageFormat("Total Deudas: " + lbldeuda.getText());

            jTable1.print(PrintMode.FIT_WIDTH, encabezado, null/*, pie*/);
            print(null);
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error durante la impresion");
        } catch (NullPointerException e) {
        }
        
    }//GEN-LAST:event_btnimprimirActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:


        if (evt.getClickCount() == 2) {
            String x = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
            int y = Integer.parseInt(x);
            Factura f = (Factura)GestFactura.getInstance().devolverFactura(y);
            new FrmDetalleDeDebe(f);
        }

    }//GEN-LAST:event_jTable1MousePressed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        try {
            Utilitaria.limpiarJtables((DefaultTableModel) jTable1.getModel());
            Date fechadesde = this.jDateChooser1.getDate();
            Date fechahasta = this.jDateChooser2.getDate();
            Cliente objC = (Cliente) jComboBox1.getSelectedItem();
            Utilitaria.deudoresEntre2Fechascliente((DefaultTableModel) this.jTable1.getModel(), fechadesde, fechahasta, objC);
            lbldeuda.setText(String.valueOf(Utilitaria.deudoresEntre2Fechastotalcliente(fechadesde, fechahasta, objC)));
            btnimprimir.enable(true);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione las fechas entre las cuales se va a consultar");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnporpantalla;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFacturado2;
    private javax.swing.JLabel lbldeuda;
    // End of variables declaration//GEN-END:variables
}