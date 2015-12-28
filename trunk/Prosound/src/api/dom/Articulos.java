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
public class Articulos implements IPersistente {
    private int artCod;
    private String artNom;
    private String artDesc;
    private double artPrecio;
    private int artStock;
    Broker objBroker;

    public Articulos() {
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    public Articulos(int artCod, String artNom, String artDesc, double artPrecio, int artStock) {
        this.artCod = artCod;
        this.artNom = artNom;
        this.artDesc = artDesc;
        this.artPrecio = artPrecio;
        this.artStock = artStock;
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    public int getArtCod() {
        return artCod;
    }

    public void setArtCod(int artCod) {
        this.artCod = artCod;
    }

    public String getArtDesc() {
        return artDesc;
    }

    public void setArtDesc(String artDesc) {
        this.artDesc = artDesc;
    }

    public String getArtNom() {
        return artNom;
    }

    public void setArtNom(String artNom) {
        this.artNom = artNom;
    }

    public double getArtPrecio() {
        return artPrecio;
    }

    public void setArtPrecio(double artPrecio) {
        this.artPrecio = artPrecio;
    }

    public int getArtStock() {
        return artStock;
    }

    public void setArtStock(int artStock) {
        this.artStock = artStock;
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
