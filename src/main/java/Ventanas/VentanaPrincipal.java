package Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.BorderLayout.*;

public class VentanaPrincipal extends Ventana implements ActionListener {

    private JButton boton = new JButton("Clientes");
    private JButton boton1 = new JButton("Vehiculos");
    private JButton boton2 = new JButton("SALIR");

    public VentanaPrincipal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(lamina());
    }

    private Component lamina() {
        lamina.add(boton,constraints);
        constraints.gridy = 1;
        lamina.add(boton1,constraints);
        constraints.gridy = 2;
        lamina.add(boton2,constraints);

        boton.addActionListener(this);
        boton1.addActionListener(this);
        boton2.addActionListener(this);

        return lamina;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object seleccion = e.getSource();

        if(seleccion == boton){
            lamina.setBackground(Color.BLACK);
            new VentanaClientes();
            this.dispose();
        }else if (seleccion == boton1){
            boton.setBackground(Color.RED);
            new VentanaVehiculos();
            this.dispose();
        }else{
            System.exit(0);
        }
    }
}
