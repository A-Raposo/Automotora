package Ventanas;

import modelo.Automotora;
import modelo.Color;
import modelo.Marca;
import modelo.Vehiculo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaVehiculos extends Ventana implements ActionListener {
    private Automotora automotora = new Automotora();
    private ArrayList<Vehiculo> vehiculos = automotora.agregarVehiculo();
    private JButton boton = new JButton("Agregar");
    private JButton boton1 = new JButton("Buscar");
    private JButton boton2 = new JButton("Atras");
    public VentanaVehiculos() {
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
            lamina.setVisible(false);
            lamina1.setVisible(true);
            add(laminaAgregar());
        }else if (seleccion == boton1){
            lamina.setVisible(false);
            lamina2.setVisible(true);
            add(laminaBuscar());

        }else if (seleccion == boton2){
            new VentanaPrincipal();
            this.dispose();
        }else if (seleccion == boton3) {
            vehiculos.add(automotora.agregarVehiculo(vehiculos,lista.getSelectedItem(),lista1.getSelectedItem(),texto,texto1,texto2));
            JOptionPane.showMessageDialog(lamina1,"Agregado exitosamente");
            texto.setText(null);
            texto1.setText(null);
            texto2.setText(null);
        }else if (seleccion == boton4) {
            lamina1.setVisible(false);
            lamina.setVisible(true);

        }else if (seleccion == boton5) {
            Object marca =lista.getSelectedItem();
            ArrayList<Vehiculo> busqueda;
            for (int i = 0; i < vehiculos.size(); i++) {
                busqueda=automotora.buscarVehiculo(marca,vehiculos);
                area.setText(busqueda.toString());
            }

        }else if (seleccion == boton6) {
            lamina2.setVisible(false);
            lamina.setVisible(true);
        }
    }

    private JPanel lamina1 = new JPanel(new GridBagLayout());;
    private JPanel laminabotones = new JPanel();

    private JComboBox lista = new JComboBox<>(Marca.values());
    private JComboBox lista1 = new JComboBox<>(Color.values());

    private JLabel etiqueta = new JLabel("Año:");
    private JLabel etiqueta1 = new JLabel("Kilometraje:");
    private JLabel etiqueta2 = new JLabel("Precio:");

    private JTextField texto = new JTextField(10);
    private JTextField texto1 = new JTextField(10);
    private JTextField texto2 = new JTextField(10);

    private JButton boton3 = new JButton("agregar");
    private JButton boton4 = new JButton("cancelar");

    private Component laminaAgregar() {

        constraints.gridy = 0;
        constraints.gridwidth = 2;
        lamina1.add(lista,constraints);
        constraints.gridy = 1;
        lamina1.add(lista1,constraints);
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        lamina1.add(etiqueta,constraints);
        lamina1.add(texto,constraints);
        constraints.gridy = 3;
        lamina1.add(etiqueta1,constraints);
        lamina1.add(texto1,constraints);
        constraints.gridy = 4;
        lamina1.add(etiqueta2,constraints);
        lamina1.add(texto2,constraints);

        constraints.gridy = 5;
        constraints.gridwidth = 2;
        laminabotones.add(boton3);
        laminabotones.add(boton4);
        lamina1.add(laminabotones,constraints);

        boton3.addActionListener(this);
        boton4.addActionListener(this);

        return lamina1;
    }
    private JPanel lamina2 = new JPanel(new GridBagLayout());
    private JPanel laminabotones2 = new JPanel();

    private JComboBox lista2 = new JComboBox<>(Marca.values());

    private JLabel etiqueta6 = new JLabel("Vehiculos:");

    private JTextArea area = new JTextArea(20,40);
    private JScrollPane laminaArea = new JScrollPane(area);

    private JButton boton5 = new JButton("buscar");
    private JButton boton6 = new JButton("atras");

    private Component laminaBuscar() {

        area.setEditable(false);
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        lamina2.add(laminaArea,constraints);
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        lamina2.add(etiqueta6,constraints);
        lamina2.add(lista2,constraints);
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.BOTH;

        laminabotones2.add(boton5);
        laminabotones2.add(boton6);
        lamina2.add(laminabotones2,constraints);

        boton5.addActionListener(this);
        boton6.addActionListener(this);

        return lamina2;
    }
}
