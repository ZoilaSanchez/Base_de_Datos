/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

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
public class listar {
    
    static Conectando con = new Conectando();
    static Connection cn = con.conect();
    
    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) Producto.tabla.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM producto ORDER BY id";
        } else {
            sql = "SELECT * FROM producto WHERE (nombreProducto LIKE'" + busca + "%')"
                    + "ORDER BY id";
        }
        String datos[] = new String[6];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("nombreProducto");
                datos[2] = rs.getString("habilitado");
                datos[3] = rs.getString("proveedor");
                datos[4] = rs.getString("precioVenta");
                datos[5] = rs.getString("stock");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(listar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

}
