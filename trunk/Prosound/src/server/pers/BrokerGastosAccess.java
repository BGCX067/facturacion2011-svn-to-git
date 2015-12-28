/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.pers;

import api.dom.Gasto;
import api.dom.IPersistente;
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
         return "INSERT INTO GASTOS(gNumero,gFecha,gDesc,gImporte, gObservaciones)" 
                    + "VALUES("+ g.getgNumero() +",'" + g.getgFecha()+"','"+g.getgDesc()+
                  "',"+g.getgImporte()+ ",'" + g.getgObservaciones()+ "')";
    }

    @Override
    public String getUpdateCommand() {
        Gasto g = (Gasto)this.getObjP();
        return "UPDATE GASTOS SET gFecha='" + g.getgFecha()+ "',gDesc='"+ g.getgDesc()+"',gImporte="+g.getgImporte()+ ",gObservaciones='"+ g.getgObservaciones()+"' WHERE gNumero=" +g.getgNumero();
            
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
                g.setgDesc(rs.getString("gDesc"));
                g.setgImporte(rs.getDouble("gImporte"));
                g.setgObservaciones(rs.getString("gObservaciones"));
                } catch (SQLException e) {
			System.out.println("ERROR AL OBTENER LOS GASTOS");
		}
    }
     

    @Override
    public IPersistente getNuevo() {
        return new Gasto();
    }
    
    
    
}
