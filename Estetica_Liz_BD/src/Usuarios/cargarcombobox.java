/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import conexion.Conectando;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Lopez
 */
public class cargarcombobox {
   Conectando conexion= new Conectando();
   
   public void consultas_empelados(JComboBox cbbx_empleado){
       java.sql.Connection conectar=null; //guardar conexion
       String consul= "SELECT nombre FROM empleado ORDER BY nombre ASC";
       try {
           conectar= conexion.conect();
           PreparedStatement pst=conectar.prepareStatement(consul);
           ResultSet resul=pst.executeQuery();
           //llenar el combo
           cbbx_empleado.addItem("Seleccione una opcion");
           //next siguiente buscar
           while(resul.next()){
               cbbx_empleado.addItem(resul.getString("nombre"));
               
           }
           
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,e);
       }finally{
            // En ambos casos de error y de exito
           if (conectar!=null){
               System.out.println("conexion exitosa");
               try {
                   conectar.close();
               } catch (SQLException ex) {
                  JOptionPane.showMessageDialog(null,ex);
               }
           }
       }
       
   }
    
}
