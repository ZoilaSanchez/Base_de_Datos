/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citas;
import productos.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author enrique7cp@gmail.com
 */
public class citamost extends javax.swing.JInternalFrame {

    /**
     * Creates new form Producto
     */
    public citamost() {
        initComponents();
        this.citastab.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.citastab.setDefaultRenderer(Object.class, new EstiloTablaRenderer(2));
        this.citastab.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        
        listar.listar("");
    }
    public static void verFila(){
        int aux = 0;
        while(aux <citastab.getRowCount()){
            if(!citastab.getValueAt(aux, 2).equals("1")){
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
        btnHabilitar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txfBuscar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        citastab = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBorder(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        btnNuevo.setBackground(new java.awt.Color(102, 0, 204));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonNuevoProducto.png"))); // NOI18N
        btnNuevo.setBorder(null);
        btnNuevo.setOpaque(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(0, 204, 51));
        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonModificar.png"))); // NOI18N
        btnModificar.setBorder(null);
        btnModificar.setOpaque(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnHabilitar.setBackground(new java.awt.Color(103, 0, 216));
        btnHabilitar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHabilitar.setForeground(new java.awt.Color(255, 255, 255));
        btnHabilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonHabilitar.png"))); // NOI18N
        btnHabilitar.setBorder(null);
        btnHabilitar.setOpaque(false);
        btnHabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabilitarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 0, 204));
        jPanel2.setForeground(new java.awt.Color(0, 153, 0));

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
        jLabel1.setText("PRODUCTOS");

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

        citastab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        citastab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOMBRE", "HABILITADO", "PROVEEDOR", "Q PRECIO COMPRA", "Q PRECIO VENTA", "STOCK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        citastab.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(citastab);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
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
                        .addComponent(btnNuevo)
                        .addGap(28, 28, 28)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnHabilitar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
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
                    .addComponent(btnHabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        Insercion ins = new Insercion();
        ins.lblTitulo.setText("REGISTRAR");
        ins.btnRegistrar.setText("REGISTRAR");
        ins.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (this.citastab.getRowCount() < 1) {
            JOptionPane.showMessageDialog(null, "LA TABLA ESTÁ VACÍA");
        } else {
            if (this.citastab.getSelectedRowCount() < 1) {
                JOptionPane.showMessageDialog(null, "SELECCIONA UN REGISTRO");
            } else {

                int fila = this.citastab.getSelectedRow();

                Insercion ins = new Insercion();
                ins.lblId.setText(this.citastab.getValueAt(fila, 0).toString());
                ins.txfNombre.setText(this.citastab.getValueAt(fila, 1).toString());
                ins.txfProveedor.setText(this.citastab.getValueAt(fila, 3).toString());
                ins.txfPrecioCompra.setText(this.citastab.getValueAt(fila, 4).toString());
                ins.txfPrecioVenta.setText(this.citastab.getValueAt(fila, 5).toString());
                ins.txfStock.setText(this.citastab.getValueAt(fila, 6).toString());
                ins.lblTitulo.setText("MODIFICAR");
                ins.btnRegistrar.setText("GUARDAR");
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
        char letras = evt.getKeyChar();

        if (Character.isLowerCase(letras)) {
            String cad = ("" + letras).toUpperCase();
            letras = cad.charAt(0);
            evt.setKeyChar(letras);
        }
    }//GEN-LAST:event_txfBuscarKeyTyped

    private void txfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyReleased
        listar.listar(this.txfBuscar.getText());
    }//GEN-LAST:event_txfBuscarKeyReleased

    private void btnHabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabilitarActionPerformed
        if (this.citastab.getRowCount() < 1) {
            JOptionPane.showMessageDialog(null, "LA TABLA ESTÁ VACÍA");
        } else {
            if (this.citastab.getSelectedRowCount() < 1) {
                JOptionPane.showMessageDialog(null, "SELECCIONA UN REGISTRO");
            } else {

                int fila = this.citastab.getSelectedRow();

                Insercion ins = new Insercion();
                ins.lblId.setText(this.citastab.getValueAt(fila, 0).toString());
                ins.txfNombre.setText(this.citastab.getValueAt(fila, 1).toString());
                ins.txfNombre.setEditable(false);
                ins.txfProveedor.setText(this.citastab.getValueAt(fila, 3).toString());
                ins.txfProveedor.setEditable(false);
                ins.txfPrecioCompra.setText(this.citastab.getValueAt(fila, 4).toString());
                ins.txfPrecioCompra.setEnabled(false);
                ins.txfPrecioVenta.setText(this.citastab.getValueAt(fila, 5).toString());
                ins.txfPrecioVenta.setEnabled(false);
                ins.txfStock.setText(this.citastab.getValueAt(fila, 6).toString());
                ins.txfStock.setEditable(false);
                ins.cbbEstado.setSelectedIndex(setComboInsertar());
                ins.btnLimpiarCampos.setEnabled(false);
                ins.lblTitulo.setText("HABILITAR/DESAHABILITAR");
                ins.btnRegistrar.setText("OK");
                ins.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnHabilitarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHabilitar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    public static javax.swing.JTable citastab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JTextField txfBuscar;
    // End of variables declaration//GEN-END:variables
    public int setComboInsertar() {
        int numero = 1;
        int fil = this.citastab.getSelectedRow();
        if(Integer.parseInt(this.citastab.getValueAt(fil, 2).toString()) == 0){
            return numero+1;
        }else
        return numero;
    }
    
}
