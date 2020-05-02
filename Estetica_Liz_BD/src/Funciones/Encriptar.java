/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;
/**
 *
 * @author Lopez
 */
public class Encriptar {
    private String llave_n="verificacion";

    public String getLlave_n() {
        return llave_n;
    }
    public String codificar(String llave, String contraseña){
       String encriptacion_lista=" ";
        try {
            MessageDigest crip= MessageDigest.getInstance("MD5");
            byte[] llavecontra= crip.digest(llave.getBytes("utf-8"));
            byte[] copia_original= Arrays.copyOf(llavecontra, 24); //base 24
            //intacia de la llave secreta
            SecretKeySpec llavee=new SecretKeySpec(copia_original, "DEsede");//llave secreta
            Cipher cifra=Cipher.getInstance("DEsede");//para desencriptar
            //tipo de encriptacion
            cifra.init(Cipher.ENCRYPT_MODE, llavee);
            //encriptacion
            
            byte[] texto_de_byte=contraseña.getBytes("utf-8");
            //se gurada el cifrado
            byte[] guardar= cifra.doFinal(texto_de_byte);//guarda el cifrado
            byte[] base=Base64.encodeBase64(guardar);
            encriptacion_lista=new String(base);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "verificar algo");
        }
      return encriptacion_lista;
    }
    public String decodificar(String llave, String contraseña){
          String dencriptacion_lista=" ";
        try {
            byte[] mensaje= Base64.decodeBase64(contraseña.getBytes("utf-8"));
            MessageDigest descrip= MessageDigest.getInstance("MD5");
            byte[] digestofPassword = descrip.digest(llave.getBytes("utf-8"));
            byte[] llave_byte= Arrays.copyOf(digestofPassword, 24);
            SecretKeySpec llavee=new SecretKeySpec(llave_byte, "DEsede");//llave secreta
            Cipher decifra=Cipher.getInstance("DEsede");//para desencriptar
            decifra.init(Cipher.DECRYPT_MODE, llavee);
            byte[] texto_des= decifra.doFinal(mensaje);
            dencriptacion_lista=new String(texto_des,"utf-8");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "verificar algo");
        }
      return dencriptacion_lista;
    }
}
