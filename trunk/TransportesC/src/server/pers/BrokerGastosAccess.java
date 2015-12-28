/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.pers;

import api.dom.Camion;
import api.dom.Factura;
import api.dom.Gasto;
import api.dom.IPersistente;
import api.gest.GestCamiones;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MAT
 */
public class BrokerGastosAccess extends server.dom.Broker{

    public BrokerGastosAccess(Gasto objG) {
       super(objG);
    }
   

    @Override
    public String getInsertCommand() {
         Gasto g = (Gasto)this.getObjP();
         return "INSERT INTO GASTOS(gNumero,gFecha,gRubro,gImporte, gLitros, CamNro)" 
                    + "VALUES("+ g.getgNumero() +",'" + g.getgFecha()+"','"+g.getgRubro()+
                  "',"+g.getgImporte()+ "," + g.getgLitros()+ ",'"+ g.getObjCamion().getcMatricula()+ "')";
    }

    @Override
    public String getUpdateCommand() {
        Gasto g = (Gasto)this.getObjP();
        return "UPDATE GASTOS SET gFecha='" + g.getgFecha()+ "',gRubro='"+ g.getgRubro()+"',gImporte="+g.getgImporte()+ ",gLitros="+ g.getgLitros()+",CamNro='"+g.getObjCamion().getcMatricula() +"' WHERE gNumero=" +g.getgNumero();
            
    }

    @Override
    public String getDeleteCommand() {
        Gasto g = (Gasto)this.getObjP();
        return "DELETE FROM GASTOS" + " WHERE gNumero=" +g.getgNumero();
    }

    @Override
    public String getSelectCommand() {
        return "SELECT * FROM GASTOS";   
    }

    @Override
    public void obtenerDesdeResultSet(ResultSet rs, Object IPersistentej) {
        try {
                Gasto g = (Gasto)IPersistentej;
		
                g.setgNumero(rs.getInt("gNumero"));
		g.setgFecha(rs.getString("gFecha"));
                g.setgRubro(rs.getString("gRubro"));
                g.setgImporte(rs.getDouble("gImporte"));
                g.setgLitros(rs.getDouble("gLitros"));
                String numcam = (rs.getString("CamNro"));
                for (Camion objCam : GestCamiones.getInstance().devolverCamiones()){
                    if(objCam.getcMatricula() == null ? numcam == null : objCam.getcMatricula().equals(numcam)){
                        g.setObjCamion(objCam);
                    }
                }
                } catch (SQLException e) {
			System.out.println("ERROR AL OBTENER LOS GASTOS");
		}
    }
     

    @Override
    public IPersistente getNuevo() {
        return new Gasto();
    }
    
    
    
}
