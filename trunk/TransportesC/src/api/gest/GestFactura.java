/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.gest;

import api.dom.Cambio;
import api.dom.Factura;
import api.dom.Pago;
import java.util.ArrayList;

/**
 *
 * @author Enrico
 */
public class GestFactura {

    private ArrayList<Factura> mColFacturas = new ArrayList<Factura>();
    private static GestFactura objGestF = null;

    public static GestFactura getInstance() {
        if (objGestF == null) {
            objGestF = new GestFactura();
        }
        return objGestF;
    }

    public GestFactura() {
        Factura objf = new Factura();
        mColFacturas = objf.obtenerTodos();

    }

    public Factura devolverFactura(int x) {
        for (Factura f : this.mColFacturas) {
            if (f.getfNumero() == x) {
                return f;
            }
        }
        return null;
    }

    public boolean verificarFactura(Factura xObjF) {
        for (Factura f : mColFacturas) {
            if (f.getfNumero() == xObjF.getfNumero()) {
                return true;
            }
        }
        return false;
    }

    public boolean altaFactura(Factura xObjF) {
        if (!verificarFactura(xObjF)) {
            mColFacturas.add(xObjF);
            xObjF.guardar();
            return true;
        }
        return false;

    }

    public void bajaFactura(int factura) {
        for (Factura objF : mColFacturas) {
            if (objF.getfNumero() == factura) {
                objF.eliminar();
                mColFacturas.remove(objF);
                break;

            }
        }
    }

    public ArrayList<Factura> devolverFacturas() {
        return mColFacturas;
    }

    public int devolverUltimoNum() {
        int mayor = 0;
        for (Factura xobjF : mColFacturas) {
            if (xobjF.getfNumero() > mayor) {
                mayor = xobjF.getfNumero();
            }
        }
        mayor = mayor + 1;
        return mayor;
    }

    public Factura buscarFactura(int numeroF) {
        for (Factura objF : mColFacturas) {
            if (objF.getfNumero() == numeroF) {
                return objF;
            }
        }
        return null;
    }

    public void modificarSaldoFactura(int numeroFact, int importe) {
        for (Factura objF : mColFacturas) {
            if (objF.getfNumero() == numeroFact) {
                int saldo = objF.getfSaldo();
                objF.setfSaldo(saldo - importe);
                objF.modificar();
            }
        }
    }

    public void modificarSaldoFactura2(int numeroFact, int importe) {
        for (Factura objF : mColFacturas) {
            if (objF.getfNumero() == numeroFact) {
                int saldo = objF.getfSaldo();
                objF.setfSaldo(saldo + importe);
                objF.modificar();
            }
        }
    }

    public boolean verificarfact(Factura xobjFact) {
        for (Pago objP : GestPago.getInstance().devolverPagos()) {
            if (objP.getpObjFactura().getfNumero() == xobjFact.getfNumero()) {
                return false;
            }
        }
        return true;

    }

    public boolean modificarFactura(Factura xobjFact) {
        for (Factura objf : mColFacturas) {
            if (objf.getfNumero() == xobjFact.getfNumero()) {
                if (verificarfact(xobjFact) == true) {                    
                    objf.setfFecha(xobjFact.getfFecha());
                    objf.setfMoneda(xobjFact.getfMoneda());
                    objf.setFtipoCambio(xobjFact.getFtipoCambio());
                    objf.setfLugarCarga(xobjFact.getfLugarCarga());
                    objf.setfLugarDescarga(xobjFact.getfLugarDescarga());
                    objf.setfKilometros(xobjFact.getfKilometros());
                    objf.setfGrupoMetros(xobjFact.getfGrupoMetros());
                    objf.setfCantBultos(xobjFact.getfCantAnimales());
                    objf.setfGuia(xobjFact.getfGuia());
                    objf.setfImporte(xobjFact.getfImporte());
                    objf.setObjCliente(xobjFact.getObjCliente());
                    objf.setObjEmpleado(xobjFact.getObjEmpleado());
                    objf.setObjCamion(xobjFact.getObjCamion());
                    objf.setfKilometrosRetorno(xobjFact.getfKilometrosRetorno());
                    objf.setfObservaciones(xobjFact.getfObservaciones());
                    if ("Dolares".equals(xobjFact.getfMoneda())) {
                        int saldo = (int) (xobjFact.getfImporte() * xobjFact.getFtipoCambio());
                        objf.setfSaldo(saldo);
                    } else {
                        objf.setfSaldo(xobjFact.getfImporte());
                    }
                    objf.modificar();
                    return true;
                }
            }
        }
        return false;
    }

    public boolean exsistefactura(int numeroFact) {
        for (Factura objF : mColFacturas) {
            if (objF.getfNumero() == numeroFact) {
                return true;
            }
        }
        return false;
    }
}
