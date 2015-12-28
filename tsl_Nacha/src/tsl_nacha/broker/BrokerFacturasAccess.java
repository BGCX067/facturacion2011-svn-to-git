/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsl_nacha.broker;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import tsl_nacha.dominio.Articulos;
import tsl_nacha.dominio.Categorias;
import tsl_nacha.dominio.Cuentas;
import tsl_nacha.dominio.Facturas;
import tsl_nacha.dominio.IPersistente;
import tsl_nacha.dominio.Lineas;
import tsl_nacha.gestoras.GestCategorias;
import tsl_nacha.gestoras.GestCuentas;
import tsl_nacha.persistencia.Broker;

/**
 *
 * @author MAT
 */
public class BrokerFacturasAccess extends Broker{
    
    public BrokerFacturasAccess(Facturas objF) {
        super(objF);
  }

    @Override
    public String getInsertCommand() {
        Facturas fac =(Facturas)this.getObjP();
        return "INSERT INTO FACTURAS(fNumero, fFecha, fDescripcion, fSubTotal, fIva, fTotal,fCuenta)" + "VALUES(" + fac.getfNumero() + ",'" + fac.getfFecha()
                + "','" + fac.getfDescripcion() + "'," + fac.getfSubTotal() + "," + fac.getfIva() + "," + fac.getfTotal() + "," + fac.getObjCuenta().getIdCuenta() +" )";
        
    }
   

    @Override
    public String getUpdateCommand() {
         Facturas fac =(Facturas)this.getObjP();
         return "hola";
            
    }

    @Override
    public String getDeleteCommand() {
         Facturas fac =(Facturas)this.getObjP();
         return "DELETE FROM FACTURAS " + " WHERE fNumero=" +fac.getfNumero()+"";
    }

    @Override
    public String getSelectCommand() {
        return "SELECT * FROM FACTURAS";
    }

    @Override
    public void obtenerDesdeResultSet(ResultSet rs, Object IPersistentej) {
        try {
                Facturas fac=(Facturas)IPersistentej;
                fac.setfNumero(Integer.parseInt(rs.getString("fNumero")));
                fac.setfFecha(rs.getString("fFecha"));
                fac.setfDescripcion(rs.getString("fDescripcion"));
                fac.setfSubTotal(Double.parseDouble(rs.getString("fSubTotal")));
                fac.setfIva(Double.parseDouble(rs.getString("fIva")));
                fac.setfTotal(Double.parseDouble(rs.getString("fTotal")));
                Cuentas objCuenta = GestCuentas.getInstance().devolverCuentaPorNumero(rs.getInt("fCuenta"));
                fac.setObjCuenta(objCuenta);
                Lineas objL = new Lineas();
                 fac.setmColLineas(objL.obtenerTodos(fac.getfNumero()));            
                } catch (SQLException e) {
			System.out.println("ERROR AL OBTENER LAS FACTURAS");
		}
    }

    @Override
    public IPersistente getNuevo() {
        return new Facturas();
    }

    @Override
    public String getSelectCommand(int numfactura) {
        return "hola";
    }
    
    
}
