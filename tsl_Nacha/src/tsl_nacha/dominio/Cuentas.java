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
public class Cuentas implements IPersistente {
    private int idCuenta;
    private Clientes objCliente;
    private double Saldo;
    private String fechaUltimaEntrega;
    private Boolean Estado;
    Broker objBroker;

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getFechaUltimaEntrega() {
        return fechaUltimaEntrega;
    }

    public void setFechaUltimaEntrega(String fechaUltimaEntrega) {
        this.fechaUltimaEntrega = fechaUltimaEntrega;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Clientes getObjCliente() {
        return objCliente;
    }

    public void setObjCliente(Clientes objCliente) {
        this.objCliente = objCliente;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean Estado) {
        this.Estado = Estado;
    }

    
    public Cuentas(int idCuenta, Clientes objCliente, double Saldo, String fechaUltimaEntrega, boolean Estado) {
        this.idCuenta = idCuenta;
        this.objCliente = objCliente;
        this.Saldo = Saldo;
        this.fechaUltimaEntrega = fechaUltimaEntrega;
        this.Estado = Estado;
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    public Cuentas() {
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
