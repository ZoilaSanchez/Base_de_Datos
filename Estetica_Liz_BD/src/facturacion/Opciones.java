/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

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
public class Opciones {

    static Conectando cc = new Conectando();
    public static Connection cn = cc.conect();
    static PreparedStatement ps;

    public static void listarVentas(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) facturacion.ListaVentas.tabla.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT P.id, P.nombreProducto, P.precioVenta, F.monto, F.fecha " +
                  "FROM producto P " +
                  "INNER JOIN factura_has_producto FP " +
                  "ON P.id = FP.producto_id " +
                  "INNER JOIN factura F " +
                  "ON FP.factura_id = F.id";
        } else {
            sql = "SELECT P.id, P.nombreProducto, P.precioVenta, F.monto, F.fecha " +
                  "FROM producto P " +
                  "INNER JOIN factura_has_producto FP " +
                  "ON P.id = FP.producto_id " +
                  "INNER JOIN factura F " +
                  "ON FP.factura_id = F.id";
        }
        String datos[] = new String[5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("nombreProducto");
                datos[2] = rs.getString("precioVenta");
                datos[3] = rs.getString("monto");
                datos[4] = rs.getString("fecha");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void listarEntradas(String fecha) {
        DefaultTableModel modelo = (DefaultTableModel) facturacion.CorteDia.ListaEntradas.getModel();

        String sql = "SELECT P.nombreProducto, F.monto, F.fecha FROM producto P INNER JOIN factura_has_producto FP ON P.id = FP.producto_id INNER JOIN factura F ON FP.factura_id = F.id AND DATE(F.fecha) = '"+fecha+"'";
        String datos[] = new String[3];
        System.out.println("pasa por acá");
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("nombreProducto");
                datos[1] = rs.getString("fecha");
                datos[2] = rs.getString("monto");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }

        corteEntradas();
    }

    public static void corteEntradas() {
        int filas = facturacion.CorteDia.ListaEntradas.getRowCount();
        double totalE = 0.0;
        for (int i = 0; i < filas; i++) {
            totalE = totalE + Double.parseDouble(facturacion.CorteDia.ListaEntradas.getValueAt(i, 2).toString());
        }
        facturacion.CorteDia.lblE.setText(String.valueOf(totalE));
    }

    public static void listarSalidas(String fecha) {
        DefaultTableModel modelo = (DefaultTableModel) facturacion.CorteDia.ListaSalidas.getModel();

        String sql = "SELECT * FROM gastos WHERE fecha_gasto = '" + fecha + "'";
        String datos[] = new String[2];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("descripcion");
                datos[1] = rs.getString("gastado");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Opciones.class.getName()).log(Level.SEVERE, null, ex);
        }

        corteSalidas();
    }

    public static void corteSalidas() {
        int filas = facturacion.CorteDia.ListaSalidas.getRowCount();
        double totalE = 0.0;
        for (int i = 0; i < filas; i++) {
            totalE = totalE + Double.parseDouble(facturacion.CorteDia.ListaSalidas.getValueAt(i, 1).toString());
        }
        facturacion.CorteDia.lblS.setText(String.valueOf(totalE));
    }

    public static void corteTotal() {
        double entradas = Double.parseDouble(facturacion.CorteDia.lblE.getText());
        double salidas = Double.parseDouble(facturacion.CorteDia.lblS.getText());
        facturacion.CorteDia.total.setText(String.valueOf(entradas - salidas));
    }


    public static void corteCaja() {
        int filas = facturacion.ListaVentas.tabla.getRowCount();
        double totalE = 0.0;
        for (int i = 0; i < filas; i++) {
            totalE = totalE + Double.parseDouble(facturacion.ListaVentas.tabla.getValueAt(i, 3).toString());
        }
        facturacion.ListaVentas.lblTotal1.setText(String.valueOf(totalE));
    }

}
