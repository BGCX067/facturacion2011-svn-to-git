/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmFacturas.java
 *
 * Created on 1/11/2011, 09:30:32 AM
 */
package api.form;

import api.dom.Articulos;
import api.dom.Cliente;
import api.dom.Factura;
import api.dom.Lineas;
import api.dom.Utilitaria;
import api.gest.GestArticulos;
import api.gest.GestFactura;
import api.gest.GestLineas;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis
 */
public class FrmFacturas extends javax.swing.JInternalFrame {

    Articulos objA = new Articulos();
    Factura objF = new Factura();

    /** Creates new form FrmFacturas */
    public FrmFacturas() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        cboxcliente.setModel(Utilitaria.listarClientesCombo((DefaultComboBoxModel) cboxcliente.getModel()));
        lblnumero.setText(String.valueOf(GestFactura.getInstance().devolverUltimoNum()));
        cboxcliente.setSelectedItem(null);
        cboxtipo.setSelectedItem(null);
        Date hoy = new Date();
        jDateChooser1.setDate(hoy);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        txtarticulo = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblnumero = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        btnAgregar1 = new javax.swing.JButton();
        txtsubtotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtiva = new javax.swing.JTextField();
        cboxcliente = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnAgregar2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtarticulo1 = new javax.swing.JTextField();
        btnAgregar3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cboxtipo = new javax.swing.JComboBox();

        setMaximumSize(new java.awt.Dimension(720, 650));
        setMinimumSize(new java.awt.Dimension(720, 650));
        setNormalBounds(new java.awt.Rectangle(0, 0, 698, 581));
        setPreferredSize(new java.awt.Dimension(720, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel2.setText("Descripcion :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel3.setText("Cantidad :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel4.setText("Articulo :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel5.setText("Total de Articulos: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, 20));

        txtcantidad.setEnabled(false);
        getContentPane().add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 170, -1));

        txtarticulo.setText("0");
        txtarticulo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtarticuloCaretUpdate(evt);
            }
        });
        txtarticulo.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtarticuloInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        txtarticulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtarticuloKeyTyped(evt);
            }
        });
        getContentPane().add(txtarticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 170, -1));

        txttotal.setEditable(false);
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 170, 20));

        btnEliminar.setText("Cancelar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, 90, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel7.setText("Importe total:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, 20));

        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Articulo", "Cantidad", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 690, 300));

        jPanel1.setBackground(new java.awt.Color(153, 180, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(698, 71));

        jLabel11.setBackground(new java.awt.Color(51, 255, 51));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 48));
        jLabel11.setText("Factura");
        jLabel11.setToolTipText("");

        lblnumero.setBackground(new java.awt.Color(51, 255, 51));
        lblnumero.setFont(new java.awt.Font("Tahoma", 0, 24));
        lblnumero.setText("1");
        lblnumero.setToolTipText("");

        jLabel12.setBackground(new java.awt.Color(51, 255, 51));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel12.setText("#");
        jLabel12.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(611, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(lblnumero)
                .addGap(51, 51, 51))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel11)
                    .addContainerGap(533, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblnumero))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(21, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 71));

        txtdescripcion.setEditable(false);
        txtdescripcion.setFont(new java.awt.Font("Tahoma", 1, 11));
        getContentPane().add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 260, -1));

        btnAgregar1.setText("Agregar Linea");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 130, -1));

        txtsubtotal.setEditable(false);
        getContentPane().add(txtsubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 170, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel9.setText("Mano de obra Prosound:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, 20));

        txtiva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtivaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtivaKeyTyped(evt);
            }
        });
        getContentPane().add(txtiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 170, 20));

        cboxcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxclienteActionPerformed(evt);
            }
        });
        getContentPane().add(cboxcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 260, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10));
        jButton1.setText(">>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 50, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel8.setText("Fecha:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 10));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 170, -1));

        btnAgregar2.setText("Agregar");
        btnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, 90, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel6.setText("Obs : ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        txtarticulo1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtarticulo1CaretUpdate(evt);
            }
        });
        txtarticulo1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtarticulo1InputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        txtarticulo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtarticulo1KeyTyped(evt);
            }
        });
        getContentPane().add(txtarticulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 170, -1));

        btnAgregar3.setText("Eliminar Linea");
        btnAgregar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 120, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel13.setText("Cliente :");
        jLabel13.setToolTipText("");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 50, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel14.setText("Tipo: ");
        jLabel14.setToolTipText("");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 50, 20));

        cboxtipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alarma", "Polarizado", "Otro" }));
        cboxtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxtipoActionPerformed(evt);
            }
        });
        getContentPane().add(cboxtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 260, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtarticuloInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtarticuloInputMethodTextChanged
        // TODO add your handling code here
}//GEN-LAST:event_txtarticuloInputMethodTextChanged

    private void txtarticuloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtarticuloKeyTyped
        // TODO add your handling code here:
}//GEN-LAST:event_txtarticuloKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        modelo.setRowCount(0);
        //listo los articulos y cambio el nuevo numero
        lblnumero.setText(String.valueOf(GestFactura.getInstance().devolverUltimoNum()));
        txtarticulo.setText("0");
        txtarticulo1.setText("");
        txtcantidad.setText("");
        txtiva.setText("");
        txtsubtotal.setText("");
        txttotal.setText("");
        cboxcliente.setSelectedItem(null);

}//GEN-LAST:event_btnEliminarActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        //txtfingreso.sets
}//GEN-LAST:event_jTable2MouseClicked

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        if ("0".equals(txtarticulo.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un articulo");
        } else if ("".equals(txtcantidad.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese cantidad");
        } else if ("".equals(txtdescripcion.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un articulo");
        } else {
            Lineas objL = new Lineas(objF, 1, objA.getArtCod(), Integer.parseInt(txtcantidad.getText()));
            Articulos art = GestArticulos.getInstance().devolverartpornumero(objA.getArtCod());
            for (int i = 0; i <= modelo.getRowCount(); i++) {
                if (modelo.getRowCount() == 0) {
                    Object[] objOp = {lblnumero.getText(), art.getArtNom(), objL.getLinCant(), art.getArtPrecio() * objL.getLinCant()};
                    modelo.addRow(objOp);
                    break;
                } else if (art.getArtNom().equals(String.valueOf(jTable2.getValueAt(i, 1)))) {
                    int cantidad = 0;
                    cantidad = Integer.parseInt(txtcantidad.getText()) + Integer.parseInt(String.valueOf(jTable2.getValueAt(i, 2)));
                    double total = 0;
                    total = cantidad * art.getArtPrecio();
                    jTable2.setValueAt(cantidad, i, 2);
                    jTable2.setValueAt(total, i, 3);
                    break;
                } else {
                    Object[] objOp = {lblnumero.getText(), art.getArtNom(), objL.getLinCant(), art.getArtPrecio() * objL.getLinCant()};
                    modelo.addRow(objOp);
                    break;
                }
            }
            txtarticulo.setText("0");
            txtcantidad.setText("");
            txtdescripcion.setText("");
            double total = 0;
            for (int i = 0; i < modelo.getRowCount(); i++) {
                total = total + (Double.parseDouble(String.valueOf(jTable2.getValueAt(i, 3))));
            }
            txttotal.setText(String.valueOf(total));
            txtsubtotal.setText(String.valueOf(total));
        }

}//GEN-LAST:event_btnAgregar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FrmListadoArt F = new FrmListadoArt(this);
        F.setVisible(true);
}//GEN-LAST:event_jButton1ActionPerformed

    private void cboxclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxclienteActionPerformed

    private void txtarticuloCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtarticuloCaretUpdate
        // TODO add your handling code here:
        try {
            objA = GestArticulos.getInstance().devolverartpornumero(Integer.parseInt(txtarticulo.getText()));
            txtdescripcion.setText(objA.getArtDesc());
            txtcantidad.setEnabled(true);
        } catch (NullPointerException ex) {
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_txtarticuloCaretUpdate

    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        /*try {*/
        if ("".equals(lblnumero.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Error en el codigo");
        } else if ("".equals(txttotal.getText())) {
            JOptionPane.showMessageDialog(rootPane, "La factura no tiene un importe");
        } else if (cboxcliente.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione el cliente");
        } else if (jDateChooser1.getDate() == null) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione la fecha de la factura");
        } else if ("".equals(txtarticulo1.getText())) {
            txtarticulo1.setText("Ninguna");
            } else if ("".equals(txtsubtotal.getText())) {
            txtarticulo1.setText("0");
        } else {
            //convierto los datos
            int codigo = Integer.parseInt(lblnumero.getText());
            String fing = Utilitaria.convertirDateString(jDateChooser1.getDate());
            double subtotal = Double.parseDouble(txtsubtotal.getText());
            double total = Double.parseDouble(txttotal.getText());
            //creo la factura
            Factura objF = new Factura(codigo, fing, (Cliente) cboxcliente.getSelectedItem(), subtotal, total, total, txtarticulo1.getText(), cboxtipo.getSelectedItem().toString());
            //la agrego
            if (GestFactura.getInstance().altaFactura(objF) == false) {
            } else {
                //agrego sus lineas
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    int numeroL = GestLineas.getInstance().devolverUltimoNum();
                    int cantLinea = Integer.parseInt(String.valueOf(jTable2.getValueAt(i, 2)));
                    Articulos numart = GestArticulos.getInstance().devolverartpornombre(String.valueOf(jTable2.getValueAt(i, 1)));
                    Lineas objLinea = new Lineas(objF, numeroL, numart.getArtCod(), cantLinea);
                    GestLineas.getInstance().altaLinea(objLinea);
                }
                //mensaje
                JOptionPane.showMessageDialog(rootPane, "Factura agregada exitosamente");
                //listo los articulos y cambio el nuevo numero
                lblnumero.setText(String.valueOf(GestFactura.getInstance().devolverUltimoNum()));
                txtarticulo.setText("0");
                txtarticulo1.setText("");
                txtcantidad.setText("");
                txtiva.setText("");
                txtsubtotal.setText("");
                txttotal.setText("");
                cboxcliente.setSelectedItem(null);
                cboxtipo.setSelectedItem(null);
            }
        }
        /*} catch (Exception e) {
        }*/
    }//GEN-LAST:event_btnAgregar2ActionPerformed

private void txtarticulo1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtarticulo1CaretUpdate
// TODO add your handling code here:
}//GEN-LAST:event_txtarticulo1CaretUpdate

private void txtarticulo1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtarticulo1InputMethodTextChanged
// TODO add your handling code here:
}//GEN-LAST:event_txtarticulo1InputMethodTextChanged

private void txtarticulo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtarticulo1KeyTyped
// TODO add your handling code here:
}//GEN-LAST:event_txtarticulo1KeyTyped

private void txtivaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtivaKeyTyped
// TODO add your handling code here:
}//GEN-LAST:event_txtivaKeyTyped

private void txtivaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtivaKeyReleased
// TODO add your handling code here:
    if ("".equals(txtsubtotal.getText())) {
        txttotal.setText(txtiva.getText());
    } else {
        double subtotal = Double.parseDouble(txtsubtotal.getText());
        if ("".equals(txtiva.getText())) {
            txttotal.setText(String.valueOf(subtotal));
        } else {
            double total = subtotal + (Double.parseDouble(txtiva.getText()));
            txttotal.setText(String.valueOf(total));
        }
    }
}//GEN-LAST:event_txtivaKeyReleased

private void btnAgregar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar3ActionPerformed
// TODO add your handling code here:
    if (jTable2.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(rootPane, "Seleccione una linea antes de eliminarla");
    } else {
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        modelo.removeRow(jTable2.getSelectedRow());
    }
}//GEN-LAST:event_btnAgregar3ActionPerformed

private void cboxtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxtipoActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_cboxtipoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnAgregar3;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox cboxcliente;
    private javax.swing.JComboBox cboxtipo;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblnumero;
    private javax.swing.JTextField txtarticulo;
    private javax.swing.JTextField txtarticulo1;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtiva;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
