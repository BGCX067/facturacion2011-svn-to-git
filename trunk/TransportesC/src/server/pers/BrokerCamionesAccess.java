/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.pers;

import api.dom.Camion;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MAT
 */
public class BrokerCamionesAccess extends server.dom.Broker{
    
    public BrokerCamionesAccess(api.dom.Camion objCam) {
        super(objCam);
  }

    @Override
    public String getInsertCommand() {
        Camion cam =(Camion)this.getObjP();
        return "INSERT INTO CAMIONES(Matricula, Marca, Color, Ejes, Metros)" + "VALUES('"+ cam.getcMatricula() + "','" + cam.getcMarca()
                + "','" + cam.getcColor()+"',"+ cam.getcEjes() +","+cam.getcMetros() +")";
        
    }

    @Override
    public String getUpdateCommand() {
         Camion cam =(Camion)this.getObjP();
         return "UPDATE CAMIONES SET Marca='" + cam.getcMarca() + "',Color='" + cam.getcColor()
                    + "',Ejes="+cam.getcEjes() + ",Metros="+cam.getcMetros() + " WHERE Matricula='" + cam.getcMatricula()+"'";
            
    }

    @Override
    public String getDeleteCommand() {
         Camion cam =(Camion)this.getObjP();
         return "DELETE FROM CAMIONES " + " WHERE Matricula='" +cam.getcMatricula()+"'";
    }

    @Override
    public String getSelectCommand() {
        return "SELECT * FROM CAMIONES";
    }

    @Override
    public void obtenerDesdeResultSet(ResultSet rs, Object IPersistentej) {
        try {
                Camion cam=(Camion)IPersistentej;
		cam.setcMatricula(rs.getString("Matricula"));
                cam.setcMarca(rs.getString("Marca"));
                cam.setcColor(rs.getString("Color"));
                cam.setcEjes(rs.getInt("Ejes"));
		cam.setcMetros(rs.getDouble("Metros"));
                } catch (SQLException e) {
			System.out.println("ERROR AL OBTENER LOS CAMIONES");
		}
    }

    @Override
    public api.dom.IPersistente getNuevo() {
        return new Camion();
    }
    
    
}
