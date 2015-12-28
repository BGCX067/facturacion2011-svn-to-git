
package tsl_nacha.persistencia;

import tsl_nacha.dominio.IPersistente;
/**
 * 
 * @author MAT
 */
public abstract class FactoryPersistence {
  private BaseDeDatos objBD;

  public BaseDeDatos getObjBD() {
        return objBD;
  }

  public abstract Broker createPersistence(tsl_nacha.dominio.IPersistente objP) ;

}
