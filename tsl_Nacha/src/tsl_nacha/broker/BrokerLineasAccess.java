/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsl_nacha.broker;

import java.sql.ResultSet;
import java.sql.SQLException;
import tsl_nacha.dominio.Articulos;
import tsl_nacha.dominio.Facturas;
import tsl_nacha.dominio.IPersistente;
import tsl_nacha.dominio.Lineas;
import tsl_nacha.gestoras.GestArticulos;
import tsl_nacha.persistencia.Broker;

/**
 *
 * @author MAT
 */
public class BrokerLineasAccess extends Broker{
    
    public BrokerLineasAccess(Lineas objL) {
        super(objL);
  }

    @Override
    public String getInsertCommand() {
        Lineas lin =(Lineas)this.getObjP();
        return "INSERT INTO LINEAS(lCorrelativo, lArticulo, lCantidad,lTotal,lNumFactura)" + "VALUES(" + lin.getlCorrelativo() + ",'" +lin.getObjArticulo().getaCodigo()
                + "'," + lin.getlCantidad()+ "," + lin.getlTotal()+ "," + lin.getlNumFactura() + ")";
        
    }

    @Override
    public String getUpdateCommand() {
         Lineas lin =(Lineas)this.getObjP();
         return "UPDATE LINEAS SET lCantidad= " + lin.getlCantidad() +", lTotal="+lin.getlTotal()+" WHERE lCorrelativo= " +lin.getlCorrelativo();
            
    }

    @Override
    public String getDeleteCommand() {
         Lineas lin =(Lineas)this.getObjP();
         return "DELETE FROM LINEAS " + " WHERE lCorrelativo=" +lin.getlCorrelativo()+"";
    }

    @Override
    public String getSelectCommand() {
        return "SELECT * FROM LINEAS";
    }

    @Override
    public void obtenerDesdeResultSet(ResultSet rs, Object IPersistentej) {
        try {
                Lineas lin=(Lineas)IPersistentej;
                lin.setlCorrelativo(Integer.parseInt(rs.getString("lCorrelativo")));
                String xCod = rs.getString("lArticulo");
                Articulos objA = GestArticulos.getInstance().devolverArticuloNumero(xCod);
                lin.setObjArticulo(objA);
                lin.setlCantidad(rs.getInt("lCantidad"));
                lin.setlTotal(rs.getDouble("lTotal"));
                lin.setlNumFactura(rs.getInt("lNumFactura"));
                } catch (SQLException e) {
			System.out.println("ERROR AL OBTENER LAS LINEAS");
		}
    }

    @Override
    public IPersistente getNuevo() {
        return new Lineas();
    }

    @Override
    public String getSelectCommand(int numfactura) {
         return "SELECT * FROM LINEAS WHERE lNumFactura=" +numfactura+"";
    }
    
    
}
