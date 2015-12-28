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
public class Pagos implements IPersistente {
    
    private int idPago;
    private Cuentas idCuenta;
    private int Monto;
    private String FechaEntrega;
    Broker objBroker;

    public String getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(String FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    public Cuentas getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Cuentas idCuenta) {
        this.idCuenta = idCuenta;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public Pagos(int idPago, Cuentas idCuenta, int Monto, String FechaEntrega) {
        this.idPago = idPago;
        this.idCuenta = idCuenta;
        this.Monto = Monto;
        this.FechaEntrega = FechaEntrega;
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }
    
    public Pagos(){
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    @Override
    public void guardar() {
      objBroker.guardar();
    }

    @Override
    public void modificar() {
        throw new UnsupportedOperationException("Not supported yet.");
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
