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
public class Cliente implements IPersistente {
    private int cliCod;
    private String cliNom;
    private String cliFing;
    private String cliRut;
    private String cliTel;
    private String cliDire;
    Broker objBroker;
    
    public Cliente() {
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    public Cliente(int cliCod, String cliNom, String cliFing, String cliRut, String cliTel, String cliDire) {
        this.cliCod = cliCod;
        this.cliNom = cliNom;
        this.cliFing = cliFing;
        this.cliRut = cliRut;
        this.cliTel = cliTel;
        this.cliDire = cliDire;
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    public int getCliCod() {
        return cliCod;
    }

    public void setCliCod(int cliCod) {
        this.cliCod = cliCod;
    }

    public String getCliFing() {
        return cliFing;
    }

    public void setCliFing(String cliFing) {
        this.cliFing = cliFing;
    }

    public String getCliNom() {
        return cliNom;
    }

    public void setCliNom(String cliNom) {
        this.cliNom = cliNom;
    }

    public String getCliRut() {
        return cliRut;
    }

    public void setCliRut(String cliRut) {
        this.cliRut = cliRut;
    }

    public String getCliDire() {
        return cliDire;
    }

    public void setCliDire(String cliDire) {
        this.cliDire = cliDire;
    }

    public String getCliTel() {
        return cliTel;
    }

    public void setCliTel(String cliTel) {
        this.cliTel = cliTel;
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
    public String toString() {
        return cliNom;
    }
    
    
   
    
    

    
    
}
