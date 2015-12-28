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
public class Factura implements IPersistente {
    private int fNumero;
    private String fFecha;
    private String fMoneda;
    private double ftipoCambio;
    private String fLugarCarga;
    private String fLugarDescarga;
    private int fKilometros;
    private int fGrupoMetros;
    private int fCantBultos;
    private int fCantAnimales;
    private String fGuia;
    private int fImporte;
    private Cliente objCliente;
    private Empleado objEmpleado;
    private Camion objCamion;
    private int fKilometrosRetorno;
    private String fObservaciones;
    private int fSaldo;
    Broker objBroker;

    public Factura() {
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    public Factura(int fNumero, String fFecha, String fmoneda, double ftipoc, String fLugarCarga
            , String fLugarDescarga, int fKilometros, int fGrupoMetros, int fCantBultos
            , int fCantAnimales, String fGuia, int fImporte, Cliente objCliente, Empleado objEmpleado
            , Camion objCamion, int fKilometrosR, String fObservaciones, int saldo) {
        
        this.fNumero = fNumero;
        this.fFecha = fFecha;
        this.fMoneda = fmoneda;
        this.ftipoCambio = ftipoc;
        this.fLugarCarga = fLugarCarga;
        this.fLugarDescarga = fLugarDescarga;
        this.fKilometros = fKilometros;
        this.fGrupoMetros = fGrupoMetros;
        this.fCantBultos = fCantBultos;
        this.fCantAnimales = fCantAnimales;
        this.fGuia = fGuia;
        this.fImporte = fImporte;
        this.objCliente = objCliente;
        this.objEmpleado = objEmpleado;
        this.objCamion = objCamion;
        this.fKilometrosRetorno = fKilometrosR;
        this.fObservaciones = fObservaciones;
        this.fSaldo = saldo;
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

     public Factura(int fNumero, String fFecha, String fmoneda, double ftipoc, String fLugarCarga
            , String fLugarDescarga, int fKilometros, int fGrupoMetros, int fCantBultos
            , int fCantAnimales, String fGuia, int fImporte, Cliente objCliente, Empleado objEmpleado
            , Camion objCamion, int fKilometrosR, String fObservaciones) {
        
        this.fNumero = fNumero;
        this.fFecha = fFecha;
        this.fMoneda = fmoneda;
        this.ftipoCambio = ftipoc;
        this.fLugarCarga = fLugarCarga;
        this.fLugarDescarga = fLugarDescarga;
        this.fKilometros = fKilometros;
        this.fGrupoMetros = fGrupoMetros;
        this.fCantBultos = fCantBultos;
        this.fCantAnimales = fCantAnimales;
        this.fGuia = fGuia;
        this.fImporte = fImporte;
        this.objCliente = objCliente;
        this.objEmpleado = objEmpleado;
        this.objCamion = objCamion;
        this.fKilometrosRetorno = fKilometrosR;
        this.fObservaciones = fObservaciones;

        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }
    
    public String getfMoneda() {
        return fMoneda;
    }

    public void setfMoneda(String fMoneda) {
        this.fMoneda = fMoneda;
    }

    public double getFtipoCambio() {
        return ftipoCambio;
    }

    public void setFtipoCambio(double ftipoCambio) {
        this.ftipoCambio = ftipoCambio;
    }

    
     public int getfCantAnimales() {
        return fCantAnimales;
    }

    public void setfCantAnimales(int fCantAnimales) {
        this.fCantAnimales = fCantAnimales;
    }

    public int getfCantBultos() {
        return fCantBultos;
    }

    public void setfCantBultos(int fCantBultos) {
        this.fCantBultos = fCantBultos;
    }

    public String getfFecha() {
        return fFecha;
    }

    public void setfFecha(String fFecha) {
        this.fFecha = fFecha;
    }

    public int getfGrupoMetros() {
        return fGrupoMetros;
    }

    public void setfGrupoMetros(int fGrupoMetros) {
        this.fGrupoMetros = fGrupoMetros;
    }

    public String getfGuia() {
        return fGuia;
    }

    public void setfGuia(String fGuia) {
        this.fGuia = fGuia;
    }

    public int getfImporte() {
        return fImporte;
    }

    public void setfImporte(int fImporte) {
        this.fImporte = fImporte;
    }

    public int getfKilometros() {
        return fKilometros;
    }

    public void setfKilometros(int fKilometros) {
        this.fKilometros = fKilometros;
    }

    public String getfLugarCarga() {
        return fLugarCarga;
    }

    public void setfLugarCarga(String fLugarCarga) {
        this.fLugarCarga = fLugarCarga;
    }

    public String getfLugarDescarga() {
        return fLugarDescarga;
    }

    public void setfLugarDescarga(String fLugarDescarga) {
        this.fLugarDescarga = fLugarDescarga;
    }

    public int getfNumero() {
        return fNumero;
    }

    public void setfNumero(int fNumero) {
        this.fNumero = fNumero;
    }

    public Camion getObjCamion() {
        return objCamion;
    }

    public void setObjCamion(Camion objCamion) {
        this.objCamion = objCamion;
    }

    public Cliente getObjCliente() {
        return objCliente;
    }

    public void setObjCliente(Cliente objCliente) {
        this.objCliente = objCliente;
    }

    public Empleado getObjEmpleado() {
        return objEmpleado;
    }

    public void setObjEmpleado(Empleado objEmpleado) {
        this.objEmpleado = objEmpleado;
    }

    public int getfKilometrosRetorno() {
        return fKilometrosRetorno;
    }

    public void setfKilometrosRetorno(int fKilometrosRetorno) {
        this.fKilometrosRetorno = fKilometrosRetorno;
    }

    public String getfObservaciones() {
        return fObservaciones;
    }

    public void setfObservaciones(String fObservaciones) {
        this.fObservaciones = fObservaciones;
    }

    public int getfSaldo() {
        return fSaldo;
    }

    public void setfSaldo(int fSaldo) {
        this.fSaldo = fSaldo;
    }
    
    
    

    @Override
    public String toString() {
        return "Factura{" + "fNumero=" + fNumero + ", fFecha=" + fFecha + 
                ", fMoneda=" + fMoneda + ", fLugarCarga=" + fLugarCarga + ", fLugarDescarga="
                + fLugarDescarga + ", fKilometros=" + fKilometros + ", fGrupoMetros=" + fGrupoMetros +
                ", fCantBultos=" + fCantBultos + ", fCantAnimales=" + fCantAnimales + ", fGuia=" + fGuia + 
                ", fImporte=" + fImporte + ", objCliente=" + objCliente + ", objEmpleado=" + objEmpleado + ""
                + ", objCamion=" + objCamion + '}';
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
