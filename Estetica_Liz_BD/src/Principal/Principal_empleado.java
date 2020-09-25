/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import citas.mostrarcita;
import conexion.Conectando;
import facturacion.Ventas;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import splash.FadeEffect;

/**
 *
 * @author enrique7cp@gmail.com
 */
public class Principal_empleado extends javax.swing.JFrame {

    private boolean minimiza = false;
    public mostrarcita citas=null;
    public static boolean cerra = false;
    private Ventas ventas = null;
    
    Conectando con = new Conectando();
    Connection conexion;
    
    public static boolean estacerrado(Object obj) {
        JInternalFrame[] activos = escritorio.getAllFrames();
        boolean cerrado = true;
        int i = 0;
        while (i < activos.length && cerrado) {
            if (activos[i] == obj) {
                cerrado = false;
                cerra = false;
            }
            i++;
        }
        return cerrado;
    }
    /**
     * Creates new form Principal_normal
     */
    public Principal_empleado() {
        initComponents();
        this.conexion = con.conect();
        this.setExtendedState(MAXIMIZED_BOTH);
        FadeEffect.fadeInFrame(this, 50, 0.1f);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jpllateral = new javax.swing.JPanel();
        btnVentas = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnGastos = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnEstadInfo = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnCitas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnServicios = new javax.swing.JButton();
        btnMarketing = new javax.swing.JButton();
        empleados = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        jplSuperior = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelFondo.setBackground(new java.awt.Color(204, 204, 204));

        jpllateral.setBackground(new java.awt.Color(102, 0, 204));
        jpllateral.setForeground(new java.awt.Color(0, 153, 153));

        btnVentas.setBackground(new java.awt.Color(102, 0, 204));
        btnVentas.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setText("VENTAS");
        btnVentas.setBorder(null);
        btnVentas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnVentasMouseMoved(evt);
            }
        });
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentasMouseExited(evt);
            }
        });
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnProductos.setBackground(new java.awt.Color(102, 0, 204));
        btnProductos.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setText("PRODUCTOS");
        btnProductos.setBorder(null);
        btnProductos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnProductosMouseMoved(evt);
            }
        });
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductosMouseExited(evt);
            }
        });
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnGastos.setBackground(new java.awt.Color(102, 0, 204));
        btnGastos.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnGastos.setForeground(new java.awt.Color(255, 255, 255));
        btnGastos.setText("GASTOS");
        btnGastos.setBorder(null);
        btnGastos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnGastosMouseMoved(evt);
            }
        });
        btnGastos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGastosMouseExited(evt);
            }
        });
        btnGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGastosActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(102, 0, 204));
        btnUsuarios.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("USUARIOS");
        btnUsuarios.setBorder(null);
        btnUsuarios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseMoved(evt);
            }
        });
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseExited(evt);
            }
        });
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnEstadInfo.setBackground(new java.awt.Color(102, 0, 204));
        btnEstadInfo.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        btnEstadInfo.setForeground(new java.awt.Color(255, 255, 255));
        btnEstadInfo.setText("ESTADISTICAS/INFORMACIÓN");
        btnEstadInfo.setBorder(null);
        btnEstadInfo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEstadInfoMouseMoved(evt);
            }
        });
        btnEstadInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEstadInfoMouseExited(evt);
            }
        });
        btnEstadInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadInfoActionPerformed(evt);
            }
        });

        btnCerrarSesion.setBackground(new java.awt.Color(102, 0, 204));
        btnCerrarSesion.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("CERRAR SESIÓN");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseMoved(evt);
            }
        });
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseExited(evt);
            }
        });
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnCitas.setBackground(new java.awt.Color(102, 0, 204));
        btnCitas.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        btnCitas.setForeground(new java.awt.Color(255, 255, 255));
        btnCitas.setText("CITAS");
        btnCitas.setBorder(null);
        btnCitas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnCitasMouseMoved(evt);
            }
        });
        btnCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCitasMouseExited(evt);
            }
        });
        btnCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitasActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(102, 0, 204));
        btnClientes.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("CLIENTES");
        btnClientes.setBorder(null);
        btnClientes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnClientesMouseMoved(evt);
            }
        });
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientesMouseExited(evt);
            }
        });
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnServicios.setBackground(new java.awt.Color(102, 0, 204));
        btnServicios.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        btnServicios.setForeground(new java.awt.Color(255, 255, 255));
        btnServicios.setText("SERVICIOS");
        btnServicios.setBorder(null);
        btnServicios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnServiciosMouseMoved(evt);
            }
        });
        btnServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnServiciosMouseExited(evt);
            }
        });
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });

        btnMarketing.setBackground(new java.awt.Color(102, 0, 204));
        btnMarketing.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        btnMarketing.setForeground(new java.awt.Color(255, 255, 255));
        btnMarketing.setText("MARKETING");
        btnMarketing.setBorder(null);
        btnMarketing.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnMarketingMouseMoved(evt);
            }
        });
        btnMarketing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMarketingMouseExited(evt);
            }
        });
        btnMarketing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarketingActionPerformed(evt);
            }
        });

        empleados.setBackground(new java.awt.Color(102, 0, 204));
        empleados.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        empleados.setForeground(new java.awt.Color(255, 255, 255));
        empleados.setText("EMPLEADOS");
        empleados.setBorder(null);
        empleados.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                empleadosMouseMoved(evt);
            }
        });
        empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                empleadosMouseExited(evt);
            }
        });
        empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadosActionPerformed(evt);
            }
        });

        btnAbout.setBackground(new java.awt.Color(102, 0, 204));
        btnAbout.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        btnAbout.setForeground(new java.awt.Color(255, 255, 255));
        btnAbout.setText("ABOUT");
        btnAbout.setBorder(null);
        btnAbout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAboutMouseMoved(evt);
            }
        });
        btnAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAboutMouseExited(evt);
            }
        });
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpllateralLayout = new javax.swing.GroupLayout(jpllateral);
        jpllateral.setLayout(jpllateralLayout);
        jpllateralLayout.setHorizontalGroup(
            jpllateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGastos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEstadInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(btnMarketing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(empleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpllateralLayout.setVerticalGroup(
            jpllateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpllateralLayout.createSequentialGroup()
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jpllateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpllateralLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(btnEstadInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMarketing, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jplSuperior.setBackground(new java.awt.Color(102, 0, 204));

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

        lblMinimizar.setBackground(new java.awt.Color(102, 0, 204));
        lblMinimizar.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimizar.setText("-");
        lblMinimizar.setOpaque(true);
        lblMinimizar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseMoved(evt);
            }
        });
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ESTÉTICA LIS");

        javax.swing.GroupLayout jplSuperiorLayout = new javax.swing.GroupLayout(jplSuperior);
        jplSuperior.setLayout(jplSuperiorLayout);
        jplSuperiorLayout.setHorizontalGroup(
            jplSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplSuperiorLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jplSuperiorLayout.setVerticalGroup(
            jplSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplSuperiorLayout.createSequentialGroup()
                .addGroup(jplSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCerrar)
                    .addComponent(lblMinimizar))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        escritorio.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotipo.png"))); // NOI18N

        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(jpllateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio)
                .addContainerGap())
            .addComponent(jplSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addComponent(jplSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(escritorio)
                    .addComponent(jpllateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseMoved
        btnVentas.setBackground(Color.RED);
    }//GEN-LAST:event_btnVentasMouseMoved

    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
        btnVentas.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnVentasMouseExited

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        if (estacerrado(ventas)) {
            try {
                ventas = new Ventas();
            } catch (SQLException ex) {
                Logger.getLogger(Principal_empleado.class.getName()).log(Level.SEVERE, null, ex);
            }
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            ventas.setSize(width, Height);
            escritorio.add(ventas);
            ventas.show();
        }
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnProductosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseMoved
        btnProductos.setBackground(Color.RED);
    }//GEN-LAST:event_btnProductosMouseMoved

    private void btnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseExited
        btnProductos.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnProductosMouseExited

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        JOptionPane.showMessageDialog(null, "¡OPSS!, ACCESO RESTRINGIDO");
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnGastosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGastosMouseMoved
        btnGastos.setBackground(Color.RED);
    }//GEN-LAST:event_btnGastosMouseMoved

    private void btnGastosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGastosMouseExited
        btnGastos.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnGastosMouseExited

    private void btnGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGastosActionPerformed
        JOptionPane.showMessageDialog(null, "¡OPSS!, ACCESO RESTRINGIDO");
    }//GEN-LAST:event_btnGastosActionPerformed

    private void btnUsuariosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseMoved
        btnUsuarios.setBackground(Color.RED);
    }//GEN-LAST:event_btnUsuariosMouseMoved

    private void btnUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseExited
        btnUsuarios.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnUsuariosMouseExited

    private void btnEstadInfoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadInfoMouseMoved
        btnEstadInfo.setBackground(Color.RED);
    }//GEN-LAST:event_btnEstadInfoMouseMoved

    private void btnEstadInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadInfoMouseExited
        btnEstadInfo.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnEstadInfoMouseExited

    private void btnCerrarSesionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseMoved
        btnCerrarSesion.setBackground(Color.RED);
    }//GEN-LAST:event_btnCerrarSesionMouseMoved

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        btnCerrarSesion.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnCerrarSesionMouseExited

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.dispose();
        new Inicio.inicio_sesion(conexion).setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnCitasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitasMouseMoved
        this.btnCitas.setBackground(Color.RED);
    }//GEN-LAST:event_btnCitasMouseMoved

    private void btnCitasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitasMouseExited
        this.btnCitas.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnCitasMouseExited

    private void btnClientesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseMoved
        this.btnClientes.setBackground(Color.RED);
    }//GEN-LAST:event_btnClientesMouseMoved

    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited
        this.btnClientes.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnClientesMouseExited

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnServiciosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiciosMouseMoved
        this.btnServicios.setBackground(Color.RED);
    }//GEN-LAST:event_btnServiciosMouseMoved

    private void btnServiciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiciosMouseExited
        this.btnServicios.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnServiciosMouseExited

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnMarketingMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMarketingMouseMoved
        this.btnMarketing.setBackground(Color.RED);
    }//GEN-LAST:event_btnMarketingMouseMoved

    private void btnMarketingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMarketingMouseExited
        this.btnMarketing.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnMarketingMouseExited

    private void btnMarketingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarketingActionPerformed
        JOptionPane.showMessageDialog(null, "¡OPSS!, ACCESO RESTRINGIDO");
    }//GEN-LAST:event_btnMarketingActionPerformed

    private void lblCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseMoved
        lblCerrar.setBackground(Color.red);
    }//GEN-LAST:event_lblCerrarMouseMoved

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseExited
        lblCerrar.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_lblCerrarMouseExited

    private void lblMinimizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseMoved
        lblMinimizar.setBackground(Color.red);
    }//GEN-LAST:event_lblMinimizarMouseMoved

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
        if (!minimiza) {
            minimiza = false;
            this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        } else {
            minimiza = true;
        }
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseExited
        lblMinimizar.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_lblMinimizarMouseExited

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        JOptionPane.showMessageDialog(null, "¡OPSS!, ACCESO RESTRINGIDO");
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnEstadInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadInfoActionPerformed
        JOptionPane.showMessageDialog(null, "¡OPSS!, ACCESO RESTRINGIDO");
    }//GEN-LAST:event_btnEstadInfoActionPerformed

    private void btnCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitasActionPerformed
        citas = new mostrarcita();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            citas.setSize(width, Height);
            escritorio.add(citas);
            citas.show();
    }//GEN-LAST:event_btnCitasActionPerformed

    private void empleadosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadosMouseMoved
        this.empleados.setBackground(Color.RED);
    }//GEN-LAST:event_empleadosMouseMoved

    private void empleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadosMouseExited
        this.empleados.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_empleadosMouseExited

    private void empleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadosActionPerformed
       JOptionPane.showMessageDialog(null, "¡OPSS!, ACCESO RESTRINGIDO");
    }//GEN-LAST:event_empleadosActionPerformed

    private void btnAboutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseMoved
        this.btnAbout.setBackground(Color.RED);
    }//GEN-LAST:event_btnAboutMouseMoved

    private void btnAboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseExited
        this.btnAbout.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnAboutMouseExited

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        new about.About(this, true).setVisible(true);
    }//GEN-LAST:event_btnAboutActionPerformed

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
            java.util.logging.Logger.getLogger(Principal_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCitas;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEstadInfo;
    private javax.swing.JButton btnGastos;
    private javax.swing.JButton btnMarketing;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnServicios;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton empleados;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jplSuperior;
    private javax.swing.JPanel jpllateral;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
