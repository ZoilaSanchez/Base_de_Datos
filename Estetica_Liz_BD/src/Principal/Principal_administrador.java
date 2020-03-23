/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Informe.EstadisticasInformes;
import Marketing.MarketingAuto;
import Usuarios.usuario;
import citas.cita1;
import citas.tablacitas;
import conexion.Conectando;

import empleados.mostraremple;

import java.awt.Color;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import productos.Producto;
import splash.FadeEffect;

/**
 *
 * @author enrique7cp@gmail.com
 */
public class Principal_administrador extends javax.swing.JFrame {
    
    public static boolean cerra = false;
    
    public Producto productoss = null; 
    public EstadisticasInformes informe = null;
    public usuario usuario =null;
    public tablacitas citas=null;
    public MarketingAuto mark = null;
    public mostraremple emple=null;
    private boolean minimiza = false;
    Conectando con = new Conectando();
    Connection conexion;
    /**
     * Creates new form Principal_administrador
     */
    public static boolean estacerrado(Object obj) {
        JInternalFrame[] activados = escritorio.getAllFrames();
        boolean cerrado = true;
        int i = 0;
        while (i < activados.length && cerrado) {
            if (activados[i] == obj) {
                cerrado = false;
                cerra = false;
            }
            i++;
        }
        return cerrado;
    }
    public Principal_administrador() {
        initComponents();
        this.conexion = con.conect();
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/logotipo.png")).getImage());
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
        empleado = new javax.swing.JButton();
        jplSuperior = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();

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

        empleado.setBackground(new java.awt.Color(102, 0, 204));
        empleado.setFont(new java.awt.Font("Agency FB", 0, 22)); // NOI18N
        empleado.setForeground(new java.awt.Color(255, 255, 255));
        empleado.setText("EMPLEADO");
        empleado.setBorder(null);
        empleado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                empleadoMouseMoved(evt);
            }
        });
        empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                empleadoMouseExited(evt);
            }
        });
        empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpllateralLayout = new javax.swing.GroupLayout(jpllateral);
        jpllateral.setLayout(jpllateralLayout);
        jpllateralLayout.setHorizontalGroup(
            jpllateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpllateralLayout.createSequentialGroup()
                .addGroup(jpllateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(btnGastos, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(btnEstadInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpllateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpllateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpllateralLayout.createSequentialGroup()
                        .addGroup(jpllateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMarketing, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMarketing, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ESTÉTICA LIS");

        javax.swing.GroupLayout jplSuperiorLayout = new javax.swing.GroupLayout(jplSuperior);
        jplSuperior.setLayout(jplSuperiorLayout);
        jplSuperiorLayout.setHorizontalGroup(
            jplSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplSuperiorLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 381, Short.MAX_VALUE)
                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jplSuperiorLayout.setVerticalGroup(
            jplSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(jplSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblCerrar)
                .addComponent(lblMinimizar))
        );

        escritorio.setBackground(new java.awt.Color(153, 255, 153));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotipo.png"))); // NOI18N

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGastosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGastosActionPerformed

    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
        btnVentas.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnVentasMouseExited

    private void btnVentasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseMoved
        btnVentas.setBackground(Color.RED);
    }//GEN-LAST:event_btnVentasMouseMoved

    private void btnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseExited
        btnProductos.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnProductosMouseExited

    private void btnProductosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseMoved
        btnProductos.setBackground(Color.RED);
    }//GEN-LAST:event_btnProductosMouseMoved

    private void btnGastosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGastosMouseExited
        btnGastos.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnGastosMouseExited

    private void btnGastosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGastosMouseMoved
        btnGastos.setBackground(Color.RED);
    }//GEN-LAST:event_btnGastosMouseMoved

    private void btnUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseExited
        btnUsuarios.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnUsuariosMouseExited

    private void btnUsuariosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseMoved
        btnUsuarios.setBackground(Color.RED);
    }//GEN-LAST:event_btnUsuariosMouseMoved

    private void btnEstadInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadInfoMouseExited
        btnEstadInfo.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnEstadInfoMouseExited

    private void btnEstadInfoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadInfoMouseMoved
        btnEstadInfo.setBackground(Color.RED);
    }//GEN-LAST:event_btnEstadInfoMouseMoved

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        btnCerrarSesion.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnCerrarSesionMouseExited

    private void btnCerrarSesionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseMoved
        btnCerrarSesion.setBackground(Color.RED);
    }//GEN-LAST:event_btnCerrarSesionMouseMoved

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        if (estacerrado(productoss)) {
            productoss = new Producto();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            productoss.setSize(width, Height);
            escritorio.add(productoss);
            productoss.show();
        }
    }//GEN-LAST:event_btnProductosActionPerformed

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseExited
        lblCerrar.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_lblCerrarMouseExited

    private void lblCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseMoved
        lblCerrar.setBackground(Color.red);
    }//GEN-LAST:event_lblCerrarMouseMoved

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCerrarMouseClicked

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

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.dispose();
        new Inicio.inicio_sesion(conexion).setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnMarketingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarketingActionPerformed
        if (estacerrado(mark)) {
            mark = new MarketingAuto();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            mark.setSize(width, Height);
            escritorio.add(mark);
            mark.show();
        }
    }//GEN-LAST:event_btnMarketingActionPerformed

    private void btnCitasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitasMouseExited
        this.btnCitas.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnCitasMouseExited

    private void btnCitasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitasMouseMoved
        this.btnCitas.setBackground(Color.RED);
    }//GEN-LAST:event_btnCitasMouseMoved

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited
        this.btnClientes.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnClientesMouseExited

    private void btnClientesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseMoved
        this.btnClientes.setBackground(Color.RED);
    }//GEN-LAST:event_btnClientesMouseMoved

    private void btnServiciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiciosMouseExited
        this.btnServicios.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnServiciosMouseExited

    private void btnServiciosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiciosMouseMoved
        this.btnServicios.setBackground(Color.RED);
    }//GEN-LAST:event_btnServiciosMouseMoved

    private void btnMarketingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMarketingMouseExited
        this.btnMarketing.setBackground(new Color(102,0,204));
    }//GEN-LAST:event_btnMarketingMouseExited

    private void btnMarketingMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMarketingMouseMoved
        this.btnMarketing.setBackground(Color.RED);
    }//GEN-LAST:event_btnMarketingMouseMoved

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        if (estacerrado(usuario)) {
            usuario = new usuario();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            usuario.setSize(width, Height);
            escritorio.add(usuario);
            usuario.show();
        }
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnEstadInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadInfoActionPerformed
        if (estacerrado(informe)) {
            informe = new EstadisticasInformes();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            informe.setSize(width, Height);
            escritorio.add(informe);
            informe.show();
        }
    }//GEN-LAST:event_btnEstadInfoActionPerformed

    private void btnCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitasActionPerformed
            citas = new tablacitas();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            citas.setSize(width, Height);
            escritorio.add(citas);
            citas.show();
    }//GEN-LAST:event_btnCitasActionPerformed

    private void empleadoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadoMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_empleadoMouseMoved

    private void empleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_empleadoMouseExited

    private void empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoActionPerformed
            emple = new mostraremple();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            emple.setSize(width, Height);
            escritorio.add(emple);
            emple.show();
    }//GEN-LAST:event_empleadoActionPerformed

    
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
            java.util.logging.Logger.getLogger(Principal_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton empleado;
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
