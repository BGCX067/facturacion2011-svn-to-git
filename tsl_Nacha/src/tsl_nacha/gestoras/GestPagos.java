/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsl_nacha.gestoras;

import java.util.ArrayList;
import tsl_nacha.dominio.Pagos;

/**
 *
 * @author Enrico
 */
public class GestPagos {

private ArrayList<Pagos>  mColPagos = new ArrayList<Pagos>();
    private static GestPagos objGestP;
    
     public GestPagos() {
        Pagos objP = new Pagos();
        mColPagos = objP.obtenerTodos();
    }

    public static GestPagos getInstance() {
        if (objGestP == null) {
            objGestP = new GestPagos();
        }
        return objGestP;
    }
    
    public boolean agregarPagos(Pagos objP){
       if(!existePago(objP)){
        mColPagos.add(objP);
        objP.guardar();
        return true;
       }
       return false;
       }

    private boolean existePago(Pagos objP) {
        for(Pagos p:mColPagos){
            if(p.getIdPago()==objP.getIdPago()){
                return true;
            }
    }
        return false;
    }
    
    public ArrayList<Pagos> devolverTodosPagos(){
        return mColPagos;
    }
    
    public int devolverNumeroPago(){
         int mayor = 0;
        for (Pagos xobjC: mColPagos) {
            if (xobjC.getIdPago() > mayor) {
                mayor = xobjC.getIdPago();
            }
        }
        mayor = mayor + 1;
        return mayor;
    }

    public ArrayList<Pagos> devolverPagosCuenta(int numero) {
        ArrayList<Pagos> colPagos = new ArrayList<Pagos>();
        for(Pagos p: mColPagos){
            if(p.getIdCuenta().getIdCuenta()==numero){
                colPagos.add(p);
            }
        }
        return colPagos;
    }

    public Pagos devolverPagoPorNum(int numero) {
       for(Pagos p:mColPagos){
           if(p.getIdPago()==numero){
               return p;
           }
       }
       return null;
    }

    public boolean eliminarPago(Pagos objPago) {
        mColPagos.remove(objPago);
        objPago.eliminar();
        return true;
    }
    
}
