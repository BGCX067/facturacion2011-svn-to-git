/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsl_nacha.dominio;

import java.util.ArrayList;
import tsl_nacha.persistencia.Broker;
import tsl_nacha.persistencia.FachadaBaseDeDatos;

/**
 *
 * @author Enrico
 */
public class Lineas implements IPersistente {
    
    private int lCorrelativo;
    private Articulos objArticulo;
    private int lCantidad;
    private double lTotal;
    private int lNumFactura;
     Broker objBroker;

    public int getlNumFactura() {
        return lNumFactura;
    }

    public void setlNumFactura(int lNumFactura) {
        this.lNumFactura = lNumFactura;
    }

    public int getlCantidad() {
        return lCantidad;
    }

    public void setlCantidad(int lCantidad) {
        this.lCantidad = lCantidad;
    }

    public int getlCorrelativo() {
        return lCorrelativo;
    }

    public void setlCorrelativo(int lCorrelativo) {
        this.lCorrelativo = lCorrelativo;
    }

    public double getlTotal() {
        return lTotal;
    }

    public void setlTotal(double lTotal) {
        this.lTotal = lTotal;
    }

    public Articulos getObjArticulo() {
        return objArticulo;
    }

    public void setObjArticulo(Articulos objArticulo) {
        this.objArticulo = objArticulo;
    }

    public Lineas(int lCorrelativo, Articulos objArticulo, int lCantidad, double lTotal,int lNumFactura) {
        this.lCorrelativo = lCorrelativo;
        this.objArticulo = objArticulo;
        this.lCantidad = lCantidad;
        this.lTotal = lTotal;
        this.lNumFactura=lNumFactura;
       objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    void sumarCantTotal(int xcant, double xtotal) {
        this.lCantidad=xcant;
        this.lTotal=xtotal;
    }

    public Lineas() {
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }
       

    @Override
    public void guardar() {
         objBroker.guardar();
    }

    @Override
    public void modificar() {
          objBroker.modificar();
    }

    @Override
    public void eliminar() {
       objBroker.eliminar();
    }

    @Override
    public ArrayList obtenerTodos(int numfactura) {
       return objBroker.obtenerTodos(numfactura);
    }

    @Override
    public ArrayList obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
    
}
