/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import com.github.sarxos.webcam.Webcam;
import conexion.Conectando;


import java.awt.Color;

import java.awt.Image;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyAnimated;


/**
 *
 * @author enrique7cp@gmail.com
 */
public class Agregarempleados extends javax.swing.JDialog {

    Conectando con = new Conectando();
    Connection nConect;
    cargarcombobox cargar = new cargarcombobox();
    FileInputStream fis,fis2;
    int longitudBytes,longitudBytes2;
  
    cargarcombobox listar = new cargarcombobox();
    

    /**
     * Creates new form Insercion
     */
        
    public Agregarempleados() {
        //super(parent, modal);
        this.nConect = con.conect();
        initComponents();
        this.setLocationRelativeTo(null);
        //agregar datos al combo box
        comboxesta.removeAllItems();
        listar.consultas_estable(comboxesta);

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
        lblCerrar1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        telefono1 = new javax.swing.JTextField();
        horaspresenciales1 = new javax.swing.JFormattedTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        lblfotoc1 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        nombre1 = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        lblregistrar = new javax.swing.JLabel();
        fecha1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtcui1 = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        comboxesta = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        combocompro = new javax.swing.JComboBox<>();
        btnregistrar = new javax.swing.JButton();
        fotografiacam = new JPanelWebCam.JPanelWebCam();
        coreo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        fechafin = new javax.swing.JTextField();
        fechainicio = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("CUI:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 40, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Fecha Fin:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Carta");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Teléfono:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("Correo:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        telefono1.setBackground(new java.awt.Color(51, 51, 255));
        telefono1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        telefono1.setForeground(new java.awt.Color(255, 255, 255));
        telefono1.setBorder(null);
        telefono1.setCaretColor(new java.awt.Color(255, 255, 255));
        telefono1.setOpaque(false);
        telefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefono1ActionPerformed(evt);
            }
        });
        telefono1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefono1KeyTyped(evt);
            }
        });
        jPanel1.add(telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 220, 20));

        horaspresenciales1.setBackground(new java.awt.Color(51, 51, 255));
        horaspresenciales1.setBorder(null);
        horaspresenciales1.setForeground(new java.awt.Color(255, 255, 255));
        try {
            horaspresenciales1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        horaspresenciales1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        horaspresenciales1.setOpaque(false);
        horaspresenciales1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaspresenciales1ActionPerformed(evt);
            }
        });
        jPanel1.add(horaspresenciales1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 150, 20));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 220, 10));

        jSeparator14.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 230, 10));

        jSeparator15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 220, 10));

        lblfotoc1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblfotoc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblfotoc1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblfotoc1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblfotoc1MouseReleased(evt);
            }
        });
        lblfotoc1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblfotoc1KeyPressed(evt);
            }
        });
        jPanel1.add(lblfotoc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 200, 160));

        jSeparator16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 150, 10));

        jSeparator17.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 140, 10));

        nombre1.setBackground(new java.awt.Color(51, 51, 255));
        nombre1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nombre1.setForeground(new java.awt.Color(255, 255, 255));
        nombre1.setBorder(null);
        nombre1.setCaretColor(new java.awt.Color(255, 255, 255));
        nombre1.setOpaque(false);
        nombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre1KeyTyped(evt);
            }
        });
        jPanel1.add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 220, 20));

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 80, 30));

        lblregistrar.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        lblregistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblregistrar.setText("REGISTRAR");
        jPanel1.add(lblregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 252, 38));

        fecha1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        fecha1.setForeground(new java.awt.Color(255, 255, 255));
        fecha1.setBorder(null);
        fecha1.setOpaque(false);
        fecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha1ActionPerformed(evt);
            }
        });
        jPanel1.add(fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 140, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("Nombre:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txtcui1.setBackground(new java.awt.Color(51, 51, 255));
        txtcui1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtcui1.setForeground(new java.awt.Color(255, 255, 255));
        txtcui1.setBorder(null);
        txtcui1.setCaretColor(new java.awt.Color(255, 255, 255));
        txtcui1.setOpaque(false);
        txtcui1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcui1KeyTyped(evt);
            }
        });
        jPanel1.add(txtcui1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 250, 20));

        jSeparator18.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 250, 10));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setText("Horas Presenciales");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setText("Estado:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 60, -1));

        comboxesta.setBackground(new java.awt.Color(51, 51, 255));
        comboxesta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        comboxesta.setOpaque(false);
        comboxesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboxestaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comboxestaMouseReleased(evt);
            }
        });
        comboxesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxestaActionPerformed(evt);
            }
        });
        comboxesta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboxestaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboxestaKeyReleased(evt);
            }
        });
        jPanel1.add(comboxesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 180, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("Foto");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 40, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel18.setText("Establecimiento");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        combocompro.setBackground(new java.awt.Color(51, 51, 255));
        combocompro.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        combocompro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione estado", "Habilitado", "Inhabilitado" }));
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
        jPanel1.add(combocompro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 230, -1));

        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        fotografiacam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fotografiacamMousePressed(evt);
            }
        });
        jPanel1.add(fotografiacam, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 200, 160));

        coreo.setBackground(new java.awt.Color(51, 51, 255));
        coreo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        coreo.setForeground(new java.awt.Color(255, 255, 255));
        coreo.setBorder(null);
        coreo.setCaretColor(new java.awt.Color(255, 255, 255));
        coreo.setOpaque(false);
        coreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                coreoKeyTyped(evt);
            }
        });
        jPanel1.add(coreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 230, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel19.setText("Fecha de Nacimiento:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel20.setText("Fecha Inicio:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        fechafin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        fechafin.setForeground(new java.awt.Color(255, 255, 255));
        fechafin.setBorder(null);
        fechafin.setOpaque(false);
        fechafin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechafinActionPerformed(evt);
            }
        });
        jPanel1.add(fechafin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 140, 20));

        fechainicio.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        fechainicio.setForeground(new java.awt.Color(255, 255, 255));
        fechainicio.setBorder(null);
        fechainicio.setOpaque(false);
        fechainicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechainicioActionPerformed(evt);
            }
        });
        jPanel1.add(fechainicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 140, 20));

        jSeparator19.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 140, 10));

        jSeparator20.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 140, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 510));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public Boolean Validar_CampoHora(String Hora) {
        boolean b;
        char[] a = Hora.toString().toCharArray();
        String[] c = Hora.split(" : ");
        if ((a[0] == ' ') || (a[1] == ' ') || (a[2] == ' ')
                || (a[3] == ' ') || (a[4] == ' ')
                || (getInteger(c[0]) > 24) || (getInteger(c[1]) > 59)) {
            b = false;
        } else {
            b = true;
        }
        return b;
    }

    public int getInteger(String valor) {
        int integer = Integer.parseInt(valor);
        return integer;
    }

   
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

    private void telefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefono1ActionPerformed

    }//GEN-LAST:event_telefono1ActionPerformed

    private void telefono1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefono1KeyTyped
        // TODO add your handling code here:
        if (telefono1.getText().length() > 8) {
            evt.consume();
        }
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(telefono1, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_telefono1KeyTyped

    private void horaspresenciales1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaspresenciales1ActionPerformed
        
    }//GEN-LAST:event_horaspresenciales1ActionPerformed

    private void nombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre1KeyTyped
        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {
            getToolkit().beep();

            evt.consume();

            JOptionPane.showMessageDialog(nombre1, "Ingrese solo letras");
        }
    }//GEN-LAST:event_nombre1KeyTyped
    String idesta="";
   
    String comb="";
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.nombre1.requestFocus();
        this.coreo.setText("");
        this.horaspresenciales1.setText("");
        this.telefono1.requestFocus();
        this.fecha1.setText("");
        this.fotografiacam.setImagenNull();
        this.lblfotoc1.setText("");      
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void fecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha1ActionPerformed

    private void txtcui1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcui1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcui1KeyTyped

    private void comboxestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxestaActionPerformed

    }//GEN-LAST:event_comboxestaActionPerformed

    private void comboxestaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboxestaKeyPressed


    }//GEN-LAST:event_comboxestaKeyPressed

    private void comboxestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboxestaMouseClicked

    }//GEN-LAST:event_comboxestaMouseClicked

    private void comboxestaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboxestaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_comboxestaKeyReleased

    private void comboxestaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboxestaMouseReleased

    }//GEN-LAST:event_comboxestaMouseReleased


    private void lblfotoc1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblfotoc1KeyPressed
     
         
    }//GEN-LAST:event_lblfotoc1KeyPressed

    private void lblfotoc1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfotoc1MouseClicked
       
    }//GEN-LAST:event_lblfotoc1MouseClicked

    private void lblfotoc1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfotoc1MouseReleased
        
    }//GEN-LAST:event_lblfotoc1MouseReleased
 String verifidacion;
    private void lblfotoc1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfotoc1MousePressed
         // agregar carta 
        verifidacion="";
        lblfotoc1.setIcon(null);
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);//validacion de solo archivos
        int estado = j.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(j.getSelectedFile());
                this.longitudBytes = (int) j.getSelectedFile().length();
                try {
                    Image icono = ImageIO.read(j.getSelectedFile()).getScaledInstance(lblfotoc1.getWidth(), lblfotoc1.getHeight(), Image.SCALE_DEFAULT);
                    lblfotoc1.setIcon(new ImageIcon(icono));
                    lblfotoc1.updateUI();
                    verifidacion = "valido";
                } catch (Exception e) {

                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_lblfotoc1MousePressed


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

    public int verificarComboBox(){
        int index=0;
        index=comboxesta.getSelectedIndex()+1;
        return index;
    }
    
    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
            byte [] imagen= fotografiacam.getBytes();
        Webcam w = Webcam.getDefault();
        w.getLock().disable();
        if (coreo.getText().equals("") || comboxesta.getSelectedIndex() == 0
                || txtcui1.getText().equals("")
                || nombre1.getText().equals("")
                || telefono1.getText().equals("")
                || horaspresenciales1.equals("")
                || fechainicio.equals("")
                || fechafin.equals("")
                ) {
            JOptionPane.showMessageDialog(null, "FALTAN LLENAR CAMPOS");
        } else {
// el erro esta aqui ya que no registra como tal al empleado
             if (this.btnregistrar.getText().equals("REGISTRAR")) {
            try {
                PreparedStatement agregaremple = nConect.prepareStatement("INSERT INTO empleado (CUI, nombre, "
                        + "foto,correo,horasPrecenciales,telefono,fechaNacimiento,cartal,habilitado,fechainicio,fechafin,establecimiento_id)"+ " VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
                agregaremple.setString(1, txtcui1.getText());
                agregaremple.setString(2, nombre1.getText());
                agregaremple.setBytes(3, imagen);
                agregaremple.setString(4, coreo.getText());
                agregaremple.setString(5, horaspresenciales1.getText());
                agregaremple.setString(6, telefono1.getText());
                agregaremple.setString(7, fecha1.getText());
                agregaremple.setBinaryStream(8, fis, longitudBytes); 
                agregaremple.setBoolean(9, verificarCombo());
                agregaremple.setString(10, fechainicio.getText());
                agregaremple.setString(11, fechafin.getText());
                agregaremple.setInt(12, verificarComboBox());
                
                agregaremple.executeUpdate();
               
                new rojerusan.RSNotifyAnimated("¡AGREGADO!", "EMPLEADO AGREGADO EXITOSAMENTE",
                        5, RSNotifyAnimated.PositionNotify.BottomRight,
                        RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);

                verifidacion = "";
                listaemple.listar("");
            if (w.isOpen()) {
                w.close();
            
            }
            } catch (SQLException ex) {

            }
             } 
               if (this.btnregistrar.getText().equals("GUARDAR")) {
                    try {
                PreparedStatement agregaremple = nConect.prepareStatement("UPDATE  empleado SET CUI=?, nombre=?,"
                        + "foto=?,correo=?,horasPrecenciales=?,telefono=?,fechaNacimiento=?,cartal=?,habilitado=?,establecimiento_id=? WHERE CUI=?");
                agregaremple.setString(1, txtcui1.getText());
                agregaremple.setString(2, nombre1.getText());
                agregaremple.setBytes(3, imagen);
                agregaremple.setString(4, coreo.getText());
                agregaremple.setString(5, horaspresenciales1.getText());
                agregaremple.setString(6, telefono1.getText());
                agregaremple.setString(7, fecha1.getText());
                agregaremple.setBinaryStream(8, fis, longitudBytes); 
                agregaremple.setBoolean(9, verificarCombo());
                agregaremple.setInt(10, verificarComboBox());
                agregaremple.setString(11, txtcui1.getText());
                agregaremple.executeUpdate();
               //fechas falta comentar
                new rojerusan.RSNotifyAnimated("¡MODIFICADO!", "EMPLEADO MODIFICADO EXITOSAMENTE",
                        5, RSNotifyAnimated.PositionNotify.BottomRight,
                        RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
                listaemple.listar("");
            if (w.isOpen()) {
                w.close();
            
            }
            } catch (SQLException ex) {

            }
               }else{
                    try {
                PreparedStatement agregaremple = nConect.prepareStatement("UPDATE  empleado SET CUI=?, nombre=?,"
                        + "foto=?,correo=?,horasPrecenciales=?,telefono=?,fechaNacimiento=?,cartal=?,habilitado=?,establecimiento_id=? WHERE CUI=?");
                agregaremple.setString(1, txtcui1.getText());
                agregaremple.setString(2, nombre1.getText());
                agregaremple.setBytes(3, imagen);
                agregaremple.setString(4, coreo.getText());
                agregaremple.setString(5, horaspresenciales1.getText());
                agregaremple.setString(6, telefono1.getText());
                agregaremple.setString(7, fecha1.getText());
                agregaremple.setBinaryStream(8, fis, longitudBytes); 
                agregaremple.setBoolean(9, verificarCombo());
                agregaremple.setInt(10, verificarComboBox());
                agregaremple.setString(11, txtcui1.getText());
                
                agregaremple.executeUpdate();
               
                new rojerusan.RSNotifyAnimated("¡HECHO!", "HABILITACIÓN O DESHABILITACIÓN REALIZADA CON ÉXITO",
                        5, RSNotifyAnimated.PositionNotify.BottomRight,
                        RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);

               
                listaemple.listar("");
            if (w.isOpen()) {
                w.close();
            
            }
            } catch (SQLException ex) {

            }
               }

        }
         verifidacion = "";
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void coreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_coreoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_coreoKeyTyped
String foto="";
    private void fotografiacamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotografiacamMousePressed
        foto="";
        foto="valido";
    }//GEN-LAST:event_fotografiacamMousePressed

    private void fechafinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechafinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechafinActionPerformed

    private void fechainicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechainicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechainicioActionPerformed
     
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
            java.util.logging.Logger.getLogger(Agregarempleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregarempleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregarempleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregarempleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Agregarempleados dialog = new Agregarempleados();
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
    private javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnregistrar;
    public javax.swing.JComboBox<String> combocompro;
    public javax.swing.JComboBox<String> comboxesta;
    public static javax.swing.JTextField coreo;
    public javax.swing.JTextField fecha1;
    public javax.swing.JTextField fechafin;
    public javax.swing.JTextField fechainicio;
    public JPanelWebCam.JPanelWebCam fotografiacam;
    public javax.swing.JFormattedTextField horaspresenciales1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblCerrar1;
    public javax.swing.JLabel lblfotoc1;
    public static javax.swing.JLabel lblregistrar;
    public static javax.swing.JTextField nombre1;
    public static javax.swing.JTextField telefono1;
    public static javax.swing.JTextField txtcui1;
    // End of variables declaration//GEN-END:variables
 public boolean verificarCombo(){
        if(combocompro.getSelectedIndex()==1){
            return true;
        }else
        return false;
    }

}
