/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsl_nacha.dominio;

import java.util.ArrayList;
import tsl_nacha.gestoras.GestArticulos;
import tsl_nacha.gestoras.GestCambio;
import tsl_nacha.persistencia.Broker;
import tsl_nacha.persistencia.FachadaBaseDeDatos;

/**
 *
 * @author Enrico
 */
public class Facturas implements IPersistente {

    private int fNumero;
    private String fFecha;
    private String fDescripcion;
    private double fSubTotal;
    private double fIva;
    private double fTotal;
    private ArrayList<Lineas> mColLineas = new ArrayList<Lineas>();
    private Cuentas objCuenta;
    Broker objBroker;

    public ArrayList<Lineas> getmColLineas() {
        return mColLineas;
    }

    public Cuentas getObjCuenta() {
        return objCuenta;
    }

    public void setObjCuenta(Cuentas objCuenta) {
        this.objCuenta = objCuenta;
    }
    
    

    public void setmColLineas(ArrayList<Lineas> mColLineas) {
        this.mColLineas = mColLineas;
    }

    public String getfDescripcion() {
        return fDescripcion;
    }

    public void setfDescripcion(String fDescripcion) {
        this.fDescripcion = fDescripcion;
    }

    public String getfFecha() {
        return fFecha;
    }

    public void setfFecha(String fFecha) {
        this.fFecha = fFecha;
    }

    public double getfIva() {
        return fIva;
    }

    public void setfIva(double fIva) {
        this.fIva = fIva;
    }

    public int getfNumero() {
        return fNumero;
    }

    public void setfNumero(int fNumero) {
        this.fNumero = fNumero;
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

    public Facturas(int fNumero, String fFecha, String fDescripcion, double fSubTotal, double fIva, double fTotal,Cuentas objCuenta) {
        this.fNumero = fNumero;
        this.fFecha = fFecha;
        this.fDescripcion = fDescripcion;
        this.fSubTotal = fSubTotal;
        this.fIva = fIva;
        this.fTotal = fTotal;
        this.objCuenta = objCuenta;
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    public Facturas() {
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    @Override
    public String toString() {
        return "Facturas{" + "fNumero=" + fNumero + ", fFecha=" + fFecha + ", fDescripcion=" + fDescripcion + ", fSubTotal=" + fSubTotal + ", fIva=" + fIva + ", fTotal=" + fTotal + '}';
    }

    @Override
    public void guardar() {
        objBroker.guardar();
    }

    @Override
    public void modificar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eliminar() {
        objBroker.eliminar();
    }

    @Override
    public ArrayList obtenerTodos() {
        return objBroker.obtenerTodos();
    }

    public boolean agregarLinea(Lineas xlin) {
        if (lineaYaAgregada(xlin) == false) {
            mColLineas.add(xlin);
//            xlin.guardar();
            return true;
        } else {
            this.modificarLinea(xlin);
        }
        return false;
    }

    public void agregarPieFactura(Lineas objLinea) {
        this.fSubTotal = fSubTotal + objLinea.getlTotal();
        Cambio c = GestCambio.getInstance().devolverUnicoCambio();
        this.fIva = (fSubTotal * c.getiva()) / 100;
        this.fTotal = fSubTotal + fIva;
    }
    
        public void actualizarPieFactura(Lineas objLinea) {
        this.fSubTotal = fSubTotal - objLinea.getlTotal();
        Cambio c = GestCambio.getInstance().devolverUnicoCambio();
        this.fIva = (fSubTotal * c.getiva()) / 100;
        this.fTotal = fSubTotal + fIva;
    }

    private boolean lineaYaAgregada(Lineas xlin) {
        for (Lineas l : mColLineas) {
            if (l.getObjArticulo().getaCodigo() == xlin.getObjArticulo().getaCodigo()) {
                return true;
            }
        }
        return false;
    }

    private void modificarLinea(Lineas xlin) {
        for (Lineas l : mColLineas) {
            if (l.getObjArticulo().getaCodigo() == xlin.getObjArticulo().getaCodigo()) {
                int nuevacant = (xlin.getlCantidad()+l.getlCantidad());
                double total = (xlin.getlTotal() + l.getlTotal());
                l.sumarCantTotal(nuevacant, total);
//                l.modificar();
            }
        }
        

    }
    public ArrayList<Lineas> devolverLineasFact(){
        return mColLineas;
    }

    public boolean eliminarLineaFactura(int numero) {
        for(Lineas l:mColLineas){
            if(l.getlCorrelativo()==numero){
                l.getObjArticulo().aumentarStock(l.getlCantidad());
                this.actualizarPieFactura(l);
                mColLineas.remove(l);
//                l.eliminar();
                return true;
            }
        }
        return false;
    }

    public int devolverNumeroLinea() {
        return mColLineas.size();
    }

    @Override
    public ArrayList obtenerTodos(int numero) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void agregarLineasBD() {
        for(Lineas l:mColLineas){
            l.guardar();
        }
    }

    public void eliminarLineasFactura() {
        for(Lineas l:mColLineas){
            l.eliminar();
        }
    }

    public boolean comprobarStock() {
        for(Lineas p:mColLineas){
            for(Articulos a: GestArticulos.getInstance().devolverArticulos()){
                if(p.getlCantidad()>a.getaStock()){
                    return true;
                }
            }
        }
        return false;
    }
    
    
}
