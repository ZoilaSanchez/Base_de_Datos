/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import conexion.Conectando;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author lucil
 */
public class cargarcomboboxservicio {
    Conectando conexion= new Conectando();
    
    public void consuta_tipocliente(JComboBox jcampo){
       java.sql.Connection conectar=null; //guardar conexion
       String consul= "SELECT tipo FROM tipocliente ORDER BY id ASC";
       try {
           //como hacer el conect();
           conectar= conexion.conect();
           PreparedStatement pst=conectar.prepareStatement(consul);
           ResultSet resul=pst.executeQuery();
           //llenar el combo
           jcampo.addItem("Seleccione una opcion");
           //next siguiente buscar
           while(resul.next()){
               jcampo.addItem(resul.getString("tipo"));
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
