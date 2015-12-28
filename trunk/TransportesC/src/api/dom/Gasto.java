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
    private String gRubro;
    private Double gImporte;
    private Double gLitros;
    private Camion objCamion;
    Broker objBroker;

    public Gasto() {
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    public Gasto(int gNumero, String gFecha, String gRubro, Double gImporte, Double litros, Camion objCamion) {
        this.gNumero = gNumero;
        this.gFecha = gFecha;
        this.gRubro = gRubro;
        this.gImporte = gImporte;
        this.gLitros = litros;
        this.objCamion = objCamion;
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
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

    public String getgRubro() {
        return gRubro;
    }

    public void setgRubro(String gRubro) {
        this.gRubro = gRubro;
    }

    public Camion getObjCamion() {
        return objCamion;
    }

    public void setObjCamion(Camion objCamion) {
        this.objCamion = objCamion;
    }

    public Double getgLitros() {
        return gLitros;
    }

    public void setgLitros(Double gLitros) {
        this.gLitros = gLitros;
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
