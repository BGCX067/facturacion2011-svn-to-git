/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api.gest;

import api.dom.Articulos;
import api.dom.Factura;
import java.util.ArrayList;

/**
 *
 * @author Enrico
 */
public class GestArticulos {

    private ArrayList<Articulos> mColArticulos = new ArrayList<Articulos>();
    private static GestArticulos objGestC = null;

    public GestArticulos() {
        Articulos objart = new Articulos();
        mColArticulos = objart.obtenerTodos();
    }

    public static GestArticulos getInstance() {
        if (objGestC == null) {
            objGestC = new GestArticulos();
        }
        return objGestC;
    }

    public boolean verificarArticulo(Articulos xObjA) {
        for (Articulos a : mColArticulos) {
            if (a.getArtCod() == xObjA.getArtCod()) {
                return true;
            }
        }
        return false;
    }

    public boolean altaArticulo(Articulos xObjA) {
        if (!verificarArticulo(xObjA)) {
            mColArticulos.add(xObjA);
            xObjA.guardar();
            return true;
        }
        return false;
    }

    public boolean bajaArticulo(int xObjE) {
        for (Articulos objA : mColArticulos) {
            if (objA.getArtCod() == xObjE) {
                /*for (Factura objF : GestFactura.getInstance().devolverFacturas()) {
                    if (objF.getObjArt().getArtCod() == objA.getArtCod()) {
                        return false;
                    }
                }*/
                mColArticulos.remove(objA);
                objA.eliminar();
                return true;

            }
        }
          

        
        return false;


    }

    public ArrayList<Articulos> devolverArticulo() {
        return mColArticulos;
    }

    public void modificarArticulo(Articulos ObjArt) {
        for (Articulos xObjA : mColArticulos) {
            if (xObjA.getArtCod() == ObjArt.getArtCod()) {
                xObjA.setArtNom(ObjArt.getArtNom());
                xObjA.setArtDesc(ObjArt.getArtDesc());
                xObjA.setArtPrecio(ObjArt.getArtPrecio());
                xObjA.setArtStock(ObjArt.getArtStock());
                xObjA.modificar();
            }
        }
    }

    public int devolverUltimoNum() {
        int mayor = 0;
        for (Articulos xobjE : mColArticulos) {
            if (xobjE.getArtCod() > mayor) {
                mayor = xobjE.getArtCod();
            }
        }
        mayor = mayor + 1;
        return mayor;
    }

    public Articulos devolverartpornombre(String nomart) {
        for (Articulos obje : mColArticulos) {
            if (obje.getArtNom().equals(nomart)) {
                return obje;
            }
        }
        return null;
    }
    public Articulos devolverartpornumero(int numart) {
        for (Articulos obje : mColArticulos) {
            if (obje.getArtCod()==numart) {
                return obje;
            }
        }
        return null;
    }
}
