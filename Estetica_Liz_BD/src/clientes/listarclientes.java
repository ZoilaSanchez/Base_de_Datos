/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import static clientes.cliente.clientestab;
import conexion.Conectando;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static servicios.servicios.serviciostab;

/**
 *
 * @author enrique7cp@gmail.com
 */
public class listarclientes {
    
    static Conectando con = new Conectando();
    static Connection cn = con.conect();
    
    public  void listar(String busca) {
        
        DefaultTableModel modelo = (DefaultTableModel) clientestab.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM cliente ORDER BY id";
        } else {
            sql = "SELECT * FROM cliente WHERE (id LIKE'" + busca + "%' OR "
                    + "nombre LIKE'" + busca + "%' OR nit LIKE'"
                    + "ORDER BY id";
        }
        String datos[] = new String[6];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("telefono");
                datos[3] = rs.getString("nit");
                datos[4] = rs.getString("correo");
                datos[5] = rs.getString("dpi");
             
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(listarclientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
