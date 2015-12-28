/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.gest;

import api.dom.Camion;
import api.dom.Factura;
import api.dom.Gasto;
import java.util.ArrayList;

/**
 *
 * @author Enrico
 */
public class GestCamiones {

    private ArrayList<Camion> mColCamiones = new ArrayList<Camion>();
    private static GestCamiones objGestC = null;

    public GestCamiones() {
        Camion objc = new Camion();
        mColCamiones = objc.obtenerTodos();
    }

    public static GestCamiones getInstance() {
        if (objGestC == null) {
            objGestC = new GestCamiones();
        }
        return objGestC;
    }

    public boolean verificarCamion(Camion xObjC) {
        for (Camion c : mColCamiones) {
            if (c.getcMatricula() == null ? xObjC.getcMatricula() == null : c.getcMatricula().equals(xObjC.getcMatricula())) {
                return true;
            }
        }
        return false;
    }

    public boolean altaCamiones(Camion xObjC) {
        if (!verificarCamion(xObjC)) {
            mColCamiones.add(xObjC);
            xObjC.guardar();
            return true;
        }
        return false;
    }

    public boolean bajaCamiones(String matricula) {
        /*if (comprobarcamiones(matricula) == false) {
        return false;
        } else {*/
        for (Camion objc : mColCamiones) {
            if (objc.getcMatricula().equals(matricula)) {
                for (Factura objF : GestFactura.getInstance().devolverFacturas()) {
                    if (objF.getObjCamion().getcMatricula().equals(objc.getcMatricula())) {
                        return false;
                    }
                }
                for (Gasto objG : GestGastos.getInstance().devolverGastos()) {
                    if (objG.getObjCamion().getcMatricula().equals(objc.getcMatricula())) {
                        return false;
                    }

                }
                mColCamiones.remove(objc);
                objc.eliminar();
                return true;

            }
        }

        /* }*/
        return false;
    }

    public ArrayList<Camion> devolverCamiones() {
        return mColCamiones;
    }

    public void modificarCamiones(Camion xObjC) {
        for (Camion xxObjCam : mColCamiones) {
            if (xxObjCam.getcMatricula().equals(xObjC.getcMatricula())) {
                xxObjCam.setcMarca(xObjC.getcMarca());
                xxObjCam.setcColor(xObjC.getcColor());
                xxObjCam.setcEjes(xObjC.getcEjes());
                xxObjCam.setcMetros(xObjC.getcMetros());
                xxObjCam.modificar();
            }
        }
    }

    public Camion devolverCamionNumero(String xnum) {
        for (Camion c : mColCamiones) {
            if (xnum.equals(c.getcMatricula())) {
                return c;
            }
        }
        return null;
    }
}
