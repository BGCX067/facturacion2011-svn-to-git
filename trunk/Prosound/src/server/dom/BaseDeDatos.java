/**
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server.dom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 
 * @author MAT
 */
public class BaseDeDatos {
  static Connection con =  null;

 public  static Connection getConexion() throws SQLException
  {
        try {
            if(con==null || con.isClosed()){
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:prosound");
               
            }
            
            }catch (ClassNotFoundException e){
                System.out.println("ERROR AL CARGAR EL DRIVER BASE DE DATOS.");
            } catch (SQLException e1) {
                System.out.println("ERROR DE CONEXION BASE DE DATOS.");
            }
       
    return con;
  }

  public static void cerrarConexion()
  {
        try{
            if(con != null){
                con.close();
            }
        }catch (SQLException e) {
                    System.out.println("ERROR AL CERRAR LA CONEXION BASE DE DATOS.");
            }
  }

}
