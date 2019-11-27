/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.jcarlosvico;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author carlos
 */
public class VentanaResultado extends JFrame {

    private JLabel resultado;

    // Este constructor recibe el fichero que contiene 
    // el QR, lo establece en el JLabel y se muestra
    public FrameResultado(String fichero) {
        // Se crea un objeto imagen a partir del fichero del QR
        ImageIcon icono = new ImageIcon(fichero);
        // Título del frame
        this.setTitle(fichero);
        // Inicialización del atributo
        resultado = new JLabel();
        // Se establece la imagen del QR en el JLabel
        resultado.setIcon(icono);
        this.add(resultado);
        this.pack();
        this.setVisible(true);
    }
}
