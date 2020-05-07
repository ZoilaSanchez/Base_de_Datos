/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Informe;

import conexion.Conectando;
import empleados.listaemple;
import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Lopez
 */
public class graficos {
       static Conectando con = new Conectando();
    static Connection cn = con.conect();
    
   public static void generarBarras(JPanel x,String mes1,String me1) throws SQLException{
     
        CallableStatement cst = con.conect().prepareCall("{call insertares (?)}");
                             cst.setString(1, "1");
                             cst.executeQuery();
                             
           DefaultCategoryDataset ds=new DefaultCategoryDataset();
            String sql= "SELECT  s.nombreServicio AS nombrep ,sum(sf.total) as total FROM factura_has_servicio sf "
                    + "INNER JOIN servicio s ON sf.servicio_id=s.id inner JOIN factura ff ON\n" +
"ff.id=sf.factura_id where MONTH(ff.fecha) ='"+mes1+"%' AND  YEAR(ff.fecha) ='"+mes1+"%' GROUP BY sf.servicio_id;";
          
              String nombreservicio="";
              String totalservicios="";
      
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nombreservicio=rs.getString("nombrep");
                totalservicios=rs.getString("total");
               ds.addValue(Integer.valueOf(totalservicios),nombreservicio, "");
            }
            String sql2= "SELECT p.nombreProducto AS nombrepS ,sum(f.total) as totalS FROM factura_has_producto f "
                    + "INNER JOIN producto p ON f.producto_id=p.id  \n" +
"inner JOIN factura ff ON\n" +
"ff.id=f.factura_id WHERE MONTH(ff.fecha)='"+mes1+"%'  AND  YEAR(ff.fecha)='"+mes1+"%'  GROUP by  f.producto_id;";
          
              String nombreproducto="";
              String totalproducot="";
      
            Statement st1 = cn.createStatement();
            ResultSet rs1 = st1.executeQuery(sql2);
            while (rs1.next()) {
                nombreproducto=rs1.getString("nombreps");
                totalproducot=rs1.getString("totals");
               ds.addValue(Integer.valueOf(totalproducot),nombreproducto, "");
            }
            
          
           
                                                        
           JFreeChart jf=ChartFactory.createBarChart3D("VENTAS", "Productos/servicios", "Precios", ds, PlotOrientation.VERTICAL, true, true, true);
           x.setLayout(new java.awt.BorderLayout()); 
           ChartPanel CP = new ChartPanel(jf);
           x.add(CP,BorderLayout.CENTER);
           x.validate();

       
   } 
   
    public static void generarBarras2(JPanel x) throws SQLException{
     
        CallableStatement cst = con.conect().prepareCall("{call insertares (?)}");
                             cst.setString(1, "1");
                             cst.executeQuery();
                             
           DefaultCategoryDataset ds=new DefaultCategoryDataset();
            String sql= "SELECT s.nombreServicio AS nombrep ,sum(sf.total) as total "
                    + "FROM factura_has_servicio sf INNER JOIN "
                    + "servicio s ON sf.servicio_id=s.id   GROUP BY sf.servicio_id;";
              String nombreservicio="";
              String totalservicios="";
      
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nombreservicio=rs.getString("nombrep");
                totalservicios=rs.getString("total");
               ds.addValue(Integer.valueOf(totalservicios),nombreservicio, "");
            }
            String sql2= "SELECT p.nombreProducto AS nombrepS ,sum(f.total) as totalS FROM "
                    + "factura_has_producto f INNER JOIN producto p ON f.producto_id=p.id GROUP BY f.producto_id;";
          
              String nombreproducto="";
              String totalproducot="";
      
            Statement st1 = cn.createStatement();
            ResultSet rs1 = st1.executeQuery(sql2);
            while (rs1.next()) {
                nombreproducto=rs1.getString("nombreps");
                totalproducot=rs1.getString("totals");
               ds.addValue(Integer.valueOf(totalproducot),nombreproducto, "");
            }
            
          
           
                                                        
           JFreeChart jf=ChartFactory.createBarChart3D("VENTAS", "Productos/servicios", "Precios", ds, PlotOrientation.VERTICAL, true, true, true);
           x.setLayout(new java.awt.BorderLayout()); 
           ChartPanel CP = new ChartPanel(jf);
           x.add(CP,BorderLayout.CENTER);
           x.validate();

       
   } 
}
