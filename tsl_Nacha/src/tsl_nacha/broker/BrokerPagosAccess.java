/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsl_nacha.broker;

import java.sql.ResultSet;
import java.sql.SQLException;
import tsl_nacha.dominio.Articulos;
import tsl_nacha.dominio.Cuentas;
import tsl_nacha.dominio.Facturas;
import tsl_nacha.dominio.IPersistente;
import tsl_nacha.dominio.Lineas;
import tsl_nacha.dominio.Pagos;
import tsl_nacha.gestoras.GestArticulos;
import tsl_nacha.gestoras.GestCuentas;
import tsl_nacha.persistencia.Broker;

/**
 *
 * @author MAT
 */
public class BrokerPagosAccess extends Broker{
    
    public BrokerPagosAccess(Pagos objP) {
        super(objP);
  }

    @Override
    public String getInsertCommand() {
        Pagos pag =(Pagos)this.getObjP();
        return "INSERT INTO Pagos(idPago, idCuenta,Monto,Fecha)" + "VALUES(" + pag.getIdPago() + "," +pag.getIdCuenta().getIdCuenta()
                + "," + pag.getMonto()+ ",'" + pag.getFechaEntrega() + "')";
        
    }

    @Override
    public String getUpdateCommand() {
         Lineas lin =(Lineas)this.getObjP();
         return "UPDATE LINEAS SET lCantidad= " + lin.getlCantidad() +", lTotal="+lin.getlTotal()+" WHERE lCorrelativo= " +lin.getlCorrelativo();
            
    }

    @Override
    public String getDeleteCommand() {
         Pagos pag =(Pagos)this.getObjP();
         return "DELETE FROM PAGOS " + " WHERE idPago=" + pag.getIdPago() +"";
    }

    @Override
    public String getSelectCommand() {
        return "SELECT * FROM PAGOS";
    }

    @Override
    public void obtenerDesdeResultSet(ResultSet rs, Object IPersistentej) {
        try {
                Pagos pag=(Pagos)IPersistentej;
                pag.setIdPago(rs.getInt("idPago"));
                Cuentas c = GestCuentas.getInstance().devolverCuentaPorNumero(rs.getInt("idCuenta"));
                pag.setIdCuenta(c);
                pag.setMonto(rs.getInt("Monto"));
                pag.setFechaEntrega(rs.getString("Fecha"));
                } catch (SQLException e) {
			System.out.println("ERROR AL OBTENER LLOS PAGOS");
		}
    }

    @Override
    public IPersistente getNuevo() {
        return new Pagos();
    }

    @Override
    public String getSelectCommand(int numfactura) {
         return "SELECT * FROM LINEAS WHERE lNumFactura=" +numfactura+"";
    }
    
    
}
