/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import conexion.Conectando;
import static empleados.mostraremple.EMPLETAB;
import java.sql.Connection;
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
public class listaemple {
    
    static Conectando con = new Conectando();
    static Connection cn = con.conect();
    
    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) EMPLETAB.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT *FROM empleado a , establecimiento t WHERE t.id=a.establecimiento_id;";
        } 
        else {
//            sql = "SELECT id, nombreUsuario FROM usuario WHERE (id LIKE'" + busca + "%' OR "
//                    + "nombreUsuario LIKE'" + busca + "%' OR nombreUsuario LIKE'"
//                    + "ORDER BY id";
            sql= "SELECT *FROM usuario WHERE (nombreUsuario LIKE'"+busca+"%')" ;
          
        }
        String datos[] = new String[9];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("CUI");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("correo");
                datos[3] = rs.getString("fechaNacimiento");
                datos[4] = rs.getString("telefono");
                datos[5] = rs.getString("t.nomEstablecimiento");
                datos[6] = rs.getString("horasPrecenciales");
                datos[7] = rs.getString("Habilitado");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(listaemple.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
