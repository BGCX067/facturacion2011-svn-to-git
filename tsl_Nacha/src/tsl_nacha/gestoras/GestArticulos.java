/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsl_nacha.gestoras;

import java.util.ArrayList;
import tsl_nacha.dominio.Articulos;

/**
 *
 * @author Enrico
 */
public class GestArticulos {
    
    private ArrayList<Articulos> mColArticulos = new ArrayList<Articulos>();
    private static GestArticulos objGestA = null;
    
        public GestArticulos() {
        Articulos objA = new Articulos();
        mColArticulos = objA.obtenerTodos();
    }

    public static GestArticulos getInstance() {
        if (objGestA == null) {
            objGestA = new GestArticulos();
        }
        return objGestA;
    }
    
    public boolean agregarArticulos(Articulos objA){
        if(!existeArticulos(objA)){
            mColArticulos.add(objA);
            objA.guardar();
            return true;
        }
        return false;
    }

    private boolean existeArticulos(Articulos objA) {
        for(Articulos a: mColArticulos){
            if(a.getaCodigo() == null ? objA.getaCodigo() == null : a.getaCodigo().equals(objA.getaCodigo())){
                return true;
            }
        }
        return false;
    }
    
    public Articulos devolverArticuloNumero(String xCod){
        for(Articulos a:mColArticulos){
            if(a.getaCodigo() == null ? xCod == null : a.getaCodigo().equals(xCod)){
                return a;
            }
        }
        return null;
    }
    
//    public int devolverUltimoNum(){
//            
//        int mayor = 0;
//        for (Articulos xobjA : mColArticulos) {
//            if (xobjA.getaCodigo() > mayor) {
//                mayor = xobjA.getaCodigo();
//            }
//        }
//        mayor = mayor + 1;
//        return mayor;
//    
//    }
    
    public ArrayList<Articulos> devolverArticulos(){
        return mColArticulos;
    }
    
    public void modificarArticulos(Articulos objA) {
        for (Articulos a : mColArticulos) {
            if (objA.getaCodigo() == null ? a.getaCodigo() == null : objA.getaCodigo().equals(a.getaCodigo())) {
               a.setObjCategoria(objA.getObjCategoria());
               a.setaColor(objA.getaColor());
               a.setaDescripcion(objA.getaDescripcion());
               a.setaPrecio(objA.getaPrecio());
               a.setaStock(objA.getaStock());
               a.setaTalle(objA.getaTalle());
               a.modificar();
               break;
            }
        }
        
    }

    public boolean eliminarArticulo(Articulos a) {
        a.eliminar();
        mColArticulos.remove(a);
        return true;
    }
    
    
    
}
