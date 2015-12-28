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
public class Empleado extends Persona implements IPersistente {
    private String eCedulaIdentidad;
    private String eFechaIngreso;
    private String eCargo;
    Broker objBroker;

    public Empleado() {
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    public Empleado(String eCedulaIdentidad, String eFechaIngreso, String eCargo, int pNumero, String pNombre, String pDireccion, String pTelefono) {
        super(pNumero, pNombre, pDireccion, pTelefono);
        this.eCedulaIdentidad = eCedulaIdentidad;
        this.eFechaIngreso = eFechaIngreso;
        this.eCargo = eCargo;
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    public String geteCargo() {
        return eCargo;
    }

    public void seteCargo(String eCargo) {
        this.eCargo = eCargo;
    }

    public String geteCedulaIdentidad() {
        return eCedulaIdentidad;
    }

    public void seteCedulaIdentidad(String eCedulaIdentidad) {
        this.eCedulaIdentidad = eCedulaIdentidad;
    }

    public String geteFechaIngreso() {
        return eFechaIngreso;
    }

    public void seteFechaIngreso(String eFechaIngreso) {
        this.eFechaIngreso = eFechaIngreso;
    }

    @Override
    public String getpDireccion() {
        return super.getpDireccion();
    }

    @Override
    public String getpNombre() {
        return super.getpNombre();
    }

    @Override
    public int getpNumero() {
        return super.getpNumero();
    }

    @Override
    public String getpTelefono() {
        return super.getpTelefono();
    }

    @Override
    public void setpDireccion(String pDireccion) {
        super.setpDireccion(pDireccion);
    }

    @Override
    public void setpNombre(String pNombre) {
        super.setpNombre(pNombre);
    }

    @Override
    public void setpNumero(int pNumero) {
        super.setpNumero(pNumero);
    }

    @Override
    public void setpTelefono(String pTelefono) {
        super.setpTelefono(pTelefono);
    }

    @Override
    public String toString() {
        return getpNombre();
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
