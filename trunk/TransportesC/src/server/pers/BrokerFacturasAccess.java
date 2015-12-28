/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.pers;

import api.dom.Camion;
import api.dom.Cliente;
import api.dom.Empleado;
import api.dom.Factura;
import api.dom.IPersistente;
import api.gest.GestCamiones;
import api.gest.GestCliente;
import api.gest.GestEmpleado;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MAT
 */
public class BrokerFacturasAccess extends server.dom.Broker{

    public BrokerFacturasAccess(Factura objFac) {
       super(objFac);
    }

    @Override
    public String getInsertCommand() {
         Factura Fac = (Factura)this.getObjP();
         return "INSERT INTO FACTURAS(fNumero,fFecha,fMoneda, ftipoCambio,fLugarCarga,fLugarDescarga,"
                 + "fKilometros,fGrupoMetros,fCantBultos,fCantAnimales,fGuia,fImporte,CliNro,EmpNro,CamNro, fKmRetorno, fObservaciones, fSaldo)"+ "VALUES("+ Fac.getfNumero() +",'" + Fac.getfFecha()+"','"+Fac.getfMoneda()+ "'," + Fac.getFtipoCambio() +
                  ",'"+Fac.getfLugarCarga()+"','"+Fac.getfLugarDescarga()+"',"+Fac.getfKilometros()+ "," + Fac.getfGrupoMetros() + 
                 ","+ Fac.getfCantBultos() +","+ Fac.getfCantAnimales() +",'"+ Fac.getfGuia() +"',"+ Fac.getfImporte() +
                 "," + Fac.getObjCliente().getpNumero() + "," + Fac.getObjEmpleado().getpNumero() + ",'" + Fac.getObjCamion().getcMatricula() + "'," + Fac.getfKilometrosRetorno()+ ",'"+ Fac.getfObservaciones() +"'," + Fac.getfSaldo() +")";
    }

    @Override
    public String getUpdateCommand() {
        Factura Fac = (Factura)this.getObjP();
        return "UPDATE FACTURAS SET fFecha='" + Fac.getfFecha()+ "',fMoneda='"+ Fac.getfMoneda()+ "',ftipoCambio=" + Fac.getFtipoCambio() +",fLugarCarga='"+Fac.getfLugarCarga()
                    +"',fLugarDescarga='"+Fac.getfLugarDescarga()+"',fKilometros="+Fac.getfKilometros()+",fGrupoMetros="+Fac.getfGrupoMetros()+
                ",fCantBultos="+Fac.getfCantBultos()+ ",fCantAnimales="+Fac.getfCantAnimales()+
                ",fGuia='"+Fac.getfGuia()+ "',fImporte="+Fac.getfImporte()+
                ",CliNro="+Fac.getObjCliente().getpNumero()+ ",EmpNro="+Fac.getObjEmpleado().getpNumero() + ",CamNro='"+Fac.getObjCamion().getcMatricula() + "',fKmRetorno="+Fac.getfKilometrosRetorno()+ ",fObservaciones='"+Fac.getfObservaciones()+ "',fSaldo="+Fac.getfSaldo()+" WHERE fNumero=" +Fac.getfNumero();
            
    }

    @Override
    public String getDeleteCommand() {
        Factura Fac = (Factura)this.getObjP();
        return "DELETE FROM FACTURAS" + " WHERE fNumero=" +Fac.getfNumero();
    }

    @Override
    public String getSelectCommand() {
        return "SELECT * FROM FACTURAS";   
    }

    @Override
    public void obtenerDesdeResultSet(ResultSet rs, Object IPersistentej) {
        try {
                Factura Fac = (Factura)IPersistentej;
		
                Fac.setfNumero(rs.getInt("fNumero"));
		Fac.setfFecha(rs.getString("fFecha"));
                Fac.setfMoneda(rs.getString("fMoneda"));
                Fac.setFtipoCambio(rs.getDouble("ftipoCambio"));
                Fac.setfLugarCarga(rs.getString("fLugarCarga"));
                Fac.setfLugarDescarga(rs.getString("fLugarDescarga"));
                Fac.setfKilometros(rs.getInt("fKilometros"));
                Fac.setfGrupoMetros(rs.getInt("fGrupoMetros"));
                Fac.setfCantAnimales(rs.getInt("fCantAnimales"));
                Fac.setfGuia(rs.getString("fGuia"));
                Fac.setfImporte(rs.getInt("fImporte"));
                int numcli = (rs.getInt("CliNro"));
                for (Cliente objCli : GestCliente.getInstance().devolverCliente()){
                    if(objCli.getpNumero() == numcli){
                        Fac.setObjCliente(objCli);
                    }
                }
                int numemp = (rs.getInt("EmpNro"));
                for (Empleado objEmp : GestEmpleado.getInstance().devolverEmpleado()){
                    if(objEmp.getpNumero() == numemp){
                        Fac.setObjEmpleado(objEmp);
                    }
                }
                String numcam = (rs.getString("CamNro"));
                for (Camion objCam : GestCamiones.getInstance().devolverCamiones()){
                    if(objCam.getcMatricula() == null ? numcam == null : objCam.getcMatricula().equals(numcam)){
                        Fac.setObjCamion(objCam);
                    }
                }
                Fac.setfKilometrosRetorno(rs.getInt("fKmRetorno"));
                Fac.setfObservaciones(rs.getString("fObservaciones"));   
                Fac.setfSaldo(rs.getInt("fSaldo"));
                } catch (SQLException e) {
			System.out.println("ERROR AL OBTENER LAS FACTURAS");
		}
    }

    @Override
    public IPersistente getNuevo() {
        return new Factura();
    }
    
    
    
}
