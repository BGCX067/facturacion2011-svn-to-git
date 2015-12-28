/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsl_nacha.broker;

import java.sql.ResultSet;
import java.sql.SQLException;
import tsl_nacha.dominio.Articulos;
import tsl_nacha.dominio.Categorias;
import tsl_nacha.dominio.IPersistente;
import tsl_nacha.gestoras.GestCategorias;
import tsl_nacha.persistencia.Broker;

/**
 *
 * @author MAT
 */
public class BrokerArticulosAccess extends Broker{
    
    public BrokerArticulosAccess(Articulos objA) {
        super(objA);
  }

    @Override
    public String getInsertCommand() {
        Articulos art =(Articulos)this.getObjP();
        return "INSERT INTO ARTICULOS(aCodigo, aDescripcio, aTalle, objCategoria, aColor, aStock, aPrecio)" + "VALUES('" + art.getaCodigo() + "','" + art.getaDescripcion()
                + "','" + art.getaTalle() + "'," + art.getObjCategoria().getcNumero() + ",'" + art.getaColor() + "'," + art.getaStock() + "," + art.getaPrecio() + ")";
        
    }

    @Override
    public String getUpdateCommand() {
         Articulos art =(Articulos)this.getObjP();
         return "UPDATE ARTICULOS SET aDescripcio='" + art.getaDescripcion() + "',aTalle='"+art.getaTalle()+"',objCategoria="+art.getObjCategoria().getcNumero()
                    +",aColor='"+art.getaColor()+"',aStock="+art.getaStock()+",aPrecio="+art.getaPrecio()+" WHERE aCodigo='" +art.getaCodigo()+"'";
            
    }

    @Override
    public String getDeleteCommand() {
         Articulos art =(Articulos)this.getObjP();
         return "DELETE FROM ARTICULOS " + " WHERE aCodigo='" +art.getaCodigo()+"'";
    }

    @Override
    public String getSelectCommand() {
        return "SELECT * FROM ARTICULOS";
    }

    @Override
    public void obtenerDesdeResultSet(ResultSet rs, Object IPersistentej) {
        try {
                Articulos art=(Articulos)IPersistentej;
		art.setaCodigo(rs.getString("aCodigo"));
                art.setaDescripcion(rs.getString("aDescripcio"));
                art.setaTalle(rs.getString("aTalle"));
                Categorias objC = GestCategorias.getInstance().devolverCategoriaNumero(Integer.parseInt(rs.getString("objCategoria")));
                art.setObjCategoria(objC);
                art.setaColor(rs.getString("aColor"));
                art.setaStock(Integer.parseInt(rs.getString("aStock")));
                art.setaPrecio(Integer.parseInt(rs.getString("aPrecio")));
                } catch (SQLException e) {
			System.out.println("ERROR AL OBTENER LOS CAMIONES");
		}
    }

    @Override
    public IPersistente getNuevo() {
        return new Articulos();
    }

    @Override
    public String getSelectCommand(int numfactura) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
