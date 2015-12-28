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
 * @author Javier
 */
public class Cambio implements IPersistente {
    int num;
    double iva;
    Broker objBroker;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    

    public Cambio( int num, double iva) {
        this.num = num;
        this.iva = iva;
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    public Cambio() {
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    public double getiva() {
        return iva;
    }

    public void setiva(double iva) {
        this.iva = iva;
        //GestCambio.getInstance().modificarCambio(dolares);
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

    @Override
    public ArrayList obtenerTodos(int numero) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
