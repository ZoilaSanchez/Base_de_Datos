/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import Inicio.inicio_sesion;
import java.sql.SQLException;
import splash.SplashScreen;

/**
 *
 * @author Lopez
 */
public class Conexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, SQLException {
       
        Conectando conectar = new Conectando();
     
        conectar.conect();
        if(conectar.conect().isValid(0) == true){
            //Se crea el objeto escritorio para desplegar toda la interfaz grafica
            new SplashScreen().setVisible(true);
//            new inicio_sesion(conectar.conect()).setVisible(true);
            System.out.println("conexion establecida");
        }
    }
    
}
