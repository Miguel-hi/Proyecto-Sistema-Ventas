package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author migue
 */
public class Sales extends JFrame {

    private JPanel panel;
    private JPanel panel2;
    ImageIcon icon;
    ImageIcon wallpaper;
    private JLabel etiqueta3;
    private JTextField usuario;
    private JPasswordField password;
    private JButton boton;
    
    public Sales() {

        this.setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Sistema de Ventas");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));

        Iniciar();
    }

    public void Iniciar() {
        PanelUno();
        PanelDos();
        Etiquetas();
        Textos();
        Boton();
    }

    private void PanelUno() {

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 350, 500);
        Border bordejpanel = new TitledBorder(new EtchedBorder());
        panel.setBorder(bordejpanel);
        panel.setBackground(Color.blue);
        this.getContentPane().add(panel);
    }

    private void PanelDos() {

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(350, 0, 350, 500);
        Border bordejpanel = new TitledBorder(new EtchedBorder());
        panel2.setBorder(bordejpanel);
        panel2.setBackground(Color.WHITE);
        this.getContentPane().add(panel2);

    }

    private void Etiquetas() {
        /*Etiquetas para el Panel1*/
        JLabel etiqueta = new JLabel("Sistema de Ventas");
        panel.add(etiqueta);
        etiqueta.setBounds(80, 0, 200, 200);
        etiqueta.setForeground(Color.BLACK);
        etiqueta.setFont(new Font("Baskerville", Font.ROMAN_BASELINE, 23));

        //Imagen de logo //
        JLabel etiqueta1 = new JLabel();
        panel.add(etiqueta1);

        JLabel etiqueta2 = new JLabel("®Proyecto de Base de Datos");
        panel.add(etiqueta2);
        etiqueta2.setBounds(100, 275, 200, 200);
        etiqueta2.setForeground(Color.BLACK);
        etiqueta2.setFont(new Font("Baskerville", Font.ROMAN_BASELINE, 12));

        JLabel etiqueta3 = new JLabel();
        ImageIcon imagen = new ImageIcon("login.png");
        etiqueta3.setBounds(200, 65, 343, 400);
        etiqueta3.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta3.getWidth(), etiqueta3.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta3);
       
        ///Etiqueta 4 ///// //Pendiente ////
        
        JLabel etiqueta5 = new JLabel("Usuario");
        panel2.add(etiqueta5);
        etiqueta5.setBounds(380, 100, 200, 200);
        etiqueta5.setForeground(Color.BLACK);
        etiqueta5.setFont(new Font("Baskerville", Font.ROMAN_BASELINE, 18));
        
        JLabel etiqueta6 = new JLabel("Contraseña");
        panel2.add(etiqueta6);
        etiqueta6.setBounds(380, 200, 200, 200);
        etiqueta6.setForeground(Color.BLACK);
        etiqueta6.setFont(new Font("Baskerville", Font.ROMAN_BASELINE, 18));
    }
    
    private void Textos() {
        usuario = new JTextField();
        usuario.setBounds(380, 225, 250, 35);
        panel2.add(usuario);
        
        password = new JPasswordField();
        password.setBounds(380, 325, 250, 35);
        panel2.add(password);
    }
    
    private void Boton() {
         boton = new JButton("Login");
        boton.setBounds(400, 400, 120, 40);
        boton.setForeground(java.awt.Color.black);
        boton.setFont(new java.awt.Font("Baskerville", java.awt.Font.CENTER_BASELINE, 15));
        boton.setEnabled(true);
        panel2.add(boton);
        
    }

    public static void main(String[] args) {

        Sales a = new Sales();
        a.setVisible(true);
    }
}
