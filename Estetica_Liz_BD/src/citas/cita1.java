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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnGuardarCi = new javax.swing.JButton();
        btnLimpiarCampos = new javax.swing.JButton();
        txfNombreCli = new javax.swing.JTextField();
        txfHora = new javax.swing.JTextField();
        txfPrecioVenta = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblProveedor = new javax.swing.JLabel();
        lblPrecioCompra = new javax.swing.JLabel();
        lblPrecioVenta = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lblCerrar = new javax.swing.JLabel();
        jOpcion = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(102, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CITA");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 252, 38));

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

        txfNombreCli.setBackground(new java.awt.Color(51, 51, 255));
        txfNombreCli.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfNombreCli.setForeground(new java.awt.Color(255, 255, 255));
        txfNombreCli.setBorder(null);
        txfNombreCli.setCaretColor(new java.awt.Color(255, 255, 255));
        txfNombreCli.setOpaque(false);
        jPanel1.add(txfNombreCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 180, -1));

        txfHora.setBackground(new java.awt.Color(51, 51, 255));
        txfHora.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfHora.setForeground(new java.awt.Color(255, 255, 255));
        txfHora.setBorder(null);
        txfHora.setCaretColor(new java.awt.Color(255, 255, 255));
        txfHora.setOpaque(false);
        txfHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfHoraActionPerformed(evt);
            }
        });
        jPanel1.add(txfHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 180, -1));

        txfPrecioVenta.setBackground(new java.awt.Color(51, 51, 255));
        txfPrecioVenta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfPrecioVenta.setForeground(new java.awt.Color(255, 255, 255));
        txfPrecioVenta.setBorder(null);
        txfPrecioVenta.setCaretColor(new java.awt.Color(255, 255, 255));
        txfPrecioVenta.setOpaque(false);
        jPanel1.add(txfPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 180, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblNombre.setText("Nombre Cliente");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        lblProveedor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblProveedor.setText("Motivo Cita");
        jPanel1.add(lblProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        lblPrecioCompra.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPrecioCompra.setText("Hora");
        jPanel1.add(lblPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        lblPrecioVenta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPrecioVenta.setText("Fecha");
        jPanel1.add(lblPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 180, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 180, 10));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 180, 10));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCiActionPerformed
        
    }//GEN-LAST:event_btnGuardarCiActionPerformed

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        this.txfNombreCli.requestFocus();
        this.txfNombreCli.setText("");
        
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

    private void txfHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfHoraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnGuardarCi;
    private javax.swing.JButton btnLimpiarCampos;
    private javax.swing.JComboBox<String> jOpcion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecioCompra;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblProveedor;
    public static javax.swing.JLabel lblTitulo;
    public static javax.swing.JTextField txfHora;
    public static javax.swing.JTextField txfNombreCli;
    public static javax.swing.JTextField txfPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
