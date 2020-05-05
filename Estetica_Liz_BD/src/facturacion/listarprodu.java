/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

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
public class listarprodu {
    
    static Conectando con = new Conectando();
    static Connection cn = con.conect();
    
    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) Productos.tablap.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT *FROM producto ORDER BY id";
        } else {
             int cont =0;
            try {
                 int numero = new Integer(busca);
                 cont++;
                 System.out.println("Es unnumero ");
            } catch (Exception e) {
                System.out.println("Es una letra");
            }
            if(cont>0){
                 sql= "SELECT *FROM producto WHERE (precioVenta LIKE'"+busca+"%')";
                 
            }else{
                sql= "SELECT *FROM producto WHERE (nombreProducto LIKE'"+busca+"%')";
            }
        }
        String datos[] = new String[7];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("nombreProducto");
                datos[2] = rs.getString("precioVenta");
                datos[3] = rs.getString("stock");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(listarprodu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void listarfac(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) facturas.tabla.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT *FROM factura f , empleado e WHERE e.CUI=f.empleado_id;";
        } else {
            
        }
        String datos[] = new String[7];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("fecha");
                datos[3] = rs.getString("nit");
                datos[4] = rs.getString("descripcion");
                datos[5] = rs.getString("monto");
                datos[6] = rs.getString("e.nombre");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(listarprodu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
