/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citas;

import javax.swing.JOptionPane;
import rojerusan.RSNotifyAnimated;

/**
import conexion.Conectando;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyAnimated;
 *
 * @author Merriam
 */
public class cita1 extends javax.swing.JPanel {
    
    /**
    Conectando con = new Conectando();
    Connection nConect;
     * Creates new form cita1
     */
    cargarcombobox combo=new cargarcombobox();
    public cita1() {
        //this.nConect = con.conect();
        initComponents();
        //this.setLocationRelativeTo(null);
        combo.consulta_Servicios(jOpcion);
    }
    
    public Boolean Validar_CampoHora (String Hora){        
        boolean b;
        char[] a = Hora.toString().toCharArray();
        String[] c = Hora.split(" : ");
        if ((a[0] == ' ') || (a[1] == ' ') || (a[2] == ' ')
                ||(a[3] == ' ') || (a[4] == ' ') 
                || (getInteger(c[0]) > 24) || (getInteger(c[1]) > 59)){
            b = false;
        } else{
            b = true;
        }
        return b;
    }
    
    public int getInteger (String valor){
        int integer = Integer.parseInt(valor);
        return integer;
    }
    
    private void dispose() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnGuardarCi = new javax.swing.JButton();
        btnLimpiarCampos = new javax.swing.JButton();
        NombreCli = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblProveedor = new javax.swing.JLabel();
        lblPrecioCompra = new javax.swing.JLabel();
        lblPrecioVenta = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblCerrar = new javax.swing.JLabel();
        jOpcion = new javax.swing.JComboBox<>();
        lblCerrar1 = new javax.swing.JLabel();
        lblCerrar2 = new javax.swing.JLabel();
        horaspresenciales = new javax.swing.JFormattedTextField();
        lblCerrar3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(102, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CITA");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 252, 38));

        btnGuardarCi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnGuardarCi.setText("Guardar Cita");
        btnGuardarCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCiActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        btnLimpiarCampos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnLimpiarCampos.setText("Limpiar Datos");
        btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        NombreCli.setBackground(new java.awt.Color(51, 51, 255));
        NombreCli.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        NombreCli.setForeground(new java.awt.Color(255, 255, 255));
        NombreCli.setBorder(null);
        NombreCli.setCaretColor(new java.awt.Color(255, 255, 255));
        NombreCli.setOpaque(false);
        NombreCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreCliActionPerformed(evt);
            }
        });
        jPanel1.add(NombreCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 180, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblNombre.setText("Nombre Cliente");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        lblProveedor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblProveedor.setText("Motivo Cita");
        jPanel1.add(lblProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        lblPrecioCompra.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPrecioCompra.setText("Hora");
        jPanel1.add(lblPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        lblPrecioVenta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPrecioVenta.setText("Fecha");
        jPanel1.add(lblPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 180, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 60, 10));

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
        jPanel1.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 30, 30));

        jOpcion.setBackground(new java.awt.Color(51, 52, 255));
        jOpcion.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jOpcion.setForeground(new java.awt.Color(204, 204, 204));
        jOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija el Servicio" }));
        jOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpcionActionPerformed(evt);
            }
        });
        jPanel1.add(jOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

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
        jPanel1.add(lblCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 30, 30));

        lblCerrar2.setBackground(new java.awt.Color(102, 0, 204));
        lblCerrar2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCerrar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar2.setText("x");
        lblCerrar2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCerrar2.setOpaque(true);
        lblCerrar2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblCerrar2MouseMoved(evt);
            }
        });
        lblCerrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrar2MouseExited(evt);
            }
        });
        jPanel1.add(lblCerrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 30, 30));

        horaspresenciales.setBackground(new java.awt.Color(51, 51, 255));
        horaspresenciales.setForeground(new java.awt.Color(255, 255, 255));
        try {
            horaspresenciales.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        horaspresenciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaspresencialesActionPerformed(evt);
            }
        });
        jPanel1.add(horaspresenciales, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 60, 40));

        lblCerrar3.setBackground(new java.awt.Color(102, 0, 204));
        lblCerrar3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCerrar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar3.setText("x");
        lblCerrar3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCerrar3.setOpaque(true);
        lblCerrar3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblCerrar3MouseMoved(evt);
            }
        });
        lblCerrar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrar3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrar3MouseExited(evt);
            }
        });
        jPanel1.add(lblCerrar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCiActionPerformed
        
    }//GEN-LAST:event_btnGuardarCiActionPerformed

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        this.NombreCli.requestFocus();
        this.NombreCli.setText("");
        
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    private void lblCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseMoved
      
    }//GEN-LAST:event_lblCerrarMouseMoved

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCerrarMouseEntered

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseExited
      
    }//GEN-LAST:event_lblCerrarMouseExited

    private void jOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOpcionActionPerformed

    private void lblCerrar1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar1MouseMoved
    
    }//GEN-LAST:event_lblCerrar1MouseMoved

    private void lblCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar1MouseClicked

    }//GEN-LAST:event_lblCerrar1MouseClicked

    private void lblCerrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCerrar1MouseEntered

    private void lblCerrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar1MouseExited

    }//GEN-LAST:event_lblCerrar1MouseExited

    private void lblCerrar2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar2MouseMoved
   
    }//GEN-LAST:event_lblCerrar2MouseMoved

    private void lblCerrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar2MouseClicked
      
    }//GEN-LAST:event_lblCerrar2MouseClicked

    private void lblCerrar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCerrar2MouseEntered

    private void lblCerrar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar2MouseExited

    }//GEN-LAST:event_lblCerrar2MouseExited

    private void horaspresencialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaspresencialesActionPerformed
        if(Validar_CampoHora(horaspresenciales.getText()) == true){
            System.out.println("La hora es correcta");
        } else{
            System.out.println("Hora incorrecta");
        }
    }//GEN-LAST:event_horaspresencialesActionPerformed

    private void NombreCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreCliActionPerformed

    private void lblCerrar3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar3MouseMoved
        //lblCerrar.setBackground(Color.RED);
    }//GEN-LAST:event_lblCerrar3MouseMoved

    private void lblCerrar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar3MouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCerrar3MouseClicked

    private void lblCerrar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCerrar3MouseEntered

    private void lblCerrar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar3MouseExited
        //lblCerrar.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_lblCerrar3MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField NombreCli;
    public static javax.swing.JButton btnGuardarCi;
    private javax.swing.JButton btnLimpiarCampos;
    private javax.swing.JFormattedTextField horaspresenciales;
    private javax.swing.JComboBox<String> jOpcion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCerrar1;
    private javax.swing.JLabel lblCerrar2;
    private javax.swing.JLabel lblCerrar3;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecioCompra;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblProveedor;
    public static javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
