/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsl_nacha.dominio;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;
import tsl_nacha.gestoras.GestArticulos;
import tsl_nacha.gestoras.GestCategorias;
import tsl_nacha.gestoras.GestClientes;
import java.util.*;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import tsl_nacha.gestoras.GestCuentas;
import tsl_nacha.gestoras.GestFacturas;
import tsl_nacha.gestoras.GestPagos;

/**
 *
 * @author Enrico
 */
public class Utilitaria {

    public static void cerrarVentanas(JDesktopPane conenedor) {

        for (JInternalFrame x : conenedor.getAllFrames()) {
            x.dispose();
        }
    }

    public static DefaultComboBoxModel listarCategoriasCombo(DefaultComboBoxModel modelo) {
        for (Categorias objc : GestCategorias.getInstance().devolverCategorias()) {
            modelo.addElement(objc);
        }
        return modelo;
    }

    public static DefaultComboBoxModel listarClienteCombo(DefaultComboBoxModel modelo) {
        for (Clientes objc : GestClientes.getInstance().devolverClientes()) {
            modelo.addElement(objc);
        }
        return modelo;
    }

    public static DefaultTableModel listarCategorias(DefaultTableModel modelo) {
        for (Categorias objC : GestCategorias.getInstance().devolverCategorias()) {
            Object[] objCat = {objC.getcNumero(), objC.getcNombre()};
            modelo.addRow(objCat);
        }
        return modelo;
    }
    
    public static DefaultTableModel listarPagos(DefaultTableModel modelo) {
        for (Pagos objP : GestPagos.getInstance().devolverTodosPagos()) {
            Object[] objPag = {objP.getIdCuenta().getObjCliente().getcNombre(),objP.getMonto(),objP.getFechaEntrega()};
            modelo.addRow(objPag);
        }
        return modelo;
    }
    
        public static DefaultTableModel listarPagosCuenta(DefaultTableModel modelo, ArrayList<Pagos> col) {
        for (Pagos objP : col) {
            Object[] objPag = {objP.getIdCuenta().getObjCliente().getcNombre(),objP.getMonto(),objP.getFechaEntrega(), objP.getIdPago()};
            modelo.addRow(objPag);
        }
        return modelo;
    }
        
                public static DefaultTableModel listarFacturas(DefaultTableModel modelo) {
        for (Facturas objF : GestFacturas.getInstance().devolverFacturas()) {
            Object[] objPag = {objF.getfNumero(),objF.getfFecha(),objF.getfSubTotal(),objF.getfIva(),objF.getfTotal(),objF.getObjCuenta().getObjCliente().getcNombre()};
            modelo.addRow(objPag);
        }
        return modelo;
    }
    
        public static DefaultTableModel listarCuentas(DefaultTableModel modelo) {
        for (Cuentas objC : GestCuentas.getInstance().devolverTodasCuentas()) {
            Object[] objCue = {objC.getIdCuenta(),objC.getObjCliente().getcNombre(), objC.getSaldo(), objC.getFechaUltimaEntrega()};
            modelo.addRow(objCue);
        }
        return modelo;
    }

    public static DefaultTableModel listarClientes(DefaultTableModel modelo) {
        for (Clientes objC : GestClientes.getInstance().devolverClientes()) {
            Object[] objCat = {objC.getcNumero(), objC.getcNombre(), objC.getcDireccion(), objC.getcTelefono()};
            modelo.addRow(objCat);
        }
        return modelo;
    }
    
    

    public static DefaultTableModel listarArticulos(DefaultTableModel modelo) {
        for (Articulos objA : GestArticulos.getInstance().devolverArticulos()) {
            Object[] objCat = {objA.getaCodigo(), objA.getObjCategoria().getcNombre(), objA.getaTalle(), objA.getaDescripcion(), objA.getaColor(), objA.getaStock(), objA.getaPrecio()};
            modelo.addRow(objCat);
        }
        return modelo;
    }

    public static DefaultTableModel listarLineasFactura(DefaultTableModel modelo, Facturas objFactura) {
        modelo.setRowCount(0);
        for (Lineas objLinea : objFactura.devolverLineasFact()) {
            Object[] obj = {objLinea.getlCorrelativo(), objLinea.getObjArticulo().getaDescripcion(), objLinea.getlCantidad(), objLinea.getlTotal()};
            modelo.addRow(obj);

        }
        return modelo;
    }

    public static DefaultTableModel limpiarJtables(DefaultTableModel modelo) {
        for (int i = 0; i < modelo.getRowCount();) {
            modelo.removeRow(i);
        }
        return modelo;
    }

    public static int leer_ini() {
        int IVA;
        try {
            Properties p = new Properties();
            p.load(new FileInputStream("C:\\param.ini"));
            IVA = Integer.parseInt(p.getProperty("IVA"));
            return IVA;
        } catch (Exception e) {
            System.out.println("error al leer el archivo .ini:" + e.getMessage());
            return 0;
        }
    }
    
    public static String convertirDateString(Date d) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = dateFormat.format(d);
        return fecha;
    }

    public static Date convertirStringDate(String d) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = formatoDelTexto.parse(d);
            return fecha;
        } catch (ParseException ex) {
        }
        return null;
    }

    public static DefaultComboBoxModel listarClienteComboConCuenta(DefaultComboBoxModel modelo) {
            for(Cuentas c: GestCuentas.getInstance().devolverTodasCuentas()){
                modelo.addElement(c.getObjCliente());
            }
            return modelo;
    }

    public static void limpiarCombo(DefaultComboBoxModel modelo) {
            modelo.removeAllElements();
    }

    public static DefaultTableModel listarArticulosAyuda(DefaultTableModel modelo) {
                for (Articulos objA : GestArticulos.getInstance().devolverArticulos()) {
            Object[] objPag = {objA.getaCodigo(),objA.getaDescripcion()};
            modelo.addRow(objPag);
        }
        return modelo;
    }

    public static DefaultTableModel listarFactEntreFechas(DefaultTableModel modelo, Date date, Date date0) {
          modelo.setRowCount(0);
        for (Facturas objF : GestFacturas.getInstance().devolverFacturas()) {
            Date fechafact = convertirStringDate(objF.getfFecha());
            if ((date.compareTo(fechafact) < 0 || date.compareTo(fechafact) == 0) && (date0.compareTo(fechafact) > 0 || date0.compareTo(fechafact) == 0)) {

                   Object[] objPag = {objF.getfNumero(),objF.getfFecha(),objF.getfSubTotal(),objF.getfIva(),objF.getfTotal(),objF.getObjCuenta().getObjCliente().getcNombre()};
                    modelo.addRow(objPag);
                
            }

        }
        return modelo;
    }
    
    public static double listarFactEntreFechasTotal( Date date, Date date0) {
         double total = 0;
        for (Facturas objF : GestFacturas.getInstance().devolverFacturas()) {
            Date fechafact = convertirStringDate(objF.getfFecha());
            if ((date.compareTo(fechafact) < 0 || date.compareTo(fechafact) == 0) && (date0.compareTo(fechafact) > 0 || date0.compareTo(fechafact) == 0)) {

                   total = total + objF.getfTotal();
                
            }

        }
        return total;
    }


}
