/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import conexion.Conectando;
import empleados.Agregarempleados;
import empleados.listaemple;
import static empleados.mostraremple.EMPLETAB;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import productos.EstiloTablaHeader;
import productos.EstiloTablaRenderer;
import static productos.Insercion.lblId;
import static productos.Insercion.txfNombre;
import static productos.Insercion.txfPrecioCompra;
import static productos.Insercion.txfPrecioVenta;
import static productos.Insercion.txfProveedor;
import static productos.Insercion.txfStock;
import productos.MyScrollbarUI;
import rojerusan.RSNotifyAnimated;
import splash.AWTUtilities;

/**
 *
 * @author enrique7cp@gmail.com
 */
public class Productos extends javax.swing.JDialog {

    /**
     * Creates new form Productos
     */
    
    listarprodu lis;
    Conectando con = new Conectando();
    Connection nConect;
    ArrayList<datos> datosfactura = new ArrayList<datos>();
    public Productos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.tablap.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.tablap.setDefaultRenderer(Object.class, new EstiloTablaRenderer(1));
        this.tablap.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);      
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.getVerticalScrollBar().setUI(new MyScrollbarUI());
        jScrollPane1.getHorizontalScrollBar().setUI(new MyScrollbarUI());

        this.setLocation(330, 120);
        AWTUtilities.setOpaque(this, false);
        this.nConect = con.conect();
        this.lblCantidadAlmacen.setVisible(false);
        lis.listar("");
      
    }

    public ArrayList<datos> lista(){
        return datosfactura;
    }

    public ArrayList<datos> getDatosfactura() {
        return datosfactura;
    }

    public void setDatosfactura(ArrayList<datos> datosfactura) {
        this.datosfactura = datosfactura;
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablap = new javax.swing.JTable();
        txfBuscar = new javax.swing.JTextField();
        txfCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCantidadAlmacen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 204), 5));

        jPanel3.setBackground(new java.awt.Color(102, 0, 204));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(925, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));

        tablap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "Q. PRECIO", "STOCK"
            }
        ));
        tablap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablapMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablap);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addContainerGap())
        );

        txfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarKeyReleased(evt);
            }
        });

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel1.setText("CANTIDAD:");

        jLabel2.setText("BUSCAR:");

        lblCantidadAlmacen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCantidadAlmacen.setText("CANTIDAD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(lblCantidadAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(lblCantidadAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 972, 589));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 992, 611));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void txfBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyPressed
        
    }//GEN-LAST:event_txfBuscarKeyPressed

    private void txfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyReleased
    lis.listar(txfBuscar.getText());
    }//GEN-LAST:event_txfBuscarKeyReleased

    //validaciones para iformacion de precios
    String codigo ;
    String nombre ;
    String Precio ;
    String cantidad ;
    int fila;
    private void tablapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablapMouseClicked
         if (this.tablap.getRowCount() < 1) {
            JOptionPane.showMessageDialog(null, "LA TABLA ESTÁ VACÍA");
        } else {
            if (this.tablap.getSelectedRowCount() < 1) {
                JOptionPane.showMessageDialog(null, "SELECCIONA UN REGISTRO");
            } else {
                fila = this.tablap.getSelectedRow();
                 codigo = this.tablap.getValueAt(fila, 0).toString();
                 nombre = this.tablap.getValueAt(fila, 1).toString();
                 Precio = this.tablap.getValueAt(fila, 2).toString();
                 cantidad = this.tablap.getValueAt(fila, 3).toString();
                
            }
            
        }
    }//GEN-LAST:event_tablapMouseClicked

 
    public void mostartabla(){
        float total_pagar=0;
        DefaultTableModel modelo = (DefaultTableModel) Ventas.tablaVentas.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String datos[] = new String[9];
        Iterator<datos> itrdatos = datosfactura.iterator();
        itrdatos = datosfactura.iterator();
        while(itrdatos.hasNext()){
	datos factudes = itrdatos.next();
	System.out.println(factudes.getCodigo()+" "
                +factudes.getNombre()+" "+factudes.getCandidad()+" "
                +factudes.getPrecio()+" "+factudes.getTotal());
        
                datos[0] = String.valueOf(factudes.getCodigo());
                datos[1] = factudes.getNombre();
                datos[2] = String.valueOf(factudes.getCandidad());
                datos[3] = String.valueOf(factudes.getPrecio());
                datos[4] = String.valueOf(factudes.getTotal());
                modelo.addRow(datos);
                total_pagar=total_pagar+factudes.getTotal();
        } 
        Ventas.lblTotal.setText(String.valueOf(total_pagar));
    
}
    
    
    
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (this.tablap.getSelectedRowCount() < 1) {
                JOptionPane.showMessageDialog(null, "SELECCIONA UN REGISTRO");
            } else {
                String test1 = txfCantidad.getText().replaceAll("^\\s*","");
                String text2=test1.replaceAll("\\s*$","");
                 if(txfCantidad.getText().equals("")){
                     JOptionPane.showMessageDialog(null, "Ingrese cantidad a vender");
                 }else{
                     if(Integer.valueOf(cantidad)>=Integer.valueOf(text2)){
                        //descontar y agregar a la siguiente tabla los valores
                          int Total_actual=0;
                        Total_actual=Integer.valueOf(cantidad)-Integer.valueOf(text2);
                         String sql = "UPDATE producto SET "
                    + "stock = ? "
                    + "WHERE id=" + Integer.parseInt(this.tablap.getValueAt(fila, 0).toString());
                    
                    PreparedStatement actualizarProducto;
                         try {
                             actualizarProducto = nConect.prepareStatement(sql);
                              actualizarProducto.setInt(1, Total_actual);
                              actualizarProducto.executeUpdate();
                              lis.listar("");
                              float total=Integer.valueOf(text2)*Float.valueOf(Precio);
                         datosfactura.add(new datos(Integer.parseInt(codigo), nombre,Integer.valueOf(text2) ,Float.valueOf(Precio),total));
                         mostartabla();
                        new rojerusan.RSNotifyAnimated("¡EXITO!", "PRODUCTO AGREGADO",
                        5, RSNotifyAnimated.PositionNotify.BottomRight,
                        RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
                         } catch (SQLException ex) {
                             Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
                         }
                         
                }else{
                      JOptionPane.showMessageDialog(null, "No hay existencia");
                 }
                 }
                 
            }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Productos dialog = new Productos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidadAlmacen;
    public static javax.swing.JTable tablap;
    private javax.swing.JTextField txfBuscar;
    private javax.swing.JTextField txfCantidad;
    // End of variables declaration//GEN-END:variables
}