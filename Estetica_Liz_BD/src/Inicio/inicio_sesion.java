/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import Funciones.Encriptar;
import Principal.*;
import facturacion.Ventas;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import java.applet.AudioClip;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import splash.FadeEffect;
//import javafx.collections.ObservableList;

/**
 *
 * @author Lopez
 */
public class inicio_sesion extends javax.swing.JFrame {

    /**
     * Creates new form inicio_sesion
     */
    Connection conexion;
    Encriptar encriptar=new Encriptar();
    AudioClip iniciar;
    public inicio_sesion(Connection conexion) {
//        txfUsuario.requestFocus(true);
        initComponents();
        tran();
         this.conexion = conexion;
        this.setLocationRelativeTo(null);
        this.txfUsuario.requestFocus();
        FadeEffect.fadeInFrame(this, 50, 0.1f);
        
    }
    public void tran(){
        btnEntrar.setOpaque(false);
        btnEntrar.setContentAreaFilled(false);
        btnEntrar.setBackground(new Color(0,0,0,0));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        txfUsuario = new javax.swing.JTextField();
        txfContraseña = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nombre.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 30, 30));

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuveoContacto.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 30, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingresar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonIngresarSS.png"))); // NOI18N
        btnEntrar.setBorderPainted(false);
        btnEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEntrar.setOpaque(false);
        btnEntrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonIngresarG.png"))); // NOI18N
        btnEntrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonIngresarG.png"))); // NOI18N
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 170, 60));

        txfUsuario.setBackground(new java.awt.Color(102, 0, 204));
        txfUsuario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txfUsuario.setBorder(null);
        txfUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txfUsuario.setOpaque(false);
        jPanel1.add(txfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 190, 20));

        txfContraseña.setBackground(new java.awt.Color(102, 0, 204));
        txfContraseña.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txfContraseña.setBorder(null);
        txfContraseña.setCaretColor(new java.awt.Color(255, 255, 255));
        txfContraseña.setOpaque(false);
        txfContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfContraseñaActionPerformed(evt);
            }
        });
        txfContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfContraseñaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfContraseñaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfContraseñaKeyTyped(evt);
            }
        });
        jPanel1.add(txfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 190, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 190, 10));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 190, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("x");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 30, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoEscritorio.jpg"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  String nombre_u;
    String contra_u;
    String tipo;
    private List<personal> listadoPersonal;
    ArrayList <personal> busquedaPersonal = new ArrayList<>();
    //private ObservableList<personal> listadoPersonalObservable;
    
  
      //Metodo que se encarga de convertir una tabla de MySQL a un listado por tuplas 
    
 
     PreparedStatement buscar;
     public void consultar (String valor) throws SQLException, IOException{
        
        buscar = conexion.prepareStatement("SELECT *FROM tipousuario WHERE id LIKE ?");
               
        buscar.setString(1, valor);
        buscar.execute();

        ResultSet resultadosObtenidos=buscar.executeQuery();
        while(resultadosObtenidos.next()){
            String id =  resultadosObtenidos.getString("id");
            String ad= resultadosObtenidos.getString("tipo") ;
       
            //Crea un objeto de tipo estudiante en base a la tupla que acaba de leer
                personal personaln= new personal(id,ad);
                //Añade ese estudiante a un listado para mostrar los datos luego en una tabla
                busquedaPersonal.add(personaln);
        }
        
    }
     Boolean ver=false;
     Boolean empleado=false;
     
     public void entrar(){
      ArrayList<String> VerificarUsuario= new ArrayList<>();
        ArrayList<String> Verificarcontra= new ArrayList<>();
        PreparedStatement buscarUsuario;
    try {
        buscarUsuario = conexion.prepareStatement("SELECT *FROM usuario WHERE nombreUsuario=? AND contraseña=? ");
        buscarUsuario.setString(1,txfUsuario.getText() );
        buscarUsuario.setString(2, encriptar.codificar(encriptar.getLlave_n(), txfContraseña.getText()));        
        buscarUsuario.execute();
        ResultSet resultadosObtenidos=buscarUsuario.executeQuery();
        String CUIclie="";
        while(resultadosObtenidos.next()){
             nombre_u =resultadosObtenidos.getString("nombreUsuario");
             contra_u=resultadosObtenidos.getString("contraseña");
             tipo=resultadosObtenidos.getString("tipoUsuario_id");
             CUIclie=resultadosObtenidos.getString("empleado_id");
             Ventas.idusuarios(CUIclie);
             consultar(tipo);
             
             for (int i = 0; i < busquedaPersonal.size(); i++) {
                
                 
                 if(Integer.valueOf(tipo)== Integer.valueOf(busquedaPersonal.get(i).getId())){
                     System.out.println("econtrado");
                     String nue=busquedaPersonal.get(i).getTipo();
                     if(busquedaPersonal.get(i).getTipo().equals("a")){
                         ver=true;
                         empleado=false;
                        
                     }else if (busquedaPersonal.get(i).getTipo().equals("b")){
                         empleado=true;
                         ver=false;
                        
                     }
                     
                 }
                 System.out.println(busquedaPersonal.get(i).getId());
                 
            }
             
             
             String real= encriptar.decodificar(encriptar.getLlave_n(), contra_u);
             System.out.println(real);
            VerificarUsuario.add(contra_u);  
            Verificarcontra.add(contra_u);
        }

        if(VerificarUsuario.isEmpty()&& Verificarcontra.isEmpty()){ //si mi lista esta vacia no hay ningun usuario
        JOptionPane.showMessageDialog(this, "Usuario y/o Contraseña Incorrecta");
        }else{
             iniciar=java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/sonido.wav"));
             iniciar.play();
            System.out.println(ver);
            if(ver==true){
                System.out.println("Bienevido administrador");
                Principal_administrador ventanaAdm = new Principal_administrador();
                ventanaAdm.setVisible(true);
                this.dispose();;
            }else if(empleado==true){
            Principal_empleado ventanaempleados = new Principal_empleado();
                ventanaempleados.setVisible(true);
                this.dispose();
            }
            
           
           
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(inicio_sesion.class.getName()).log(Level.SEVERE, null, ex);
    }   catch (IOException ex) {
            Logger.getLogger(inicio_sesion.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        entrar();          
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void txfContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfContraseñaKeyPressed
        
    }//GEN-LAST:event_txfContraseñaKeyPressed

    
    private void txfContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfContraseñaKeyTyped
      
    }//GEN-LAST:event_txfContraseñaKeyTyped

    private void txfContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfContraseñaKeyReleased
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            entrar();   
       }
    }//GEN-LAST:event_txfContraseñaKeyReleased

    private void txfContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfContraseñaActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txfContraseña;
    private javax.swing.JTextField txfUsuario;
    // End of variables declaration//GEN-END:variables
}
