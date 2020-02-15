/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estetica_liz_bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lopez
 */
public class Conexion_BD {
    //enlace hacia la ruta , localhost es la ip
   
    private static String URL = "jdbc:mariadb://localhost:3306/bd_estetica";
        private static String Usuario="root";
        private static String contraseña="199810";
 
public static Connection conectar() throws InstantiationException, IllegalAccessException{

      Connection conexion=null;
      try {
          System.out.println("hola");
          Class.forName("org.mariadb.jdbc.Driver").newInstance();
          
          conexion=DriverManager.getConnection(URL, Usuario, contraseña);
          
          System.out.println("Conexion Establecida");
      } catch (ClassNotFoundException | SQLException e) {
          System.out.println("Error de conexion "+e);
      }
      
      return conexion;
  }
 
}
