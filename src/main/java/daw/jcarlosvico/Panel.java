/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.jcarlosvico;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jfervic933
 */
public class Panel extends JPanel{
    
    // Tamaño del panel. Constantes
    public static final int ANCHO_PANEL = 600;
    public static final int ALTO_PANEL = 200;
    
    // Atributos del panel
    private JButton btnGenerar, btnCerrar;
    private JLabel lblUrl, lblFichero;
    private JTextField tfUrl, tfFichero;
    private String nombreFichero;
    
    // Constructor 
    public Panel(){
        this.setLayout(new FlowLayout());
        this.setBackground(Color.gray);
        this.setSize(ANCHO_PANEL, ALTO_PANEL);
    }
    
}
