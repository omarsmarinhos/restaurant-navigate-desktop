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
public class pnlTrabajadores extends javax.swing.JPanel {

    /**
     * Creates new form pnlTrabajadores
     */
    public pnlTrabajadores() {
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
        txt_buscar_trabajadores = new textfield.TextField();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_trabajadores = new javax.swing.JTable();
        btn_agregar_trabajador = new javax.swing.JButton();
        btn_editar_trabajador = new javax.swing.JButton();
        btn_eliminar_trabajador = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1010, 548));

        materialTabbed1.setForeground(new java.awt.Color(102, 102, 102));
        materialTabbed1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txt_buscar_trabajadores.setLabelText("Buscar un trabajador por nombre, id, dni");
        txt_buscar_trabajadores.setLineColor(new java.awt.Color(255, 131, 6));

        jLabel32.setBackground(new java.awt.Color(110, 116, 126));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(110, 116, 126));
        jLabel32.setText("LISTA DE TRABAJADORES");

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tbl_trabajadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tbl_trabajadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"2345", null, "Juan Carlos", "Campos Suarez", "juanc@gmail.com", "Mesero", "77756733"},
                {"3444", null, "Merly Yuli", "Montes Torres", "merlyc@gmail.com", "Cocina", "56756433"},
                {"6786", null, "Pedro Santiago", "Gonzales Carrera", "pedro@gmail.com", "Mesero", "35345654"},
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
                " ID", "Imagen", "Nombres", "Apellidos", "Email", "Puesto", "DNI"
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

        jLabel33.setIcon(new ImageIcon("src/main/java/img/lupa-icon.png"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(925, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel32)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(49, 49, 49)
                                    .addComponent(txt_buscar_trabajadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_agregar_trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_editar_trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_eliminar_trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(11, 11, 11)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(423, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(jLabel32)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txt_buscar_trabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_agregar_trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_editar_trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_eliminar_trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(2, 2, 2)))
        );

        materialTabbed1.addTab("TRABAJADORES", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(materialTabbed1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(materialTabbed1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar_trabajador;
    private javax.swing.JButton btn_editar_trabajador;
    private javax.swing.JButton btn_eliminar_trabajador;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private tabbed.MaterialTabbed materialTabbed1;
    private javax.swing.JTable tbl_trabajadores;
    private textfield.TextField txt_buscar_trabajadores;
    // End of variables declaration//GEN-END:variables
}
