/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmListadoDetallado.java
 *
 * Created on 15-oct-2011, 13:15:29
 */
package apiformularios.form;

import api.dom.Camion;
import api.dom.Cliente;
import api.dom.Empleado;
import api.dom.Factura;
import api.dom.Utilitaria;
import api.dom.jtableconcombo;
import api.gest.GestCambio;
import api.gest.GestCamiones;
import api.gest.GestCliente;
import api.gest.GestEmpleado;
import api.gest.GestFactura;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Javier
 */
public class FrmListadoDetallado extends javax.swing.JFrame {

    JComboBox combo;
    JComboBox combo1;
    JComboBox combo2;
    JComboBox combo3;
    DefaultTableModel oi;
    JInternalFrame i;
    Boolean fact = false;
    Boolean aux = false;

    /** Creates new form FrmListadoDetallado */
    public FrmListadoDetallado() {
        initComponents();
        fact = false;


        jTable1.setModel(Utilitaria.listarDetalladaLaFactura1((DefaultTableModel) jTable1.getModel()));
        jButton2.setVisible(true);
        TableColumn columna = jTable1.getColumn("Nro");
        TableColumn columna1 = jTable1.getColumn("Fecha");
        columna.setPreferredWidth(45);
        columna1.setPreferredWidth(90);




        ActionListener a = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (aux == true) {
                        jButton2ActionPerformed(e);
                        Utilitaria.limpiarJtables((DefaultTableModel) jTable1.getModel());
                        jTable1.setModel(Utilitaria.listarDetalladaLaFactura1((DefaultTableModel) jTable1.getModel()));
                        aux = false;

                    }
                    aux = true;
                } catch (IndexOutOfBoundsException a) {
                }

            }
        };

        combo = new JComboBox();
        combo1 = new JComboBox();
        combo2 = new JComboBox();
        combo3 = new JComboBox();


        Utilitaria.tipoPagoCombo((DefaultComboBoxModel) combo1.getModel());
        Utilitaria.listarClientesCombo((DefaultComboBoxModel) combo.getModel());
        Utilitaria.listarEmpleadosCombo((DefaultComboBoxModel) combo2.getModel());
        Utilitaria.listarCamionesCombo((DefaultComboBoxModel) combo3.getModel());


        combo3.addActionListener(a);
        combo2.addActionListener(a);
        combo1.addActionListener(a);
        combo.addActionListener(a);

        TableColumn col1 = jTable1.getColumnModel().getColumn(2);
        TableColumn col = jTable1.getColumnModel().getColumn(13);
        TableColumn col2 = jTable1.getColumnModel().getColumn(14);
        TableColumn col3 = jTable1.getColumnModel().getColumn(15);

        col2.setCellEditor(new jtableconcombo(combo2));
        col1.setCellEditor(new jtableconcombo(combo1));
        col.setCellEditor(new jtableconcombo(combo));
        col3.setCellEditor(new jtableconcombo(combo3));







    }

    public FrmListadoDetallado(DefaultTableModel x, JInternalFrame i) {
        initComponents();

        this.i = i;
        jTable1.setModel(Utilitaria.listarDetalladaLaFactura1((DefaultTableModel) jTable1.getModel()));
        TableColumn columna = jTable1.getColumn("Nro");
        TableColumn columna1 = jTable1.getColumn("Fecha");
        columna.setPreferredWidth(45);
        columna1.setPreferredWidth(90);
        oi = x;
        fact = true;

        jButton2.setVisible(false);


    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtNombre1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnBuscar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1020, 570));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1020, 590));
        setMinimumSize(new java.awt.Dimension(1020, 590));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro", "Fecha", "Moneda", "T. Cambio", "Lugar Carga", "Lugar Descarga", "Km's", "Km's Retorno", "Metros", "C. Bultos", "C. Animales", "Guia", "Importe", "Cliente", "Empleado", "Camion", "Observaciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1020, 470));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, 40));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 90, 40));

        btnBuscar1.setText("...");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 20, 40));

        jPanel1.setBackground(new java.awt.Color(153, 180, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(580, 71));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(51, 255, 51));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48));
        jLabel6.setText("Lista Detallada");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 49));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 70));

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 550, 100, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, 100, 40));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, -1, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if (this.fact == true) {
            for (Component e : i.getContentPane().getComponents()) {

                if ("class javax.swing.JTextField".equals(e.getClass().toString())) {
                    //  System.out.println(((JTextField)e).getText());
                    if ("0".equals(((JTextField) e).getText()) || "factura".equals(((JTextField) e).getName())) {


                        ((JTextField) e).setText(String.valueOf(this.jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
                        (((JTextField) e)).setName("factura");
                        break;
                    }
                }
            }
        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
        if (this.fact == true) {
            if (evt.getClickCount() == 2) {
                this.dispose();
            }
        }


    }//GEN-LAST:event_jTable1MousePressed

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1PropertyChange

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        try {
            if ("".equals(txtNombre1.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese numero de factura a buscar");
            } else {
                DefaultTableModel modelo32 = (DefaultTableModel) jTable1.getModel();
                modelo32.setRowCount(0);
                Factura objFac = GestFactura.getInstance().devolverFactura(Integer.parseInt(txtNombre1.getText()));
                if (fact == true) {
                    if (objFac.getfSaldo() == 0) {
                    } else {
                        Object[] objf = {objFac.getfNumero(), objFac.getfFecha(), objFac.getfMoneda(), objFac.getFtipoCambio(), objFac.getfLugarCarga(), objFac.getfLugarDescarga(), objFac.getfKilometros(), objFac.getfKilometrosRetorno(), objFac.getfGrupoMetros(), objFac.getfCantBultos(),
                            objFac.getfCantAnimales(), objFac.getfGuia(), objFac.getfImporte(), objFac.getObjCliente().getpNombre(), objFac.getObjEmpleado().getpNombre(),
                            objFac.getObjCamion().getcMatricula(), objFac.getfObservaciones(), objFac.getfSaldo()};
                        modelo32.addRow(objf);

                    }
                } else if (fact == false) {
                    Object[] objf = {objFac.getfNumero(), objFac.getfFecha(), objFac.getfMoneda(), objFac.getFtipoCambio(), objFac.getfLugarCarga(), objFac.getfLugarDescarga(), objFac.getfKilometros(), objFac.getfKilometrosRetorno(), objFac.getfGrupoMetros(), objFac.getfCantBultos(),
                        objFac.getfCantAnimales(), objFac.getfGuia(), objFac.getfImporte(), objFac.getObjCliente().getpNombre(), objFac.getObjEmpleado().getpNombre(),
                        objFac.getObjCamion().getcMatricula(), objFac.getfObservaciones(), objFac.getfSaldo()};
                    modelo32.addRow(objf);
                }





            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "No exsiste tal factura");
            txtNombre1.setText("");
            // this.jTable1.setModel(Utilitaria.listarDetalladaLaFactura());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_btnBuscar1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        /*try{*/
        //primero preguntamos si la factura ya no esta pagada
        int numeroF = Integer.parseInt(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
        String fechaF = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 1));
        String monedaF = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 2));
        double tipoc;
        if("Pesos".equals(monedaF)){
            tipoc = 0;
        }
        else{
            tipoc = GestCambio.getInstance().devolverUnicoCambio().getDolares();
        }
        String lugarcarga = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 4));
        String lugardescarga = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 5));
        int km = Integer.parseInt(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 6)));
        int kmretorno = Integer.parseInt(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 7)));
        int metros = Integer.parseInt(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 8)));
        int cantbultos = Integer.parseInt(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 9)));
        int cantanimales = Integer.parseInt(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 10)));
        String guia = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 11));
        int importe = Integer.parseInt(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 12)));
        //consigo el cliente
        String cliente = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 13));
        Cliente objc = GestCliente.getInstance().devolverclipornombre(cliente);
        //consigo el empleado
        String empleado = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 14));
        Empleado objE = GestEmpleado.getInstance().devolveremppornombre(empleado);
        //consigo el camion
        String camion = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 15));
        Camion objCam = GestCamiones.getInstance().devolverCamionNumero(camion);
        String observaciones = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 16));
        //convertimos la factura y la modificamos
        Factura objF = new Factura(numeroF, fechaF, monedaF, tipoc, lugarcarga, lugardescarga, km, metros, cantbultos, cantanimales, guia, importe, objc, objE, objCam, kmretorno, observaciones);
        if (GestFactura.getInstance().modificarFactura(objF) == true) {
            JOptionPane.showMessageDialog(rootPane, "Factura modificada");
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se puede modificar la factura porque la misma ya esta con pagos, .\n elimine sus pagos para poder modificarla");
        }


        //convertimos los valores de la lista antes de pasarselos a la factura


        /*}catch(NullPointerException e){
        
        }*/
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() == 0) {
            if (JOptionPane.showConfirmDialog(null, "Desea eliminar la factura de:  " + String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 3)) + "  del dia: " + String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 1))) == 0) {
                int facnro = Integer.parseInt(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
                GestFactura.getInstance().bajaFactura(facnro);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Se cancelo la eliminacion de la factura");
            }


        } else {
            JOptionPane.showMessageDialog(rootPane, "Primero seleccione una factura de la lista");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtNombre1;
    // End of variables declaration//GEN-END:variables
}
