/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsl_nacha.gestoras;


import java.util.ArrayList;
import tsl_nacha.dominio.Cambio;

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
            if (xxObjCam.getNum() == 1) {
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
    public void modificar1(int y, double u) {
        for (Cambio x : mColCambio) {
            if (x.getNum()==(y)) {
               x.setiva(u);
               x.modificar();
               break;
            }
        }
        
    }
}
