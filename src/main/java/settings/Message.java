package settings;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import glasspanepopup.GlassPanePopup;
import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;

/**
 *
 * @author RAVEN
 */
public class Message extends javax.swing.JPanel {

    public Message() {
        initComponents();
        
        btn_cambiarfoto.setCursor(new Cursor(HAND_CURSOR));
        btn_cancelar.setCursor(new Cursor(HAND_CURSOR));
        btn_guardarcambios.setCursor(new Cursor(HAND_CURSOR));
        
        setOpaque(false);
        txt_nombres.setBackground(new Color(0, 0, 0, 0));
        txt_nombres.setSelectionColor(new Color(48, 170, 63, 200));
        txt_nombres.setOpaque(false);
        
        txt_apellidos.setBackground(new Color(0, 0, 0, 0));
        txt_apellidos.setSelectionColor(new Color(48, 170, 63, 200));
        txt_apellidos.setOpaque(false);
        
        txt_email.setBackground(new Color(0, 0, 0, 0));
        txt_email.setSelectionColor(new Color(48, 170, 63, 200));
        txt_email.setOpaque(false);
        
        separador.setBackground(new Color(0, 0, 0, 0));
        
        separador.setOpaque(false);
        
        txt_passactual.setBackground(new Color(0, 0, 0, 0));
        txt_passactual.setSelectionColor(new Color(48, 170, 63, 200));
        txt_passactual.setOpaque(false);
        
        txt_passnueva.setBackground(new Color(0, 0, 0, 0));
        txt_passnueva.setSelectionColor(new Color(48, 170, 63, 200));
        txt_passnueva.setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));
        g2.dispose();
        super.paintComponent(grphcs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_guardarcambios = new settings.Button();
        btn_cancelar = new settings.Button();
        txt_apellidos = new textfield.TextField();
        jLabel2 = new javax.swing.JLabel();
        btn_cambiarfoto = new settings.Button();
        txt_nombres = new textfield.TextField();
        txt_email = new textfield.TextField();
        separador = new javax.swing.JSeparator();
        txt_passactual = new textfield.PasswordField();
        txt_passnueva = new textfield.PasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(25, 25, 25, 25));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(80, 80, 80));
        jLabel1.setText("Mi Cuenta");

        btn_guardarcambios.setBackground(new java.awt.Color(255, 154, 52));
        btn_guardarcambios.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardarcambios.setText("Guardar Cambios");
        btn_guardarcambios.setFocusPainted(false);
        btn_guardarcambios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btn_cancelar.setText("Cancelar");
        btn_cancelar.setFocusPainted(false);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        txt_apellidos.setText("Mendoza Cardenas");
        txt_apellidos.setLabelText("Apellidos");
        txt_apellidos.setLineColor(new java.awt.Color(255, 154, 52));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 154, 52)));

        btn_cambiarfoto.setBackground(new java.awt.Color(21, 165, 251));
        btn_cambiarfoto.setForeground(new java.awt.Color(255, 255, 255));
        btn_cambiarfoto.setText("Cambiar Foto");
        btn_cambiarfoto.setFocusPainted(false);
        btn_cambiarfoto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txt_nombres.setText("Boris Juan");
        txt_nombres.setLabelText("Nombres");
        txt_nombres.setLineColor(new java.awt.Color(255, 154, 52));

        txt_email.setText("borisjuan22@gmail.com");
        txt_email.setLabelText("Email");
        txt_email.setLineColor(new java.awt.Color(255, 154, 52));

        separador.setForeground(new java.awt.Color(255, 154, 52));

        txt_passactual.setLabelText("Contraseña Actual");
        txt_passactual.setLineColor(new java.awt.Color(255, 154, 52));
        txt_passactual.setShowAndHide(true);

        txt_passnueva.setEditable(false);
        txt_passnueva.setLabelText("Nueva Contraseña");
        txt_passnueva.setLineColor(new java.awt.Color(255, 154, 52));
        txt_passnueva.setShowAndHide(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 54, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btn_guardarcambios, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_cambiarfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))
                    .addComponent(separador)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt_passactual, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_passnueva, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btn_cambiarfoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_passactual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_passnueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_guardarcambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelActionPerformed
        
    }//GEN-LAST:event_cmdCancelActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        GlassPanePopup.closePopupLast();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    public void eventOK(ActionListener event) {
        btn_guardarcambios.addActionListener(event);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private settings.Button btn_cambiarfoto;
    private settings.Button btn_cancelar;
    private settings.Button btn_guardarcambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator separador;
    private textfield.TextField txt_apellidos;
    private textfield.TextField txt_email;
    private textfield.TextField txt_nombres;
    private textfield.PasswordField txt_passactual;
    private textfield.PasswordField txt_passnueva;
    // End of variables declaration//GEN-END:variables
}
