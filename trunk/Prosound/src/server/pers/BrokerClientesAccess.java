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
        return "INSERT INTO CLIENTES(cliCod, cliNom, cliFing, cliRut, cliTel, cliDire)" + "VALUES("+ Cli.getCliCod() +",'" + Cli.getCliNom()+"','"+Cli.getCliFing()+
                  "','"+Cli.getCliRut()+ "','"+Cli.getCliTel()+ "','"+Cli.getCliDire()+ "')";
        
    }

    @Override
    public String getUpdateCommand() {
        Cliente Cli = (Cliente)this.getObjP();
        return "UPDATE CLIENTES SET cliNom='" + Cli.getCliNom()+ "',cliFing='"+Cli.getCliFing()+"',cliRut="+Cli.getCliRut()
                    +",cliTel='"+Cli.getCliTel()+"',cliDire='"+Cli.getCliDire()+"' WHERE cliCod=" + Cli.getCliCod();
    }

    @Override
    public String getDeleteCommand() {
        Cliente Cli = (Cliente)this.getObjP();
        return "DELETE FROM CLIENTES " + " WHERE cliCod=" +Cli.getCliCod();
    }

    @Override
    public String getSelectCommand() {
        return "SELECT * FROM CLIENTES";
    }

    @Override
    public void obtenerDesdeResultSet(ResultSet rs, Object IPersistentej) {
         try {
                Cliente cli=(Cliente)IPersistentej;
		cli.setCliCod(rs.getInt("cliCod"));
                cli.setCliNom(rs.getString("cliNom"));
                cli.setCliFing(rs.getString("cliFing"));
                cli.setCliRut(rs.getString("cliRut"));
		cli.setCliTel(rs.getString("cliTel"));
                cli.setCliDire(rs.getString("cliDire"));
                } catch (SQLException e) {
			System.out.println("ERROR AL OBTENER LOS CLIENTES");
		}
    }

    @Override
    public api.dom.IPersistente getNuevo() {
       return new Cliente();
    }
    
    
    
}
