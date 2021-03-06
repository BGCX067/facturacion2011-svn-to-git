/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmCliente.java
 *
 * Created on 31/10/2011, 11:04:19 AM
 */
package api.form;

import api.dom.Articulos;
import api.dom.Utilitaria;
import api.gest.GestArticulos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis
 */
public class FrmArticulos extends javax.swing.JInternalFrame {

    /** Creates new form FrmCliente */
    public FrmArticulos() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        lblnumero.setText(String.valueOf(GestArticulos.getInstance().devolverUltimoNum()));
        jTable1.setModel(Utilitaria.listarArticulos((DefaultTableModel) jTable1.getModel()));
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
        jLabel9 = new javax.swing.JLabel();
        lblnumero = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtstock = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtdesc = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtNombre1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnBuscar1 = new javax.swing.JButton();
        btnagregar1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(720, 650));
        setMinimumSize(new java.awt.Dimension(720, 650));
        setNormalBounds(new java.awt.Rectangle(0, 0, 698, 581));
        setPreferredSize(new java.awt.Dimension(720, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 180, 209));
        jPanel1.setMaximumSize(new java.awt.Dimension(720, 74));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 74));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 74));
        jPanel1.setRequestFocusEnabled(false);

        jLabel6.setBackground(new java.awt.Color(51, 255, 51));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48));
        jLabel6.setText("Articulos");
        jLabel6.setToolTipText("");

        lblnumero.setBackground(new java.awt.Color(51, 255, 51));
        lblnumero.setFont(new java.awt.Font("Tahoma", 0, 24));
        lblnumero.setText("1");
        lblnumero.setToolTipText("");

        jLabel8.setBackground(new java.awt.Color(51, 255, 51));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel8.setText("#");
        jLabel8.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 449, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));

        jLabel1.setText("Descripcion:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));

        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel3.setText("Precio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        jLabel4.setText("Stock:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        txtstock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtstockKeyTyped(evt);
            }
        });
        getContentPane().add(txtstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 230, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 160, -1));
        getContentPane().add(txtdesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 160, -1));

        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 230, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 700, 400));

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 580, 90, 40));

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, 90, 40));

        btnmodificar.setText("Modificar");
        btnmodificar.setEnabled(false);
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 90, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombre1KeyReleased(evt);
            }
        });
        jPanel2.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 160, 40));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 90, 40));

        btnBuscar1.setText("...");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, 20, 40));

        btnagregar1.setText("...");
        btnagregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 40, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
        if ("".equals(lblnumero.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Falto ingresar codigo");
        }
        else if ("".equals(txtnombre.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Falto ingresar nombre");
        }
        else if ("".equals(txtdesc.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Falto ingresar descripcion");
        }
        else if ("".equals(txtprecio.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Falto ingresar precio");
        }
        else if ("".equals(txtstock.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Falto ingresar stock");
        } else {
            //convierto los datos
            int codigo = Integer.parseInt(lblnumero.getText());
            String nombre = txtnombre.getText();
            String descripcion = txtdesc.getText();
            double precio = Double.parseDouble(txtprecio.getText());
            int stock = Integer.parseInt(txtstock.getText());
            //creo el articulo
            Articulos objA = new Articulos(codigo, nombre, descripcion, precio, stock);
            //lo agrego
            GestArticulos.getInstance().altaArticulo(objA);
            //mensaje
            JOptionPane.showMessageDialog(rootPane, "Articulo agregado exitosamente");
            //listo los articulos y cambio el nuevo numero
            Utilitaria.listarArticulos((DefaultTableModel) jTable1.getModel());
            lblnumero.setText(String.valueOf(GestArticulos.getInstance().devolverUltimoNum()));
            txtnombre.setText("");
            txtdesc.setText("");
            txtprecio.setText("");
            txtstock.setText("");
        }
    }//GEN-LAST:event_btnagregarActionPerformed
    
    private void txtstockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstockKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtstockKeyTyped
    
    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtprecioKeyTyped
    
    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        if ("".equals(lblnumero.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Falto ingresar codigo");
        }
        if ("".equals(txtnombre.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Falto ingresar nombre");
        }
        if ("".equals(txtdesc.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Falto ingresar descripcion");
        }
        if ("".equals(txtprecio.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Falto ingresar precio");
        }
        if ("".equals(txtstock.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Falto ingresar stock");
        } else {
            //convierto los datos
            int codigo = Integer.parseInt(lblnumero.getText());
            String nombre = txtnombre.getText();
            String descripcion = txtdesc.getText();
            double precio = Double.parseDouble(txtprecio.getText());
            int stock = Integer.parseInt(txtstock.getText());
            //creo el articulo
            Articulos objA = new Articulos(codigo, nombre, descripcion, precio, stock);
            //lo agrego
            GestArticulos.getInstance().modificarArticulo(objA);
            //listo los articulos y limpio los textbox
            Utilitaria.listarArticulos((DefaultTableModel) jTable1.getModel());
            lblnumero.setText(String.valueOf(GestArticulos.getInstance().devolverUltimoNum()));
            txtnombre.setText("");
            txtdesc.setText("");
            txtprecio.setText("");
            txtstock.setText("");
            btnagregar.setEnabled(true);
            btnmodificar.setEnabled(false);
        }
    }//GEN-LAST:event_btnmodificarActionPerformed
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        lblnumero.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
        txtnombre.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 1)));
        txtdesc.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 2)));
        txtprecio.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 3)));
        txtstock.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 4)));
        btnmodificar.setEnabled(true);
        btnagregar.setEnabled(false);
        
    }//GEN-LAST:event_jTable1MouseClicked
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
        this.jTable1.setModel(Utilitaria.listarArticulos((DefaultTableModel) jTable1.getModel()));
        this.txtNombre1.setText("");
}//GEN-LAST:event_btnBuscar1ActionPerformed
    
    private void txtNombre1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre1KeyReleased
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setRowCount(0);
            String nombre = txtNombre1.getText();
            int i = nombre.length();
            String nombre2;
            for (Articulos objA : GestArticulos.getInstance().devolverArticulo()) {
                nombre2 = objA.getArtNom();
                String cortado = nombre2.substring(0, i);
                if (cortado.equalsIgnoreCase(nombre)) {
                    Object[] objart = {objA.getArtCod(), objA.getArtNom(), objA.getArtDesc(), objA.getArtPrecio(), objA.getArtStock()};
                    modelo.addRow(objart);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtNombre1KeyReleased
    
    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un cliente");
        } else {
            String x = (String.valueOf(this.jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
            int numero = Integer.parseInt(x);
            if (GestArticulos.getInstance().bajaArticulo(numero) == false) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar el cliente.  \n El mismo esta asociado a una factura");
            }
            Utilitaria.listarArticulos((DefaultTableModel) this.jTable1.getModel());
            lblnumero.setText(String.valueOf(GestArticulos.getInstance().devolverUltimoNum()));
            txtnombre.setText("");
            txtdesc.setText("");
            txtprecio.setText("");
            txtstock.setText("");
            
        }
    }//GEN-LAST:event_btneliminarActionPerformed
    
    private void btnagregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregar1ActionPerformed
        // TODO add your handling code here:
        lblnumero.setText(String.valueOf(GestArticulos.getInstance().devolverUltimoNum()));
        txtnombre.setText("");
        txtdesc.setText("");
        txtprecio.setText("");
        txtstock.setText("");
        btnagregar.setEnabled(true);
        btnmodificar.setEnabled(false);
    }//GEN-LAST:event_btnagregar1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnagregar1;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblnumero;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtdesc;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables
}
