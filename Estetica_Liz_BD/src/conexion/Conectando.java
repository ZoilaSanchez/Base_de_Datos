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
public class Conectando {

    Connection connection = null;
    
    public Connection conect(){
        
        try {
            //Indicamos cual driver vamos a utilizar
            Class.forName("com.mysql.jdbc.Driver");
            //Abrimos una coneccion a la DB usando una url en la que indicamos el
            //nombre de la base datos y como parametros enviamos el usuario y la contrasena
<<<<<<< Updated upstream
            connection = DriverManager.getConnection("jdbc:mysql://localhost?user=root&password=hola");
=======
<<<<<<< HEAD
            connection = DriverManager.getConnection("jdbc:mysql://localhost?user=root&password=12345");
=======
            connection = DriverManager.getConnection("jdbc:mysql://localhost?user=root&password=hola");
>>>>>>> 7a7c45b66d681087627b591d5dc6eff39aa20e93
>>>>>>> Stashed changes
            Statement seleccionarBaseDatos = connection.createStatement();
            seleccionarBaseDatos.execute("USE bdestetica"); 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conectando.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conectando.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}
