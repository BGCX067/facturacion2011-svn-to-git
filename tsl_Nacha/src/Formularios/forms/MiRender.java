/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios.forms;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class MiRender extends DefaultTableCellRenderer
{
   public Component getTableCellRendererComponent(JTable table,
      Object value,
      boolean isSelected,
      boolean hasFocus,
      int row,
      int column)
   {
      super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);
     
         this.setOpaque(true);
         this.setBackground(Color.DARK_GRAY);
         this.setForeground(Color.WHITE);
            String valor = String.valueOf(table.getValueAt(row, 5));
            int s = Integer.parseInt(valor);
            if(s<10){
                this.setBackground(Color.RED);
             this.setForeground(Color.YELLOW);
            }
      return this;
   }
}