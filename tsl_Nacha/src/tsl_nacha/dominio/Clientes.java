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
public class Clientes implements IPersistente {
    
    private int cNumero; 
    private String cNombre;
    private String cDireccion;
    private String cTelefono;
    Broker objBroker;
    

    public String getcDireccion() {
        return cDireccion;
    }

    public void setcDireccion(String cDireccion) {
        this.cDireccion = cDireccion;
    }

    public String getcNombre() {
        return cNombre;
    }

    public void setcNombre(String cNombre) {
        this.cNombre = cNombre;
    }

    public int getcNumero() {
        return cNumero;
    }

    public void setcNumero(int cNumero) {
        this.cNumero = cNumero;
    }

    public String getcTelefono() {
        return cTelefono;
    }

    public void setcTelefono(String cTelefono) {
        this.cTelefono = cTelefono;
    }

    public Clientes(int cNumero, String cNombre, String cDireccion, String cTelefono) {
        this.cNumero = cNumero;
        this.cNombre = cNombre;
        this.cDireccion = cDireccion;
        this.cTelefono = cTelefono;
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }
    
    public Clientes(){
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    @Override
    public String toString() {
        return cNombre + "--" + cDireccion;
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

    @Override
    public ArrayList obtenerTodos(int numero) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
}
