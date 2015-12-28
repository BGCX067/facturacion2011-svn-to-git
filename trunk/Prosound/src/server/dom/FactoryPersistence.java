
package server.dom;

import api.dom.IPersistente;
/**
 * 
 * @author MAT
 */
public abstract class FactoryPersistence {
  private BaseDeDatos objBD;

  public BaseDeDatos getObjBD() {
        return objBD;
  }

  public abstract Broker createPersistence(api.dom.IPersistente objP) ;

}
