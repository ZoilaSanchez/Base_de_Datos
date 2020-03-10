/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import productos.*;
import conexion.Conectando;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author enrique7cp@gmail.com
 */
public class listarusua {
    
    static Conectando con = new Conectando();
    static Connection cn = con.conect();
    
    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) usuario.tabla.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM usuario ORDER BY id";
        } else {
            sql = "SELECT id, nombreUsuario FROM usuario WHERE (id LIKE'" + busca + "%' OR "
                    + "nombreUsuario LIKE'" + busca + "%' OR nombreUsuario LIKE'"
                    + "ORDER BY id";
        }
        String datos[] = new String[6];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("nombreUsuario");
                datos[2] = rs.getString("contraseña");
                datos[3] = rs.getString("empleado_id");
                datos[4] = rs.getString("tipoUsuario_id");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(listarusua.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
