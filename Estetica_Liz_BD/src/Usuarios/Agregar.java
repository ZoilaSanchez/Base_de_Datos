/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Usuarios;

import Funciones.Encriptar;
import conexion.Conectando;
import static empleados.Agregarempleados.txtcui1;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyAnimated;
/**
 *
 * @author enrique7cp@gmail.com
 */
public class Agregar extends javax.swing.JDialog {
    Conectando con = new Conectando();
    Connection nConect;
    cargarcombobox cargar =new cargarcombobox();
    Encriptar encri=new Encriptar();
    /** Creates new form Insercion */
    public Agregar() {
        //super(parent, modal);
        this.nConect = con.conect();
        initComponents();
        this.setLocationRelativeTo(null);
         btnRegistrar.setEnabled(false);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiarCampos = new javax.swing.JButton();
        txtcui = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        txfUsuario = new javax.swing.JTextField();
        lblusuario = new javax.swing.JLabel();
        lblcontra = new javax.swing.JLabel();
        CUI = new javax.swing.JLabel();
        lbltipo = new javax.swing.JLabel();
        cbbTipo_us = new javax.swing.JComboBox<String>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblCerrar = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txfContrase = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("REGISTRAR");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 252, 38));

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        btnLimpiarCampos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnLimpiarCampos.setText("LIMPIAR CAMPOS");
        btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 170, -1));

        txtcui.setBackground(new java.awt.Color(51, 51, 255));
        txtcui.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtcui.setForeground(new java.awt.Color(255, 255, 255));
        txtcui.setBorder(null);
        txtcui.setCaretColor(new java.awt.Color(255, 255, 255));
        txtcui.setOpaque(false);
        txtcui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcuiActionPerformed(evt);
            }
        });
        txtcui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcuiKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcuiKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcuiKeyTyped(evt);
            }
        });
        jPanel1.add(txtcui, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 270, -1));

        lblId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblId.setText("ID");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        txfUsuario.setBackground(new java.awt.Color(51, 51, 255));
        txfUsuario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txfUsuario.setBorder(null);
        txfUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txfUsuario.setOpaque(false);
        txfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 250, -1));

        lblusuario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblusuario.setText("Usuario:");
        jPanel1.add(lblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        lblcontra.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblcontra.setText("Contraseña:");
        jPanel1.add(lblcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        CUI.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        CUI.setText("CUI:");
        jPanel1.add(CUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        lbltipo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbltipo.setText("Tipo de Usuario:");
        jPanel1.add(lbltipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        cbbTipo_us.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbbTipo_us.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Tipo", "Administrador", "Empleado" }));
        cbbTipo_us.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbTipo_usMouseClicked(evt);
            }
        });
        cbbTipo_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTipo_usActionPerformed(evt);
            }
        });
        jPanel1.add(cbbTipo_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 190, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 270, 10));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 250, 10));

        lblCerrar.setBackground(new java.awt.Color(102, 0, 204));
        lblCerrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("x");
        lblCerrar.setOpaque(true);
        lblCerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblCerrarMouseMoved(evt);
            }
        });
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrarMouseExited(evt);
            }
        });
        jPanel1.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 30, 30));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 220, 10));

        txfContrase.setBackground(new java.awt.Color(102, 0, 204));
        txfContrase.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfContrase.setForeground(new java.awt.Color(255, 255, 255));
        txfContrase.setBorder(null);
        txfContrase.setCaretColor(new java.awt.Color(255, 255, 255));
        txfContrase.setOpaque(false);
        txfContrase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfContraseKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfContraseKeyTyped(evt);
            }
        });
        jPanel1.add(txfContrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 220, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 425, 365));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        if(this.btnRegistrar.getText().equals("ELIMINAR")){
            try {
                    PreparedStatement eliminar = nConect.prepareStatement("DELETE FROM usuario WHERE empleado_id=?");
                    eliminar.setString(1, txtcui.getText());
                    eliminar.execute();
                    new rojerusan.RSNotifyAnimated("¡ELIMINADO!", "USUARIO ELIMINADO EXITOSAMENTE",
                            5, RSNotifyAnimated.PositionNotify.BottomRight,
                            RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
                    
                       listarusua.listar("");
                       this.txfUsuario.requestFocus();
                       this.txfUsuario.setText("");
                       this.txfContrase.setText("");
                       this.txtcui.setText("");
                    } catch (Exception e) {
                }
        }else{
            if(txfUsuario.getText().equals("") 
                || txfContrase.getText().equals("") 
                || txtcui.getText().equals("")
                || cbbTipo_us.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "FALTAN LLENAR CAMPOS");
            
        }else{
            
            if (this.btnRegistrar.getText().equals("REGISTRAR")) {
                     try {
  
                    PreparedStatement agregarUsuario = nConect.prepareStatement("INSERT INTO usuario (nombreUsuario,contraseña,empleado_id,tipoUsuario_id) VALUES (?,?,?,?)");
                    agregarUsuario.setString(1, txfUsuario.getText());
                    agregarUsuario.setString(2, encri.codificar(encri.getLlave_n(),txfContrase.getText()));
                    agregarUsuario.setString(3, txtcui.getText()); //verificar aqui tengo qeu hacer una busquedad del nombre y que me retornet el id para guardarlo 
                    agregarUsuario.setString(4, verificarCombo());
                    System.out.println("vericiaon: "+ verificarCombo());
                    
                    agregarUsuario.executeUpdate();
                    
                    new rojerusan.RSNotifyAnimated("¡AGREGADO!", "USUARIO AGREGADO EXITOSAMENTE",
                            5, RSNotifyAnimated.PositionNotify.BottomRight,
                            RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
                    
                    listarusua.listar("");
                } catch (SQLException ex) {
                    Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(this.btnRegistrar.getText().equals("GUARDAR")){
                
                 try {
  
                   PreparedStatement agregarUsuario = nConect.prepareStatement("UPDATE  usuario SET nombreUsuario=?, "
                            + "contraseña=?,tipoUsuario_id=? WHERE empleado_id=?"); 
                            
                    agregarUsuario.setString(1, txfUsuario.getText());
                    agregarUsuario.setString(2, encri.codificar(encri.getLlave_n(),txfContrase.getText()));
                    agregarUsuario.setString(4, txtcui.getText()); //verificar aqui tengo qeu hacer una busquedad del nombre y que me retornet el id para guardarlo 
                    agregarUsuario.setString(3, verificarCombo());
                    System.out.println("vericiaon: "+ verificarCombo());
                    
                    agregarUsuario.executeUpdate();
                    
                    new rojerusan.RSNotifyAnimated("¡MODIFICADO!", "USUARIO MODIFICADO EXITOSAMENTE",
                            5, RSNotifyAnimated.PositionNotify.BottomRight,
                            RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
                    
                       listarusua.listar("");
                } catch (SQLException ex) {
                    
                }
                 txtcui.setEditable(true);
            }
        }
        }
        
            
    }//GEN-LAST:event_btnRegistrarActionPerformed
    PreparedStatement buscar;
    public void consultar (String valor) throws SQLException, IOException{
       
        String nombre = "";
        buscar = nConect.prepareStatement("SELECT *FROM empleado WHERE CUI=?");
        buscar.setString(1, valor);
        buscar.execute();

        ResultSet resultadosObtenidos=buscar.executeQuery();
        while(resultadosObtenidos.next()){
             nombre =  resultadosObtenidos.getString("nombre");
        }
        txfUsuario.setText(nombre);
        
    }
    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        this.txfUsuario.requestFocus();
        this.txfUsuario.setText("");
        this.txfContrase.setText("");
        this.txtcui.setText("");

    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    private void lblCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCerrarMouseEntered

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseExited
        lblCerrar.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_lblCerrarMouseExited

    private void lblCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseMoved
        lblCerrar.setBackground(Color.RED);
    }//GEN-LAST:event_lblCerrarMouseMoved

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void cbbTipo_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTipo_usActionPerformed
        
    }//GEN-LAST:event_cbbTipo_usActionPerformed

    private void cbbTipo_usMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbTipo_usMouseClicked
        
    }//GEN-LAST:event_cbbTipo_usMouseClicked

    private void txfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfUsuarioActionPerformed
       
    }//GEN-LAST:event_txfUsuarioActionPerformed

    private void txtcuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcuiActionPerformed
       
    }//GEN-LAST:event_txtcuiActionPerformed

    private void txtcuiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuiKeyPressed
        
    }//GEN-LAST:event_txtcuiKeyPressed

    private void txfContraseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfContraseKeyPressed

    }//GEN-LAST:event_txfContraseKeyPressed

    private void txfContraseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfContraseKeyTyped

    }//GEN-LAST:event_txfContraseKeyTyped

    private void txtcuiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuiKeyTyped
         int limite = 13;
        char car = evt.getKeyChar();
        if (Character.isDigit(car) && car != KeyEvent.VK_SPACE) {

        } else {
            evt.consume();
            getToolkit().beep();
        }
        if (txtcui.getText().length() == limite) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcuiKeyTyped

    private void txtcuiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuiKeyReleased
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           try {
            consultar(txtcui.getText());
             btnRegistrar.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    }//GEN-LAST:event_txtcuiKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Agregar dialog = new Agregar();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CUI;
    public javax.swing.JButton btnLimpiarCampos;
    public static javax.swing.JButton btnRegistrar;
    public javax.swing.JComboBox<String> cbbTipo_us;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblCerrar;
    public static javax.swing.JLabel lblId;
    public static javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblcontra;
    private javax.swing.JLabel lbltipo;
    private javax.swing.JLabel lblusuario;
    public javax.swing.JPasswordField txfContrase;
    public static javax.swing.JTextField txfUsuario;
    public static javax.swing.JTextField txtcui;
    // End of variables declaration//GEN-END:variables

    public String verificarCombo(){
        if(cbbTipo_us.getSelectedIndex()==1){
            return "1";
        }
        return "2";
    }
    
}
