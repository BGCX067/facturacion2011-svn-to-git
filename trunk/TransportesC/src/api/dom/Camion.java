/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.dom;

import java.util.ArrayList;
import javax.xml.soap.Text;
import server.dom.Broker;
import server.dom.FachadaBaseDeDatos;

/**
 *
 * @author Enrico
 */
public class Camion implements IPersistente {    
private String cMatricula;
private String cMarca;
private String cColor;
private int cEjes;
private Double cMetros;
Broker objBroker;

    public String getcColor() {
        return cColor;
    }

    public void setcColor(String cColor) {
        this.cColor = cColor;
    }

    public int getcEjes() {
        return cEjes;
    }

    public void setcEjes(int cEjes) {
        this.cEjes = cEjes;
    }

    public String getcMarca() {
        return cMarca;
    }

    public void setcMarca(String cMarca) {
        this.cMarca = cMarca;
    }

    public String getcMatricula() {
        return cMatricula;
    }

    public void setcMatricula(String cMatricula) {
        this.cMatricula = cMatricula;
    }

    public Double getcMetros() {
        return cMetros;
    }

    public void setcMetros(Double cMetros) {
        this.cMetros = cMetros;
    }

    public Camion(String cMatricula, String cMarca, String cColor, int cEjes, Double cMetros) {
        this.cMatricula = cMatricula;
        this.cMarca = cMarca;
        this.cColor = cColor;
        this.cEjes = cEjes;
        this.cMetros = cMetros;
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }
    
        public Camion() {
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
    public String toString() {
        return "Mat: " + cMatricula + "   Marca: " + cMarca;
    }
    
    


}
