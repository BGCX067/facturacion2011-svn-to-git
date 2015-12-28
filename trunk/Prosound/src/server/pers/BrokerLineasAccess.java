/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.pers;

import api.dom.Articulos;
import api.dom.Factura;
import api.dom.IPersistente;
import api.dom.Lineas;
import api.gest.GestFactura;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MAT
 */
public class BrokerLineasAccess extends server.dom.Broker{

    public BrokerLineasAccess(api.dom.Lineas xObjEmp) {
        super(xObjEmp);
    }
    
       @Override
    public String getInsertCommand() {
         Lineas Lin = (Lineas)this.getObjP();
         return "INSERT INTO LINEAS(factNro,linNro,linArt,linCant)" 
                    + "VALUES("+ Lin.getFactNro().getfCod() +"," + Lin.getLinNro()+","+Lin.getLinArt()+
                  ","+ Lin.getLinCant()+")";
    }

    @Override
    public String getUpdateCommand() {
        Lineas Lin = (Lineas)this.getObjP();
        return "UPDATE LINEAS SET factNro='" + Lin.getFactNro().getfCod()+ "',linArt='"+Lin.getLinArt()+"',linCant="+Lin.getLinCant()+" WHERE linNro=" +Lin.getLinNro();
            
    }

    @Override
    public String getDeleteCommand() {
         Lineas Lin = (Lineas)this.getObjP();
        return "DELETE FROM LINEAS" + " WHERE linNro=" +Lin.getLinNro();
    }

    @Override
    public String getSelectCommand() {
        return "SELECT * FROM LINEAS";   
    }

    @Override
    public void obtenerDesdeResultSet(ResultSet rs, Object IPersistentej) {
          try {
                Lineas lin = (Lineas)IPersistentej;		
                lin.setLinNro(rs.getInt("linNro"));
		lin.setLinCant(rs.getInt("linCant"));
                lin.setLinArt(rs.getInt("linArt"));
                int numfac = (rs.getInt("factNro"));
                for (Factura objF : GestFactura.getInstance().devolverFacturas()){
                    if(objF.getfCod() == numfac){
                        lin.setFactNro(objF);
                    }
                }
                } catch (SQLException e) {
			System.out.println("ERROR AL OBTENER LAS LINEAS DE LAS FACTURAS");
		}
    }

    @Override
    public IPersistente getNuevo() {
        return new Lineas();
    }
    
    
}
