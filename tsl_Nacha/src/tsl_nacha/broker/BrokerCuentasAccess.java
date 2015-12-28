/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsl_nacha.broker;

import java.sql.ResultSet;
import java.sql.SQLException;
import tsl_nacha.dominio.Articulos;
import tsl_nacha.dominio.Clientes;
import tsl_nacha.dominio.Cuentas;
import tsl_nacha.dominio.IPersistente;
import tsl_nacha.gestoras.GestClientes;
import tsl_nacha.persistencia.Broker;

/**
 *
 * @author MAT
 */
public class BrokerCuentasAccess extends Broker{
    
    public BrokerCuentasAccess(Cuentas objC) {
        super(objC);
  }

    @Override
    public String getInsertCommand() {
        Cuentas cue =(Cuentas)this.getObjP();
        return "INSERT INTO Cuentas(idCuenta,idCliente,Saldo,fechaUltimaEntrega)" + "VALUES(" + cue.getIdCuenta() + "," + cue.getObjCliente().getcNumero()
                + "," + cue.getSaldo() + ",'" + cue.getFechaUltimaEntrega()  + "')";
        
    }

    @Override
    public String getUpdateCommand() {
         Cuentas cue=(Cuentas)this.getObjP();
         return "UPDATE CUENTAS SET Saldo= " + cue.getSaldo() +" WHERE idCuenta= " +cue.getIdCuenta();
            
    }

    @Override
    public String getDeleteCommand() {
         Cuentas cue =(Cuentas)this.getObjP();
         return "DELETE FROM CUENTAS " + " WHERE idCuenta=" +cue.getIdCuenta()+"";
    }

    @Override
    public String getSelectCommand() {
        return "SELECT * FROM CUENTAS";
    }

    @Override
    public void obtenerDesdeResultSet(ResultSet rs, Object IPersistentej) {
        try {
               Cuentas cue=(Cuentas)IPersistentej;
               cue.setIdCuenta(rs.getInt("idCuenta"));
               Clientes objC = GestClientes.getInstance().devolverClientesNumero(rs.getInt("idCliente"));
               cue.setObjCliente(objC);
               cue.setSaldo(rs.getDouble("Saldo"));
               cue.setFechaUltimaEntrega(rs.getString("fechaUltimaEntrega"));
               boolean estado = rs.getBoolean("Estado");
               cue.setEstado(estado);          
                } catch (SQLException e) {
			System.out.println("ERROR AL OBTENER LAS CUENTAS");
		}
    }

    @Override
    public IPersistente getNuevo() {
        return new Cuentas();
    }

    @Override
    public String getSelectCommand(int numfactura) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
