/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.dom;

import server.dom.Broker;
import server.dom.FachadaBaseDeDatos;

/**
 *
 * @author Javs
 */
public abstract class Persona{
    private int pNumero;
    private String pNombre;
    private String pDireccion;
    private String pTelefono;
//    Broker objBroker;

    public Persona() {
        //CONTRUCTOR PARA CARGAR EL BROKER DE PERSONA
//       objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    public Persona(int pNumero, String pNombre, String pDireccion, String pTelefono) {
        this.pNumero = pNumero;
        this.pNombre = pNombre;
        this.pDireccion = pDireccion;
        this.pTelefono = pTelefono;
//        objBroker = FachadaBaseDeDatos.getInstance().obtenerBroker(this);
    }

    
    public String getpDireccion() {
        return pDireccion;
    }

    public void setpDireccion(String pDireccion) {
        this.pDireccion = pDireccion;
    }

    public String getpNombre() {
        return pNombre;
    }

    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }

    public int getpNumero() {
        return pNumero;
    }

    public void setpNumero(int pNumero) {
        this.pNumero = pNumero;
    }

    public String getpTelefono() {
        return pTelefono;
    }

    public void setpTelefono(String pTelefono) {
        this.pTelefono = pTelefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "pNumero=" + pNumero + ", pNombre=" + pNombre + ", pDireccion=" + pDireccion + ", pTelefono=" + pTelefono + '}';
    }

    
    
    
    
    
}
