/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.pers;

import api.dom.Empleado;
import api.dom.IPersistente;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MAT
 */
public class BrokerEmpleadosAccess extends server.dom.Broker{

    public BrokerEmpleadosAccess(api.dom.Empleado xObjEmp) {
        super(xObjEmp);
    }
    
       @Override
    public String getInsertCommand() {
         Empleado Emp = (Empleado)this.getObjP();
         return "INSERT INTO EMPLEADOS(Numero,Nombre,Direccion,Telefono,CI,FIng,Cargo)" 
                    + "VALUES("+ Emp.getpNumero() +",'" + Emp.getpNombre()+"','"+Emp.getpDireccion()+
                  "','"+Emp.getpTelefono()+"','"+Emp.geteCedulaIdentidad()+"','"+Emp.geteFechaIngreso()+ "','"+Emp.geteCargo()+"')";
    }

    @Override
    public String getUpdateCommand() {
        Empleado Emp = (Empleado)this.getObjP();
        return "UPDATE EMPLEADOS SET Nombre='" + Emp.getpNombre()+ "',Direccion='"+Emp.getpDireccion()+"',Telefono="+Emp.getpTelefono()
                    +",CI='"+Emp.geteCedulaIdentidad()+"',FIng='"+Emp.geteFechaIngreso()+"',Cargo='"+Emp.geteCargo()+"' WHERE Numero=" +Emp.getpNumero();
            
    }

    @Override
    public String getDeleteCommand() {
         Empleado Emp = (Empleado)this.getObjP();
        return "DELETE FROM EMPLEADOS" + " WHERE Numero=" +Emp.getpNumero();
    }

    @Override
    public String getSelectCommand() {
        return "SELECT * FROM EMPLEADOS";   
    }

    @Override
    public void obtenerDesdeResultSet(ResultSet rs, Object IPersistentej) {
          try {
                Empleado Emp = (Empleado)IPersistentej;
		
                Emp.setpNumero(rs.getInt("Numero"));
		Emp.setpNombre(rs.getString("Nombre"));
                Emp.setpDireccion(rs.getString("Direccion"));
                Emp.setpTelefono(rs.getString("Telefono"));
                Emp.seteCedulaIdentidad(rs.getString("CI"));
                Emp.seteFechaIngreso(rs.getString("FIng")); 
                Emp.seteCargo(rs.getString("Cargo"));
                } catch (SQLException e) {
			System.out.println("ERROR AL OBTENER LOS EMPLEADOS");
		}
    }

    @Override
    public IPersistente getNuevo() {
        return new Empleado();
    }
    
    
}
