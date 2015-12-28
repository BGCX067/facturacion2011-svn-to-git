/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.dom;

import api.gest.GestCambio;
import java.util.ArrayList;
import server.dom.Broker;
import server.dom.FachadaBaseDeDatos;

/**
 *
 * @author Javier
 */
public class Cambio implements IPersistente {

    double dolares;
    double GasOil;
    int numero;
    Broker objBroker;

    public Cambio(double dolares, double Gasoil, int num) {
        this.numero = num;
        this.dolares = dolares;
        this.GasOil = Gasoil;
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    public Cambio() {
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    public double getDolares() {
        return dolares;
    }

    public void setDolares(double dolares) {
        this.dolares = dolares;
        //GestCambio.getInstance().modificarCambio(dolares);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getGasOil() {
        return GasOil;
    }

    public void setGasOil(double GasOil) {
        this.GasOil = GasOil;
    }
    
    

    @Override
    public void guardar() {
        this.objBroker.guardar();
    }

    @Override
    public void modificar() {
        this.objBroker.modificar();
    }

    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList obtenerTodos() {
        return this.objBroker.obtenerTodos();
    }
}
