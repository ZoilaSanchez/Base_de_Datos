/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gastos;

import conexion.Conectando;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyAnimated;

/**
 *
 * @author enrique7cp@gmail.com
 */
public class Opciones {
    static Conectando cc = new Conectando();
    static Connection cn = cc.conect();
    static PreparedStatement ps;

    public static int registrar(Sentencias uc) {
        int rsu = 0;
        String sql = Sentencias.REGISTRAR;
        try {
            //desactivando autocommit e iniciando transaccion
            cn.setAutoCommit(false);
            
            ps = cn.prepareStatement(sql);
            ps.setString(1, uc.getDescripcion());
            ps.setDouble(2, uc.getGastado());
            ps.setString(3, uc.getFecha());
            rsu = ps.executeUpdate();
            //comprometiendo transaccion
            cn.commit();
        } catch (SQLException ex) {
            System.out.println(ex);
            try {
                if (cc.conect().isValid(0) == false) {
                        //abortando transacción    
                        cn.rollback();
                    }
            } catch (SQLException ex1) {
                Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex1);
            }
            new rojerusan.RSNotifyAnimated("¡ERROR!", "NO SE PUDO REGISTRAR EL GASTO",
                    5, RSNotifyAnimated.PositionNotify.BottomRight,
                    RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.WARNING).setVisible(true);
        }
        System.out.println(sql);
        return rsu;
    }

    public static int actualizar(Sentencias uc) {
        int rsu = 0;
        String sql = Sentencias.ACTUALIZAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, uc.getDescripcion());
            ps.setDouble(2, uc.getGastado());
            ps.setString(3, uc.getFecha());
            ps.setInt(4, uc.getId());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        System.out.println(sql);
        return rsu;
    }


    public static void totalGastos() {
        int filas = gastos.Salidas.tabla.getRowCount();
        double totalE = 0.0;
        for (int i = 0; i < filas; i++) {
            totalE = totalE + Double.parseDouble(gastos.Salidas.tabla.getValueAt(i, 1).toString());
        }
        gastos.Salidas.lblTotal1.setText(String.valueOf(totalE));
    }
    
    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) Salidas.tabla.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = Sentencias.LISTAR;
            Salidas.descripcion.setText("");
        } else {
            sql = "SELECT * FROM gastos WHERE (id LIKE'" + busca + "%' OR "
                    + "descripcion LIKE'" + busca + "%' OR "
                    + "gastado LIKE'" + busca + "%' OR fecha LIKE'" + busca + "%') "
                    + "ORDER BY fecha";
            Salidas.descripcion.setText("");
        }
        String datos[] = new String[3];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("gastado");
                datos[2] = rs.getString("fecha");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void extraerDescripcion(String id) {
        String c = null;
        String SQL = "SELECT * FROM gastos WHERE id = "+id;

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(2);
            }
            System.out.println(c);           
            Salidas.descripcion.setText(c);

        } catch (SQLException ex) {
            Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
