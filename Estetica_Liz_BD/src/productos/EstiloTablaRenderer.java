/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author enrique7cp@gmail.com
 */
public class EstiloTablaRenderer extends DefaultTableCellRenderer {

    private Component componente;
    private int noColumna;

    public EstiloTablaRenderer(int noColumna) {
        this.noColumna = noColumna;
    }
    

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.       
        this.setHorizontalAlignment(0);
        this.setBorder(null);
        this.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(153,153,255)));
        
        if (row % 2 == 0) {
            componente.setForeground(new Color(153,153,255));
            componente.setBackground(new Color(255, 255, 255));
        } else {
            componente.setForeground(new Color(153,153,255));
            componente.setBackground(new Color(255, 255, 255));
        }
        if(table.getValueAt(row, noColumna).toString().equals("0")){
            componente.setBackground(Color.RED);
        }
        if (isSelected) {
            componente.setForeground(Color.white);
            componente.setBackground(new Color(153,153,255));
            componente.setFont(new Font("Tahoma", Font.BOLD, 14));
        }
        
        return componente;

    }

}
