/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.gest;

import api.dom.Cliente;
import api.dom.Factura;

import java.util.ArrayList;

/**
 *
 * @author Enrico
 */
public class GestCliente {
    private ArrayList<Cliente> mColCliente = new ArrayList<Cliente>();
    private static GestCliente objGestC = null;
    
     private GestCliente() {
        Cliente objCli = new Cliente();
         mColCliente = objCli.obtenerTodos();
  }
    
      public static GestCliente getInstance()
  {
        if (objGestC == null){
            objGestC = new GestCliente();
            }
        return objGestC;
  }
      
      public boolean verificarCliente(Cliente xObjP){
          for(Cliente p: mColCliente){
              if(p.getpNumero()==xObjP.getpNumero()){
                 return true;
              }                 
          }
          return false;
      }
      
      public boolean altaCliente(Cliente xObjP){
          if(!verificarCliente(xObjP)){
              mColCliente.add(xObjP);
              xObjP.guardar();
              return true;
          }
          return false;
      }
      
       public boolean bajaCliente(int xObjC){
          for (Cliente objC : mColCliente) {
            if (objC.getpNumero() == xObjC) {
                for (Factura objF : GestFactura.getInstance().devolverFacturas()) {
                    if (objF.getObjCliente().getpNumero() == objC.getpNumero()) {
                        return false;
                    }
                }
                mColCliente.remove(objC);
                objC.eliminar();
                return true;

            }
        }

        return false;
          
      }
      
      public ArrayList<Cliente> devolverCliente(){
          return mColCliente;
      }
      
      public void modificarCliente(Cliente xcli){
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
      }
      
      public int devolverUltimoNum() {
        int mayor = 0;
        for (Cliente xobjC: mColCliente) {
            if (xobjC.getpNumero() > mayor) {
                mayor = xobjC.getpNumero();
            }
        }
        mayor = mayor + 1;
        return mayor;
    }
      
      public Cliente devolvercliporcodigo(int numcli){
          for(Cliente objc: mColCliente){
              if(objc.getpNumero()==numcli){
                  return objc;
              }
          }
          return null;
      }
      public Cliente devolverclipornombre(String nomcli){
          for(Cliente objc: mColCliente){
              if(objc.getpNombre().equals(nomcli)){
                  return objc;
              }
          }
          return null;
      }
      
      
      
   
}
