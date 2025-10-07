package practica2;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;




public class practica2 extends JFrame {

    JLabel label;

    public practica2(){

        setTitle("Registro de acciones del usuario");
        setSize(520, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

       

        Font fuente = new Font("Segoe UI",Font.BOLD, 18);
        Font fuenteDatos = new Font("Consolas", ABORT,14);
        // color
        Color colLabel = new Color(40,128,190);
        Color colBox = new Color(220, 244, 195);
        //Color colPanel = new Color(236, 240, 241);

        //Label de"Registro de interacción"
        label = new JLabel("Registro de interacción");
        label.setFont(fuente);
        label.setForeground(colLabel);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.NORTH);

       
        JPanel panelCentro = new JPanel(new BorderLayout(5, 5)); // 5 px espacio horizontal y vertical

        //caja de texto
        JTextField datos = new JTextField();
        datos.setColumns(50);
        datos.setFont(fuenteDatos);
        datos.setBorder(new LineBorder(colLabel,2));
        panelCentro.add(datos, BorderLayout.CENTER); // ocupa todo el espacio horizontal

        //boton
        Button enviar = new Button("Enviar");
        enviar.setBackground(colLabel);
        enviar.setForeground(Color.WHITE);
        enviar.setFont(fuente);

        panelCentro.add(enviar, BorderLayout.EAST); // botón a la derecha con tamaño natural

        add(panelCentro, BorderLayout.CENTER);

        TextArea box = new TextArea();
        
        add(box, BorderLayout.SOUTH);

        Dimension min = new Dimension(520, 420);

        setMinimumSize(min);

        setVisible(true);
        System.out.println();
    }

   

   public static void main(String[] args) {

    new practica2();
   }
}
