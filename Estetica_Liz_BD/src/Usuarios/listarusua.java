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
 * @author López
 */
public class listarusua {
    
    static Conectando con = new Conectando();
    static Connection cn = con.conect();
    
    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) usuario.usuariostab.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT *FROM usuario a , tipousuario t, "
                    + "empleado e WHERE t.id=a.tipoUsuario_id AND e.CUI=a.empleado_id;";
        } 
        else {
//            sql = "SELECT id, nombreUsuario FROM usuario WHERE (id LIKE'" + busca + "%' OR "
//                    + "nombreUsuario LIKE'" + busca + "%' OR nombreUsuario LIKE'"
//                    + "ORDER BY id";
            sql= "SELECT *FROM usuario WHERE (nombreUsuario LIKE'"+busca+"%')" ;
          
        }
        String datos[] = new String[6];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("CUI");
                datos[1] = rs.getString("nombreUsuario");
                datos[2] = rs.getString("e.nombre");
                datos[3] = rs.getString("t.tipo");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(listarusua.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
