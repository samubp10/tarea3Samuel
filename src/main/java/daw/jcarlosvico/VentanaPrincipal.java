/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.jcarlosvico;

import javax.swing.JFrame;

/**
 *
 * @author jfervic933
 */
public class VentanaPrincipal extends JFrame{
    
    // Tamaño de la ventana
    public static final int ANCHO_FRAME = 600;
    public static final int ALTO_FRAME = 200;
    
    // Constructor de la clase 
    public VentanaPrincipal(){
        crearVentana();
    }
    
    
    // Método privado para inicializar el JFrame
    private void crearVentana(){
        // Posición y tamaño del JFrame
        this.setBounds(600, 150, ANCHO_FRAME, ALTO_FRAME);
        // Título de la ventana
        this.setTitle("Generador de códigos QR");
        // Ventana no redimensionable
        this.setResizable(false);
        // Comportamiento al cerrar la ventana
        // Terminar el programa
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Hace visible la ventana
        this.setVisible(true);
    }
    
}
