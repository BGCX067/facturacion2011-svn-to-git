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
 * @author Javs
 */
public class Gasto implements IPersistente {
    private int gNumero;
    private String gFecha;
    private String gDesc;
    private Double gImporte;
    private String gObservaciones;    
    Broker objBroker;

    public Gasto() {
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    public Gasto(int gNumero, String gFecha, String gDesc, Double gImporte, String gObservaciones) {
        this.gNumero = gNumero;
        this.gFecha = gFecha;
        this.gDesc = gDesc;
        this.gImporte = gImporte;
        this.gObservaciones = gObservaciones;
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

   

    public String getgDesc() {
        return gDesc;
    }

    public void setgDesc(String gDesc) {
        this.gDesc = gDesc;
    }

    public String getgFecha() {
        return gFecha;
    }

    public void setgFecha(String gFecha) {
        this.gFecha = gFecha;
    }

    public Double getgImporte() {
        return gImporte;
    }

    public void setgImporte(Double gImporte) {
        this.gImporte = gImporte;
    }

    public int getgNumero() {
        return gNumero;
    }

    public void setgNumero(int gNumero) {
        this.gNumero = gNumero;
    }

    public String getgObservaciones() {
        return gObservaciones;
    }

    public void setgObservaciones(String gObservaciones) {
        this.gObservaciones = gObservaciones;
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
    public ArrayList obtenerTodos() {
        return objBroker.obtenerTodos();
    }

    
    
    
 
}
