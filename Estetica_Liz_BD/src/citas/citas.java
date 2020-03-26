/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citas;

import Usuarios.*;
import Funciones.Encriptar;

import productos.*;
import conexion.Conectando;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
import static java.lang.Integer.getInteger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyAnimated;
/**
 *
 * @author enrique7cp@gmail.com
 */
public class citas extends javax.swing.JDialog {
    Conectando con = new Conectando();
    Connection nConect;
    
    cargarcombobox combo=new cargarcombobox();
     mostrar most= new mostrar();
    /** Creates new form Insercion */
    public citas() {
        //super(parent, modal);
        this.nConect = con.conect();
        initComponents();
        this.setLocationRelativeTo(null);
         combo.consulta_Servicios(jOpcion);
         most.listar("");
         txtid.setEditable(false);
         txtid.setVisible(false);
        
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
        btnLimpiarCampos = new javax.swing.JButton();
        NombreCli = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        lblProveedor1 = new javax.swing.JLabel();
        lblPrecioCompra1 = new javax.swing.JLabel();
        Telefono2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jOpcion = new javax.swing.JComboBox<String>();
        hora = new javax.swing.JFormattedTextField();
        lblCerrar4 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtcui = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        lblPrecioVenta2 = new javax.swing.JLabel();
        combocompro = new javax.swing.JComboBox<String>();
        Telefono3 = new javax.swing.JLabel();
        telefono1 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        btnregistrar = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        verificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CITA");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 252, 38));

        btnLimpiarCampos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnLimpiarCampos.setText("LIMPIAR");
        btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, 30));

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
        jPanel1.add(NombreCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 190, -1));

        lblNombre1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblNombre1.setText("Nombre Cliente:");
        jPanel1.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        lblProveedor1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblProveedor1.setText("Motivo Cita:");
        jPanel1.add(lblProveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        lblPrecioCompra1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPrecioCompra1.setText("Hora:");
        jPanel1.add(lblPrecioCompra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        Telefono2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Telefono2.setText("Estado:");
        jPanel1.add(Telefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 240, 10));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 270, 10));

        jOpcion.setBackground(new java.awt.Color(51, 52, 255));
        jOpcion.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jOpcion.setForeground(new java.awt.Color(204, 204, 204));
        jOpcion.setOpaque(false);
        jOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpcionActionPerformed(evt);
            }
        });
        jPanel1.add(jOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 210, 20));

        hora.setBackground(new java.awt.Color(102, 0, 204));
        hora.setBorder(null);
        hora.setForeground(new java.awt.Color(255, 255, 255));
        try {
            hora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        hora.setOpaque(false);
        hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaActionPerformed(evt);
            }
        });
        jPanel1.add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 270, 20));

        lblCerrar4.setBackground(new java.awt.Color(102, 0, 204));
        lblCerrar4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCerrar4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar4.setText("x");
        lblCerrar4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCerrar4.setOpaque(true);
        lblCerrar4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblCerrar4MouseMoved(evt);
            }
        });
        lblCerrar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrar4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrar4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrar4MouseExited(evt);
            }
        });
        jPanel1.add(lblCerrar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 30, 30));

        fecha.setBackground(new java.awt.Color(51, 51, 255));
        fecha.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        fecha.setBorder(null);
        fecha.setOpaque(false);
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 260, 20));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 190, 10));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("CUI:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 40, -1));

        txtcui.setBackground(new java.awt.Color(51, 51, 255));
        txtcui.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtcui.setForeground(new java.awt.Color(255, 255, 255));
        txtcui.setBorder(null);
        txtcui.setCaretColor(new java.awt.Color(255, 255, 255));
        txtcui.setOpaque(false);
        txtcui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcuiKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcuiKeyTyped(evt);
            }
        });
        jPanel1.add(txtcui, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 200, 20));

        jSeparator19.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 200, 10));

        lblPrecioVenta2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPrecioVenta2.setText("Fecha:");
        jPanel1.add(lblPrecioVenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        combocompro.setBackground(new java.awt.Color(51, 51, 255));
        combocompro.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        combocompro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione estado", "Almacenada", "Terminada" }));
        combocompro.setOpaque(false);
        combocompro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combocomproMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                combocomproMouseReleased(evt);
            }
        });
        combocompro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocomproActionPerformed(evt);
            }
        });
        combocompro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combocomproKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                combocomproKeyReleased(evt);
            }
        });
        jPanel1.add(combocompro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 250, 20));

        Telefono3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Telefono3.setText("Telefono:");
        jPanel1.add(Telefono3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        telefono1.setBackground(new java.awt.Color(51, 51, 255));
        telefono1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        telefono1.setBorder(null);
        telefono1.setOpaque(false);
        jPanel1.add(telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 240, 20));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 260, 10));

        btnregistrar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        txtid.setBackground(new java.awt.Color(51, 51, 255));
        txtid.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtid.setForeground(new java.awt.Color(255, 255, 255));
        txtid.setBorder(null);
        txtid.setCaretColor(new java.awt.Color(255, 255, 255));
        txtid.setOpaque(false);
        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtidKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidKeyTyped(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 20));

        lblId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblId.setText("ID");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        verificar.setText("verificar");
        verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarActionPerformed(evt);
            }
        });
        verificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                verificarKeyPressed(evt);
            }
        });
        jPanel1.add(verificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 437));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        this.NombreCli.requestFocus();
        this.NombreCli.setText("");
        this.hora.requestFocus();
        this.hora.setText("");
        this.fecha.requestFocus();
        this.fecha.setText("");
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed
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
    private void NombreCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreCliActionPerformed

    private void jOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOpcionActionPerformed

    private void horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaActionPerformed
        if(Validar_CampoHora(hora.getText()) == true){
            System.out.println("La hora es correcta");
        } else{
            System.out.println("Hora incorrecta");
        }
    }//GEN-LAST:event_horaActionPerformed

    private void lblCerrar4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar4MouseMoved
        //lblCerrar.setBackground(Color.RED);
    }//GEN-LAST:event_lblCerrar4MouseMoved

    private void lblCerrar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar4MouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCerrar4MouseClicked

    private void lblCerrar4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCerrar4MouseEntered

    private void lblCerrar4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar4MouseExited
        //lblCerrar.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_lblCerrar4MouseExited
    String id="";
    public void consultaid (String valor) throws SQLException, IOException{
       PreparedStatement buscar;
        String nombre = "";
        
        buscar = nConect.prepareStatement("SELECT *FROM cliente WHERE dpi=?");
        buscar.setString(1, valor);
        buscar.execute();

        ResultSet resultadosObtenidos=buscar.executeQuery();
        while(resultadosObtenidos.next()){
             nombre =  resultadosObtenidos.getString("nombre");
             id =  resultadosObtenidos.getString("id");
             NombreCli.setText(nombre);
             txtid.setText(id);
        System.out.println("el id es  "+ txtid.getText());
        }
        
        
        
    }
    private void txtcuiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuiKeyPressed
    }//GEN-LAST:event_txtcuiKeyPressed

    private void txtcuiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcuiKeyTyped

    private void combocomproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combocomproMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_combocomproMouseClicked

    private void combocomproMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combocomproMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_combocomproMouseReleased

    private void combocomproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocomproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combocomproActionPerformed

    private void combocomproKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combocomproKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_combocomproKeyPressed

    private void combocomproKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combocomproKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_combocomproKeyReleased
    public String convertirVaciosNull (String dato)
   {
      String resultado = null;
      if (dato != null && dato.length()>0)
      {
         resultado = dato;
      }
      return resultado;
   }
    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
       
        if(txtcui.getText().equals("")
            || NombreCli.getText().equals("")
            || hora.getText().equals("")
            || jOpcion.getSelectedIndex() == 0
            || fecha.equals("")
            || telefono1.equals("")){
            JOptionPane.showMessageDialog(null, "FALTAN LLENAR CAMPOS");

        }else{
            if (this.btnregistrar.getText().equals("REGISTRAR")) {
                try {
                   
                    PreparedStatement agregarcita = nConect.prepareStatement("INSERT INTO cita (nombre,motivo,telefono,hora,fecha,estado,identificacion,cliente_id) VALUES (?,?,?,?,?,?,?,?)");
                    agregarcita.setString(1, NombreCli.getText());
                    agregarcita.setString(2, jOpcion.getSelectedItem().toString());
                    agregarcita.setString(3, telefono1.getText()); //verificar aqui tengo qeu hacer una busquedad del nombre y que me retornet el id para guardarlo
                    agregarcita.setString(4, hora.getText());
                    agregarcita.setString(5, fecha.getText());
                    agregarcita.setBoolean(6, verificarCombo());
                    agregarcita.setString(7,txtcui.getText());
                    System.out.println("impirmir nulo"+ txtid.getText());
                    
                        agregarcita.setString(8,convertirVaciosNull(txtid.getText()));
                   
                    
                    agregarcita.executeUpdate();

                    new rojerusan.RSNotifyAnimated("¡REGISTRADA!", "CITA REGISTRADA EXITOSAMENTE",
                        5, RSNotifyAnimated.PositionNotify.BottomRight,
                        RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);

                    most.listar("");
                } catch (SQLException ex) {

                } 
            }else if(this.btnregistrar.getText().equals("GUARDAR")){
                
                try {                   
                    PreparedStatement agregarcita = nConect.prepareStatement("UPDATE  cita SET nombre=?,"
                            + "motivo=?,telefono=?,hora=?,fecha=?,estado=?,identificacion=?,cliente_id=? "
                            + "WHERE id=?");
                
                    agregarcita.setString(1, NombreCli.getText());
                    agregarcita.setString(2, jOpcion.getSelectedItem().toString());
                    agregarcita.setString(3, telefono1.getText()); //verificar aqui tengo qeu hacer una busquedad del nombre y que me retornet el id para guardarlo
                    agregarcita.setString(4, hora.getText());
                    agregarcita.setString(5, fecha.getText());
                    agregarcita.setBoolean(6, verificarCombo());
                    agregarcita.setString(7,txtcui.getText());
                    agregarcita.setString(8, convertirVaciosNull(txtid.getText()));
                    agregarcita.setString(9,lblId.getText());
                    agregarcita.executeUpdate();

                    new rojerusan.RSNotifyAnimated("¡MODIFICADA!", "CITA  MODIFICADA EXITOSAMENTE",
                        5, RSNotifyAnimated.PositionNotify.BottomRight,
                        RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);

                    most.listar("");
                } catch (SQLException ex) {
                    Logger.getLogger(citas.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
                    else if(this.btnregistrar.getText().equals("CAMBIAR")){
                
                try {                   
                    PreparedStatement agregarcita = nConect.prepareStatement("UPDATE  cita SET nombre=?,"
                            + "motivo=?,telefono=?,hora=?,fecha=?,estado=?,identificacion=?,cliente_id=? "
                            + "WHERE id=?");
                
                    agregarcita.setString(1, NombreCli.getText());
                    agregarcita.setString(2, jOpcion.getSelectedItem().toString());
                    agregarcita.setString(3, telefono1.getText()); //verificar aqui tengo qeu hacer una busquedad del nombre y que me retornet el id para guardarlo
                    agregarcita.setString(4, hora.getText());
                    agregarcita.setString(5, fecha.getText());
                    agregarcita.setBoolean(6, verificarCombo());
                    agregarcita.setString(7,txtcui.getText());
                    agregarcita.setString(8, convertirVaciosNull(txtid.getText()));
                    agregarcita.setString(9,lblId.getText());
                    agregarcita.executeUpdate();

                    new rojerusan.RSNotifyAnimated("¡MODIFICADA!", "CITA  MODIFICADA EXITOSAMENTE",
                        5, RSNotifyAnimated.PositionNotify.BottomRight,
                        RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);

                    most.listar("");
                } catch (SQLException ex) {
                    Logger.getLogger(citas.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
        }
        
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void txtidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidKeyPressed

    private void txtidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidKeyTyped

    private void verificarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verificarKeyPressed
       
    }//GEN-LAST:event_verificarKeyPressed

    private void verificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarActionPerformed
      try {
            consultaid(txtcui.getText());
        
        } catch (SQLException ex) {
           
        } catch (IOException ex) {
            
        }
    }//GEN-LAST:event_verificarActionPerformed
   
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
            java.util.logging.Logger.getLogger(citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                citas dialog = new citas();
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
    public static javax.swing.JTextField NombreCli;
    private javax.swing.JLabel Telefono2;
    private javax.swing.JLabel Telefono3;
    private javax.swing.JButton btnLimpiarCampos;
    public javax.swing.JButton btnregistrar;
    private javax.swing.JComboBox<String> combocompro;
    public javax.swing.JTextField fecha;
    public javax.swing.JFormattedTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JComboBox<String> jOpcion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblCerrar4;
    public javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblPrecioCompra1;
    private javax.swing.JLabel lblPrecioVenta2;
    private javax.swing.JLabel lblProveedor1;
    public static javax.swing.JLabel lblTitulo;
    public javax.swing.JTextField telefono1;
    public static javax.swing.JTextField txtcui;
    public static javax.swing.JTextField txtid;
    private javax.swing.JButton verificar;
    // End of variables declaration//GEN-END:variables

   public boolean verificarCombo(){
        if(combocompro.getSelectedIndex()==1){
            return true;
        }else
        return false;
     }
    
}