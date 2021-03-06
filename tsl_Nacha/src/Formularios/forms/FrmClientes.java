/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmClientes.java
 *
 * Created on 20-oct-2011, 9:39:39
 */
package Formularios.forms;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tsl_nacha.dominio.Clientes;
import tsl_nacha.dominio.Cuentas;
import tsl_nacha.dominio.Utilitaria;
import tsl_nacha.gestoras.GestClientes;
import tsl_nacha.gestoras.GestCuentas;

/**
 *
 * @author Luis
 */
public class FrmClientes extends javax.swing.JInternalFrame {

    /** Creates new form FrmClientes */
    public FrmClientes() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        Utilitaria.listarClientes((DefaultTableModel) this.jTable2.getModel());
        this.txtcodigo.setText(String.valueOf(GestClientes.getInstance().devolverUltimoNum()));
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
        txtcodigo = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        btnmodificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtNombre11 = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        btnAgregar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(698, 581));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel1.setText("Numero :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel2.setText("Direccion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel3.setText("Telefono");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel4.setText("Nombre :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtcodigo.setEditable(false);
        txtcodigo.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        txtcodigo.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 120, -1));

        txttelefono.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 170, -1));

        txtnombre.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 180, -1));

        btnmodificar.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 80, 40));

        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 700, 310));

        jPanel1.setBackground(new java.awt.Color(153, 180, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(698, 71));

        jLabel6.setBackground(new java.awt.Color(51, 255, 51));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48));
        jLabel6.setText("Clientes");
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 545, Short.MAX_VALUE)
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 71));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnBuscar.setText("Buscar");
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 90, 40));

        txtNombre11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jPanel2.add(txtNombre11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, 40));

        txtdireccion.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        getContentPane().add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 170, -1));

        btnAgregar1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnAgregar1.setText("Agregar");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 80, 40));

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 20, 20));

        btnEliminar.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 80, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
    // TODO add your handling code here:
    try {
        if ("".equals(txtcodigo.getText()) || "".equals(txtnombre.getText()) || "".equals(txtdireccion.getText()) || "".equals(txttelefono.getText())) {
            JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR CLIENTE. \nFALTO INGRESAR ALGUN DATO.");
        } else {
            Clientes objCliente = new Clientes(Integer.parseInt(txtcodigo.getText()), txtnombre.getText(), txtdireccion.getText(), txttelefono.getText());
            if (GestClientes.getInstance().modificarClientes(objCliente)) {
                txtcodigo.setText("");
                txtnombre.setText("");
                txtdireccion.setText("");
                txttelefono.setText("");
                JOptionPane.showMessageDialog(rootPane, "Cliente modificado");
                Utilitaria.limpiarJtables((DefaultTableModel) this.jTable2.getModel());
                Utilitaria.listarClientes((DefaultTableModel) this.jTable2.getModel());
            } else {
                JOptionPane.showMessageDialog(null, "CLIENTE NO PUEDE SER MODIFICADO");
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Error al modificar, Verifique datos");
    }


}//GEN-LAST:event_btnmodificarActionPerformed

private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
    // TODO add your handling code here:

    String s = String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 0));
    int numero = Integer.parseInt(s);
    Clientes objC = GestClientes.getInstance().devolverClientesNumero(numero);
    if ("NACHA CONTADO".equals(objC.getcNombre())) {
        JOptionPane.showMessageDialog(rootPane, "NACHA CONTADO NO ES MODIFICABLE POR UN USUARIO");
    } else {
        txtcodigo.setText(String.valueOf(objC.getcNumero()));
        txtnombre.setText(objC.getcNombre());
        txtdireccion.setText(objC.getcDireccion());
        txttelefono.setText(objC.getcTelefono());
    }

}//GEN-LAST:event_jTable2MouseClicked

private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
// TODO add your handling code here:
    if ("".equals(txtnombre.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar al menos el nombre del cliente");
    } else {
        Clientes objCliNuevo = new Clientes(Integer.parseInt(this.txtcodigo.getText()), this.txtnombre.getText(), this.txtdireccion.getText(), this.txttelefono.getText());
        if (GestClientes.getInstance().agregarClientes(objCliNuevo)) {
            JOptionPane.showMessageDialog(null, "CLIENTE INGRESADO CORRECTAMENTE");
            Utilitaria.limpiarJtables((DefaultTableModel) this.jTable2.getModel());
            Utilitaria.listarClientes((DefaultTableModel) this.jTable2.getModel());
            this.txtcodigo.setText(String.valueOf(GestClientes.getInstance().devolverUltimoNum()));
            if (JOptionPane.showConfirmDialog(rootPane, "DESEA CREARLE UNA CUENTA AUTOMATICAMENTE AL CLIENTE?", "WORA MESSAGE", JOptionPane.OK_CANCEL_OPTION) == 0) {
                Cuentas objCuenta = new Cuentas(GestCuentas.getInstance().devolverNumeroCuenta(), objCliNuevo, 0, "", true);
                GestCuentas.getInstance().agregarCuenta(objCuenta);
            }
        }
    }
}//GEN-LAST:event_btnAgregar1ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    txtcodigo.setText(String.valueOf(GestClientes.getInstance().devolverUltimoNum()));
    txtnombre.setText("");
    txtdireccion.setText("");
    txttelefono.setText("");
}//GEN-LAST:event_jButton1ActionPerformed

private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
// TODO add your handling code here:
    try {
        String s = String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 0));
        int numero = Integer.parseInt(s);

        Clientes c = GestClientes.getInstance().devolverClientesNumero(numero);


        if (GestClientes.getInstance().eliminarCliente(c)) {
            JOptionPane.showMessageDialog(rootPane, "Cliente Eliminado");
            DefaultTableModel modelo = (DefaultTableModel) this.jTable2.getModel();
            Utilitaria.limpiarJtables(modelo);
            Utilitaria.listarClientes(modelo);

        } else {
            JOptionPane.showMessageDialog(rootPane, "El cliente tiene una cuenta asociada,  \n Dirigase a Cuentas y eliminela primero");
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Compruebe si selecciono un Cliente");
    }
}//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtNombre11;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
