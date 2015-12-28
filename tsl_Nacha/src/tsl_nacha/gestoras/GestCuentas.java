/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsl_nacha.gestoras;

import java.util.ArrayList;
import tsl_nacha.dominio.Clientes;
import tsl_nacha.dominio.Cuentas;
import tsl_nacha.dominio.Facturas;
import tsl_nacha.dominio.Pagos;

    
/**
 *
 * @author Enrico
 */
public class GestCuentas {
    private ArrayList<Cuentas>  mColCuentas = new ArrayList<Cuentas>();
    private static GestCuentas objGestC;
    
     public GestCuentas() {
        Cuentas objC = new Cuentas();
        mColCuentas = objC.obtenerTodos();
    }

    public static GestCuentas getInstance() {
        if (objGestC == null) {
            objGestC = new GestCuentas();
        }
        return objGestC;
    }
    
    public boolean agregarCuenta(Cuentas objC){
       if(!existeCuenta(objC)){
        mColCuentas.add(objC);
        objC.guardar();
        return true;
       }
       return false;
       }

    private boolean existeCuenta(Cuentas objC) {
        for(Cuentas c:mColCuentas){
            if(c.getIdCuenta()==objC.getIdCuenta()){
                return true;
            }
    }
        return false;
    }
    
   public ArrayList<Cuentas> devolverTodasCuentas(){
       return mColCuentas;
   } 
   
    public int devolverNumeroCuenta() {
        return mColCuentas.size();
    }

    public void aumentarSaldoCuenta(Clientes clientes, Facturas factura) {
        for(Cuentas c:mColCuentas){
            if(c.getObjCliente().getcNumero()==clientes.getcNumero()){
                c.setSaldo(factura.getfTotal() + c.getSaldo());
                c.modificar();
            }
        }
    }

    public Cuentas devolverCuentaPorNumero(int numero) {
        for(Cuentas c:mColCuentas){
            if(c.getIdCuenta()==numero){
                return c;
            }
        }
        return null;
    }

    public void disminuirSaldoCuenta(Pagos objPago) {
        for(Cuentas c:mColCuentas){
            if(c.getIdCuenta()==objPago.getIdCuenta().getIdCuenta()){
                Double SaldoA = c.getSaldo();
                c.setSaldo(SaldoA-objPago.getMonto());
                c.modificar();
            }
        }
    }
    
    public void RestaurarSaldoCuenta(Pagos objPago) {
        for(Cuentas c:mColCuentas){
            if(c.getIdCuenta()==objPago.getIdCuenta().getIdCuenta()){
                Double SaldoA = c.getSaldo();
                c.setSaldo(SaldoA + objPago.getMonto());
                c.modificar();
            }
        }
    }

    public Cuentas devolverCuentaPorCliente(Clientes clientes) {
        for(Cuentas c:mColCuentas){
            if(c.getObjCliente().getcNumero()==clientes.getcNumero()){
                return c;
            }
        }
        return null;
    }

    void restarSaldoCuenta(Facturas f) {
               for(Cuentas c:mColCuentas){
            if(c.getObjCliente().getcNumero()==f.getObjCuenta().getObjCliente().getcNumero()){
                c.setSaldo(c.getSaldo() - f.getfTotal());
                c.modificar();
            }
        }
    }

   public  boolean eliminarCuentaCliente(Clientes c) {
        for(Cuentas cc:mColCuentas){
            if(c.getcNumero()==cc.getObjCliente().getcNumero()){
                if(cc.getSaldo()<1){
                    cc.eliminar();
                    mColCuentas.remove(cc);
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }

    public boolean clienteTieneCuenta(Clientes c) {
        for(Cuentas cc:mColCuentas){
            if(cc.getObjCliente().getcNumero()==c.getcNumero()){
                return true;
            }
        }
        return false;
    }

    public boolean eliminarCuenta(Cuentas c) {
       if(c.getSaldo()==0 ){
           if(!"NACHA CONTADO".equals(c.getObjCliente().getcNombre())){
               mColCuentas.remove(c);
               return true;
           }
       }
       return false;
    }
}
