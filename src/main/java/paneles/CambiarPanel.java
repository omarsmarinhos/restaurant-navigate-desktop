/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paneles;

import javax.swing.JPanel;

/**
 *
 * @author MenDark
 */
public class CambiarPanel {
    private JPanel container;
    private JPanel content;
    /**
     * Constructor de clase
     */
    public CambiarPanel(JPanel container, JPanel content) {
        this.container = container;
        this.content = content;
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();
        
        this.container.add(this.content);
        this.container.revalidate();
        this.container.repaint();
    }
    
}
