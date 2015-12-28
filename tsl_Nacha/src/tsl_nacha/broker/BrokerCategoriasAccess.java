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
public class BrokerCategoriasAccess extends Broker{
    
    public BrokerCategoriasAccess(Categorias objA) {
        super(objA);
  }

    @Override
    public String getInsertCommand() {
        Categorias cat =(Categorias)this.getObjP();
        return "INSERT INTO CATEGORIAS(cNumero, cNombre)" + "VALUES(" + cat.getcNumero() + ",'" + cat.getcNombre() +"')";
        
    }

    @Override
    public String getUpdateCommand() {
         Categorias cat =(Categorias)this.getObjP();
         return "UPDATE CATEGORIAS SET cNombre='" + cat.getcNombre() + "' WHERE cNumero=" +cat.getcNumero();
            
    }

    @Override
    public String getDeleteCommand() {
         Categorias cat =(Categorias)this.getObjP();
         return "DELETE FROM Categorias " + " WHERE cNumero='" +cat.getcNumero()+"'";
    }

    @Override
    public String getSelectCommand() {
        return "SELECT * FROM Categorias";
    }

    @Override
    public void obtenerDesdeResultSet(ResultSet rs, Object IPersistentej) {
        try {
                Categorias cat=(Categorias)IPersistentej;
		cat.setcNumero(Integer.parseInt(rs.getString("cNumero")));
                cat.setcNombre(rs.getString("cNombre"));
                } catch (SQLException e) {
			System.out.println("ERROR AL OBTENER LOS CAMIONES");
		}
    }

    @Override
    public IPersistente getNuevo() {
        return new Categorias();
    }

    @Override
    public String getSelectCommand(int numfactura) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
