/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.pers;

import api.dom.Cliente;
import api.dom.IPersistente;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MAT
 */
public class BrokerClientesAccess extends server.dom.Broker{

    public BrokerClientesAccess(api.dom.Cliente objCli) {
        super(objCli);
    }

    @Override
    public String getInsertCommand() {
        Cliente Cli =(Cliente)this.getObjP();
        return "INSERT INTO CLIENTES(Numero, Nombre, Direccion, Telefono, Dicose, Rut)" + "VALUES("+ Cli.getpNumero() +",'" + Cli.getpNombre()+"','"+Cli.getpDireccion()+
                  "','"+Cli.getpTelefono()+"','"+Cli.getcDicose()+"','"+Cli.getcRut()+"')";
        
    }

    @Override
    public String getUpdateCommand() {
        Cliente Cli = (Cliente)this.getObjP();
        return "UPDATE CLIENTES SET Nombre='" + Cli.getpNombre()+ "',Direccion='"+Cli.getpDireccion()+"',Telefono="+Cli.getpTelefono()
                    +",Dicose='"+Cli.getcDicose()+"',Rut='"+Cli.getcRut()+"' WHERE Numero=" + Cli.getpNumero();
    }

    @Override
    public String getDeleteCommand() {
        Cliente Cli = (Cliente)this.getObjP();
        return "DELETE FROM CLIENTES " + " WHERE Numero=" +Cli.getpNumero();
    }

    @Override
    public String getSelectCommand() {
        return "SELECT * FROM CLIENTES";
    }

    @Override
    public void obtenerDesdeResultSet(ResultSet rs, Object IPersistentej) {
         try {
                Cliente cli=(Cliente)IPersistentej;
		cli.setpNumero(rs.getInt("Numero"));
                cli.setpNombre(rs.getString("Nombre"));
                cli.setpDireccion(rs.getString("Direccion"));
                cli.setpTelefono(rs.getString("Telefono"));
		cli.setcDicose(rs.getString("Dicose"));
                cli.setcRut(rs.getString("Rut"));
                } catch (SQLException e) {
			System.out.println("ERROR AL OBTENER LOS CLIENTES");
		}
    }

    @Override
    public api.dom.IPersistente getNuevo() {
       return new Cliente();
    }
    
    
    
}
