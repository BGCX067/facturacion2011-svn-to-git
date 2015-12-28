/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsl_nacha.gestoras;

import java.util.ArrayList;
import tsl_nacha.dominio.Articulos;
import tsl_nacha.dominio.Categorias;

/**
 *
 * @author Enrico
 */
public class GestCategorias {
    
    private ArrayList<Categorias> mColCategorias = new ArrayList<Categorias>();
    private static GestCategorias objGestC = null;
    
    public GestCategorias() {
        Categorias objC = new Categorias();
        mColCategorias = objC.obtenerTodos();
    }

    public static GestCategorias getInstance() {
        if (objGestC == null) {
            objGestC = new GestCategorias();
        }
        return objGestC;
    }
            
   public boolean agregarCategorias(Categorias objC){
        if(!existeCategoria(objC)){
            mColCategorias.add(objC);
            objC.guardar();
            return true;
        }
        return false;
    }

    private boolean existeCategoria(Categorias objC) {
        for(Categorias c: mColCategorias){
            if(c.getcNumero()==objC.getcNumero()){
                return true;
            }
        }
        return false;
    }
    
        public Categorias devolverCategoriaNumero(int xCod){
        for(Categorias a:mColCategorias){
            if(a.getcNumero()==xCod){
                return a;
            }
        }
        return null;
    }

    public ArrayList<Categorias> devolverCategorias() {
        return mColCategorias;
    }
    
    public int devolverUltimoNum(){
            
        int mayor = 0;
        for (Categorias xobjC : mColCategorias) {
            if (xobjC.getcNumero() > mayor) {
                mayor = xobjC.getcNumero();
            }
        }
        mayor = mayor + 1;
        return mayor;
    
    }
          
    
    public void modificarCategorias(Categorias objC) {
        for (Categorias c : mColCategorias) {
            if (objC.getcNumero()==c.getcNumero()) {
               c.setcNombre(objC.getcNombre());
               c.modificar();
               break;
            }
        }
    }
}
