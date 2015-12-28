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
public class Articulos implements IPersistente {
    
    private String aCodigo;
    private String aDescripcion;
    private String aTalle;
    private Categorias objCategoria;
    private String aColor;
    private int aStock;
    private int aPrecio;
    Broker objBroker;

   

    public int getaPrecio() {
        return aPrecio;
    }

    public void setaPrecio(int aPrecio) {
        this.aPrecio = aPrecio;
    }

    public String getaCodigo() {
        return aCodigo;
    }

    public void setaCodigo(String aCodigo) {
        this.aCodigo = aCodigo;
    }

 

    public String getaColor() {
        return aColor;
    }

    public void setaColor(String aColor) {
        this.aColor = aColor;
    }

    public String getaDescripcion() {
        return aDescripcion;
    }

    public void setaDescripcion(String aDescripcion) {
        this.aDescripcion = aDescripcion;
    }

    public int getaStock() {
        return aStock;
    }

    public void setaStock(int aStock) {
        this.aStock = aStock;
    }

    public String getaTalle() {
        return aTalle;
    }

    public void setaTalle(String aTalle) {
        this.aTalle = aTalle;
    }

    public Categorias getObjCategoria() {
        return objCategoria;
    }

    public void setObjCategoria(Categorias objCategoria) {
        this.objCategoria = objCategoria;
    }

    public Articulos(String aCodigo, String aDescripcion, String aTalle, Categorias objCategoria, String aColor, int aStock, int aPrecio) {
        this.aCodigo = aCodigo;
        this.aDescripcion = aDescripcion;
        this.aTalle = aTalle;
        this.objCategoria = objCategoria;
        this.aColor = aColor;
        this.aStock = aStock;
        this.aPrecio = aPrecio;
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    @Override
    public String toString() {
        return "Articulos{" + "aCodigo=" + aCodigo + ", aDescripcion=" + aDescripcion + ", aTalle=" + aTalle + ", objCategoria=" + objCategoria + ", aColor=" + aColor + ", aStock=" + aStock + '}';
    }
    
    public boolean aumentarStock(int i){
        this.aStock = this.aStock + i;
        this.modificar();
        return true;
    }
    
    public boolean restarStock(int i){
        this.aStock = this.aStock - i;
        this.modificar();
        return true;
    }
        
    public Articulos() {
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
    public ArrayList obtenerTodos() {
        return objBroker.obtenerTodos();
    }

    @Override
    public ArrayList obtenerTodos(int numero) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
