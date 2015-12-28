/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tsl_nacha.dominio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Enrico
 */
public class Impresora
{
    Font fuente = new Font("Dialog", Font.PLAIN, 10);
	PrintJob pj;	
	Graphics pagina;
	

	/********************************************************************
	*	A continuación el constructor de la clase. Aquí lo único que	*
	*	hago es tomar un objeto de impresion.							*
	********************************************************************/
	public Impresora()
	{
		pj = Toolkit.getDefaultToolkit().getPrintJob(new Frame(), "SCAT", null);
	}
			
	/********************************************************************
	*	A continuación el método "imprimir(String)", el encargado de 	*
	*	colocar en el objeto gráfico la cadena que se le pasa como 		*
	*	parámetro y se imprime.											*
	********************************************************************/
    public void imprimir(Facturas fac)
	{
		//LO COLOCO EN UN try/catch PORQUE PUEDEN CANCELAR LA IMPRESION
		try
		{
			pagina = pj.getGraphics();
			pagina.setFont(fuente);
			pagina.setColor(Color.black);
	
			pagina.drawString("Numero factura" + fac.getfNumero(), 60, 60);
                        pagina.drawString("Fecha" + fac.getfFecha(), 60, 70);
                        int x = 100;
                        for(Lineas l: fac.devolverLineasFact()){
                        pagina.drawString(l.getObjArticulo().getaDescripcion() + " " + l.getlTotal(), 60, x);  
                        x= x + 20;
                        }
                        x= x + 20;
                        pagina.drawString("TOTAL" + fac.getfTotal(), 60, x);

			pagina.dispose();
			pj.end();
		}catch(Exception e)
		{
			System.out.println("LA IMPRESION HA SIDO CANCELADA...");
		}
	}//FIN DEL PROCEDIMIENTO imprimir(String...)

					
}//FIN DE LA CLASE Impresora
