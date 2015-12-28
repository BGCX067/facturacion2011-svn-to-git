/**
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsl_nacha.dominio;

import java.util.ArrayList;
/**
 * 
 * @author MAT
 */
public interface IPersistente {
  void guardar() ;

  void modificar() ;

  void eliminar() ;

  ArrayList obtenerTodos() ;
  
  ArrayList obtenerTodos(int numero);

}
