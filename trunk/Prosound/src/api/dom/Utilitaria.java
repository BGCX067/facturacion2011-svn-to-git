/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.dom;

import api.gest.GestArticulos;
import api.gest.GestCliente;
import api.gest.GestFactura;
import api.gest.GestGastos;
import api.gest.GestLineas;
import api.gest.GestPago;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MAT
 */
public class Utilitaria {

    public static void cerrarVentanas(JDesktopPane conenedor) {
        for (JInternalFrame x : conenedor.getAllFrames()) {
            x.dispose();
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

    public static DefaultTableModel listarArticulos(DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (Articulos objA : GestArticulos.getInstance().devolverArticulo()) {
            Object[] objOp = {objA.getArtCod(), objA.getArtNom(), objA.getArtDesc(), objA.getArtPrecio(), objA.getArtStock()};
            modelo.addRow(objOp);
        }
        return modelo;
    }

    public static DefaultTableModel listarClientes(DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (Cliente objC : GestCliente.getInstance().devolverCliente()) {
            Object[] objOp = {objC.getCliCod(), objC.getCliNom(), objC.getCliFing(), objC.getCliRut(), objC.getCliTel(), objC.getCliDire()};
            modelo.addRow(objOp);
        }
        return modelo;
    }

    public static DefaultTableModel listarFacturas(DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (Factura objF : GestFactura.getInstance().devolverFacturas()) {
            Object[] objOp = {objF.getfCod(), objF.getfFecha(), objF.getObjCli().getCliNom(), objF.getfObservaciones(), objF.getfSubTotal(), (objF.getfTotal() - objF.getfSubTotal()), objF.getfTotal()};
            modelo.addRow(objOp);
        }
        return modelo;
    }

    public static DefaultTableModel listarGastos(DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (Gasto objG : GestGastos.getInstance().devolverGastos()) {
            Object[] objart = {objG.getgNumero(), objG.getgFecha(), objG.getgDesc(), objG.getgImporte(), objG.getgObservaciones()};
            modelo.addRow(objart);
        }
        return modelo;
    }

    public static DefaultTableModel listarPagos(DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (Pago objP : GestPago.getInstance().devolverPagos()) {
            Object[] objart = {objP.getpNumeroPago(), objP.getpFechaPago(), objP.getpObjFactura().getfCod(), objP.getpImportePago(),objP.getpObjFactura().getfSaldo()};
            modelo.addRow(objart);
        }
        return modelo;
    }

    public static DefaultComboBoxModel listarClientesCombo(DefaultComboBoxModel modelo) {
        for (Cliente objcli : GestCliente.getInstance().devolverCliente()) {
            modelo.addElement(objcli);
        }
        return modelo;
    }

    //gastos entre dos fechas
    public static DefaultTableModel listaGastosEntre2Fechas(DefaultTableModel modelo, Date desde, Date hasta) {
        modelo.setRowCount(0);
        for (Gasto objG : GestGastos.getInstance().devolverGastos()) {
            Date fechaG = convertirStringDate(objG.getgFecha());
            if ((desde.compareTo(fechaG) < 0 || desde.compareTo(fechaG) == 0) && (hasta.compareTo(fechaG) > 0 || hasta.compareTo(fechaG) == 0)) {
                Object[] objg = {objG.getgNumero(), objG.getgFecha(), objG.getgDesc(), objG.getgImporte(), objG.getgObservaciones()};
                modelo.addRow(objg);
            }

        }
        return modelo;
    }

    //facturas entre dos fechas y facturado entre esas fechas
    public static DefaultTableModel listaFactEntreFechas(DefaultTableModel modelo, Date desde, Date hasta) {
        modelo.setRowCount(0);
        for (Factura objF : GestFactura.getInstance().devolverFacturas()) {
            Date fechaF = convertirStringDate(objF.getfFecha());
            if ((desde.compareTo(fechaF) < 0 || desde.compareTo(fechaF) == 0) && (hasta.compareTo(fechaF) > 0 || hasta.compareTo(fechaF) == 0)) {
                Object[] objg = {objF.getfTipo(), objF.getfCod(), objF.getfFecha(), objF.getObjCli().getCliNom(), objF.getfObservaciones(), objF.getfTotal(), objF.getfSaldo()};
                modelo.addRow(objg);

            }

        }
        return modelo;
    }

    public static double totalFactEntreFechas(Date desde, Date hasta) {
        double total = 0;
        for (Factura objF : GestFactura.getInstance().devolverFacturas()) {
            Date fechaF = convertirStringDate(objF.getfFecha());
            if ((desde.compareTo(fechaF) < 0 || desde.compareTo(fechaF) == 0) && (hasta.compareTo(fechaF) > 0 || hasta.compareTo(fechaF) == 0)) {
                total = total + objF.getfTotal();
            }

        }
        return total;
    }

    //Metodos para estado de cuenta
    public static DefaultTableModel EstadoCuentaFacturado(DefaultTableModel modelo, Cliente objc, Date fechaini, Date fechafin) {
        modelo.setRowCount(0);
        for (Factura objF : GestFactura.getInstance().devolverFacturas()) {
            if (objF.getObjCli().getCliCod() == objc.getCliCod()) {
                Date fechafact = convertirStringDate(objF.getfFecha());
                if ((fechaini.compareTo(fechafact) < 0 || fechaini.compareTo(fechafact) == 0) && (fechafin.compareTo(fechafact) > 0 || fechafin.compareTo(fechafact) == 0)) {
                    Object[] objx = {objF.getfCod(), objF.getfFecha(), objF.getfTipo(), objF.getfSubTotal(), (objF.getfTotal() - objF.getfSubTotal()), objF.getfTotal()};
                    modelo.addRow(objx);
                }

            }
        }
        return modelo;
    }

    public static double EstadoCuentaTotalFacturado(Cliente objc, Date fechaini, Date fechafin) {
        double aux = 0;
        for (Factura objF : GestFactura.getInstance().devolverFacturas()) {
            if (objF.getObjCli().getCliCod() == objc.getCliCod()) {
                Date fechafact = convertirStringDate(objF.getfFecha());
                if ((fechaini.compareTo(fechafact) < 0 || fechaini.compareTo(fechafact) == 0) && (fechafin.compareTo(fechafact) > 0 || fechafin.compareTo(fechafact) == 0)) {
                    aux = aux + objF.getfTotal();
                }
            }
        }
        return aux;
    }

    public static DefaultTableModel EstadoCuentaPagado(DefaultTableModel modelo, Cliente objc, Date fechaini, Date fechafin) {
        modelo.setRowCount(0);
        for (Pago objP : GestPago.getInstance().devolverPagos()) {
            if (objP.getpObjFactura().getObjCli().getCliCod() == objc.getCliCod()) {
                Date fechafact = convertirStringDate(objP.getpFechaPago());
                if ((fechaini.compareTo(fechafact) < 0 || fechaini.compareTo(fechafact) == 0) && (fechafin.compareTo(fechafact) > 0 || fechafin.compareTo(fechafact) == 0)) {
                    Object[] objx = {objP.getpNumeroPago(), objP.getpFechaPago(), objP.getpObjFactura().getfCod(), objP.getpImportePago(), objP.getpObjFactura().getfSaldo()};
                    modelo.addRow(objx);
                }

            }
        }
        return modelo;
    }

    public static double EstadoCuentaTotalPagado(Cliente objc, Date fechaini, Date fechafin) {
        double aux = 0;
        for (Pago objP : GestPago.getInstance().devolverPagos()) {
            if (objP.getpObjFactura().getObjCli().getCliCod() == objc.getCliCod()) {
                Date fechapag = convertirStringDate(objP.getpFechaPago());
                if ((fechaini.compareTo(fechapag) < 0 || fechaini.compareTo(fechapag) == 0) && (fechafin.compareTo(fechapag) > 0 || fechafin.compareTo(fechapag) == 0)) {
                    aux = aux + objP.getpImportePago();
                }
            }
        }
        return aux;
    }

    //Facturas debiendo pòr cliente
    public static DefaultTableModel facturasporclientedebiendo(DefaultTableModel modelo, int objC) {
        modelo.setRowCount(0);
        for (Factura objF : GestFactura.getInstance().devolverFacturas()) {
            if (objF.getObjCli().getCliCod() == objC && objF.getfSaldo() > 0) {
                Object[] objfac = {objF.getfCod(), objF.getfFecha(), objF.getfObservaciones(), objF.getfTotal(), objF.getfSaldo()};
                modelo.addRow(objfac);
            }
        }
        return modelo;
    }

    public static DefaultTableModel DetalleDeDebe(DefaultTableModel modelo, Factura x) {
        for (Lineas L : GestLineas.getInstance().devolverLineas()) {
            if (x.getfCod() == L.getFactNro().getfCod()) {

                Object[] objx = {GestArticulos.getInstance().devolverartpornumero(L.getLinArt()).getArtNom(), L.getLinCant(), GestArticulos.getInstance().devolverartpornumero(L.getLinArt()).getArtDesc()};
                modelo.addRow(objx);
            }
        }
        return modelo;
    }

    public static DefaultTableModel listarPagosentreFechas(DefaultTableModel modelo, Date desde, Date hasta) {
        modelo.setRowCount(0);
        for (Pago objP : GestPago.getInstance().devolverPagos()) {
            Date fechaP = convertirStringDate(objP.getpFechaPago());
            if ((desde.compareTo(fechaP) < 0 || desde.compareTo(fechaP) == 0) && (hasta.compareTo(fechaP) > 0 || hasta.compareTo(fechaP) == 0)) {
                Object[] objPa = {objP.getpNumeroPago(), objP.getpFechaPago(), objP.getpObjFactura().getfCod(), objP.getpImportePago(), objP.getpObjFactura().getfSaldo()};
                modelo.addRow(objPa);
            }
        }
        return modelo;
    }

    public static DefaultTableModel consulta1(DefaultTableModel modelo, Date desde, Date hasta, String tipo) {
        modelo.setRowCount(0);
        for (Factura objFac : GestFactura.getInstance().devolverFacturas()) {
            if (objFac.getfTipo().equals(tipo)) {
                Date fechaF = convertirStringDate(objFac.getfFecha());
                if ((desde.compareTo(fechaF) < 0 || desde.compareTo(fechaF) == 0) && (hasta.compareTo(fechaF) > 0 || hasta.compareTo(fechaF) == 0)) {
                    Object[] objPa = {objFac.getfCod(), objFac.getfFecha(), objFac.getfObservaciones(), objFac.getfTipo(), objFac.getfSubTotal(), objFac.getfTotal()};
                    modelo.addRow(objPa);
                }
            }
        }
        return modelo;
    }
    
   public static double consulta1gastos(Date desde, Date hasta, String tipo) {
        double totalgastosportipo = 0;
        for (Gasto objG : GestGastos.getInstance().devolverGastos()) {
            if (objG.getgDesc().equals(tipo)) {
                Date fechaF = convertirStringDate(objG.getgFecha());
                if ((desde.compareTo(fechaF) < 0 || desde.compareTo(fechaF) == 0) && (hasta.compareTo(fechaF) > 0 || hasta.compareTo(fechaF) == 0)) {
                    totalgastosportipo = totalgastosportipo+ objG.getgImporte();
                }
            }
        }
        return totalgastosportipo;
    }   
    
}
