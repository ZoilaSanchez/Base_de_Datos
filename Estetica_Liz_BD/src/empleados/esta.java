/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empleados;

import Usuarios.*;
import Funciones.Encriptar;
import productos.*;
import conexion.Conectando;

import java.awt.Color;
import java.awt.Image;

import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyAnimated;
import empleados.*;
/**
 *
 * @author enrique7cp@gmail.com
 */
public class esta extends javax.swing.JDialog {
    Conectando con = new Conectando();
    Connection nConect;
    cargarcombobox cargar =new cargarcombobox();
    FileInputStream fis;
    int longitudBytes;
    
 
    /** Creates new form Insercion */
    public esta() {
        //super(parent, modal);
        this.nConect = con.conect();
        initComponents();
        this.setLocationRelativeTo(null);
        //agregar datos al combo box
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        horaspresenciales = new javax.swing.JFormattedTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcui = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        carta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        lblfotoc = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCerrar1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        txtnombre = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        btningresar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();

        lblCerrar.setBackground(new java.awt.Color(102, 0, 204));
        lblCerrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("x");
        lblCerrar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("CUI");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Fecha de Nacimiento");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Foto");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Teléfono");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Apellido");

        telefono.setBackground(new java.awt.Color(51, 51, 255));
        telefono.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        telefono.setForeground(new java.awt.Color(255, 255, 255));
        telefono.setBorder(null);
        telefono.setCaretColor(new java.awt.Color(255, 255, 255));
        telefono.setOpaque(false);
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Agregar Carta");

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

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));

        nombre.setBackground(new java.awt.Color(51, 51, 255));
        nombre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setBorder(null);
        nombre.setCaretColor(new java.awt.Color(255, 255, 255));
        nombre.setOpaque(false);
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        apellido.setBackground(new java.awt.Color(51, 51, 255));
        apellido.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        apellido.setBorder(null);
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });
        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });

        btnregistrar.setText("INGRESAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("REGISTRAR");

        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Nombre");

        txtcui.setBackground(new java.awt.Color(51, 51, 255));
        txtcui.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtcui.setForeground(new java.awt.Color(255, 255, 255));
        txtcui.setBorder(null);
        txtcui.setCaretColor(new java.awt.Color(255, 255, 255));
        txtcui.setOpaque(false);
        txtcui.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcuiKeyTyped(evt);
            }
        });

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Horas Presenciales");

        carta.setText("Agregar Carta");
        carta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartaActionPerformed(evt);
            }
        });

        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator13.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 130, Short.MAX_VALUE))
            .addComponent(jSeparator13)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setUndecorated(true);

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
        jPanel1.add(lblCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 30, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Nombre");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Telefono");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 190, 10));

        jSeparator14.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 200, 10));

        txtnombre.setBackground(new java.awt.Color(51, 51, 255));
        txtnombre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(255, 255, 255));
        txtnombre.setBorder(null);
        txtnombre.setCaretColor(new java.awt.Color(255, 255, 255));
        txtnombre.setOpaque(false);
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 190, 20));

        txtdireccion.setBackground(new java.awt.Color(51, 51, 255));
        txtdireccion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtdireccion.setBorder(null);
        txtdireccion.setOpaque(false);
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });
        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });
        jPanel1.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 200, 20));

        btningresar.setText("INGRESAR");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        jPanel1.add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jButton3.setText("LIMPIAR");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        lblTitulo1.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("REGISTRAR");
        jPanel1.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 180, 38));

        txttelefono.setBackground(new java.awt.Color(51, 51, 255));
        txttelefono.setBorder(null);
        txttelefono.setOpaque(false);
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 200, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Direccion");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jSeparator15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 200, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseMoved
        lblCerrar.setBackground(Color.RED);
    }//GEN-LAST:event_lblCerrarMouseMoved

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCerrarMouseEntered

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseExited
        lblCerrar.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_lblCerrarMouseExited

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed

    }//GEN-LAST:event_telefonoActionPerformed

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        // TODO add your handling code here:
        if (telefono.getText().length()>8) {
            evt.consume();
        }
        char validar=evt.getKeyChar();

        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(telefono, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_telefonoKeyTyped

    private void horaspresencialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaspresencialesActionPerformed
        if(Validar_CampoHora(horaspresenciales.getText()) == true){
            System.out.println("La hora es correcta");
        } else{
            System.out.println("Hora incorrecta");
        }
    }//GEN-LAST:event_horaspresencialesActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        char validar=evt.getKeyChar();

        if(Character.isDigit(validar)){
            getToolkit().beep();

            evt.consume();

            JOptionPane.showMessageDialog(nombre, "Ingrese solo letras");
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyTyped
        char validar=evt.getKeyChar();

        if(Character.isDigit(validar)){
            getToolkit().beep();

            evt.consume();

            JOptionPane.showMessageDialog(apellido, "Ingrese solo letras");
        }
    }//GEN-LAST:event_apellidoKeyTyped
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
    public void consulta_mostrar_imagen(){
        String sql="SELECT  *FROM empleado where CUI="+txtcui.getText();
        ImageIcon foto;
        InputStream is;
        String nombres;
        try {
            Statement st = nConect.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                is=rs.getBinaryStream("foto");
                nombres=rs.getString("nombre");
                BufferedImage bi= ImageIO.read(is);
                foto=new ImageIcon(bi);//convertir
                Image img=foto.getImage();
                Image ver=img.getScaledInstance(140, 170, java.awt.Image.SCALE_SMOOTH);
                ImageIcon vers=new ImageIcon(ver);
                lblfotoc.setIcon(vers);
                nombre.setText(nombres);
            }
            
        } catch (Exception e) {
        }
                
    }
    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // ingresar

        if( verifidacion.equals("")||lblfotoc.equals("")
            ||txtcui.getText().equals("")||
            nombre.getText().equals("")
            || apellido.getText().equals("")
            || telefono.getText().equals("")
            || horaspresenciales.equals("")
        ){
            JOptionPane.showMessageDialog(null, "FALTAN LLENAR CAMPOS");

        }else{

            try {

                PreparedStatement agregaremple = nConect.prepareStatement("INSERT INTO empleado (CUI, nombre,"
                    + "foto,correo,horasPrecenciales, telefono,fechaNacimiento, "
                    + "establecimiento_id,cartal) VALUES (?,?,?,?,?,?,?,?,?)");
                agregaremple.setString(1, txtcui.getText());
                agregaremple.setString(2, nombre.getText()+" "+apellido.getText());
                agregaremple.setBinaryStream(3, fis, longitudBytes);
                agregaremple.setString(4, "correo");
                agregaremple.setString(5,horaspresenciales.getText());
                agregaremple.setString(6, telefono.getText());
                agregaremple.setString(7, fecha.getText());
                agregaremple.setString(8, "1");//va el establecimiento
                agregaremple.setBinaryStream(9, fis, longitudBytes);
                agregaremple.executeUpdate();

                new rojerusan.RSNotifyAnimated("¡AGREGADO!", "USUARIO AGREGADO EXITOSAMENTE",
                    5, RSNotifyAnimated.PositionNotify.BottomRight,
                    RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);

                verifidacion="";
            } catch (SQLException ex) {
               
            }

        }

    }//GEN-LAST:event_btnregistrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        consulta_mostrar_imagen();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed

    private void txtcuiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcuiKeyTyped

    private void cartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartaActionPerformed
        verifidacion ="valido";
        lblfotoc.setIcon(null);
        JFileChooser j=new JFileChooser();
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);//validacion de solo archivos
        int estado=j.showOpenDialog(null);
        if(estado==JFileChooser.APPROVE_OPTION){
            try {
                fis=new FileInputStream(j.getSelectedFile());
                this.longitudBytes=(int)j.getSelectedFile().length();
                try {
                    Image icono= ImageIO.read(j.getSelectedFile()).getScaledInstance
                    (lblfotoc.getWidth(), lblfotoc.getHeight(), Image.SCALE_DEFAULT);
                    lblfotoc.setIcon(new ImageIcon(icono));
                    lblfotoc.updateUI();
                } catch (Exception e) {

                }
            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_cartaActionPerformed

    private void lblCerrar1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar1MouseMoved
        lblCerrar.setBackground(Color.RED);
    }//GEN-LAST:event_lblCerrar1MouseMoved

    private void lblCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar1MouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCerrar1MouseClicked

    private void lblCerrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCerrar1MouseEntered

    private void lblCerrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrar1MouseExited
        lblCerrar.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_lblCerrar1MouseExited

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char validar=evt.getKeyChar();

        if(Character.isDigit(validar)){
            getToolkit().beep();

            evt.consume();

            JOptionPane.showMessageDialog(nombre, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        char validar=evt.getKeyChar();

        if(Character.isDigit(validar)){
            getToolkit().beep();

            evt.consume();

            JOptionPane.showMessageDialog(apellido, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtdireccionKeyTyped

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        // ingresar
        if( txtnombre.equals("")||txtdireccion.equals("")
            ||txttelefono.getText().equals("")){
            JOptionPane.showMessageDialog(null, "FALTAN LLENAR CAMPOS");
        }else{

            try {
                // START TRANSACTION 
                con.conect().setAutoCommit(false); 
                PreparedStatement agregaremple = nConect.prepareStatement("INSERT INTO establecimiento (nomEstablecimiento,"
                    + "direccion,telefono) VALUES (?,?,?)");
                agregaremple.setString(1, txtnombre.getText());
                agregaremple.setString(2, txtdireccion.getText());
                agregaremple.setString(3,txttelefono.getText());
                agregaremple.executeUpdate();
                // ----- Seguimiento de la transaccion -----
                con.conect().commit();
                System.out.println("commit realizado");
                // ----- Transaccion Finalizada -----
                new rojerusan.RSNotifyAnimated("¡AGREGADO!", "EXITOSAMENTE",
                    5, RSNotifyAnimated.PositionNotify.BottomRight,
                    RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
                
                this.dispose();
            } catch (SQLException ex) {
                try {
                   
//                    if (con.conect().isValid(0) == false) {
                       
                            // ----- Transaccion RECHAZADA -----
                            nConect.rollback();
                            System.out.println("rollback realizado");
                            // ----- Transaccion Finalizada -----
                            
                        new rojerusan.RSNotifyAnimated("¡ROLLBACK!", "TRANSACCION CANCELADA ",
                        5, RSNotifyAnimated.PositionNotify.BottomRight,
                        RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
     
//                    }
                } catch (SQLException ex1) {
                    Logger.getLogger(esta.class.getName()).log(Level.SEVERE, null, ex1);
                }
                
            }
           
        }
      

    }//GEN-LAST:event_btningresarActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed
String verifidacion="";        PreparedStatement buscar;
    public void consultar (String valor) throws SQLException, IOException{
       
        String nombre = "";
        buscar = nConect.prepareStatement("SELECT *FROM empleado WHERE CUI=?");
        buscar.setString(1, valor);
        buscar.execute();

        ResultSet resultadosObtenidos=buscar.executeQuery();
        while(resultadosObtenidos.next()){
             nombre =  resultadosObtenidos.getString("nombre");
        }
       
//          if(nombre.equals("")){
//             new rojerusan.RSNotifyAnimated("¡REGISTRO NO EXISTENTE!", "VUELVA A INTENTARLO",
//                            5, RSNotifyAnimated.PositionNotify.BottomRight,
//                            RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
//                    
//        }else{
//             new rojerusan.RSNotifyAnimated("¡ENCONTRADO!", "USUARIO ENCONTRADO EXITOSAMENTE",
//                            5, RSNotifyAnimated.PositionNotify.BottomRight,
//                            RSNotifyAnimated.AnimationNotify.RightLeft, RSNotifyAnimated.TypeNotify.SUCCESS).setVisible(true);
//                    
//        }
        
    }
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
            java.util.logging.Logger.getLogger(esta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(esta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(esta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(esta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                esta dialog = new esta();
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
    private javax.swing.JTextField apellido;
    private javax.swing.JButton btningresar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton carta;
    private javax.swing.JTextField fecha;
    private javax.swing.JFormattedTextField horaspresenciales;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCerrar1;
    public static javax.swing.JLabel lblTitulo;
    public static javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblfotoc;
    public static javax.swing.JTextField nombre;
    public static javax.swing.JTextField telefono;
    public static javax.swing.JTextField txtcui;
    private javax.swing.JTextField txtdireccion;
    public static javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

    
    
}
