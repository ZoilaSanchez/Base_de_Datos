/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citas;

import static citas.mostrarcita.citatab;
import productos.*;
import conexion.Conectando;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.StyleConstants;

/**
 *
 * @author enrique7cp@gmail.com
 */
public class mostrar {
    
    static Conectando con = new Conectando();
    static Connection cn = con.conect();
    
    public  void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) citatab.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM cita ORDER BY id";
        } else {
            sql = "SELECT * FROM cita WHERE (nombre LIKE'" + busca + "%')"
                    + "ORDER BY id";
        }
        String datos[] = new String[9];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("identificacion");
                datos[2] = rs.getString("nombre");
                datos[3] = rs.getString("motivo");
                datos[4] = rs.getString("telefono");
                datos[5] = rs.getString("hora");
                datos[6] = rs.getString("fecha");
                datos[7] = rs.getString("estado");
                datos[8] = rs.getString("cliente_id");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(mostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
