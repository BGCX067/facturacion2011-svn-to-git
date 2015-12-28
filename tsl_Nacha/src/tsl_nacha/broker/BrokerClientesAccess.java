/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsl_nacha.broker;

import java.sql.ResultSet;
import java.sql.SQLException;

import tsl_nacha.dominio.Categorias;
import tsl_nacha.dominio.Clientes;
import tsl_nacha.dominio.IPersistente;

import tsl_nacha.persistencia.Broker;

/**
 *
 * @author MAT
 */
public class BrokerClientesAccess extends Broker{
    
    public BrokerClientesAccess(Clientes objA) {
        super(objA);
  }

    @Override
    public String getInsertCommand() {
        Clientes cli =(Clientes)this.getObjP();
        return "INSERT INTO CLIENTES(cNumero, cNombre, cDireccion, cTelefono)" + "VALUES(" + cli.getcNumero() + ",'" + cli.getcNombre() + "','" + cli.getcDireccion() + "','" + cli.getcTelefono() +"')";
        
    }

    @Override
    public String getUpdateCommand() {
         Clientes cli =(Clientes)this.getObjP();
         return "UPDATE CLIENTES SET cNombre='" +cli.getcNombre() + "', cDireccion='" + cli.getcDireccion() + "', cTelefono='" + cli.getcTelefono() + "' WHERE cNumero=" +cli.getcNumero();
            
    }

    @Override
    public String getDeleteCommand() {
         Clientes cli =(Clientes)this.getObjP();
         return "DELETE FROM CLIENTES " + " WHERE cNumero=" +cli.getcNumero()+"";
    }

    @Override
    public String getSelectCommand() {
        return "SELECT * FROM CLIENTES";
    }

    @Override
    public void obtenerDesdeResultSet(ResultSet rs, Object IPersistentej) {
        try {
                Clientes cli=(Clientes)IPersistentej;
		cli.setcNumero(Integer.parseInt(rs.getString("cNumero")));
                cli.setcNombre(rs.getString("cNombre"));
                cli.setcDireccion(rs.getString("cDireccion"));
                cli.setcTelefono(rs.getString("cTelefono"));
                } catch (SQLException e) {
			System.out.println("ERROR AL OBTENER LOS CAMIONES");
		}
    }

    @Override
    public IPersistente getNuevo() {
        return new Clientes();
    }

    @Override
    public String getSelectCommand(int numfactura) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
