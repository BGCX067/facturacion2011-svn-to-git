/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.pers;

import api.dom.Cambio;
import api.dom.Camion;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MAT
 */
public class BrokerCambioAccess extends server.dom.Broker{
    
    public BrokerCambioAccess(api.dom.Cambio objCam) {
        super(objCam);
  }

    @Override
    public String getInsertCommand() {
        Cambio cam =(Cambio)this.getObjP();
        return "INSERT INTO CAMBIO(Dolar, Peso)" + "VALUES("+ cam.getDolares() +")";
        
    }

    @Override
    public String getUpdateCommand() {
        Cambio cam =(Cambio)this.getObjP();
         return "UPDATE CAMBIO SET Dolar="+ cam.getDolares()+ ",GasOil="+ cam.getGasOil()+  " WHERE Num=" +1;
            
    }

    @Override
    public String getDeleteCommand() {
        return "";
    }

    @Override
    public String getSelectCommand() {
        return "SELECT * FROM CAMBIO";
    }

    @Override
    public void obtenerDesdeResultSet(ResultSet rs, Object IPersistentej) {
        try {
               Cambio cam =(Cambio)IPersistentej;
                    cam.setDolares(rs.getDouble("Dolar"));
                    cam.setGasOil(rs.getDouble("GasOil"));
                    cam.setNumero(rs.getInt("Num"));
             
                
                } catch (SQLException e) {
			System.out.println("ERROR AL OBTENER LAs CONFIGURACIONES");
		}
    }

    @Override
    public api.dom.IPersistente getNuevo() {
        return new Cambio();
    }
    
    
}
