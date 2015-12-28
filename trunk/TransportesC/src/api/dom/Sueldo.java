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
 * @author Enrico
 */
public class Sueldo implements IPersistente {
    private int SueldoNumero;
    private String FechaPago;
    private String FechaInicio;
    private String FechaFin;
    private String CorrespondienteA;
    private int Km;
    private double PrecioKm;
    private int KmRetorno;
    private double PrecioKmRetorno;
    private int Sueldo;
    private double Facturado;
    private Empleado objE;
        Broker objBroker;

    public Sueldo() {
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    public Empleado getObjE() {
        return objE;
    }

    public void setObjE(Empleado objE) {
        this.objE = objE;
    }

    public double getPrecioKmRetorno() {
        return PrecioKmRetorno;
    }

    public void setPrecioKmRetorno(double PrecioKmRetorno) {
        this.PrecioKmRetorno = PrecioKmRetorno;
    }

    public int getSueldoNumero() {
        return SueldoNumero;
    }

    public void setSueldoNumero(int SueldoNumero) {
        this.SueldoNumero = SueldoNumero;
    }

    public String getCorrespondienteA() {
        return CorrespondienteA;
    }

    public void setCorrespondienteA(String CorrespondienteA) {
        this.CorrespondienteA = CorrespondienteA;
    }

    public String getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(String FechaFin) {
        this.FechaFin = FechaFin;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public String getFechaPago() {
        return FechaPago;
    }

    public void setFechaPago(String FechaPago) {
        this.FechaPago = FechaPago;
    }

    public double getFacturado() {
        return Facturado;
    }

    public void setFacturado(double facturado) {
        this.Facturado = facturado;
    }

    public int getKm() {
        return Km;
    }

    public void setKm(int Km) {
        this.Km = Km;
    }

    public int getKmRetorno() {
        return KmRetorno;
    }

    public void setKmRetorno(int KmRetorno) {
        this.KmRetorno = KmRetorno;
    }

    public double getPrecioKm() {
        return PrecioKm;
    }

    public void setPrecioKm(double PrecioKm) {
        this.PrecioKm = PrecioKm;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    public Sueldo(int SueldoNumero, String FechaPago, String FechaInicio, String FechaFin, String CorrespondienteA, int Km, double PrecioKm, int KmRetorno, double PrecioKmRetorno, int Sueldo, double fact, Empleado objE) {
        this.SueldoNumero = SueldoNumero;
        this.FechaPago = FechaPago;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.CorrespondienteA = CorrespondienteA;
        this.Km = Km;
        this.PrecioKm = PrecioKm;
        this.KmRetorno = KmRetorno;
        this.PrecioKmRetorno = PrecioKmRetorno;
        this.Sueldo = Sueldo;
        this.Facturado = fact;
        this.objE = objE;
        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
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
       this.objBroker.eliminar();
    }

    @Override
    public ArrayList obtenerTodos() {
        return objBroker.obtenerTodos();
    }
    
}
