/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmGastos.java
 *
 * Created on 2/11/2011, 09:34:36 AM
 */
package api.form;

import api.dom.Gasto;
import api.dom.Utilitaria;
import api.gest.GestGastos;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis
 */
public class FrmGastos extends javax.swing.JInternalFrame {

    /** Creates new form FrmGastos */
    public FrmGastos() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        Date hoy = new Date();
        jDateChooser1.setDate(hoy);
        jTable1.setModel(Utilitaria.listarGastos((DefaultTableModel) jTable1.getModel()));
        lblnumero.setText(String.valueOf(GestGastos.getInstance().devolverUltimoNum()));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtimporte = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnagregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblnumero = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtobservaciones = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtNombre1 = new javax.swing.JTextField();
        btnBuscar1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        btnmodificar1 = new javax.swing.JButton();
        btnagregar1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cboxtipo = new javax.swing.JComboBox();

        setMaximumSize(new java.awt.Dimension(720, 650));
        setMinimumSize(new java.awt.Dimension(720, 650));
        setNormalBounds(new java.awt.Rectangle(0, 0, 698, 581));
        setPreferredSize(new java.awt.Dimension(720, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtimporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 270, -1));

        jLabel5.setText("Importe:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Fecha", "Tipo", "Importe", "Observaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 700, 430));

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 90, 40));

        btnmodificar.setText("Modificar");
        btnmodificar.setEnabled(false);
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 90, 40));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 210, -1));

        jPanel1.setBackground(new java.awt.Color(153, 180, 209));
        jPanel1.setMaximumSize(new java.awt.Dimension(720, 74));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 74));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 74));
        jPanel1.setRequestFocusEnabled(false);

        jLabel6.setBackground(new java.awt.Color(51, 255, 51));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48));
        jLabel6.setText("Gastos");
        jLabel6.setToolTipText("");

        jLabel10.setBackground(new java.awt.Color(51, 255, 51));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel10.setText("#");
        jLabel10.setToolTipText("");

        lblnumero.setBackground(new java.awt.Color(51, 255, 51));
        lblnumero.setFont(new java.awt.Font("Tahoma", 0, 24));
        lblnumero.setText("1");
        lblnumero.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 480, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblnumero)
                .addGap(49, 49, 49)
                .addComponent(jLabel9))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addComponent(lblnumero)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 74));

        jLabel7.setText("Fecha:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel2.setText("Obs :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        getContentPane().add(txtobservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 210, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombre1KeyReleased(evt);
            }
        });
        jPanel2.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 160, 40));

        btnBuscar1.setText("...");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, 20, 40));

        jToggleButton1.setText("Buscar por Tipo");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 580, 170, 40));

        btnmodificar1.setText("Eliminar");
        btnmodificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnmodificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, 90, 40));

        btnagregar1.setText("...");
        btnagregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 40, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel14.setText("Tipo: ");
        jLabel14.setToolTipText("");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 50, 20));

        cboxtipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alarma", "Polarizado", "Otro" }));
        cboxtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxtipoActionPerformed(evt);
            }
        });
        getContentPane().add(cboxtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 270, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void txtNombre1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre1KeyReleased
    // TODO add your handling code here:
    if ("".equals(txtNombre1)) {
        jTable1.setModel(Utilitaria.listarGastos((DefaultTableModel) jTable1.getModel()));
    } else {
        if (jToggleButton1.getText().equals("Buscar por Codigo")) {
            try {
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setRowCount(0);
                int numero = Integer.parseInt(txtNombre1.getText());
                Gasto objG = GestGastos.getInstance().devolverGasto(numero);
                Object[] objart = {objG.getgNumero(), objG.getgFecha(), objG.getgDesc(), objG.getgImporte(), objG.getgObservaciones()};
                modelo.addRow(objart);
            } catch (NumberFormatException ex) {
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(rootPane, "No existe ese gasto");
                jTable1.setModel(Utilitaria.listarGastos((DefaultTableModel) jTable1.getModel()));
                txtNombre1.setText("");
            }
        } else {
            try {
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setRowCount(0);
                String nombre = txtNombre1.getText();
                int i = nombre.length();
                String nombre2;
                for (Gasto objG : GestGastos.getInstance().devolverGastos()) {
                    nombre2 = objG.getgDesc();
                    String cortado = nombre2.substring(0, i);
                    if (cortado.equalsIgnoreCase(nombre)) {
                        Object[] objart = {objG.getgNumero(), objG.getgFecha(), objG.getgDesc(), objG.getgImporte(), objG.getgObservaciones()};
                        modelo.addRow(objart);
                    }
                }
            } catch (Exception e) {
            }
        }
    }
}//GEN-LAST:event_txtNombre1KeyReleased

private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
    // TODO add your handling code here:
    this.jTable1.setModel(Utilitaria.listarGastos((DefaultTableModel) jTable1.getModel()));
    this.txtNombre1.setText("");
}//GEN-LAST:event_btnBuscar1ActionPerformed

private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
// TODO add your handling code here:
    if (jToggleButton1.isSelected()) {
        this.jToggleButton1.setText("Buscar por Codigo");
        txtNombre1.setText("");
    } else {
        this.jToggleButton1.setText("Buscar por Descripcion");
        txtNombre1.setText("");
    }

}//GEN-LAST:event_jToggleButton1ActionPerformed

private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
// TODO add your handling code here:
    try{
    if ("".equals(cboxtipo.getSelectedItem().toString())) {
        JOptionPane.showMessageDialog(rootPane, "Debe ingresar una descripcion");
    } else if ("".equals(txtimporte.getText())) {
        JOptionPane.showMessageDialog(rootPane, "Debe ingresar un importe");
    } else if (jDateChooser1.getDate() == null) {
        JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una fecha");
    } else {
        if ("".equals(txtobservaciones.getText())) {
            txtobservaciones.setText("Ninguna");
        }
        String descripcion = cboxtipo.getSelectedItem().toString();
        String observaciones = txtobservaciones.getText();
        double importe = Double.parseDouble(txtimporte.getText());
        String fing = Utilitaria.convertirDateString(jDateChooser1.getDate());
        Gasto objG = new Gasto(Integer.parseInt(lblnumero.getText()), fing, descripcion, importe, observaciones);
        GestGastos.getInstance().altaGasto(objG);
        JOptionPane.showMessageDialog(rootPane, "Gasto ingresado correctamente");
        lblnumero.setText(String.valueOf(GestGastos.getInstance().devolverUltimoNum()));
        jTable1.setModel(Utilitaria.listarGastos((DefaultTableModel) jTable1.getModel()));
        cboxtipo.setSelectedItem(null);
        txtobservaciones.setText("");
        txtimporte.setText("");        
    }
    }catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, "Asegurese de ingresar bien los campos");
    }
}//GEN-LAST:event_btnagregarActionPerformed

private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
// TODO add your handling code here:
    lblnumero.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
    String tipo = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 2));
    cboxtipo.setSelectedItem(tipo);
    txtimporte.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 3)));
    txtobservaciones.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 4)));
    jDateChooser1.setDate(Utilitaria.convertirStringDate(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 1))));
    btnmodificar.setEnabled(true);
    btnagregar.setEnabled(false);
}//GEN-LAST:event_jTable1MouseClicked

private void btnagregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregar1ActionPerformed
        // TODO add your handling code here:
        lblnumero.setText(String.valueOf(GestGastos.getInstance().devolverUltimoNum()));
        cboxtipo.setSelectedItem(null);
        txtimporte.setText("");
        txtobservaciones.setText("");
        Date hoy = new Date();
        jDateChooser1.setDate(hoy);       
        btnagregar.setEnabled(true);
        btnmodificar.setEnabled(false);
}//GEN-LAST:event_btnagregar1ActionPerformed

private void btnmodificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificar1ActionPerformed
// TODO add your handling code here:
    try{
    GestGastos.getInstance().bajaGasto(Integer.parseInt(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0))));
    jTable1.setModel(Utilitaria.listarGastos((DefaultTableModel) jTable1.getModel()));
    btnagregar.setEnabled(true);
    btnmodificar.setEnabled(true);
    }catch(NullPointerException e){
        JOptionPane.showMessageDialog(rootPane, "Seleccione un gasto");
    }catch(ArrayIndexOutOfBoundsException e){
        JOptionPane.showMessageDialog(rootPane, "Seleccione un gasto");
    }
}//GEN-LAST:event_btnmodificar1ActionPerformed

private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
// TODO add your handling code here:
     if ("".equals(cboxtipo.getSelectedItem().toString())) {
        JOptionPane.showMessageDialog(rootPane, "Debe ingresar una descripcion");
    } else if ("".equals(txtimporte.getText())) {
        JOptionPane.showMessageDialog(rootPane, "Debe ingresar un importe");
    } else if (jDateChooser1.getDate() == null) {
        JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una fecha");
    } else {
        if ("".equals(txtobservaciones.getText())) {
            txtobservaciones.setText("Ninguna");
        }
        String descripcion = cboxtipo.getSelectedItem().toString();
        String observaciones = txtobservaciones.getText();
        double importe = Double.parseDouble(txtimporte.getText());
        String fing = Utilitaria.convertirDateString(jDateChooser1.getDate());
        Gasto objG = new Gasto(Integer.parseInt(lblnumero.getText()), fing, descripcion, importe, observaciones);
        GestGastos.getInstance().modificarGasto(objG);
        JOptionPane.showMessageDialog(rootPane, "Gasto modificado correctamente");
        lblnumero.setText(String.valueOf(GestGastos.getInstance().devolverUltimoNum()));
        jTable1.setModel(Utilitaria.listarGastos((DefaultTableModel) jTable1.getModel()));
        cboxtipo.setSelectedItem(null);
        txtobservaciones.setText("");
        txtimporte.setText(""); 
        btnagregar.setEnabled(true);
        btnmodificar.setEnabled(false);
    }
}//GEN-LAST:event_btnmodificarActionPerformed

private void cboxtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxtipoActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_cboxtipoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnagregar1;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnmodificar1;
    private javax.swing.JComboBox cboxtipo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblnumero;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtimporte;
    private javax.swing.JTextField txtobservaciones;
    // End of variables declaration//GEN-END:variables
}
