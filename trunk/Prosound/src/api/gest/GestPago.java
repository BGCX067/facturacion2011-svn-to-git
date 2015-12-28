/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.gest;

import api.dom.Pago;
import java.util.ArrayList;

/**
 *
 * @author Enrico
 */
public class GestPago {

    private ArrayList<Pago> mColPago = new ArrayList<Pago>();
    private static GestPago objGestP = null;

    private GestPago() {
        Pago objp = new Pago();
        mColPago = objp.obtenerTodos();
    }

    public static GestPago getInstance() {
        if (objGestP == null) {
            objGestP = new GestPago();
        }
        return objGestP;
    }

    public boolean verificarPago(Pago xObjP) {
        for (Pago p : mColPago) {
            if (p.getpNumeroPago() == xObjP.getpNumeroPago()) {
                return true;
            }
        }
        return false;
    }

    public boolean altaPago(Pago xObjP) {
        if (!verificarPago(xObjP)) {
            mColPago.add(xObjP);
            xObjP.guardar();
            return true;
        }
        return false;
    }

    public ArrayList<Pago> devolverPagos() {
        return mColPago;
    }

    public int devolverUltimoNum() {
        int mayor = 0;
        for (Pago xobjp : mColPago) {
            if (xobjp.getpNumeroPago() > mayor) {
                mayor = xobjp.getpNumeroPago();
            }
        }
        mayor = mayor + 1;
        return mayor;
    }

    public void bajaPago(int xObjP) {
        for (Pago objP : mColPago) {
            if (objP.getpNumeroPago() == xObjP) {
                
                mColPago.remove(objP);
                objP.eliminar();
                break;

            }

        }
    }

    public void modificarPago(Pago xPago) {
        for (Pago xObjP : mColPago) {
            if (xObjP.getpNumeroPago() == xPago.getpNumeroPago()) {
                xObjP = xPago;
                xObjP.modificar();
            }
        }
    }

    public Pago devolverPago(int x) {
        for (Pago xObjP : mColPago) {
            if (xObjP.getpNumeroPago() == x) {
                return xObjP;
            }
        }
        return null;
    }
}
