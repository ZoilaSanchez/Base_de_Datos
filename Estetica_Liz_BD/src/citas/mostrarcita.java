/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citas;

import empleados.*;
import Usuarios.*;
import static Usuarios.Agregar.txfUsuario;
import conexion.Conectando;
import static empleados.Agregarempleados.txtcui1;

import productos.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.Label;
import java.awt.image.BufferedImage;
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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author  Lopez
 */
public class mostrarcita extends javax.swing.JInternalFrame {
    Conectando con = new Conectando();
    Connection nConect;
    /**
     * Creates new form Producto
     */
    mostrar listar= new mostrar();
    public mostrarcita() {
        initComponents();
        this.citatab.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.citatab.setDefaultRenderer(Object.class, new EstiloTablaRenderer(2));
        this.citatab.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.nConect = con.conect();

        listar.listar("");
    }
 public static void verFila(){
        int aux = 0;
        while(aux <citatab.getRowCount()){
            if(!citatab.getValueAt(aux, 2).equals("1")){
            }
        }
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
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        citatab = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        txfBuscar = new javax.swing.JTextField();

        setBorder(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevo.setText("NUEVA CITA");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setText("CAMBIAR ESTADO");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        citatab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        citatab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NO.", "CUI", "NOMBRE", "MOTIVO", "TELEFONO", "HORA", "FECHA", "ESTADO", "ID"
            }
        ));
        citatab.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(citatab);

        jPanel2.setBackground(new java.awt.Color(102, 0, 204));

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CITAS");

        lblCerrar.setBackground(new java.awt.Color(102, 0, 204));
        lblCerrar.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
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
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCerrar)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfBuscarActionPerformed(evt);
            }
        });
        txfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfBuscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(57, 57, 57)
                        .addComponent(btnModificar)
                        .addGap(52, 52, 52)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                        .addComponent(txfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNuevo)
                        .addComponent(btnModificar)
                        .addComponent(btnEliminar))
                    .addComponent(txfBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        citas ins = new citas();
        ins.lblTitulo.setText("REGISTRAR");
        ins.btnregistrar.setText("REGISTRAR");
        ins.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed
    
        
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (this.citatab.getRowCount() < 1) {
            JOptionPane.showMessageDialog(null, "LA TABLA ESTÁ VACÍA");
        } else {
            if (this.citatab.getSelectedRowCount() < 1) {
                JOptionPane.showMessageDialog(null, "SELECCIONA UN REGISTRO");
            } else {
                int fila = this.citatab.getSelectedRow();
                citas ins = new citas();
                ins.lblId.setText(this.citatab.getValueAt(fila, 0).toString());
                
                ins.txtcui.setText(this.citatab.getValueAt(fila, 1).toString());
                ins.NombreCli.setText(this.citatab.getValueAt(fila, 2).toString());
                ins.telefono1.setText(this.citatab.getValueAt(fila, 4).toString());
                ins.hora.setText(this.citatab.getValueAt(fila, 5).toString());
                ins.fecha.setText(this.citatab.getValueAt(fila, 6).toString());
                ins.txtid.setText(this.citatab.getValueAt(fila, 8).toString());
                ins.lblTitulo.setText("MODIFICAR");
                ins.btnregistrar.setText("GUARDAR");
                 ins.txtid.setEditable(false);
                  ins.txtid.setVisible(false);
                ins.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed


    
    private void lblCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseMoved
        lblCerrar.setBackground(Color.red);
    }//GEN-LAST:event_lblCerrarMouseMoved

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseExited
        lblCerrar.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_lblCerrarMouseExited

    private void txfBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyTyped

    }//GEN-LAST:event_txfBuscarKeyTyped

    private void txfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyReleased
        listarusua.listar(this.txfBuscar.getText());
    }//GEN-LAST:event_txfBuscarKeyReleased

    private void txfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscarActionPerformed

    private void txfBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscarKeyPressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (this.citatab.getRowCount() < 1) {
            JOptionPane.showMessageDialog(null, "LA TABLA ESTÁ VACÍA");
        } else {
            if (this.citatab.getSelectedRowCount() < 1) {
                JOptionPane.showMessageDialog(null, "SELECCIONA UN REGISTRO");
            } else {
                int fila = this.citatab.getSelectedRow();
                citas ins = new citas();
                ins.lblId.setText(this.citatab.getValueAt(fila, 0).toString());
                
                ins.txtcui.setText(this.citatab.getValueAt(fila, 1).toString());
                ins.NombreCli.setText(this.citatab.getValueAt(fila, 2).toString());
                ins.telefono1.setText(this.citatab.getValueAt(fila, 4).toString());
                ins.hora.setText(this.citatab.getValueAt(fila, 5).toString());
                ins.fecha.setText(this.citatab.getValueAt(fila, 6).toString());
                ins.txtid.setText(this.citatab.getValueAt(fila, 8).toString());
                ins.lblTitulo.setText("CAMBIAR ESTADO");
                ins.btnregistrar.setText("CAMBIAR");
                 ins.txtid.setEditable(false);
                 ins.txtid.setVisible(false);
                ins.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    public static javax.swing.JTable citatab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JTextField txfBuscar;
    // End of variables declaration//GEN-END:variables
}
