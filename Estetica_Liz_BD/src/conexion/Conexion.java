/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import Funciones.Encriptar;
import Inicio.inicio_sesion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Lopez
 */
public class Conexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, SQLException {

    Connection connection = null;
            try {
                //Indicamos cual driver vamos a utilizar
                Class.forName("com.mysql.jdbc.Driver");

                //Abrimos una coneccion a la DB usando una url en la que indicamos el
                //nombre de la base datos y como parametros enviamos el usuario y la contrasena 
                connection = DriverManager.getConnection("jdbc:mysql://localhost?user=root&password=hola");
                Statement seleccionarBaseDatos = connection.createStatement();
                seleccionarBaseDatos.execute("USE bdestetica");

                //Se crea el objeto escritorio para desplegar toda la interfaz grafica
                new inicio_sesion(connection).setVisible(true);
                System.out.println("conexion establecida");
            } catch (ClassNotFoundException e) {
                System.out.println("error");
                e.printStackTrace(System.out);
            }
    }
    
}
