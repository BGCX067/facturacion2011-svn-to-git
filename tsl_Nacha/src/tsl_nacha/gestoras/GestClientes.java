/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsl_nacha.gestoras;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import tsl_nacha.dominio.Articulos;
import tsl_nacha.dominio.Clientes;

/**
 *
 * @author Enrico
 */
public class GestClientes {
    
    private ArrayList<Clientes> mColClientes = new ArrayList<Clientes>();
    private static GestClientes objGestC = null;
    
        public GestClientes() {
        Clientes objC = new Clientes();
        mColClientes = objC.obtenerTodos();
    }

    public static GestClientes getInstance() {
        if (objGestC == null) {
            objGestC = new GestClientes();
        }
        return objGestC;
    }
    
    public boolean agregarClientes(Clientes objC){
        if(!existeClientes(objC)){
            mColClientes.add(objC);
            objC.guardar();
            return true;
        }
        return false;
    }

    private boolean existeClientes(Clientes objC) {
        for(Clientes c: mColClientes){
            if(c.getcNumero()==objC.getcNumero()){
                return true;
            }
        }
        return false;
    }
    
    public Clientes devolverClientesNumero(int xCod){
        for(Clientes c:mColClientes){
            if(c.getcNumero()==xCod){
                return c;
            }
        }
        return null;
    }
    
    public int devolverUltimoNum(){
            
        int mayor = 0;
        for (Clientes xobjC : mColClientes) {
            if (xobjC.getcNumero() > mayor) {
                mayor = xobjC.getcNumero();
            }
        }
        mayor = mayor + 1;
        return mayor;
    
    }
    
    public ArrayList<Clientes> devolverClientes(){
        return mColClientes;
    }
    
      public boolean modificarClientes(Clientes xObjC) {
        for (Clientes xxObjCli : mColClientes) {
            if (xxObjCli.getcNumero() == xObjC.getcNumero()) {
                xxObjCli.setcNombre(xObjC.getcNombre());
                xxObjCli.setcDireccion(xObjC.getcDireccion());
                xxObjCli.setcTelefono(xObjC.getcTelefono());
               

                xxObjCli.modificar();
                return true;
            }
        }
        return false;
    }

    public boolean eliminarCliente(Clientes c) {
        if(!GestCuentas.getInstance().clienteTieneCuenta(c)){
               
                       c.eliminar();
                       mColClientes.remove(c);
                       return true;
                  
       }
        return false;
    }

    public boolean esNacha(Clientes c2) {
       if("NACHA CONTADO".equals(c2.getcNombre())){
           return true;
       }
       return false;
    }
    
    
}
