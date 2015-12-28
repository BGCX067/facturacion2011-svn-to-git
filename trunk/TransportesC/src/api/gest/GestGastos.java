/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.gest;

import api.dom.Gasto;
import java.util.ArrayList;

/**
 *
 * @author Enrico
 */
public class GestGastos {
    private ArrayList<Gasto> mColGastos = new ArrayList<Gasto>();
    private static GestGastos objGestG = null;
    
    
        public GestGastos() {
        Gasto objg = new Gasto();
        mColGastos = objg.obtenerTodos();
    }
      public static GestGastos getInstance()
  {
        if (objGestG == null){
            objGestG = new GestGastos();
            }
        return objGestG;
  }
      
      
      public boolean altaGasto(Gasto xObjG){     
              mColGastos.add(xObjG);
              xObjG.guardar();
              return true;
      }
      
      public ArrayList<Gasto> devolverGastos(){
          return mColGastos;
      }
      
          public int devolverUltimoNum() {
        int mayor = 0;
        for (Gasto xobjg : mColGastos) {
            if (xobjg.getgNumero() > mayor) {
                mayor = xobjg.getgNumero();
            }
        }
        mayor = mayor + 1;
        return mayor;
    }

    public Gasto devolverGastoNumero(int numero) {
        for(Gasto g: mColGastos){
            if(g.getgNumero()==numero){
                return g;
            }
        }
        return null;
    }
    
    public void modificarGasto(Gasto ObjG) {
        for(Gasto g: mColGastos){
            if(g.getgNumero()==ObjG.getgNumero()){                       
                        g.setgFecha(ObjG.getgFecha()); 
                        g.setgRubro(ObjG.getgRubro());
                        g.setgImporte(ObjG.getgImporte());
                        g.setObjCamion(ObjG.getObjCamion());
                        g.modificar();
            }
        }
    }
    
    public Gasto devolverGasto(int x) {
        for (Gasto g : this.mColGastos) {
            if (g.getgNumero() == x) {
                return g;
            }
        }
        return null;
    }
    
      public void bajaGasto(int g) {
        for (Gasto objg : mColGastos) {
            if (objg.getgNumero() == g) {
                objg.eliminar();
                mColGastos.remove(objg);
                break;

            }
        }
    }
    
}
