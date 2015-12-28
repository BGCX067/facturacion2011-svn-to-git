/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.gest;

import api.dom.Camion;
import api.dom.Sueldo;
import java.util.ArrayList;

/**
 *
 * @author Enrico
 */
public class GestSueldo {

    private ArrayList<Sueldo> mColSuelodo = new ArrayList<Sueldo>();
    private static GestSueldo objGestS = null;

    public GestSueldo() {
        Sueldo objS = new Sueldo();
        mColSuelodo = objS.obtenerTodos();
    }

    public static GestSueldo getInstance() {
        if (objGestS == null) {
            objGestS = new GestSueldo();
        }
        return objGestS;
    }

    public boolean verificarSueldo(Sueldo xObjS) {
        for (Sueldo s : mColSuelodo) {
            if (s.getSueldoNumero() == xObjS.getSueldoNumero()) {
                return true;
            }
        }
        return false;
    }

    public boolean altaSueldo(Sueldo xObjS) {
        if (!verificarSueldo(xObjS)) {
            mColSuelodo.add(xObjS);
            xObjS.guardar();
            return true;
        }
        return false;
    }

    public void bajaSueldo(String numero) {
        for (Sueldo objs : mColSuelodo) {
            if (objs.getSueldoNumero() == Integer.parseInt(numero)) {
                mColSuelodo.remove(objs);
                objs.eliminar();
                break;

            }
        }

    }

    public ArrayList<Sueldo> devolverSueldo() {
        return mColSuelodo;
    }

    public void modificarSueldo(Sueldo xObjs) {
        for (Sueldo xxObjS : mColSuelodo) {
            if (xxObjS.getSueldoNumero() == xObjs.getSueldoNumero()) {
                xxObjS.setCorrespondienteA(xObjs.getCorrespondienteA());
                xxObjS.setFacturado(xObjs.getFacturado());
                xxObjS.setFechaFin(xObjs.getFechaFin());
                xxObjS.setFechaInicio(xObjs.getFechaInicio());
                xxObjS.setFechaPago(xObjs.getFechaPago());
                xxObjS.setKm(xObjs.getKm());
                xxObjS.setKmRetorno(xObjs.getKmRetorno());
                xxObjS.setObjE(xObjs.getObjE());
                xxObjS.setPrecioKm(xObjs.getPrecioKm());
                xxObjS.setPrecioKmRetorno(xObjs.getPrecioKmRetorno());
                xxObjS.setSueldo(xObjs.getSueldo());


                xxObjS.modificar();
            }
        }
    }

    public int devolverUltimoNum() {
        int mayor = 0;
        for (Sueldo xobjs : mColSuelodo) {
            if (xobjs.getSueldoNumero() > mayor) {
                mayor = xobjs.getSueldoNumero();
            }
        }
        mayor = mayor + 1;
        return mayor;
    }

    public Sueldo devolverSueldoNum(int x) {
        for (Sueldo o : mColSuelodo) {
            if (o.getSueldoNumero() == x) {
                return o;
            }
        }
        return null;
    }
}
