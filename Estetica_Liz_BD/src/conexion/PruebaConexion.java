/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import Inicio.inicio_sesion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author enrique7cp@gmail.com
 */
public class PruebaConexion {

    Connection connection = null;
    
    public Connection conect(){
        
        try {
            //Indicamos cual driver vamos a utilizar
            Class.forName("com.mysql.jdbc.Driver");
            
            //Abrimos una coneccion a la DB usando una url en la que indicamos el
            //nombre de la base datos y como parametros enviamos el usuario y la contrasena
            connection = DriverManager.getConnection("jdbc:mysql://localhost?user=root&password=12345");
            Statement seleccionarBaseDatos = connection.createStatement();
            seleccionarBaseDatos.execute("USE bdestetica");
            
            //Se crea el objeto escritorio para desplegar toda la interfaz grafica
            new inicio_sesion(connection).setVisible(true);
            System.out.println("conexion establecida");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PruebaConexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PruebaConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}
