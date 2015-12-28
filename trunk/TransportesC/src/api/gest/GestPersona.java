/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.gest;

import api.dom.Persona;
import java.util.ArrayList;

/**
 *
 * @author Enrico
 */
public class GestPersona {
    private ArrayList<Persona> mColPersona = new ArrayList<Persona>();
    private static GestPersona objGestC = null;
    
      public static GestPersona getInstance()
  {
        if (objGestC == null){
            objGestC = new GestPersona();
            }
        return objGestC;
  }
      
      public boolean verificarPersona(Persona xObjP){
          for(Persona p: mColPersona){
              if(p.getpNumero()==xObjP.getpNumero()){
                 return true;
              }                 
          }
          return false;
      }
      
      public boolean altaPersona(Persona xObjP){
          if(!verificarPersona(xObjP)){
              mColPersona.add(xObjP);
              return true;
          }
          return false;
      }
      
      public boolean bajaPersona(Persona xObjP){
          mColPersona.remove(xObjP);
          return true;
      }
      
      public ArrayList<Persona> devolverCamiones(){
          return mColPersona;
      }
      
      public boolean modificarPersona(Persona xObjP){
          mColPersona.set(mColPersona.indexOf(xObjP), xObjP);
          return true;
      }
      
      
      
      
   
}
