/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.omarsmarinhos.restaurant;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;

/**
 *
 * @author MenDark
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        panelRegistra.setVisible(false);
        
        lbl_textLogin.setText("<html>Comeinza a administrar tu negocio y dale un impulso para atraer mas clientes con Restaurant Navigator 100% gratis para ti</html>");
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
        btn_cerrar = new javax.swing.JButton();
        btn_minimizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelIniciar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblIniciarSesion = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        textField1 = new textfield.TextField();
        passwordField1 = new textfield.PasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblRegistrar = new javax.swing.JLabel();
        panelRegistra = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        textField2 = new textfield.TextField();
        textField3 = new textfield.TextField();
        textField4 = new textfield.TextField();
        passwordField2 = new textfield.PasswordField();
        passwordField3 = new textfield.PasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lbl_textLogin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 191, 130)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cerrar.setIcon(new ImageIcon("src/main/java/img/btn_cerrar.png"));
        btn_cerrar.setBorder(null);
        btn_cerrar.setBorderPainted(false);
        btn_cerrar.setContentAreaFilled(false);
        btn_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrar.setFocusPainted(false);
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 20, 20));

        btn_minimizar.setIcon(new ImageIcon("src/main/java/img/btn_minimizar.png"));
        btn_minimizar.setBorder(null);
        btn_minimizar.setBorderPainted(false);
        btn_minimizar.setContentAreaFilled(false);
        btn_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_minimizar.setFocusPainted(false);
        btn_minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minimizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 20, 20));

        jLabel5.setIcon(new ImageIcon("src/main/java/img/logo_icon.png"));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 40));

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Iniciar Sesión - Restaurant Navigate");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 20));

        panelIniciar.setBackground(new java.awt.Color(255, 255, 255));
        panelIniciar.setMinimumSize(new java.awt.Dimension(350, 500));
        panelIniciar.setPreferredSize(new java.awt.Dimension(350, 500));
        panelIniciar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setForeground(new java.awt.Color(51, 153, 255));
        jLabel11.setText("Reestablecer contraseña?");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelIniciar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 140, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 150, 150));
        jLabel10.setText("¿Necesitas ayuda? Contáctanos");
        panelIniciar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, 20));

        lblIniciarSesion.setFont(new java.awt.Font("Swis721 BT", 1, 24)); // NOI18N
        lblIniciarSesion.setForeground(new java.awt.Color(255, 153, 51));
        lblIniciarSesion.setText("INICIA SESIÓN");
        panelIniciar.add(lblIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 190, 29));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Recordar ");
        panelIniciar.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        textField1.setLabelText("Email");
        textField1.setLineColor(new java.awt.Color(255, 154, 52));
        panelIniciar.add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 210, -1));

        passwordField1.setLabelText("Contraseña");
        passwordField1.setLineColor(new java.awt.Color(255, 154, 52));
        passwordField1.setShowAndHide(true);
        panelIniciar.add(passwordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 210, -1));

        jButton2.setIcon(new ImageIcon("src/main/java/img/btn_iniciarsesion.png"));
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelIniciar.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 120, 40));

        jLabel4.setIcon(new ImageIcon("src/main/java/img/Logo_RN_Circle.png"));
        panelIniciar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 130, 130));

        jPanel1.add(panelIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 400, 520));

        lblRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrar.setText("Registrarse");
        lblRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        lblRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarMouseClicked(evt);
            }
        });
        jPanel1.add(lblRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 513, 130, 34));

        panelRegistra.setBackground(new java.awt.Color(255, 255, 255));
        panelRegistra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Swis721 BT", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 51));
        jLabel12.setText("REGÍSTRATE");
        panelRegistra.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 160, 29));

        textField2.setLabelText("Email");
        textField2.setLineColor(new java.awt.Color(255, 154, 52));
        panelRegistra.add(textField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 220, -1));

        textField3.setLabelText("Nombres");
        textField3.setLineColor(new java.awt.Color(255, 154, 52));
        panelRegistra.add(textField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 220, -1));

        textField4.setLabelText("Apellidos");
        textField4.setLineColor(new java.awt.Color(255, 154, 52));
        panelRegistra.add(textField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 220, -1));

        passwordField2.setLabelText("Confirmar Contraseña");
        passwordField2.setLineColor(new java.awt.Color(255, 154, 52));
        passwordField2.setShowAndHide(true);
        panelRegistra.add(passwordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 220, -1));

        passwordField3.setLabelText("Contraseña");
        passwordField3.setLineColor(new java.awt.Color(255, 154, 52));
        passwordField3.setShowAndHide(true);
        panelRegistra.add(passwordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 220, -1));

        jButton1.setIcon(new ImageIcon("src/main/java/img/btn_registrarse.png"));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegistra.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 120, 40));

        jLabel7.setIcon(new ImageIcon("src/main/java/img/Logo_RN_Circle.png"));
        panelRegistra.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 130, 130));

        jPanel1.add(panelRegistra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 400, 520));

        lbl_textLogin.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbl_textLogin.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_textLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 260, 100));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¡Create una cuenta gratis!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        jLabel2.setIcon(new ImageIcon("src/main/java/img/img_login.png"));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 390, 520));

        jLabel1.setIcon(new ImageIcon("src/main/java/img/Rectangle_login.png"));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 880, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarMouseClicked
       int posicion = lblRegistrar.getX();
       if(posicion > 126){
           Animacion.Animacion.mover_izquierda(381, 125, 3, 3, lblRegistrar);
           Animacion.Animacion.mover_izquierda(20, -480, 3, 3, panelIniciar);
           panelRegistra.setVisible(true);
           lblRegistrar.setText("Iniciar Sesion");
           lblRegistrar.setForeground(Color.decode("#FF9A34"));
           lblRegistrar.setBorder(new CompoundBorder(
           BorderFactory.createMatteBorder(2, 2, 2, 2, Color.decode("#FF9A34")),
           BorderFactory.createEmptyBorder(2, 2, 2, 2)));
       }else{
           Animacion.Animacion.mover_derecha(25, 545, 3, 3, lblRegistrar);
           Animacion.Animacion.mover_derecha(-180, 70, 3, 3, panelIniciar);
           panelRegistra.setVisible(false);
           lblRegistrar.setText("Registrase");
           lblRegistrar.setForeground(Color.WHITE);
           lblRegistrar.setBorder(new CompoundBorder(
           BorderFactory.createMatteBorder(2, 2, 2, 2, Color.WHITE),
           BorderFactory.createEmptyBorder(2, 2, 2, 2)));
       }
    }//GEN-LAST:event_lblRegistrarMouseClicked

    private void btn_minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btn_minimizarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_minimizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JLabel lbl_textLogin;
    private javax.swing.JPanel panelIniciar;
    private javax.swing.JPanel panelRegistra;
    private textfield.PasswordField passwordField1;
    private textfield.PasswordField passwordField2;
    private textfield.PasswordField passwordField3;
    private textfield.TextField textField1;
    private textfield.TextField textField2;
    private textfield.TextField textField3;
    private textfield.TextField textField4;
    // End of variables declaration//GEN-END:variables
}