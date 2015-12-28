/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.gest;

import api.dom.Factura;
import api.dom.Lineas;
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
            if (f.getfCod() == x) {
                return f;
            }
        }
        return null;
    }

    public boolean verificarF(Factura xObjF) {
        for (Factura f : mColFacturas) {
            if (f.getfCod() == xObjF.getfCod()) {
                return true;
            }
        }
        return false;
    }

    public boolean altaFactura(Factura xObjF) {
        if (verificarF(xObjF) == false) {
            mColFacturas.add(xObjF);
            xObjF.guardar();
            return true;
        }
        return false;
    }

    public boolean bajaFactura(int factura) {
        for (Factura objF : mColFacturas) {
            if (objF.getfCod() == factura) {
                for (Pago objP : GestPago.getInstance().devolverPagos()) {
                    if (objP.getpObjFactura().getfCod() == factura) {
                        return false;
                    } else {
                        for(Lineas objL: GestLineas.getInstance().devolverLineas()){
                            if(objL.getFactNro().getfCod()==objF.getfCod()){
                                objL.eliminar();
                            }
                        }
                        objF.eliminar();
                        mColFacturas.remove(objF);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public ArrayList<Factura> devolverFacturas() {
        return mColFacturas;
    }

    public int devolverUltimoNum() {
        int mayor = 0;
        for (Factura xobjF : mColFacturas) {
            if (xobjF.getfCod() > mayor) {
                mayor = xobjF.getfCod();
            }
        }
        mayor = mayor + 1;
        return mayor;
    }

    public Factura buscarFactura(int numeroF) {
        for (Factura objF : mColFacturas) {
            if (objF.getfCod() == numeroF) {
                return objF;
            }
        }
        return null;
    }

    public void modificarSaldoFactura(int numeroFact, int importe) {
        for (Factura objF : mColFacturas) {
            if (objF.getfCod() == numeroFact) {
                double saldo = objF.getfSaldo();
                objF.setfSaldo(saldo - importe);
                objF.modificar();
            }
        }
    }

    public void modificarSaldoFactura2(int codFact, int importe) {
        for (Factura objF : mColFacturas) {
            if (objF.getfCod() == codFact) {
                double saldo = objF.getfSaldo();
                objF.setfSaldo(saldo + importe);
                objF.modificar();
            }
        }
    }

    public void modificarFactura(Factura xobjFact) {
        for (Factura objf : mColFacturas) {
            if (objf.getfCod() == xobjFact.getfCod()) {
                objf = xobjFact;


                objf.modificar();
            }
        }
    }

    public boolean exsistefactura(int codFact) {
        for (Factura objF : mColFacturas) {
            if (objF.getfCod() == codFact) {
                return true;
            }
        }
        return false;
    }
}
