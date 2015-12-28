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
public class Lineas implements IPersistente {
    private Factura factNro;
    private int linNro;
    private int linArt;
    private int linCant;
    Broker objBroker;
    
    public Lineas() {
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    public Lineas(Factura factNro, int linNro, int linArt, int linCant) {
        this.factNro = factNro;
        this.linNro = linNro;
        this.linArt = linArt;
        this.linCant = linCant;
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    public Factura getFactNro() {
        return factNro;
    }

    public void setFactNro(Factura factNro) {
        this.factNro = factNro;
    }

    public int getLinArt() {
        return linArt;
    }

    public void setLinArt(int linArt) {
        this.linArt = linArt;
    }

    public int getLinCant() {
        return linCant;
    }

    public void setLinCant(int linCant) {
        this.linCant = linCant;
    }

    public int getLinNro() {
        return linNro;
    }

    public void setLinNro(int linNro) {
        this.linNro = linNro;
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
