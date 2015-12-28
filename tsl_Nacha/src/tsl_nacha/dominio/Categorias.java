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
public class Categorias implements IPersistente {
    
   private int cNumero;
   private String cNombre;
   Broker objBroker;

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

    public Categorias(int cNumero, String cNombre) {
        this.cNumero = cNumero;
        this.cNombre = cNombre;
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }
    
    public Categorias() {
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    @Override
    public String toString() {
        return cNombre;
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
        throw new UnsupportedOperationException("Not supported yet.");
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
