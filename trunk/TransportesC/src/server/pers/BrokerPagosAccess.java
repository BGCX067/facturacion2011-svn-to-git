/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.pers;

import api.dom.Factura;
import api.dom.IPersistente;
import api.dom.Pago;
import api.gest.GestFactura;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MAT
 */
public class BrokerPagosAccess extends server.dom.Broker{

    public BrokerPagosAccess(api.dom.Pago objPago) {
        super(objPago);
    }

    @Override
    public String getInsertCommand() {
        Pago Pag =(Pago)this.getObjP();
        return "INSERT INTO PAGOS(NumeroPago, FechaPago, FacNro, Importe)" + "VALUES("+ Pag.getpNumeroPago() +",'" + Pag.getpFechaPago()+"',"+Pag.getpObjFactura().getfNumero()+
                  ","+Pag.getpImportePago() +")";
        
    }

    @Override
    public String getUpdateCommand() {
        Pago Pag =(Pago)this.getObjP();
        return "UPDATE PAGOS SET FechaPago='" + Pag.getpFechaPago()+ "',FacNro="+Pag.getpObjFactura().getfNumero()
                    +",Importe="+Pag.getpImportePago()+" WHERE NumeroPago=" + Pag.getpNumeroPago();
        
    }

    @Override
    public String getDeleteCommand() {
        Pago Pag =(Pago)this.getObjP();
        return "DELETE FROM PAGOS" + " WHERE NumeroPago=" +Pag.getpNumeroPago();
    }

    @Override
    public String getSelectCommand() {
        return "SELECT * FROM PAGOS";
    }

    @Override
    public void obtenerDesdeResultSet(ResultSet rs, Object IPersistentej) {
         try {
                Pago pag=(Pago)IPersistentej;
		pag.setpNumeroPago(rs.getInt("NumeroPago"));
                pag.setpFechaPago(rs.getString("FechaPago"));
                int numfac = (rs.getInt("FacNro"));
                for (Factura objF : GestFactura.getInstance().devolverFacturas()){
                    if(objF.getfNumero() == numfac){
                        pag.setpObjFactura(objF);
                    }
                }
               
		pag.setpImportePago(rs.getInt("Importe"));
                } catch (SQLException e) {
			System.out.println("ERROR AL OBTENER LOS PAGOS");
		}
    }

    @Override
    public IPersistente getNuevo() {
       return new Pago();
    }
    
    
    
}
