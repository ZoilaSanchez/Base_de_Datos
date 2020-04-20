/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marketing;

import conexion.Conectando;
import java.sql.Connection;
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
public class listarClienteCorreo {
    static Conectando con = new Conectando();
    static Connection cn = con.conect();
    
    public static void listar(String busca) {
        
        DefaultTableModel modelo = (DefaultTableModel) ClientesCorreo.tablita.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT  * FROM cliente ORDER BY id";
        } else {
            sql = "SELECT * FROM cliente WHERE (nombre LIKE'" + busca + "%')"
                    + "ORDER BY id";
        }
        String datos[] = new String[3];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("correo");
             
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(listarClienteCorreo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
