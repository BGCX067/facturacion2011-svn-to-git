/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.pers;

import api.dom.Articulos;
import api.dom.IPersistente;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MAT
 */
public class BrokerArticulosAccess extends server.dom.Broker{

    public BrokerArticulosAccess(api.dom.Articulos xObjEmp) {
        super(xObjEmp);
    }
    
       @Override
    public String getInsertCommand() {
         Articulos Art = (Articulos)this.getObjP();
         return "INSERT INTO ARTICULOS(artCod,artNom,artDesc,artPrecio,artStock)" 
                    + "VALUES("+ Art.getArtCod() +",'" + Art.getArtNom()+"','"+Art.getArtDesc()+
                  "',"+Art.getArtPrecio()+","+Art.getArtStock()+")";
    }

    @Override
    public String getUpdateCommand() {
        Articulos Art = (Articulos)this.getObjP();
        return "UPDATE ARTICULOS SET artNom='" + Art.getArtNom()+ "',artDesc='"+Art.getArtDesc()+"',artPrecio="+Art.getArtPrecio()
                    +",artStock="+Art.getArtStock()+" WHERE artCod=" +Art.getArtCod();
            
    }

    @Override
    public String getDeleteCommand() {
         Articulos Emp = (Articulos)this.getObjP();
        return "DELETE FROM ARTICULOS" + " WHERE artCod=" +Emp.getArtCod();
    }

    @Override
    public String getSelectCommand() {
        return "SELECT * FROM ARTICULOS";   
    }

    @Override
    public void obtenerDesdeResultSet(ResultSet rs, Object IPersistentej) {
          try {
                Articulos Art = (Articulos)IPersistentej;
		
                Art.setArtCod(rs.getInt("artCod"));
		Art.setArtNom(rs.getString("artNom"));
                Art.setArtDesc(rs.getString("artDesc"));
                Art.setArtPrecio(rs.getDouble("artPrecio"));
                Art.setArtStock(rs.getInt("artStock"));
                } catch (SQLException e) {
			System.out.println("ERROR AL OBTENER LOS ARTICULOS");
		}
    }

    @Override
    public IPersistente getNuevo() {
        return new Articulos();
    }
    
    
}
