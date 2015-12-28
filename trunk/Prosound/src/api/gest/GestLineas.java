/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.gest;

import api.dom.Cliente;
import api.dom.Factura;
import api.dom.Lineas;

import java.util.ArrayList;

/**
 *
 * @author Enrico
 */
public class GestLineas {
    private ArrayList<Lineas> mColLineas = new ArrayList<Lineas>();
    private static GestLineas objGestC = null;
    
     private GestLineas() {
        Lineas objLin = new Lineas();
         mColLineas = objLin.obtenerTodos();
  }
    
      public static GestLineas getInstance()
  {
        if (objGestC == null){
            objGestC = new GestLineas();
            }
        return objGestC;
  }
      
      public boolean verificarLinea(Lineas xObjL){
         /* for(Lineas lin: mColLineas){
              if(lin.getFactNro().getCliCod()==xObjL.getFactNro().getfNumero()){
                 return true;
              }                 
          }*/
          return false;
      }
      
      public boolean altaLinea(Lineas xObjL){
          if(!verificarLinea(xObjL)){
              mColLineas.add(xObjL);
              xObjL.guardar();
              return true;
          }
          return false;
      }
      
       public boolean bajaLinea(int xObjL){
          /*for (Lineas objL : mColLineas) {
            if (objC.getCliCod() == xObjC) {
                for (Factura objF : GestFactura.getInstance().devolverFacturas()) {
                    if (objF.getObjCliente().getCliCod() == objC.getCliCod()) {
                        return false;
                    }
                }
                mColCliente.remove(objC);
                objC.eliminar();
                return true;

            }
        }*/

        return false;
          
      }
      
      public ArrayList<Lineas> devolverLineas(){
          return mColLineas;
      }
      
      /*public void modificarCliente(Cliente xcli){
          for(Cliente xObjC: mColCliente){
            if(xObjC.getpNumero() == xcli.getpNumero() ){
                xObjC.setpNombre(xcli.getpNombre());
                xObjC.setpDireccion(xcli.getpDireccion());
                xObjC.setpTelefono(xcli.getpTelefono());
                xObjC.setcDicose(xcli.getcDicose());
                xObjC.setcRut(xcli.getcRut());
                xObjC.modificar();
            }
        }
      }*/
      
      public int devolverUltimoNum() {
        int mayor = 0;
        for (Lineas xobjF : mColLineas) {
            if (xobjF.getLinNro() > mayor) {
                mayor = xobjF.getLinNro();
            }
        }
        mayor = mayor + 1;
        return mayor;
    }
      
      
      
      
   
}
