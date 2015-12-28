/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.dom;

import api.gest.GestCliente;
import java.util.ArrayList;
import server.dom.Broker;
import server.dom.FachadaBaseDeDatos;

/**
 *
 * @author Javs
 */
public class Cliente extends Persona implements IPersistente {
    private String cDicose;
    private String cRut;
    Broker objBroker;
    
    public Cliente() {
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    
    public Cliente(String cDicose, String cRut, int pNumero, String pNombre, String pDireccion, String pTelefono) {
        super(pNumero, pNombre, pDireccion, pTelefono);
        this.cDicose = cDicose;
        this.cRut = cRut;
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
        
    }

    public String getcDicose() {
        return cDicose;
    }

    public void setcDicose(String cDicose) {
        this.cDicose = cDicose;
    }

    public String getcRut() {
        return cRut;
    }

    public void setcRut(String cRut) {
        this.cRut = cRut;
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
