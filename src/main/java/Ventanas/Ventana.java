package Ventanas;

import javax.swing.*;
import java.awt.*;
import modelo.*;
import Datos.*;

public abstract class Ventana extends JFrame {
    protected JPanel lamina = new JPanel();
    protected GridBagConstraints constraints = new GridBagConstraints();
    protected Automotora automotora = new Automotora();

    public Ventana() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("AUTOMOTORA");
        setLayout(new GridBagLayout());

        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamañoPantalla = pantalla.getScreenSize();

        int alturaPantalla = tamañoPantalla.height;
        int anchoPantalla = tamañoPantalla.width;

        setBounds(anchoPantalla/4,alturaPantalla/4,anchoPantalla/2,alturaPantalla/2);

        lamina.setLayout(new GridBagLayout());
        constraints.fill = GridBagConstraints.BOTH;
    }
}