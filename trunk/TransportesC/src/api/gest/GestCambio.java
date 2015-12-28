/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.gest;

import api.dom.Cambio;
import api.dom.Camion;
import java.util.ArrayList;

/**
 *
 * @author Enrico
 */
public class GestCambio {

    private ArrayList<Cambio> mColCambio = new ArrayList<Cambio>();
    private static GestCambio objGestC = null;

    public GestCambio() {
        Cambio objc = new Cambio();
        mColCambio = objc.obtenerTodos();
    }

    public static GestCambio getInstance() {
        if (objGestC == null) {
            objGestC = new GestCambio();
        }
        return objGestC;
    }

    public ArrayList<Cambio> devolverCambio() {
        return mColCambio;
    }

    public Cambio devolverUnicoCambio() {
        for (Cambio xxObjCam : mColCambio) {
            if (xxObjCam.getNumero() == 1) {
                return xxObjCam;
            }
        }
        return null;
    }
     
/*
    public void modificarCambio(double x ) {
        devolverUnicoCambio().setDolares(x);
        devolverUnicoCambio().modificar();
    }
    
     * 
     */
    public void modificar1(int y, double u, double gasoil) {
        for (Cambio x : mColCambio) {
            if (x.getNumero()==(y)) {
               x.setDolares(u);
               x.setGasOil(gasoil);
               x.modificar();
               break;
            }
        }
        
    }
}
