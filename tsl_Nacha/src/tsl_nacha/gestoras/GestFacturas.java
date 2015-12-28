/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsl_nacha.gestoras;

import java.util.ArrayList;
import tsl_nacha.dominio.Articulos;
import tsl_nacha.dominio.Facturas;

/**
 *
 * @author Enrico
 */
public class GestFacturas {
    
    private ArrayList<Facturas> mColFacturas = new ArrayList<Facturas>();
    private static GestFacturas objGestF = null;
    
        public GestFacturas() {
        Facturas objF = new Facturas();
        mColFacturas = objF.obtenerTodos();
    }

    public static GestFacturas getInstance() {
        if (objGestF == null) {
            objGestF = new GestFacturas();
        }
        return objGestF;
    }
    
        public boolean agregarFactura(Facturas objF){
        if(!existeFactura(objF)){
            mColFacturas.add(objF);
            objF.guardar();
            return true;
        }
        return false;
    }

    private boolean existeFactura(Facturas objF) {
        for(Facturas f: mColFacturas){
            if(f.getfNumero()==objF.getfNumero()){
                return true;
            }
        }
        return false;
    }
    
    
    public int devolverUltimoNum(){           
        int mayor = 0;
        for (Facturas xobjF : mColFacturas) {
            if (xobjF.getfNumero() > mayor) {
                mayor = xobjF.getfNumero();
            }
        }
        mayor = mayor + 1;
        return mayor;
    }
    
    public ArrayList<Facturas> devolverFacturas(){
        return mColFacturas;
    }
    
        public int devolverNumeroLinea() {
            int i = 0;
            for(Facturas f: mColFacturas){
              i = f.devolverNumeroLinea() + i;
            }
            return i;
        
    }
        
        public boolean eliminarFacturaSinPagos(Facturas f){
                    f.eliminarLineasFactura();
                    GestCuentas.getInstance().restarSaldoCuenta(f);
                    f.eliminar();
                     mColFacturas.remove(f);
                    return true;
        }

    public Facturas devolverFacturaNumero(int numero) {
        for(Facturas f:mColFacturas){
            if(f.getfNumero()==numero){
                return f;
            }
        }
        return null;
    }
    

}
