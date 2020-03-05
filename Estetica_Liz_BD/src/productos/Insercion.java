/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package productos;

import conexion.Conectando;
import java.awt.Color;
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
    Conectando con = new Conectando();
    Connection nConect;
    /** Creates new form Insercion */
    public Insercion() {
        //super(parent, modal);
        this.nConect = con.conect();
        initComponents();
        this.setLocationRelativeTo(null);
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
        lblId = new javax.swing.JLabel();
        txfNombre = new javax.swing.JTextField();
        txfProveedor = new javax.swing.JTextField();
        txfPrecioCompra = new javax.swing.JTextField();
        txfPrecioVenta = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblProveedor = new javax.swing.JLabel();
        lblPrecioCompra = new javax.swing.JLabel();
        lblPrecioVenta = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        txfStock = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        cbbEstado = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        lblCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setUndecorated(true);

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
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        btnLimpiarCampos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnLimpiarCampos.setText("LIMPIAR CAMPOS");
        btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        lblId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblId.setText("ID");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        txfNombre.setBackground(new java.awt.Color(51, 51, 255));
        txfNombre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfNombre.setForeground(new java.awt.Color(255, 255, 255));
        txfNombre.setBorder(null);
        txfNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        txfNombre.setOpaque(false);
        jPanel1.add(txfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 180, -1));

        txfProveedor.setBackground(new java.awt.Color(51, 51, 255));
        txfProveedor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfProveedor.setForeground(new java.awt.Color(255, 255, 255));
        txfProveedor.setBorder(null);
        txfProveedor.setCaretColor(new java.awt.Color(255, 255, 255));
        txfProveedor.setOpaque(false);
        jPanel1.add(txfProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 180, -1));

        txfPrecioCompra.setBackground(new java.awt.Color(51, 51, 255));
        txfPrecioCompra.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfPrecioCompra.setForeground(new java.awt.Color(255, 255, 255));
        txfPrecioCompra.setBorder(null);
        txfPrecioCompra.setCaretColor(new java.awt.Color(255, 255, 255));
        txfPrecioCompra.setOpaque(false);
        jPanel1.add(txfPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 180, -1));

        txfPrecioVenta.setBackground(new java.awt.Color(51, 51, 255));
        txfPrecioVenta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfPrecioVenta.setForeground(new java.awt.Color(255, 255, 255));
        txfPrecioVenta.setBorder(null);
        txfPrecioVenta.setCaretColor(new java.awt.Color(255, 255, 255));
        txfPrecioVenta.setOpaque(false);
        jPanel1.add(txfPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 180, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblNombre.setText("Nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        lblProveedor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblProveedor.setText("Proveedor");
        jPanel1.add(lblProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        lblPrecioCompra.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPrecioCompra.setText("Precio Compra");
        jPanel1.add(lblPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        lblPrecioVenta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPrecioVenta.setText("Precio Venta");
        jPanel1.add(lblPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        lblStock.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblStock.setText("Stock");
        jPanel1.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        txfStock.setBackground(new java.awt.Color(51, 51, 255));
        txfStock.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfStock.setForeground(new java.awt.Color(255, 255, 255));
        txfStock.setBorder(null);
        txfStock.setCaretColor(new java.awt.Color(255, 255, 255));
        txfStock.setOpaque(false);
        jPanel1.add(txfStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 180, -1));

        lblEstado.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblEstado.setText("Estado Prod...");
        jPanel1.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        cbbEstado.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione estado", "Habilitado", "Inhabilitado" }));
        jPanel1.add(cbbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 160, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 180, 10));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 180, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 180, 10));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 180, 10));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 180, 10));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(txfNombre.getText().equals("") 
                || txfProveedor.getText().equals("") 
                || txfPrecioCompra.getText().equals("")
                || txfPrecioVenta.getText().equals("")
                || txfStock.getText().equals("")
                || cbbEstado.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "FALTAN LLENAR CAMPOS");
            
        }else{
            
            if (this.btnRegistrar.getText().equals("REGISTRAR")) {
                try {
                    PreparedStatement agregarProducto = nConect.prepareStatement("INSERT INTO producto (nombreProducto,proveedor,precioCompra,precioVenta,habilitado,stock)" + "VALUES (?,?,?,?,?,?)");
                    agregarProducto.setString(1, txfNombre.getText());
                    agregarProducto.setString(2, txfProveedor.getText());
                    agregarProducto.setDouble(3, Double.parseDouble(txfPrecioCompra.getText()));
                    agregarProducto.setDouble(4, Double.parseDouble(txfPrecioVenta.getText()));
                    agregarProducto.setBoolean(5, verificarCombo());
                    agregarProducto.setInt(6, Integer.parseInt(txfStock.getText()));
                    
                    agregarProducto.executeUpdate();
                    
                    new rojerusan.RSNotifyAnimated("¡AGREGADO!", "PRODUCTO AGREGADO EXITOSAMENTE",
                            5, RSNotifyAnimated.PositionNotify.BottomRight,
                            RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
                    
                    listar.listar("");
                } catch (SQLException ex) {
                    Logger.getLogger(Insercion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else {
                try {
                    String sql = "UPDATE producto SET "
                    + "nombreProducto = ?"
                    + ",proveedor = ?"
                    + ",precioCompra = ?"
                    + ",precioVenta = ?"
                    + ",habilitado = ? "
                    + ",stock = ? "
                    + "WHERE id=" + Integer.parseInt(lblId.getText());
                    
                    PreparedStatement actualizarProducto = nConect.prepareStatement(sql);
                    actualizarProducto.setString(1, txfNombre.getText());
                    actualizarProducto.setString(2, txfProveedor.getText());
                    actualizarProducto.setDouble(3, Double.parseDouble(txfPrecioCompra.getText()));
                    actualizarProducto.setDouble(4, Double.parseDouble(txfPrecioVenta.getText()));
                    actualizarProducto.setBoolean(5, verificarCombo());
                    actualizarProducto.setInt(6, Integer.parseInt(txfStock.getText()));
                    
                    
                    actualizarProducto.executeUpdate();
                    
                    listar.listar("");
                    
                    new rojerusan.RSNotifyAnimated("¡HECHO!", "SE HAN GUARDADO LOS CAMBIOS",
                            5, RSNotifyAnimated.PositionNotify.BottomRight,
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
                Insercion dialog = new Insercion();
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
    private javax.swing.JComboBox<String> cbbEstado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblEstado;
    public static javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecioCompra;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblStock;
    public static javax.swing.JLabel lblTitulo;
    public static javax.swing.JTextField txfNombre;
    public static javax.swing.JTextField txfPrecioCompra;
    public static javax.swing.JTextField txfPrecioVenta;
    public static javax.swing.JTextField txfProveedor;
    public static javax.swing.JTextField txfStock;
    // End of variables declaration//GEN-END:variables

    public boolean verificarCombo(){
        if(cbbEstado.getSelectedIndex()==1){
            return true;
        }
        return false;
    }
}
