/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;


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
public class listarServicios {
    
      static Conectando con = new Conectando();
    static Connection cn = con.conect();
    
    public static void listars(String busca) {
         DefaultTableModel modelo = (DefaultTableModel) Productos1.tablaps.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM servicio ORDER BY id";
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
                 sql= "SELECT *FROM servicio WHERE (precio LIKE'"+busca+"%')";
                 
            }else{
                sql= "SELECT *FROM servicio WHERE (nombreServicio LIKE'"+busca+"%')";
            }           
        }
        String datos[] = new String[4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("precio");
                datos[2] = rs.getString("categoria");
                datos[3] = rs.getString("nombreServicio");
             
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(listarServicios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
