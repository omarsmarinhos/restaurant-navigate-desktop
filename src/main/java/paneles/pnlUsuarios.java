/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

import javax.swing.ImageIcon;

/**
 *
 * @author MenDark
 */
public class pnlUsuarios extends javax.swing.JPanel {

    /**
     * Creates new form pnlUsuarios
     */
    public pnlUsuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        materialTabbed1 = new tabbed.MaterialTabbed();
        jPanel1 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        txt_buscar_trabajadores = new textfield.TextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_trabajadores = new javax.swing.JTable();
        btn_agregar_trabajador = new javax.swing.JButton();
        btn_editar_trabajador = new javax.swing.JButton();
        btn_eliminar_trabajador = new javax.swing.JButton();

        materialTabbed1.setForeground(new java.awt.Color(102, 102, 102));
        materialTabbed1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel33.setIcon(new ImageIcon("src/main/java/img/lupa-icon.png"));

        txt_buscar_trabajadores.setLabelText("Buscar usuario por nombre, id, dni");
        txt_buscar_trabajadores.setLineColor(new java.awt.Color(255, 131, 6));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tbl_trabajadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tbl_trabajadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"234", null, "Juan Carlos", "Campos Suarez", "juanc@gmail.com", "Administrador", "77756733"},
                {"112", null, "Merly Yuli", "Montes Torres", "merlyc@gmail.com", "Trabajador", "56756433"},
                {"566", null, "Pedro Santiago", "Gonzales Carrera", "pedro@gmail.com", "Trabajador", "35345654"},
                {null, null, "", "", "", null, null},
                {null, null, "", "", "", null, null},
                {null, null, "", "", "", null, null},
                {null, null, "", "", "", null, null},
                {null, null, "", "", "", null, null},
                {null, null, "", "", "", null, null},
                {null, null, "", "", "", null, null},
                {null, null, "", "", "", null, null}
            },
            new String [] {
                "ID", "Imagen", "Nombres", "Apellidos", "Email", "Tipo", "DNI"
            }
        ));
        tbl_trabajadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_trabajadores.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_trabajadores.setRowHeight(35);
        tbl_trabajadores.setSelectionBackground(new java.awt.Color(251, 154, 57));
        jScrollPane2.setViewportView(tbl_trabajadores);

        btn_agregar_trabajador.setIcon(new ImageIcon("src/main/java/img/btn_agregar_nuevo.png"));
        btn_agregar_trabajador.setBorderPainted(false);
        btn_agregar_trabajador.setContentAreaFilled(false);
        btn_agregar_trabajador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar_trabajador.setFocusPainted(false);
        btn_agregar_trabajador.setFocusable(false);

        btn_editar_trabajador.setIcon(new ImageIcon("src/main/java/img/btn_editar.png"));
        btn_editar_trabajador.setBorderPainted(false);
        btn_editar_trabajador.setContentAreaFilled(false);
        btn_editar_trabajador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar_trabajador.setFocusPainted(false);
        btn_editar_trabajador.setFocusable(false);

        btn_eliminar_trabajador.setIcon(new ImageIcon("src/main/java/img/btn_eliminar.png"));
        btn_eliminar_trabajador.setBorderPainted(false);
        btn_eliminar_trabajador.setContentAreaFilled(false);
        btn_eliminar_trabajador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar_trabajador.setFocusPainted(false);
        btn_eliminar_trabajador.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_buscar_trabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_agregar_trabajador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar_trabajador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar_trabajador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_buscar_trabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_agregar_trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_editar_trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar_trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        materialTabbed1.addTab("USUARIOS", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(materialTabbed1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(materialTabbed1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar_trabajador;
    private javax.swing.JButton btn_editar_trabajador;
    private javax.swing.JButton btn_eliminar_trabajador;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private tabbed.MaterialTabbed materialTabbed1;
    private javax.swing.JTable tbl_trabajadores;
    private textfield.TextField txt_buscar_trabajadores;
    // End of variables declaration//GEN-END:variables
}
