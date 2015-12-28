/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.pers;

import api.dom.Cliente;
import api.dom.Factura;
import api.dom.IPersistente;
import api.gest.GestCliente;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MAT
 */
public class BrokerFacturasAccess extends server.dom.Broker {

    public BrokerFacturasAccess(Factura objFac) {
        super(objFac);
    }

    @Override
    public String getInsertCommand() {
        Factura Fac = (Factura) this.getObjP();
        return "INSERT INTO FACTURAS(factCod,factFecha,factCli,factSubTotal, factTotal,factSaldo, factObservaciones, fTipo)" + "VALUES(" + Fac.getfCod() + ",'" + Fac.getfFecha() + "','" + Fac.getObjCli().getCliCod()
                + "'," + Fac.getfSubTotal() + ",'" + Fac.getfTotal() + "'," + Fac.getfSaldo() + ",'" + Fac.getfObservaciones() +"','" + Fac.getfTipo()+"')";
    }

    @Override
    public String getUpdateCommand() {
        Factura Fac = (Factura) this.getObjP();
        return "UPDATE FACTURAS SET factFecha='" + Fac.getfFecha() + "',factCli=" + Fac.getObjCli().getCliCod() + ",factSubTotal=" + Fac.getfSubTotal() + ",factTotal=" + Fac.getfTotal()
                + ",factSaldo=" + Fac.getfSaldo() + ",factObservaciones='" + Fac.getfObservaciones() +"',fTipo='" + Fac.getfTipo() + "' WHERE factCod=" + Fac.getfCod();
    }

    @Override
    public String getDeleteCommand() {
        Factura Fac = (Factura) this.getObjP();
        return "DELETE FROM FACTURAS" + " WHERE factCod=" + Fac.getfCod();
    }

    @Override
    public String getSelectCommand() {
        return "SELECT * FROM FACTURAS";
    }

    @Override
    public void obtenerDesdeResultSet(ResultSet rs, Object IPersistentej) {
        try {
            Factura Fac = (Factura) IPersistentej;
            Fac.setfCod(rs.getInt("factCod"));
            Fac.setfFecha(rs.getString("factFecha"));
            int numcli = (rs.getInt("factCli"));
            for (Cliente objCli : GestCliente.getInstance().devolverCliente()) {
                if (objCli.getCliCod() == numcli) {
                    Fac.setObjCli(objCli);
                }
            }
            Fac.setfSubTotal(rs.getInt("factSubTotal"));
            Fac.setfTotal(rs.getInt("factTotal"));
            Fac.setfSaldo(rs.getInt("factSaldo"));
            Fac.setfObservaciones(rs.getString("factObservaciones"));
            Fac.setfTipo(rs.getString("fTipo"));
        } catch (SQLException e) {
            System.out.println("ERROR AL OBTENER LAS FACTURAS");
        }
    }

    @Override
    public IPersistente getNuevo() {
        return new Factura();
    }
}
