/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsl_nacha.broker;

import java.sql.ResultSet;
import java.sql.SQLException;
import tsl_nacha.dominio.Cambio;
import tsl_nacha.dominio.IPersistente;
import tsl_nacha.persistencia.Broker;

/**
 *
 * @author MAT
 */
public class BrokerCambioAccess extends Broker{
    
    public BrokerCambioAccess(Cambio objCam) {
        super(objCam);
  }

    @Override
    public String getInsertCommand() {
        Cambio cam =(Cambio)this.getObjP();
        return "INSERT INTO CAMBIO(iva)" + "VALUES("+ cam.getiva() +")";
        
    }

    @Override
    public String getUpdateCommand() {
        Cambio cam =(Cambio)this.getObjP();
         return "UPDATE CAMBIO SET iva="+ cam.getiva()+ " WHERE Num=" +1;
            
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
               cam.setNum(rs.getInt("Num"));
                    cam.setiva(rs.getDouble("iva"));
             
                
                } catch (SQLException e) {
			System.out.println("ERROR AL OBTENER LAs CONFIGURACIONES");
		}
    }

    @Override
    public IPersistente getNuevo() {
        return new Cambio();
    }

    @Override
    public String getSelectCommand(int numfactura) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
