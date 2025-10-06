package PrimeraVentana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends JFrame implements MouseListener, MouseMotionListener {

    private JPanel panel;
    private JLabel label;

    public MouseListenerExample() {
        setTitle("Ejemplo de MouseListener");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.addMouseListener(this);  
        panel.addMouseMotionListener(this); // Agregado

        label = new JLabel("Mueve el ratón o arrástralo");
        add(panel, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        panel.setBackground(Color.BLUE);
        System.out.println("Ratón clicado en la posición: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        panel.setBackground(Color.GREEN);
        System.out.println("Ratón presionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        panel.setBackground(Color.YELLOW);
        System.out.println("Ratón liberado");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        panel.setBackground(Color.ORANGE);
        System.out.println("Ratón ha entrado en el panel");
        System.out.println();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        panel.setBackground(Color.LIGHT_GRAY);
        System.out.println("Ratón ha salido del panel");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        label.setText("Ratón arrastrado por: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        label.setText("Ratón movido a: " + e.getX() + ", " + e.getY());
    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}
