/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmCliente.java
 *
 * Created on 10-oct-2011, 9:22:59
 */
package apiformularios.form;

import api.dom.Cliente;
import api.dom.Utilitaria;
import api.gest.GestCliente;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis
 */
public class FrmCliente extends javax.swing.JInternalFrame {

    /** Creates new form FrmCliente */
    public FrmCliente() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.txtNumero.setText(String.valueOf(GestCliente.getInstance().devolverUltimoNum()));
        Utilitaria.listarClientes((DefaultTableModel) this.jTable2.getModel());
        this.btnModificar.setEnabled(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDicose = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtDireccion1 = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtNombre1 = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(610, 570));
        setMinimumSize(new java.awt.Dimension(610, 570));
        setNextFocusableComponent(txtNombre);
        setNormalBounds(new java.awt.Rectangle(0, 0, 650, 570));
        setPreferredSize(new java.awt.Dimension(650, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel1.setText("Numero :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel2.setText("Nom. Completo :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel3.setText("Direccion :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel4.setText("*");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel5.setText("Dicose :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        txtNumero.setEditable(false);
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 150, -1));

        txtNombre.setNextFocusableComponent(txtDireccion1);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 190, -1));

        txtTelefono.setNextFocusableComponent(txtDicose);
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 190, -1));

        txtDicose.setNextFocusableComponent(txtRut);
        getContentPane().add(txtDicose, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 190, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel7.setText("Rut :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        txtRut.setNextFocusableComponent(btnAgregar);
        getContentPane().add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 190, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nombre completo", "Direccion", "Telefono", "Dicose", "Rut"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 630, 340));

        jPanel1.setBackground(new java.awt.Color(153, 180, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 71));

        jLabel8.setBackground(new java.awt.Color(51, 255, 51));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 48));
        jLabel8.setText("Clientes");
        jLabel8.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(475, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        txtDireccion1.setNextFocusableComponent(txtTelefono);
        getContentPane().add(txtDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 190, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        btnAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAgregarKeyPressed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 80, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 80, 40));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 80, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setText("Buscar");
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 90, 40));

        txtNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombre1KeyReleased(evt);
            }
        });
        jPanel2.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, 40));

        btnLimpiar.setText("...");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 30, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel6.setText("Telefono :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            if ("".equals(txtNombre.getText()) ) {
                JOptionPane.showMessageDialog(null, "Falto ingresar nombre.");
            } else {
                if("".equals(txtDicose.getText())){
                    txtDicose.setText("No ingreso");
                }
                if("".equals(txtDireccion1.getText())){
                    txtDireccion1.setText("No ingreso");
                }
                if("".equals(txtRut.getText())){
                    txtRut.setText("No ingreso");
                }
                if("".equals(txtTelefono.getText())){
                    txtTelefono.setText("No ingreso");
                }
                Utilitaria.limpiarJtables((DefaultTableModel) this.jTable2.getModel());
                Cliente objClie = new Cliente(txtDicose.getText(), txtRut.getText(), Integer.parseInt(txtNumero.getText()), txtNombre.getText(), txtDireccion1.getText(), txtTelefono.getText());
                GestCliente.getInstance().altaCliente(objClie);
               
                this.txtDicose.setText("");
                this.txtDireccion1.setText("");
                this.txtNombre.setText("");
                this.txtNombre1.setText("");
                this.txtRut.setText("");
                this.txtTelefono.setText("");
                this.txtNumero.setText(String.valueOf(GestCliente.getInstance().devolverUltimoNum()));
                Utilitaria.limpiarJtables((DefaultTableModel) this.jTable2.getModel());
                Utilitaria.listarClientes((DefaultTableModel) this.jTable2.getModel());

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error interno mientras se agregaba el cliente. \nSi el problema persiste comuniquese a W.O.R.A inc");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            Cliente objClie = new Cliente(txtDicose.getText(), txtRut.getText(), Integer.parseInt(txtNumero.getText()), txtNombre.getText(), txtDireccion1.getText(), txtTelefono.getText());
            GestCliente.getInstance().modificarCliente(objClie);
            txtNombre.setText("");
            txtDireccion1.setText("");
            txtDicose.setText("");
            txtTelefono.setText("");
            txtRut.setText("");
            txtNumero.setText(String.valueOf(GestCliente.getInstance().devolverUltimoNum()));
            Utilitaria.limpiarJtables((DefaultTableModel) jTable2.getModel());
            Utilitaria.listarClientes((DefaultTableModel) jTable2.getModel());
            JOptionPane.showMessageDialog(rootPane, "Cliente modificado con exito");
            btnModificar.setEnabled(false);
            btnAgregar.setEnabled(true);
        }catch(NumberFormatException a){
            JOptionPane.showMessageDialog(rootPane, "Seleccione un cliente de la lista antes de modificarlo");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un cliente de la lista antes de modificarlo");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

        if (jTable2.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un cliente");
        } else {
            String x = (String.valueOf(this.jTable2.getValueAt(jTable2.getSelectedRow(), 0)));
            int numero = Integer.parseInt(x);
            if( GestCliente.getInstance().bajaCliente(numero)== false){
                JOptionPane.showMessageDialog(null, "No se puede eliminar el cliente.  \nEl mismo esta asociado a una factira");
            }
           
            Utilitaria.limpiarJtables((DefaultTableModel) jTable2.getModel());
            Utilitaria.listarClientes((DefaultTableModel) this.jTable2.getModel());
            this.txtNumero.setText(String.valueOf(GestCliente.getInstance().devolverUltimoNum()));
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        txtNumero.setText(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 0)));
        txtNombre.setText(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 1)));
        txtDireccion1.setText(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 2)));
        txtTelefono.setText(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 3)));
        txtDicose.setText(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 4)));
        txtRut.setText(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 5)));
        this.btnModificar.setEnabled(true);
        this.btnAgregar.setEnabled(false);

    }//GEN-LAST:event_jTable2MouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.txtNumero.setText(String.valueOf(GestCliente.getInstance().devolverUltimoNum()));
        this.txtNombre.setText("");
        this.txtDireccion1.setText("");
        this.txtTelefono.setText("");
        this.txtDicose.setText("");
        this.txtRut.setText("");
        this.btnAgregar.setEnabled(true);
        this.btnModificar.setEnabled(false);
        // TODO add your handling code here:         this.txtNumero.setText(String.valueOf(GestEmpleado.getInstance().devolverUltimoNum()));         this.txtNombre1.setText("");         this.txtCedula.setText("");         this.txtDireccion.setText("");         this.txtTelefono.setText("");     }//GEN-LAST:event_btnLimpiarActionPerformed
    }
        private void txtNombre1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre1KeyReleased
            // TODO add your handling code here:
            try {
                DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
                modelo.setRowCount(0);
                String nombre = txtNombre1.getText();
                int i = nombre.length();
                String nombre2;
                for (Cliente objc : GestCliente.getInstance().devolverCliente()) {
                    nombre2 = objc.getpNombre();
                    String cortado = nombre2.substring(0, i);
                    if (cortado.equalsIgnoreCase(nombre)) {
                        Object[] objcli = {objc.getpNumero(), objc.getpNombre(), objc.getpDireccion(), objc.getpTelefono(), objc.getcDicose(), objc.getcRut()};
                        modelo.addRow(objcli);
                    }
                }
            } catch (Exception e) {
            }
        }//GEN-LAST:event_txtNombre1KeyReleased

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void jTable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable2MousePressed

    private void btnAgregarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAgregarKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
              btnAgregarActionPerformed(null);              
          }
    }//GEN-LAST:event_btnAgregarKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtDicose;
    private javax.swing.JTextField txtDireccion1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}