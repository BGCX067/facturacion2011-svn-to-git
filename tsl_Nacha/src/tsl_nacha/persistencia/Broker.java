/**
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsl_nacha.persistencia;

import tsl_nacha.dominio.IPersistente;
import java.sql.*;
import java.util.ArrayList;

/**
 * 
 * @author MAT
 */
public abstract class Broker {
  protected tsl_nacha.dominio.IPersistente objP;

  public Broker(tsl_nacha.dominio.IPersistente xObjP) {
        objP = xObjP;
  }

  public tsl_nacha.dominio.IPersistente getObjP() {
        return objP;
  }

  public void setObjP(tsl_nacha.dominio.IPersistente objP) {
        this.objP = objP;
  }

  public void guardar() {
        this.ejecutar(this.getInsertCommand());
  }

  public void modificar() {
        this.ejecutar(this.getUpdateCommand());
  }

  public void eliminar() {
        this.ejecutar(this.getDeleteCommand());
  }

  public void ejecutar(String sentenciaSql) {
    try {
                    Statement st = BaseDeDatos.getConexion().createStatement();
                    st.executeUpdate(sentenciaSql);
                    st.close();
                    BaseDeDatos.cerrarConexion();
            } catch (SQLException e) {
                    System.out.println("Error al ejecutar sql.\n" + e.getMessage());
            }
  }

  public ResultSet obtenerResultSet(String consultaSql) {
        ResultSet rs = null;
            try {
                    Statement st = BaseDeDatos.getConexion().createStatement();
                    rs = st.executeQuery(consultaSql);
            } catch (SQLException e) {
                    System.out.println("Error al ejecutar sql.\n" + e.getMessage());
            }
            return rs;
  }

  public ArrayList obtenerTodos() {
        ArrayList ret = new ArrayList();
            try {
                    ResultSet rs = this.obtenerResultSet(getSelectCommand());
                    while (rs.next()) {
                            IPersistente aux= getNuevo();
                            obtenerDesdeResultSet(rs,aux);
                            ret.add(aux);
                    }
            } catch (SQLException e) {
                    System.out.println("Error al obtener objetos.\n" + e.getMessage());
            }
            return ret;
  }

  public abstract String getInsertCommand() ;

  public abstract String getUpdateCommand() ;

  public abstract String getDeleteCommand() ;

  public abstract String getSelectCommand() ;

  public abstract void obtenerDesdeResultSet(ResultSet rs, Object IPersistentej) ;

  public abstract tsl_nacha.dominio.IPersistente getNuevo() ;

    public ArrayList obtenerTodos(int numfactura) {
   ArrayList ret = new ArrayList();
            try {
                    ResultSet rs = this.obtenerResultSet(getSelectCommand(numfactura));
                    while (rs.next()) {
                            IPersistente aux= getNuevo();
                            obtenerDesdeResultSet(rs,aux);
                            ret.add(aux);
                    }
            } catch (SQLException e) {
                    System.out.println("Error al obtener objetos.\n" + e.getMessage());
            }
            return ret;}

    public abstract String getSelectCommand(int numfactura) ;

}
