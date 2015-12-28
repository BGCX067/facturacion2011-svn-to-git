/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.pers;

import api.dom.Camion;
import api.dom.Empleado;
import api.dom.Sueldo;
import api.gest.GestEmpleado;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MAT
 */
public class BrokerSueldosAccess extends server.dom.Broker{
    
    public BrokerSueldosAccess(api.dom.Sueldo objSueldo) {
        super(objSueldo);
  }

    @Override
    public String getInsertCommand() {
        Sueldo s =(Sueldo)this.getObjP();
        return "INSERT INTO SUELDOS (SNumero, SFPago, SFIni, SFFin, SCorrespondienteA, SKm, SPrecio, SKmRetorno, SPrecioKmRetorno, SSueldo, SFacturado, EmpNro)" + 
                "VALUES("+ s.getSueldoNumero() + ",'"+ s.getFechaPago()+"','" + s.getFechaInicio()+"','"+ s.getFechaFin()+"','"+s.getCorrespondienteA() 
                + "','"+ s.getKm() + "','"+ s.getPrecioKm()+"','"+s.getKmRetorno() + "','"+s.getPrecioKmRetorno() + "','"+ s.getSueldo() + "','"+ s.getFacturado()+ "',"+ s.getObjE().getpNumero()+")";
        
    }

    @Override
    public String getUpdateCommand() {
         Sueldo s =(Sueldo)this.getObjP();
         return "UPDATE SUELDOS SET SFPago='" + s.getFechaPago()+ "',SFIni='"+s.getFechaInicio()+"',SFFin='"+s.getFechaFin()
                    +"',SCorrespondienteA='"+s.getCorrespondienteA()+"',SKm="+s.getKm()+",SPrecio="+s.getPrecioKm()+",SKmRetorno="+s.getKmRetorno()
                 +",SPrecioKmRetorno="+s.getPrecioKmRetorno()+",SSueldo="+s.getSueldo() +",SFacturado="+s.getFacturado()+" WHERE SNumero=" +s.getSueldoNumero();
            
    }

    @Override
    public String getDeleteCommand() {
         Sueldo s =(Sueldo)this.getObjP();
         return "DELETE FROM SUELDOS " + " WHERE SNumero=" +s.getSueldoNumero();
    }

    @Override
    public String getSelectCommand() {
        return "SELECT * FROM SUELDOS";
    }

    @Override
    public void obtenerDesdeResultSet(ResultSet rs, Object IPersistentej) {
        try {
       
            Sueldo s=(Sueldo)IPersistentej;
		s.setSueldoNumero(rs.getInt("SNumero"));
                s.setFechaPago(rs.getString("SFPago"));
                s.setFechaInicio(rs.getString("SFIni"));
                s.setFechaFin(rs.getString("SFFin"));
		s.setCorrespondienteA(rs.getString("SCorrespondienteA"));
                s.setKm(rs.getInt("SKm"));
                s.setPrecioKm(rs.getInt("SPrecio"));
                s.setKmRetorno(rs.getInt("SKmRetorno"));
                s.setPrecioKmRetorno(rs.getInt("SPrecioKmRetorno"));
                s.setSueldo(rs.getInt("SSueldo"));
                s.setFacturado(rs.getInt("SFacturado"));
                int numemp = (rs.getInt("EmpNro"));
                for (Empleado objEmp : GestEmpleado.getInstance().devolverEmpleado()){
                    if(objEmp.getpNumero() == numemp){
                        s.setObjE(objEmp);
                    }
                }
                } catch (SQLException e) {
			System.out.println("ERROR AL OBTENER LOS SUELDOS");
		}
    }

    @Override
    public api.dom.IPersistente getNuevo() {
        return new Sueldo();
    }
    
    
}
