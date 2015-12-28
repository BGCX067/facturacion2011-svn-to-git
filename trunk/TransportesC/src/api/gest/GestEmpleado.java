/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.gest;

import api.dom.Empleado;
import api.dom.Factura;
import api.dom.Persona;
import api.dom.Sueldo;
import java.util.ArrayList;

/**
 *
 * @author Enrico
 */
public class GestEmpleado {

    private ArrayList<Empleado> mColEmpleado = new ArrayList<Empleado>();
    private static GestEmpleado objGestC = null;

    public GestEmpleado() {
        Empleado objEmp = new Empleado();
        mColEmpleado = objEmp.obtenerTodos();
    }

    public static GestEmpleado getInstance() {
        if (objGestC == null) {
            objGestC = new GestEmpleado();
        }
        return objGestC;
    }

    public boolean verificarEmpleado(Persona xObjE) {
        for (Empleado e : mColEmpleado) {
            if (e.getpNumero() == xObjE.getpNumero()) {
                return true;
            }
        }
        return false;
    }

    public boolean altaEmpleado(Empleado xObjE) {
        if (!verificarEmpleado(xObjE)) {
            mColEmpleado.add(xObjE);
            xObjE.guardar();
            return true;
        }
        return false;
    }

    public boolean bajaEmpleado(int xObjE) {
        for (Empleado objEmp : mColEmpleado) {
            if (objEmp.getpNumero() == xObjE) {
                for (Factura objF : GestFactura.getInstance().devolverFacturas()) {
                    if (objF.getObjEmpleado().getpNumero() == objEmp.getpNumero()) {
                        return false;
                    }
                }
                for (Sueldo objS : GestSueldo.getInstance().devolverSueldo()) {
                    if (objS.getObjE().getpNumero()== objEmp.getpNumero()) {
                        return false;
                    }

                }
                mColEmpleado.remove(objEmp);
                objEmp.eliminar();
                return true;

            }
        }

        return false;


    }

    public ArrayList<Empleado> devolverEmpleado() {
        return mColEmpleado;
    }

    public void modificarEmpleado(Empleado ObjEmp) {
        for (Empleado xObjE : mColEmpleado) {
            if (xObjE.getpNumero() == ObjEmp.getpNumero()) {
                xObjE.setpNombre(ObjEmp.getpNombre());
                xObjE.setpDireccion(ObjEmp.getpDireccion());
                xObjE.setpTelefono(ObjEmp.getpTelefono());
                xObjE.seteCedulaIdentidad(ObjEmp.geteCedulaIdentidad());
                xObjE.seteFechaIngreso(ObjEmp.geteFechaIngreso());
                xObjE.modificar();
            }
        }
    }

    public int devolverUltimoNum() {
        int mayor = 0;
        for (Empleado xobjE : mColEmpleado) {
            if (xobjE.getpNumero() > mayor) {
                mayor = xobjE.getpNumero();
            }
        }
        mayor = mayor + 1;
        return mayor;
    }

    public Empleado devolveremppornombre(String nomemp) {
        for (Empleado obje : mColEmpleado) {
            if (obje.getpNombre().equals(nomemp)) {
                return obje;
            }
        }
        return null;
    }
}
