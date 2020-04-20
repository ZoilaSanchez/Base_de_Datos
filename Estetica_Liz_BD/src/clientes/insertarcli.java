/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import empleados.*;
import com.github.sarxos.webcam.Webcam;
        
import conexion.Conectando;
import java.awt.Color;
import java.awt.Image;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import productos.Insercion;
import rojerusan.RSNotifyAnimated;

/**
 *
 * @author lucil
 */
public class insertarcli extends javax.swing.JDialog {
    
    Conectando con = new Conectando();
    Connection nConect;
    listarclientes lis=new listarclientes();
    /**
     * Creates new form insertarcli
     */
    public insertarcli() {
        this.nConect = con.conect();
        initComponents();
        this.setLocationRelativeTo(null);
        lis.listar("");
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
        lbtitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txnit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txcorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtelefono = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        lblCerrar1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txdpi = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(360, 390));
        setPreferredSize(new java.awt.Dimension(360, 398));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 390));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 390));

        lbtitulo.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        lbtitulo.setText("REGISTRAR");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Nombre:");

        txnombre.setBackground(new java.awt.Color(54, 54, 255));
        txnombre.setForeground(new java.awt.Color(255, 255, 255));
        txnombre.setCaretColor(new java.awt.Color(255, 255, 255));
        txnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Telefono:");

        txnit.setBackground(new java.awt.Color(54, 54, 255));
        txnit.setForeground(new java.awt.Color(255, 255, 255));
        txnit.setCaretColor(new java.awt.Color(255, 255, 255));
        txnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Correo:");

        txcorreo.setBackground(new java.awt.Color(54, 54, 255));
        txcorreo.setForeground(new java.awt.Color(255, 255, 255));
        txcorreo.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Nit:");

        txtelefono.setBackground(new java.awt.Color(54, 54, 255));
        txtelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtelefono.setCaretColor(new java.awt.Color(255, 255, 255));
        txtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtelefonoActionPerformed(evt);
            }
        });

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        lblId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblId.setText("ID");

        lblCerrar1.setBackground(new java.awt.Color(102, 0, 204));
        lblCerrar1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCerrar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar1.setText("x");
        lblCerrar1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCerrar1.setOpaque(true);
        lblCerrar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblCerrar1MouseMoved(evt);
            }
        });
        lblCerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrar1MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Dpi:");

        txdpi.setBackground(new java.awt.Color(54, 54, 255));
        txdpi.setForeground(new java.awt.Color(255, 255, 255));
        txdpi.setCaretColor(new java.awt.Color(255, 255, 255));
        txdpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txdpiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(lbtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(lblCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnagregar)
                        .addGap(60, 60, 60)
                        .addComponent(lblId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(btnlimpiar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txcorreo)
                            .addComponent(txnit)
                            .addComponent(txnombre)
                            .addComponent(txtelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(txdpi))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbtitulo)
                    .addComponent(lblCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txdpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(lblId)
                    .addComponent(btnlimpiar))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void txnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txnombreActionPerformed
    
    private void txnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txnitActionPerformed

    private void txtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtelefonoActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        this.txnombre.requestFocus();
        this.txnombre.setText("");
        this.txnit.setText("");
        this.txcorreo.setText("");
        this.txtelefono.setText("");
        this.txdpi.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        
        
        if (txnombre.getText().equals("")
                || txnit.getText().equals("")
                || txcorreo.getText().equals("") 
                || txtelefono.getText().equals("") 
                || txdpi.getText().equals("")  ) {
            JOptionPane.showMessageDialog(null, "FALTAN LLENAR CAMPOS");
            
        }else {

             if (this.btnagregar.getText().equals("REGISTRAR")) {
                 PreparedStatement agregar;
                    try {
                        agregar = nConect.prepareStatement("INSERT INTO cliente (nombre, telefono, nit, correo,dpi)VALUES (?,?,?,?,?)");
                        agregar.setString(1, txnombre.getText());
                        agregar.setString(2, txtelefono.getText());
                        agregar.setString(3, txnit.getText());
                        agregar.setString(4, txcorreo.getText());
                        agregar.setString(5, txdpi.getText());
                        agregar.executeUpdate();
                        
                        new rojerusan.RSNotifyAnimated("¡AGREGADO!", "CLIENTE AGREGADO EXITOSAMENTE",
                        5, RSNotifyAnimated.PositionNotify.BottomRight,
                        RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
                        lis.listar("");
                    } catch (SQLException ex) {

                }        
                 
             }
            
             if (this.btnagregar.getText().equals("GUARDAR")) {
                 try {
                     PreparedStatement modificar = nConect.prepareStatement("UPDATE cliente SET nombre=?, telefono=?, nit=?,correo=?,dpi=? WHERE id="+ Integer.parseInt(lblId.getText()));
                        modificar.setString(1, txnombre.getText());
                        modificar.setString(2,  txtelefono.getText());
                        modificar.setString(3, txnit.getText());
                        modificar.setString(4,  txcorreo.getText());
                        modificar.setString(5,  txdpi.getText());
                        modificar.executeUpdate();
                        new rojerusan.RSNotifyAnimated("¡MODIFICADO!", "CLIENTE MODIFICADO EXITOSAMENTE",
                        5, RSNotifyAnimated.PositionNotify.BottomRight,
                        RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
                        lis.listar("");
                 } catch (SQLException ex) {
                     Logger.getLogger(insertarcli.class.getName()).log(Level.SEVERE, null, ex);
                 }
              
            }

        }
    }//GEN-LAST:event_btnagregarActionPerformed

    private void lblCerrar1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar1MouseMoved
        lblCerrar1.setBackground(Color.RED);
    }//GEN-LAST:event_lblCerrar1MouseMoved

    private void lblCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar1MouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCerrar1MouseClicked

    private void lblCerrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCerrar1MouseEntered

    private void lblCerrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar1MouseExited
        lblCerrar1.setBackground(new Color(102, 0, 204));
    }//GEN-LAST:event_lblCerrar1MouseExited

    private void txdpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txdpiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txdpiActionPerformed
    
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
            java.util.logging.Logger.getLogger(insertarcli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insertarcli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insertarcli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insertarcli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                insertarcli dialog = new insertarcli();
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
    public javax.swing.JButton btnagregar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCerrar1;
    public javax.swing.JLabel lblId;
    public javax.swing.JLabel lbtitulo;
    private javax.swing.JTextField txcorreo;
    private javax.swing.JTextField txdpi;
    private javax.swing.JTextField txnit;
    public static javax.swing.JTextField txnombre;
    private javax.swing.JTextField txtelefono;
    // End of variables declaration//GEN-END:variables
}
