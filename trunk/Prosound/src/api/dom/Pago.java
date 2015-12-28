/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.dom;

import java.util.ArrayList;
import server.dom.Broker;
import server.dom.FachadaBaseDeDatos;

/**
 *
 * @author Enrico
 */
public class Pago implements IPersistente {
    private int pNumeroPago;
    private String pFechaPago;
    private Factura pObjFactura;
    private double pImportePago;
    Broker objBroker;

    public String getpFechaPago() {
        return pFechaPago;
    }

    public void setpFechaPago(String pFechaPago) {
        this.pFechaPago = pFechaPago;
    }

    public double getpImportePago() {
        return pImportePago;
    }

    public void setpImportePago(double pImportePago) {
        this.pImportePago = pImportePago;
    }

    public int getpNumeroPago() {
        return pNumeroPago;
    }

    public void setpNumeroPago(int pNumeroPago) {
        this.pNumeroPago = pNumeroPago;
    }

    public Factura getpObjFactura() {
        return pObjFactura;
    }

    public void setpObjFactura(Factura pObjFactura) {
        this.pObjFactura = pObjFactura;
    }

  

    public Pago(int pNumeroPago, String pFechaPago, Factura pObjFactura,  double pImportePago) {
        this.pNumeroPago = pNumeroPago;
        this.pFechaPago = pFechaPago;
        this.pObjFactura = pObjFactura;
        this.pImportePago = pImportePago;
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    public Pago() {
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    @Override
    public String toString() {
        return "Pago{" + "pNumeroPago=" + pNumeroPago + ", pFechaPago=" 
                + pFechaPago + ", pObjFactura=" + pObjFactura + ", pSaldoFactura=" 
               + ", pImportePago=" + pImportePago + '}';
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
