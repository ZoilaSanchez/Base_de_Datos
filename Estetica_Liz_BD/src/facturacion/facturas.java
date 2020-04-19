/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import Principal.Principal_administrador;
import conexion.Conectando;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Merriam
 */
public class facturas extends javax.swing.JPanel {

    /**
     * Creates new form facturas
     */
    Conectando con = new Conectando();
    Connection nConect;
    listarprodu lis;
    public facturas() {
        initComponents();
         this.nConect = con.conect();
        lis.listarfac("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cargarcombobox1 = new empleados.cargarcombobox();
        jPanel1 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnHabilitar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txfBuscar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        btnNuevo.setBackground(new java.awt.Color(102, 0, 204));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("NUEVO FACTURA");
        btnNuevo.setBorder(null);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(102, 0, 204));
        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("MODIFICAR");
        btnModificar.setBorder(null);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnHabilitar.setBackground(new java.awt.Color(102, 0, 204));
        btnHabilitar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHabilitar.setForeground(new java.awt.Color(255, 255, 255));
        btnHabilitar.setText("HABILITAR/INHABILITAR");
        btnHabilitar.setBorder(null);
        btnHabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabilitarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 0, 204));

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

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FACTURAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
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
                    .addComponent(jLabel1)
                    .addComponent(lblCerrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfBuscarKeyTyped(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 0, 204));

        tabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO. FACTURA", "NOMBRE", "FECHA", "NIT", "DESCRIPCION", "Q. MONTO", "EMPLEADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUSCAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfBuscar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        if (Principal_administrador.estacerrado(Principal_administrador.ventas)) {
            try {
                Principal_administrador.ventas = new Ventas();
            } catch (SQLException ex) {
                Logger.getLogger(facturas.class.getName()).log(Level.SEVERE, null, ex);
            }
            int width = Principal_administrador.escritorio.getWidth();
            int Height = Principal_administrador.escritorio.getHeight();
            Principal_administrador.ventas.setSize(width, Height);
            Principal_administrador.escritorio.add(Principal_administrador.ventas);
            Principal_administrador.ventas.show();
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (this.tabla.getRowCount() < 1) {
//            JOptionPane.showMessageDialog(null, "LA TABLA ESTÁ VACÍA");
        } else {
            if (this.tabla.getSelectedRowCount() < 1) {
//                JOptionPane.showMessageDialog(null, "SELECCIONA UN REGISTRO");
            } else {

                int fila = this.tabla.getSelectedRow();

//                Insercion ins = new Insercion();
//                ins.lblId.setText(this.tabla.getValueAt(fila, 0).toString());
//                ins.txfNombre.setText(this.tabla.getValueAt(fila, 1).toString());
//                ins.txfProveedor.setText(this.tabla.getValueAt(fila, 3).toString());
//                ins.txfPrecioCompra.setText(this.tabla.getValueAt(fila, 4).toString());
//                ins.txfPrecioVenta.setText(this.tabla.getValueAt(fila, 5).toString());
//                ins.txfStock.setText(this.tabla.getValueAt(fila, 6).toString());
//                ins.lblTitulo.setText("MODIFICAR");
//                ins.btnRegistrar.setText("GUARDAR");
//                ins.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnHabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabilitarActionPerformed
//        if (this.tabla.getRowCount() < 1) {
//            JOptionPane.showMessageDialog(null, "LA TABLA ESTÁ VACÍA");
//        } else {
//            if (this.tabla.getSelectedRowCount() < 1) {
//                JOptionPane.showMessageDialog(null, "SELECCIONA UN REGISTRO");
//            } else {
//
//                int fila = this.tabla.getSelectedRow();
//
//                Insercion ins = new Insercion();
//                ins.lblId.setText(this.tabla.getValueAt(fila, 0).toString());
//                ins.txfNombre.setText(this.tabla.getValueAt(fila, 1).toString());
//                ins.txfNombre.setEditable(false);
//                ins.txfProveedor.setText(this.tabla.getValueAt(fila, 3).toString());
//                ins.txfProveedor.setEditable(false);
//                ins.txfPrecioCompra.setText(this.tabla.getValueAt(fila, 4).toString());
//                ins.txfPrecioCompra.setEnabled(false);
//                ins.txfPrecioVenta.setText(this.tabla.getValueAt(fila, 5).toString());
//                ins.txfPrecioVenta.setEnabled(false);
//                ins.txfStock.setText(this.tabla.getValueAt(fila, 6).toString());
//                ins.txfStock.setEditable(false);
//                ins.cbbEstado.setSelectedIndex(setComboInsertar());
//                ins.btnLimpiarCampos.setEnabled(false);
//                ins.lblTitulo.setText("HABILITAR/DESAHABILITAR");
//                ins.btnRegistrar.setText("OK");
//                ins.setVisible(true);
//            }
//        }
    }//GEN-LAST:event_btnHabilitarActionPerformed

    private void lblCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseMoved
//        lblCerrar.setBackground(Color.red);
    }//GEN-LAST:event_lblCerrarMouseMoved

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseExited
//        lblCerrar.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_lblCerrarMouseExited

    private void txfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyReleased
//        listar.listar(this.txfBuscar.getText());
    }//GEN-LAST:event_txfBuscarKeyReleased

    private void txfBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyTyped
        char letras = evt.getKeyChar();

        if (Character.isLowerCase(letras)) {
            String cad = ("" + letras).toUpperCase();
            letras = cad.charAt(0);
            evt.setKeyChar(letras);
        }
    }//GEN-LAST:event_txfBuscarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHabilitar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private empleados.cargarcombobox cargarcombobox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCerrar;
    public static javax.swing.JTable tabla;
    private javax.swing.JTextField txfBuscar;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
         //To change body of generated methods, choose Tools | Templates.
    }
}
