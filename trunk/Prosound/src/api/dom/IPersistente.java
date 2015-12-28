/**
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.dom;

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

}
