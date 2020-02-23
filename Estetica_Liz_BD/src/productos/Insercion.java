/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package productos;

import conexion.PruebaConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyAnimated;
/**
 *
 * @author enrique7cp@gmail.com
 */
public class Insercion extends javax.swing.JDialog {

    Connection nConect;
    /** Creates new form Insercion */
    public Insercion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.nConect = nConect;
        initComponents();
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
        txfNombre = new app.bolivia.swing.JCTextField();
        txfProveedor = new app.bolivia.swing.JCTextField();
        txfPrecioCompra = new app.bolivia.swing.JCTextField();
        txfPrecioVenta = new app.bolivia.swing.JCTextField();
        id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lblTitulo.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("REGISTRAR");

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnLimpiarCampos.setText("LIMPIAR CAMPOS");
        btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActionPerformed(evt);
            }
        });

        txfNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txfNombre.setPlaceholder("NOMBRE");

        txfProveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txfProveedor.setPlaceholder("PROVEEDOR");

        txfPrecioCompra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txfPrecioCompra.setPlaceholder("PRECIO COMPRA");

        txfPrecioVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txfPrecioVenta.setPlaceholder("PRECIO VENTA");

        id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(id)
                        .addGap(36, 36, 36)
                        .addComponent(btnLimpiarCampos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txfProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txfPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txfPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnLimpiarCampos)
                    .addComponent(id))
                .addGap(41, 41, 41))
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

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        if(txfNombre.getText().equals("") 
                || txfProveedor.getText().equals("") 
                || txfPrecioCompra.getText().equals("")
                || txfPrecioVenta.getText().equals("")){
            JOptionPane.showMessageDialog(null, "FALTAN CAMPOS DE LLENAR");
            
        }else{
            
            if (this.btnRegistrar.getText().equals("REGISTRAR")) {
                try {
                    PreparedStatement agregarProducto = nConect.prepareStatement("INSERT INTO producto (Nombre,Proveedor,PrecioCompra,PrecioVenta)VALUES (?,?,?,?)");
                    agregarProducto.setString(1, txfNombre.getText());
                    agregarProducto.setString(2, txfProveedor.getText());
                    agregarProducto.setInt(3, Integer.parseInt(txfPrecioCompra.getText()));
                    agregarProducto.setInt(4, Integer.parseInt(txfPrecioVenta.getText()));
                    
                    agregarProducto.execute();
                    
                    new rojerusan.RSNotifyAnimated("¡AGREGADO!", "PRODUCTO AGREGADO EXITOSAMENTE",
                            7, RSNotifyAnimated.PositionNotify.BottomRight,
                            RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Insercion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else {
                try {
                    PreparedStatement actualizarProducto = nConect.prepareStatement("UPDATE producto SET Nombre=?, Proveedor=?, PrecioCompra=?, PrecioVenta=?" + "WHERE id=" + Integer.parseInt(id.getText()));
                    actualizarProducto.setString(1, txfNombre.getText());
                    actualizarProducto.setString(2, txfProveedor.getText());
                    actualizarProducto.setInt(3, Integer.parseInt(txfPrecioCompra.getText()));
                    actualizarProducto.setInt(4, Integer.parseInt(txfPrecioVenta.getText()));
                    
                    actualizarProducto.execute();
                    
                    new rojerusan.RSNotifyAnimated("¡HECHO!", "SE HAN GUARDADO LOS CAMBIOS",
                            7, RSNotifyAnimated.PositionNotify.BottomRight,
                            RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Insercion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        this.txfNombre.requestFocus();

        this.txfNombre.setText("");
        this.txfProveedor.setText("");
        this.txfPrecioCompra.setText("");
        this.txfPrecioVenta.setText("");
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

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
            java.util.logging.Logger.getLogger(Insercion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insercion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insercion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insercion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Insercion dialog = new Insercion(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnLimpiarCampos;
    public static javax.swing.JButton btnRegistrar;
    public static javax.swing.JLabel id;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblTitulo;
    public static app.bolivia.swing.JCTextField txfNombre;
    public static app.bolivia.swing.JCTextField txfPrecioCompra;
    public static app.bolivia.swing.JCTextField txfPrecioVenta;
    public static app.bolivia.swing.JCTextField txfProveedor;
    // End of variables declaration//GEN-END:variables

}
