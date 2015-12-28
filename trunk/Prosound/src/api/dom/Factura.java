/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.dom;

import java.util.ArrayList;
import java.util.Date;
import server.dom.Broker;
import server.dom.FachadaBaseDeDatos;

/**
 *
 * @author Javs
 */
public class Factura implements IPersistente {
    private int fCod;
    private String fFecha;
    private Cliente objCli;
    private double fSubTotal;
    private double fTotal;
    private double fSaldo;
    private String fObservaciones;
    private String fTipo;
    private Broker objBroker;
  

    public Factura(){
         objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }
    
    public Factura(int fCod, String fFecha, Cliente objCli, double fSubTotal, double fTotal, double fSaldo, String observ, String ftip) {
        this.fCod = fCod;
        this.fFecha = fFecha;
        this.objCli = objCli;
        this.fSubTotal = fSubTotal;
        this.fTotal = fTotal;
        this.fSaldo = fSaldo;
        this.fObservaciones = observ;
        this.fTipo = ftip;
      
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    
    
    public int getfCod() {
        return fCod;
    }

    public void setfCod(int fCod) {
        this.fCod = fCod;
    }

    public String getfFecha() {
        return fFecha;
    }

    public void setfFecha(String fFecha) {
        this.fFecha = fFecha;
    }

    public double getfSaldo() {
        return fSaldo;
    }

    public void setfSaldo(double fSaldo) {
        this.fSaldo = fSaldo;
    }

    public double getfSubTotal() {
        return fSubTotal;
    }

    public void setfSubTotal(double fSubTotal) {
        this.fSubTotal = fSubTotal;
    }

    public double getfTotal() {
        return fTotal;
    }

    public void setfTotal(double fTotal) {
        this.fTotal = fTotal;
    }

    public Cliente getObjCli() {
        return objCli;
    }

    public void setObjCli(Cliente objCli) {
        this.objCli = objCli;
    }

    public String getfObservaciones() {
        return fObservaciones;
    }

    public void setfObservaciones(String fObservaciones) {
        this.fObservaciones = fObservaciones;
    }

    public String getfTipo() {
        return fTipo;
    }

    public void setfTipo(String fTipo) {
        this.fTipo = fTipo;
    }
    
    
    
    
    
    
    @Override
    public void guardar() {
        this.objBroker.guardar();
    }

    @Override
    public void modificar() {
        this.objBroker.modificar();
    }

    @Override
    public void eliminar() {
       this.objBroker.eliminar();
    }

    @Override
    public ArrayList obtenerTodos() {
       return this.objBroker.obtenerTodos();
    }
   
    
    
    
    
}
