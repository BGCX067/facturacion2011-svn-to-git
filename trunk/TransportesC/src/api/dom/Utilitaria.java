/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.dom;

import api.gest.GestCambio;
import api.gest.GestCamiones;
import api.gest.GestCliente;
import api.gest.GestEmpleado;
import api.gest.GestFactura;
import api.gest.GestGastos;
import api.gest.GestPago;
import api.gest.GestSueldo;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javs
 */
public class Utilitaria {

    public static void cerrarVentanas(JDesktopPane conenedor) {

        for (JInternalFrame x : conenedor.getAllFrames()) {
            x.dispose();
        }
    }

    public static void listarCamionesJComboBox(JComboBox j) {
        ArrayList<Gasto> arr = GestGastos.getInstance().devolverGastos();
        for (Gasto g : arr) {
            j.addItem(arr);
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
    //LIMPIAR JTABLE

    public static DefaultTableModel limpiarJtables(DefaultTableModel modelo) {
        for (int i = 0; i < modelo.getRowCount();) {
            modelo.removeRow(i);
        }
        return modelo;
    }

    //LISTAR JTABLE
    public static DefaultTableModel listarEmpleados(DefaultTableModel modelo) {
        for (Empleado obje : GestEmpleado.getInstance().devolverEmpleado()) {
            Object[] objOp = {obje.getpNumero(), obje.getpNombre(), obje.getpDireccion(), obje.getpTelefono(), obje.geteCedulaIdentidad(), obje.geteFechaIngreso(), obje.geteCargo()};
            modelo.addRow(objOp);
        }
        return modelo;
    }

    public static DefaultTableModel listarCamiones(DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (Camion objC : GestCamiones.getInstance().devolverCamiones()) {
            Object[] objCa = {objC.getcMatricula(), objC.getcMarca(), objC.getcColor(), objC.getcEjes(), objC.getcMetros()};
            modelo.addRow(objCa);
        }
        return modelo;
    }

    public static DefaultTableModel listarClientes(DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (Cliente objC : GestCliente.getInstance().devolverCliente()) {
            Object[] objCli = {objC.getpNumero(), objC.getpNombre(), objC.getpDireccion(), objC.getpTelefono(), objC.getcDicose(), objC.getcRut()};
            modelo.addRow(objCli);
        }
        return modelo;
    }

    public static DefaultTableModel listarFacturas(DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (Factura objF : GestFactura.getInstance().devolverFacturas()) {
            Object[] objFa = {objF.getfNumero(), objF.getfFecha(), objF.getObjCamion().getcMatricula(), objF.getObjCliente().getpNombre(), objF.getObjEmpleado().getpNombre()};
            modelo.addRow(objFa);
        }
        return modelo;
    }

    public static DefaultTableModel listarGastos(DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (Gasto objG : GestGastos.getInstance().devolverGastos()) {
            if (objG.getgRubro().equals("GasOil")) {
                Object[] objGa = {objG.getgNumero(), objG.getgFecha(), objG.getObjCamion().getcMatricula(), objG.getgRubro(), objG.getgImporte(), "Litros: " + objG.getgLitros()};
                modelo.addRow(objGa);
            } else {
                Object[] objGa = {objG.getgNumero(), objG.getgFecha(), objG.getObjCamion().getcMatricula(), objG.getgRubro(), objG.getgImporte(), "Ninguna"};
                modelo.addRow(objGa);
            }

        }
        return modelo;
    }

    public static DefaultTableModel listarSueldos(DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (Sueldo objS : GestSueldo.getInstance().devolverSueldo()) {
            Object[] objSA = {objS.getSueldoNumero(), objS.getObjE().getpNombre(), objS.getFechaPago(), objS.getFacturado(), objS.getSueldo()};
            modelo.addRow(objSA);
        }
        return modelo;
    }

    public static DefaultTableModel listarPagos(DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (Pago objP : GestPago.getInstance().devolverPagos()) {
            Object[] objPa = {objP.getpNumeroPago(), objP.getpFechaPago(), objP.getpObjFactura().getfNumero(), objP.getpImportePago(), objP.getpObjFactura().getfSaldo()};
            modelo.addRow(objPa);
        }
        return modelo;
    }

    public static DefaultComboBoxModel listarCamionesCombo(DefaultComboBoxModel modelo) {
        for (Camion objcam : GestCamiones.getInstance().devolverCamiones()) {
            modelo.addElement(objcam);
        }
        return modelo;
    }

    public static DefaultComboBoxModel listarEmpleadosCombo(DefaultComboBoxModel modelo) {
        for (Empleado objemp : GestEmpleado.getInstance().devolverEmpleado()) {
            modelo.addElement(objemp);
        }
        return modelo;
    }

    public static DefaultComboBoxModel listarClientesCombo(DefaultComboBoxModel modelo) {
        for (Cliente objcli : GestCliente.getInstance().devolverCliente()) {
            modelo.addElement(objcli);
        }
        return modelo;
    }

    /*public static DefaultTableModel listarDetalladoLosGastos() {
    DefaultTableModel x = new DefaultTableModel();
    
    x.addColumn("Nro");
    x.addColumn("Fecha");
    x.addColumn("Gasoil");
    x.addColumn("Lubricante");
    x.addColumn("Cubiertas");
    x.addColumn("Taller");
    x.addColumn("Impuestos");
    x.addColumn("Amortizacion");
    x.addColumn("Varios");
    x.addColumn("Seguro");
    x.addColumn("Sueldos");
    x.addColumn("Camion");
    for (Gasto objG : GestGastos.getInstance().devolverGastos()) {
    Object[] objg = {objG.getgNumero(), objG.getgFecha(), objG.getgGasoil(), objG.getgLubricante(), objG.getgCubierta(),
    objG.getgTaller(), "SOLUCIONAR EL IMPUESTO", objG.getgAmortizacion(), objG.getgVarios(), objG.getgSeguro(), objG.getgSueldo(), objG.getObjCamion().getcMatricula()};
    x.addRow(objg);
    }
    return (DefaultTableModel) x;
    }*/
    public static DefaultTableModel listarDetalladaLaFactura1(DefaultTableModel x) {
        x.setRowCount(0);
        for (Factura objFac : GestFactura.getInstance().devolverFacturas()) {
            Object[] objf = {objFac.getfNumero(), objFac.getfFecha(), objFac.getfMoneda(), objFac.getFtipoCambio(), objFac.getfLugarCarga(), objFac.getfLugarDescarga(), objFac.getfKilometros(), objFac.getfKilometrosRetorno(), objFac.getfGrupoMetros(), objFac.getfCantBultos(),
                objFac.getfCantAnimales(), objFac.getfGuia(), objFac.getfImporte(), objFac.getObjCliente().getpNombre(), objFac.getObjEmpleado().getpNombre(),
                objFac.getObjCamion().getcMatricula(), objFac.getfObservaciones(), objFac.getfSaldo()};
            x.addRow(objf);
        }
        return (DefaultTableModel) x;

    }

    public static DefaultTableModel listarDetalladaLaFactura() {
        DefaultTableModel x = new DefaultTableModel();




        x.addColumn("Nro");

        x.addColumn("Fecha");
        x.addColumn("Moneda");
        x.addColumn("Tipo Cambio");
        x.addColumn("Lugar Carga");
        x.addColumn("Lugar Descarga");
        x.addColumn("Km's");
        x.addColumn("Km Retorno");
        x.addColumn("Grupos Metros");
        x.addColumn("Cant Bultos");
        x.addColumn("Cant Animales");
        x.addColumn("Guia");
        x.addColumn("Importe");
        x.addColumn("Cliente");
        x.addColumn("Empleado");
        x.addColumn("Camion");
        x.addColumn("Observaciones");



        for (Factura objFac : GestFactura.getInstance().devolverFacturas()) {
            if (objFac.getfImporte() < Utilitaria.totalDeDiferencia(objFac.getfNumero())) {
                Object[] objf = {objFac.getfNumero(), objFac.getfFecha(), objFac.getfMoneda(), objFac.getFtipoCambio(), objFac.getfLugarCarga(), objFac.getfLugarDescarga(), objFac.getfKilometros(), objFac.getfKilometrosRetorno(), objFac.getfGrupoMetros(), objFac.getfCantBultos(),
                    objFac.getfCantAnimales(), objFac.getfGuia(), objFac.getfImporte(), objFac.getObjCliente().getpNombre(), objFac.getObjEmpleado().getpNombre(),
                    objFac.getObjCamion().getcMatricula(), objFac.getfObservaciones()};
                x.addRow(objf);

            }

        }

        return (DefaultTableModel) x;

    }

    public static DefaultTableModel listarDetalladaLaFacturaDebiendo() {
        DefaultTableModel x = new DefaultTableModel();

        x.addColumn("Nro");
        x.addColumn("Fecha");
        x.addColumn("Moneda");
        x.addColumn("Tipo Cambio");
        x.addColumn("Lugar Carga");
        x.addColumn("Lugar Descarga");
        x.addColumn("Km's");
        x.addColumn("Km Retorno");
        x.addColumn("Grupos Metros");
        x.addColumn("Cant Bultos");
        x.addColumn("Cant Animales");
        x.addColumn("Guia");
        x.addColumn("Importe");
        x.addColumn("Cliente");
        x.addColumn("Empleado");
        x.addColumn("Camion");
        x.addColumn("Observaciones");
        for (Factura objFac : GestFactura.getInstance().devolverFacturas()) {
            if (objFac.getfSaldo() == 0) {
            } else {
                Object[] objf = {objFac.getfNumero(), objFac.getfFecha(), objFac.getfMoneda(), objFac.getFtipoCambio(), objFac.getfLugarCarga(), objFac.getfLugarDescarga(), objFac.getfKilometros(), objFac.getfKilometrosRetorno(), objFac.getfGrupoMetros(), objFac.getfCantBultos(),
                    objFac.getfCantAnimales(), objFac.getfGuia(), objFac.getfImporte(), objFac.getObjCliente().getpNombre(), objFac.getObjEmpleado().getpNombre(),
                    objFac.getObjCamion().getcMatricula(), objFac.getfObservaciones()};
                x.addRow(objf);

            }

        }

        return (DefaultTableModel) x;

    }

    public static DefaultTableModel listaGastosEntre2Fechas(DefaultTableModel modelo, Date desde, Date hasta, Camion cam) {
        for (Gasto objG : GestGastos.getInstance().devolverGastos()) {
            Date fechaG = convertirStringDate(objG.getgFecha());
            if ((desde.compareTo(fechaG) < 0 || desde.compareTo(fechaG) == 0) && (hasta.compareTo(fechaG) > 0 || hasta.compareTo(fechaG) == 0)) {
                if (cam.getcMatricula().equalsIgnoreCase(objG.getObjCamion().getcMatricula())) {
                    Object[] objg = {objG.getgNumero(), objG.getgFecha(), objG.getgRubro(), objG.getgImporte(), objG.getObjCamion().getcMatricula()};
                    modelo.addRow(objg);
                }
            }

        }

        return modelo;
    }

    public static double listaGastosEntre2FechasTotal(Date desde, Date hasta, Camion cam) {
        double total2 = 0;
        for (Gasto objG : GestGastos.getInstance().devolverGastos()) {
            Date fechaG = convertirStringDate(objG.getgFecha());
            if ((desde.compareTo(fechaG) < 0 || desde.compareTo(fechaG) == 0) && (hasta.compareTo(fechaG) > 0 || hasta.compareTo(fechaG) == 0)) {
                if (cam.getcMatricula().equalsIgnoreCase(objG.getObjCamion().getcMatricula())) {
                    total2 += objG.getgImporte();
                }
            }

        }

        return total2;
    }

    public static double totalGastoCamion(Camion cam) {
        double total = 0;
        for (Gasto g : GestGastos.getInstance().devolverGastos()) {
            if (g.getObjCamion() == cam) {
                total += g.getgImporte();

            }
        }
        return total;
    }

    public static DefaultTableModel deudoresEntre2Fechas(DefaultTableModel modelo, Date fechaini, Date fechafin) {
        modelo.setRowCount(0);
        double subtotal = 0;
        double total = 0;
        for (Cliente objcli : ClientesDeudoresArray(fechaini, fechafin)) {
            for (Factura objf : GestFactura.getInstance().devolverFacturas()) {
                Date fechafact = convertirStringDate(objf.getfFecha());
                if (objcli.getpNumero() == objf.getObjCliente().getpNumero()) {
                    if ((fechaini.compareTo(fechafact) < 0 || fechaini.compareTo(fechafact) == 0) && (fechafin.compareTo(fechafact) > 0 || fechafin.compareTo(fechafact) == 0)) {
                        if (objf.getfSaldo() == 0) {
                        } else {
                            Object[] objg = {objf.getfNumero(), objf.getfFecha(), objf.getObjCliente().getpNombre(), "$  " + objf.getfSaldo()};
                            subtotal += objf.getfSaldo();
                            total += objf.getfSaldo();
                            modelo.addRow(objg);
                        }
                    }
                }
            }
            Object[] linea = {"----------", "------------------------", "----------------------------------------------------------->SUB-TOTAL", "$  " + subtotal};
            modelo.addRow(linea);
            subtotal = 0;
        }
        Object[] linea3 = {"", "", "", "" };
        Object[] linea2 = {"----------", "------------------------", "------------------------------------------------------->TOTAL-TOTAL", "$  " + total};
        modelo.addRow(linea3);
        modelo.addRow(linea2);
        return modelo;
    }

    /*public static Cliente devolverClienteOrdenados(){
    for (Cliente objC : GestCliente.getInstance().devolverCliente()) {
    for (Factura objf : GestFactura.getInstance().devolverFacturas()) {
    if (objC.getpNumero() == objf.getObjCliente().getpNumero()) {
    return objC;
    }
    }
    
    }
    }*/
    /*
    public static DefaultTableModel deudoresEntre2Fechas(DefaultTableModel modelo, Date fechaini, Date fechafin) {
    modelo.setRowCount(0);
    for (Factura objf : GestFactura.getInstance().devolverFacturas()) {
    Date fechafact = convertirStringDate(objf.getfFecha());
    if ((fechaini.compareTo(fechafact) < 0 || fechaini.compareTo(fechafact) == 0) && (fechafin.compareTo(fechafact) > 0 || fechafin.compareTo(fechafact) == 0)) {
    if (objf.getfSaldo() == 0) {
    } else {
    Object[] objg = {objf.getfNumero(), objf.getfFecha(), objf.getObjCliente().getpNombre(), "$  " + objf.getfSaldo()};
    modelo.addRow(objg);
    }
    }
    
    }
    return modelo;
    }
     */
    public static double deudoresEntre2Fechastotal(Date fechaini, Date fechafin) {
        double total = 0;
        for (Factura objf : GestFactura.getInstance().devolverFacturas()) {
            Date fechafact = convertirStringDate(objf.getfFecha());
            if ((fechaini.compareTo(fechafact) < 0 || fechaini.compareTo(fechafact) == 0) && (fechafin.compareTo(fechafact) > 0 || fechafin.compareTo(fechafact) == 0)) {
                total = total + objf.getfSaldo();
            }
        }
        return total;
    }

    public static ArrayList<Cliente> ClientesDeudoresArray(Date fechaini, Date fechafin) {
        ArrayList<Cliente> arraycli = new ArrayList<Cliente>();
        for (Cliente objC : GestCliente.getInstance().devolverCliente()) {
            for (Factura objf : GestFactura.getInstance().devolverFacturas()) {
                if (objC.getpNumero() == objf.getObjCliente().getpNumero()) {
                    Date fechafact = convertirStringDate(objf.getfFecha());
                    if ((fechaini.compareTo(fechafact) < 0 || fechaini.compareTo(fechafact) == 0) && (fechafin.compareTo(fechafact) > 0 || fechafin.compareTo(fechafact) == 0)) {
                        if (objf.getfSaldo() == 0) {
                        } else {
                            arraycli.add(objC);
                            break;
                        }
                    }
                }
            }
        }


        return arraycli;
    }

    public static DefaultComboBoxModel listarClientesDeudoresCombo(DefaultComboBoxModel modelo, Date fechaini, Date fechafin) {
        modelo.removeAllElements();
        for (Cliente objC : GestCliente.getInstance().devolverCliente()) {
            for (Factura objf : GestFactura.getInstance().devolverFacturas()) {
                if (objC.getpNumero() == objf.getObjCliente().getpNumero()) {
                    Date fechafact = convertirStringDate(objf.getfFecha());
                    if ((fechaini.compareTo(fechafact) < 0 || fechaini.compareTo(fechafact) == 0) && (fechafin.compareTo(fechafact) > 0 || fechafin.compareTo(fechafact) == 0)) {
                        if (objf.getfSaldo() == 0) {
                        } else {
                            modelo.addElement(objC);
                            break;
                        }
                    }
                }
            }
        }


        return modelo;
    }

    public static DefaultTableModel deudoresEntre2Fechascliente(DefaultTableModel modelo, Date fechaini, Date fechafin, Cliente objC) {
        for (Factura objf : GestFactura.getInstance().devolverFacturas()) {
            if (objC.getpNumero() == objf.getObjCliente().getpNumero()) {
                Date fechafact = convertirStringDate(objf.getfFecha());
                if ((fechaini.compareTo(fechafact) < 0 || fechaini.compareTo(fechafact) == 0) && (fechafin.compareTo(fechafact) > 0 || fechafin.compareTo(fechafact) == 0)) {
                    if (objf.getfSaldo() == 0) {
                    } else {
                        Object[] objg = {objf.getfNumero(), objf.getfFecha(), objf.getObjCliente().getpNombre(), "$  " + objf.getfSaldo()};
                        modelo.addRow(objg);
                    }
                }
            }
        }
        return modelo;
    }

    public static double deudoresEntre2Fechastotalcliente(Date fechaini, Date fechafin, Cliente objC) {
        double total = 0;
        for (Factura objf : GestFactura.getInstance().devolverFacturas()) {
            if (objC.getpNumero() == objf.getObjCliente().getpNumero()) {
                Date fechafact = convertirStringDate(objf.getfFecha());
                if ((fechaini.compareTo(fechafact) < 0 || fechaini.compareTo(fechafact) == 0) && (fechafin.compareTo(fechafact) > 0 || fechafin.compareTo(fechafact) == 0)) {
                    total = total + objf.getfSaldo();
                }
            }
        }
        return total;
    }

    public static double debeEnFactura(Factura x) {
        double deve = 0;
        if ("Dolares".equals(x.getfMoneda())) {
            deve = x.getfImporte() * x.getFtipoCambio();
        } else {
            deve = x.getfImporte();
        }

        double pagadaHastaMomento = 0;
        for (Pago p : GestPago.getInstance().devolverPagos()) {
            if (p.getpObjFactura().getfNumero() == x.getfNumero()) {
                pagadaHastaMomento += p.getpImportePago();

            }
        }
        return deve - pagadaHastaMomento;

    }

    public static DefaultTableModel kmlitro(DefaultTableModel modelo, Date fechainicial, Date fechafinal, Camion objc) {
        double totalgastado = 0;
        double totalrecorrido = 0;
        double totalgasoil = 0;
        double totalfacturado = 0;
        Object[] o = {};
        for (Gasto objg : GestGastos.getInstance().devolverGastos()) {
            Date fechaG = convertirStringDate(objg.getgFecha());
            if (objg.getObjCamion().getcMatricula().equals(objc.getcMatricula()) && ((fechainicial.compareTo(fechaG) < 0 || fechainicial.compareTo(fechaG) == 0) && (fechafinal.compareTo(fechaG) > 0 || fechafinal.compareTo(fechaG) == 0))) {
                if (objg.getgRubro().equals("GasOil")) {
                    totalgasoil = totalgasoil + objg.getgLitros();
                }
                totalgastado = totalgastado + objg.getgImporte();

            }
        }
        for (Factura objf : GestFactura.getInstance().devolverFacturas()) {
            Date fechaF = convertirStringDate(objf.getfFecha());
            if (objf.getObjCamion().getcMatricula().equals(objc.getcMatricula()) && ((fechainicial.compareTo(fechaF) < 0 || fechainicial.compareTo(fechaF) == 0) && (fechafinal.compareTo(fechaF) > 0 || fechafinal.compareTo(fechaF) == 0))) {
                totalrecorrido = totalrecorrido + (objf.getfKilometros() * 2);
                if ("Dolares".equals(objf.getfMoneda())) {
                    totalfacturado = totalfacturado + (objf.getfImporte() * objf.getFtipoCambio());
                } else {
                    totalfacturado = totalfacturado + (objf.getfImporte());
                }
            }
        }
        NumberFormat NF = NumberFormat.getInstance();
        NF.setMaximumFractionDigits(2); //2 decimales        
        Object[] objg = {NF.format(totalrecorrido), NF.format(totalgasoil), NF.format(totalrecorrido / totalgasoil), NF.format(totalfacturado), NF.format(totalgastado), NF.format(totalfacturado / totalgastado)};
        modelo.addRow(objg);
        return modelo;
    }

    public static DefaultTableModel EstadoCuentaFacturado(DefaultTableModel modelo, Cliente objc, Date fechaini, Date fechafin) {
        modelo.setRowCount(0);
        for (Factura objF : GestFactura.getInstance().devolverFacturas()) {
            if (objF.getObjCliente().getpNumero() == objc.getpNumero()) {
                Date fechafact = convertirStringDate(objF.getfFecha());
                if ((fechaini.compareTo(fechafact) < 0 || fechaini.compareTo(fechafact) == 0) && (fechafin.compareTo(fechafact) > 0 || fechafin.compareTo(fechafact) == 0)) {
                    if (objF.getfMoneda().equals("Dolares")) {
                        Object[] objx = {objF.getfNumero(), objF.getfFecha(), objF.getfLugarCarga(), objF.getfLugarDescarga(), "U$S  " + objF.getfImporte()};
                        modelo.addRow(objx);
                    } else {
                        Object[] objx = {objF.getfNumero(), objF.getfFecha(), objF.getfLugarCarga(), objF.getfLugarDescarga(), "$  " + objF.getfImporte()};
                        modelo.addRow(objx);
                    }
                }
            }
        }
        return modelo;
    }

    public static int EstadoCuentaTotalFacturado(Cliente objc, Date fechaini, Date fechafin) {
        int aux = 0;
        for (Factura objF : GestFactura.getInstance().devolverFacturas()) {
            if (objF.getObjCliente().getpNumero() == objc.getpNumero()) {
                Date fechafact = convertirStringDate(objF.getfFecha());
                if ((fechaini.compareTo(fechafact) < 0 || fechaini.compareTo(fechafact) == 0) && (fechafin.compareTo(fechafact) > 0 || fechafin.compareTo(fechafact) == 0)) {
                    if (objF.getfMoneda().equals("Dolares")) {
                        aux = (int) (aux + (objF.getfImporte() * objF.getFtipoCambio()));
                    } else {
                        aux = aux + objF.getfImporte();
                    }
                }
            }
        }
        return aux;
    }

    public static DefaultTableModel EstadoCuentaPagado(DefaultTableModel modelo, Cliente objc, Date fechaini, Date fechafin) {
        modelo.setRowCount(0);
        for (Pago objP : GestPago.getInstance().devolverPagos()) {
            if (objP.getpObjFactura().getObjCliente().getpNumero() == objc.getpNumero()) {
                Date fechafact = convertirStringDate(objP.getpFechaPago());
                if ((fechaini.compareTo(fechafact) < 0 || fechaini.compareTo(fechafact) == 0) && (fechafin.compareTo(fechafact) > 0 || fechafin.compareTo(fechafact) == 0)) {
                    Object[] objx = {objP.getpNumeroPago(), objP.getpFechaPago(), objP.getpObjFactura().getfNumero(), objP.getpImportePago(), objP.getpObjFactura().getfSaldo()};
                    modelo.addRow(objx);
                }

            }
        }
        return modelo;
    }

    public static double EstadoCuentaTotalPagado(Cliente objc, Date fechaini, Date fechafin) {
        double aux = 0;
        for (Pago objP : GestPago.getInstance().devolverPagos()) {
            if (objP.getpObjFactura().getObjCliente().getpNumero() == objc.getpNumero()) {
                Date fechapag = convertirStringDate(objP.getpFechaPago());
                if ((fechaini.compareTo(fechapag) < 0 || fechaini.compareTo(fechapag) == 0) && (fechafin.compareTo(fechapag) > 0 || fechafin.compareTo(fechapag) == 0)) {
                    aux = aux + objP.getpImportePago();
                }
            }
        }
        return aux;
    }

    public static double devolverDiferenciaPago(int x, double y) {
        Factura x1 = (Factura) GestFactura.getInstance().devolverFactura(x);
        double totalPagos = 0;
        double v = 0;
        double totalFactura = x1.getfImporte() * x1.getFtipoCambio();
        double diferenciaEnFactura = 0;
        for (Pago p : GestPago.getInstance().devolverPagos()) {
            if (x1.getfNumero() == p.getpObjFactura().getfNumero()) {
                totalPagos += p.getpImportePago();
            }
        }
        totalPagos += y;
        diferenciaEnFactura = totalFactura - totalPagos;
        if (diferenciaEnFactura < 0) {
            return diferenciaEnFactura;
        } else {
            return diferenciaEnFactura;
        }

    }

    public static double totalDeDiferencia(int x) {
        Factura x1 = (Factura) GestFactura.getInstance().devolverFactura(x);
        double totalPagos = 0;
        double v = 0;
        double totalFactura = x1.getfImporte() * x1.getFtipoCambio();
        double diferenciaEnFactura = 0;
        for (Pago p : GestPago.getInstance().devolverPagos()) {
            if (x1.getfNumero() == p.getpObjFactura().getfNumero()) {
                totalPagos += p.getpImportePago();
            }
        }
        diferenciaEnFactura = totalFactura - totalPagos;
        return diferenciaEnFactura;
    }

    public static DefaultTableModel DetalleDeDebe(DefaultTableModel modelo, Factura x) {
        for (Pago p : GestPago.getInstance().devolverPagos()) {
            if (p.getpObjFactura().getfNumero() == x.getfNumero()) {
                Object[] objx = {p.getpFechaPago(), p.getpImportePago()};
                modelo.addRow(objx);
            }
        }
        return modelo;
    }

    public static DefaultTableModel listarFactEntreFechas(DefaultTableModel modelo, Date desde, Date hasta) {
        modelo.setColumnCount(0);
        modelo.setRowCount(0);

        modelo.addColumn("Nro");
        modelo.addColumn("Fecha");
        modelo.addColumn("Moneda");
        modelo.addColumn("Importe");
        modelo.addColumn("Lugar Carga");
        modelo.addColumn("Lugar Descarga");
        modelo.addColumn("Km's");
        modelo.addColumn("Km Retorno");
        modelo.addColumn("Metros");
        modelo.addColumn("Cant Animales");
        modelo.addColumn("Guia");
        modelo.addColumn("Cliente");
        modelo.addColumn("Empleado");
        modelo.addColumn("Camion");
        modelo.addColumn("Observaciones");
        for (Factura objFac : GestFactura.getInstance().devolverFacturas()) {
            Date fechaF = convertirStringDate(objFac.getfFecha());
            if ((desde.compareTo(fechaF) < 0 || desde.compareTo(fechaF) == 0) && (hasta.compareTo(fechaF) > 0 || hasta.compareTo(fechaF) == 0)) {
                Object[] objf = {objFac.getfNumero(), objFac.getfFecha(), objFac.getfMoneda(), objFac.getfImporte(), objFac.getfLugarCarga(), objFac.getfLugarDescarga(), objFac.getfKilometros(), objFac.getfKilometrosRetorno(), objFac.getfGrupoMetros(),
                    objFac.getfCantAnimales(), objFac.getfGuia(), objFac.getObjCliente().getpNombre(), objFac.getObjEmpleado().getpNombre(),
                    objFac.getObjCamion().getcMatricula(), objFac.getfObservaciones()};
                modelo.addRow(objf);
            }
        }

        return modelo;

    }

    public static double listarFactEntreFechasTotal(Date desde, Date hasta) {
        double total = 0;
        for (Factura objFac : GestFactura.getInstance().devolverFacturas()) {
            Date fechaF = convertirStringDate(objFac.getfFecha());
            if ((desde.compareTo(fechaF) < 0 || desde.compareTo(fechaF) == 0) && (hasta.compareTo(fechaF) > 0 || hasta.compareTo(fechaF) == 0)) {
                if (objFac.getfMoneda().equals("Dolares")) {
                    total = total + (objFac.getfImporte() * objFac.getFtipoCambio());
                } else {
                    total = total + (objFac.getfImporte());
                }
            }
        }

        return total;

    }

    public static double calcularLitros(double importe) {
        double litros = 0;
        Cambio objc = GestCambio.getInstance().devolverUnicoCambio();

        litros = importe / objc.getGasOil();
        return litros;
    }

    public static double calcularFacturado(Date desde, Date hasta, Empleado objE) {
        double facturado = 0;
        for (Factura objF : GestFactura.getInstance().devolverFacturas()) {
            Date fechafact = convertirStringDate(objF.getfFecha());
            if (objF.getObjEmpleado().getpNumero() == objE.getpNumero()) {
                if ((desde.compareTo(fechafact) < 0 || desde.compareTo(fechafact) == 0) && (hasta.compareTo(fechafact) > 0 || hasta.compareTo(fechafact) == 0)) {
                    if (objF.getfMoneda().equals("Dolares")) {
                        facturado = facturado + (objF.getfImporte() * objF.getFtipoCambio());
                    } else {
                        facturado = facturado + objF.getfImporte();
                    }
                }
            }
        }
        return facturado;
    }

    public static DefaultTableModel facturasporclientedebiendo(DefaultTableModel modelo, int objC) {
        modelo.setRowCount(0);
        for (Factura objF : GestFactura.getInstance().devolverFacturas()) {
            if (objF.getObjCliente().getpNumero() == objC && objF.getfSaldo() > 0) {
                Object[] objfac = {objF.getfNumero(), objF.getfFecha(), objF.getObjCamion().getcMatricula(), objF.getfMoneda(), objF.getfImporte(), objF.getfSaldo()};
                modelo.addRow(objfac);
            }
        }
        return modelo;
    }

    public static DefaultComboBoxModel tipoPagoCombo(DefaultComboBoxModel modelo) {

        modelo.addElement("Pesos");
        modelo.addElement("Dolares");
        return (DefaultComboBoxModel) modelo;
    }

    public static DefaultTableModel listarPagosentreFechas(DefaultTableModel modelo, Date desde, Date hasta) {
        modelo.setRowCount(0);
        //String fechaincial = convertirDateString(desde);
        //String fechafin = convertirDateString(hasta);
        for (Pago objP : GestPago.getInstance().devolverPagos()) {
            Date fechaP = convertirStringDate(objP.getpFechaPago());
            if ((desde.compareTo(fechaP) < 0 || desde.compareTo(fechaP) == 0) && (hasta.compareTo(fechaP) > 0 || hasta.compareTo(fechaP) == 0)) {
                Object[] objPa = {objP.getpNumeroPago(), objP.getpFechaPago(), objP.getpObjFactura().getfNumero(), objP.getpImportePago(), objP.getpObjFactura().getfSaldo()};
                modelo.addRow(objPa);
            }
        }
        return modelo;
    }
}