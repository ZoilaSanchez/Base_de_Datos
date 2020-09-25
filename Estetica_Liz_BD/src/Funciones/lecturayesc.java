/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import static Usuarios.Agregar.txtcui;
import conexion.Conectando;
import conexion.Conexion;
import static empleados.Agregarempleados.coreo;
import static empleados.Agregarempleados.fecha1;
import static empleados.Agregarempleados.fechafin;
import static empleados.Agregarempleados.fechainicio;
import static empleados.Agregarempleados.horaspresenciales1;
import static empleados.Agregarempleados.nombre1;
import static empleados.Agregarempleados.telefono2;
import static empleados.Agregarempleados.txtcui1;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import rojerusan.RSNotifyAnimated;


/**
 *
 * @author Lopez
 */
public class lecturayesc {
    Conectando con = new Conectando();
    Connection nConect;
    Connection cn = con.conect();
    
    String nombreusuario="";
    String contador="";
    public void insertaraux(String usuario) throws SQLException{
        PreparedStatement agregar = cn.prepareStatement("INSERT INTO auxiliar (id, nombre, contador)"+ " VALUES (?,?,?)");
                agregar.setString(1, "1");
                agregar.setString(2, usuario);
                agregar.setString(3, "1");
                agregar.executeUpdate();
                new rojerusan.RSNotifyAnimated("¡AGREGADO!", "elimianr despues linea xx",
                5, RSNotifyAnimated.PositionNotify.BottomRight,
                RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
    }
    
    public void actualizarcontaaro(int contador) throws SQLException{
        PreparedStatement agregar = cn.prepareStatement("UPDATE  auxiliar SET nombre=?,"
                        + "contador=? WHERE id=?");
                agregar.setString(3, "1");
                agregar.setString(1, retornarusuario("1"));
                agregar.setInt(2, contador);
                agregar.executeUpdate();
    }
    public String retornarusuario(String i) throws SQLException{
           String sql= "SELECT *FROM auxiliar WHERE (id LIKE'"+i+"%')" ;
       
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nombreusuario=rs.getString("nombre");
            }
                 return nombreusuario;
    }
    
    public Integer retornarcontador() throws SQLException{
           String sql= "SELECT *FROM auxiliar WHERE (id LIKE'"+1+"%')" ;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                contador=rs.getString("contador");
            }
                 return Integer.valueOf(contador);
    }
    
    public void elimianrresgistros() throws SQLException{
        PreparedStatement eliminar = cn.prepareStatement("DELETE FROM auxiliar WHERE id=?");
            eliminar.setString(1, "1");
            eliminar.execute();
                   
    }
    public String tiempo(){
        Date objDate = new Date(); 
        // Mostrar la fecha y la hora usando toString ()
        System.out.println(objDate.toString());

        String strDateFormat = "hh:mm:ss a dd-MMM-yyyy"; // El formato de fecha está especificado  
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto 
        return objSDF.format(objDate);
    
    }
    public void lectura(String nombreArchivo){
        File archivo;
        FileReader fr;
        BufferedReader br;
        try {
            archivo=new File(nombreArchivo);
            fr=new FileReader(archivo);
            br= new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null){
                System.out.println(linea); //se escribe lo de la linea
            }
            //cerrar los archvios
            br.close();
            fr.close();
        } catch (Exception e) {
        }
    }
    
    public void escritura(String nombreArchivo,String modulo,String Usuario,String numero,String estado,String Operacion) throws IOException{
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo=new File(nombreArchivo);
        if(!archivo.exists()){
            archivo.createNewFile();
            //true se utiliza para escribir al final de un archivo
            escribir=new FileWriter(archivo,true);
            linea= new PrintWriter(escribir);
            //escribir en el archivo como tal
            linea.println(" Bitacora ");
            linea.println("< T No. "+numero+" >< Start >");
            linea.println("< Status >< "+estado+" >");
            linea.println("< TS >< "+tiempo() +" >");
            linea.println("< Operacion >< "+Operacion +" >");
            linea.println("< Usuario >< "+Usuario +" >");
            linea.println("< Modulo >< "+modulo +" >");
            linea.println("");
            //cerrar las lineas
            linea.close();
            escribir.close();
        }else{
            //true se utiliza para escribir al final de un archivo
            escribir=new FileWriter(archivo,true);
            linea= new PrintWriter(escribir);
            //escribir en el archivo como tal
            linea.println("");
            linea.println("< T No. "+numero+" >< Start >");
            linea.println("< Status >< "+estado+" >");
            linea.println("< TS >< "+tiempo() +" >");
            linea.println("< Operacion >< "+Operacion +" >");
            linea.println("< Usuario >< "+Usuario +" >");
            linea.println("< Modulo >< "+modulo +" >");
            linea.println("");
            //cerrar las lineas
            linea.close();
            escribir.close();
        }
    }//cerrar el metodo escritura
}
