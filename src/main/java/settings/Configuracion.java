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
public class Configuracion extends javax.swing.JPanel {

    public Configuracion() {
        initComponents();
        
        setOpaque(false);
        btn_cancelar.setCursor(new Cursor(HAND_CURSOR));
        btn_guardarcambios.setCursor(new Cursor(HAND_CURSOR));
        
        chk_notificaciones.setBackground(new Color(0, 0, 0, 0));
        chk_notificaciones.setOpaque(false);
        
        chk_sonidos.setBackground(new Color(0, 0, 0, 0));
        chk_sonidos.setOpaque(false);
        
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
        chk_sonidos = new javax.swing.JCheckBox();
        chk_notificaciones = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(25, 25, 25, 25));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(80, 80, 80));
        jLabel1.setText("Configuración de Sistema");

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

        chk_sonidos.setText("        Activar Sonido");

        chk_notificaciones.setText("        Activar Notificaciones");

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
                        .addGap(0, 133, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chk_sonidos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btn_guardarcambios, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(chk_notificaciones)
                    .addContainerGap(276, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(chk_sonidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardarcambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(chk_notificaciones)
                    .addContainerGap(104, Short.MAX_VALUE)))
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
    private settings.Button btn_cancelar;
    private settings.Button btn_guardarcambios;
    private javax.swing.JCheckBox chk_notificaciones;
    private javax.swing.JCheckBox chk_sonidos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
