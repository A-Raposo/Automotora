package Ventanas;


import modelo.Color;
import modelo.Marca;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VentanaVehiculos extends Ventana implements ActionListener {
    private JButton boton = new JButton("Agregar");
    private JButton boton1 = new JButton("Buscar");
    private JButton boton2 = new JButton("Atras");
    public VentanaVehiculos() {
        laminaAgregar.setVisible(false);
        laminaBuscar.setVisible(false);
        lamina();
        laminaAgregar();
        laminaBuscar();
        add(lamina);
        add(laminaAgregar);
        add(laminaBuscar);
    }
    private void lamina() {
        lamina.add(boton,constraints);
        constraints.gridy = 1;
        lamina.add(boton1,constraints);
        constraints.gridy = 2;
        lamina.add(boton2,constraints);

        boton.addActionListener(this);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object seleccion = e.getSource();

        if(seleccion == boton){
            lamina.setVisible(false);
            laminaAgregar.setVisible(true);
        }else if (seleccion == boton1){
            lamina.setVisible(false);
            laminaBuscar.setVisible(true);

        }else if (seleccion == boton2){
            new VentanaPrincipal();
            this.dispose();
        }else if (seleccion == boton3) {
            if ((texto.getText().isBlank() | texto1.getText().isBlank() | texto2.getText().isBlank()) == false) {
                automotora.agregarVehiculo(lista.getSelectedItem(), lista1.getSelectedItem(), texto, texto1, texto2);
                JOptionPane.showMessageDialog(laminaAgregar, "Agregado exitosamente");
            }
            texto.setText(null);
            texto1.setText(null);
            texto2.setText(null);
        }else if (seleccion == boton4) {
            laminaAgregar.setVisible(false);
            lamina.setVisible(true);

        }else if (seleccion == boton5) {
            area.setText(automotora.buscarVehiculo(lista2.getSelectedItem()).toString());

        }else if (seleccion == boton6) {
            laminaBuscar.setVisible(false);
            lamina.setVisible(true);
        }
    }

    private JPanel laminaAgregar = new JPanel(new GridBagLayout());;
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

    private void laminaAgregar() {

        constraints.gridy = 0;
        constraints.gridwidth = 2;
        laminaAgregar.add(lista,constraints);
        constraints.gridy = 1;
        laminaAgregar.add(lista1,constraints);
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        laminaAgregar.add(etiqueta,constraints);
        laminaAgregar.add(texto,constraints);
        constraints.gridy = 3;
        laminaAgregar.add(etiqueta1,constraints);
        laminaAgregar.add(texto1,constraints);
        constraints.gridy = 4;
        laminaAgregar.add(etiqueta2,constraints);
        laminaAgregar.add(texto2,constraints);

        constraints.gridy = 5;
        constraints.gridwidth = 2;
        laminabotones.add(boton3);
        laminabotones.add(boton4);
        laminaAgregar.add(laminabotones,constraints);

        boton3.addActionListener(this);
        boton4.addActionListener(this);

        texto.addKeyListener(new Datos.ingresoTeclado(texto));
        texto1.addKeyListener(new Datos.ingresoTeclado(texto1));
        texto2.addKeyListener(new Datos.ingresoTeclado(texto2));
    }
    private JPanel laminaBuscar = new JPanel(new GridBagLayout());
    private JPanel laminabotones2 = new JPanel();

    private JComboBox lista2 = new JComboBox<>(Marca.values());

    private JLabel etiqueta6 = new JLabel("Vehiculos:");

    private JTextArea area = new JTextArea(20,40);
    private JScrollPane laminaArea = new JScrollPane(area);

    private JButton boton5 = new JButton("buscar");
    private JButton boton6 = new JButton("atras");

    private void laminaBuscar() {

        area.setEditable(false);
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        laminaBuscar.add(laminaArea,constraints);
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        laminaBuscar.add(etiqueta6,constraints);
        laminaBuscar.add(lista2,constraints);
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.BOTH;

        laminabotones2.add(boton5);
        laminabotones2.add(boton6);
        laminaBuscar.add(laminabotones2,constraints);

        boton5.addActionListener(this);
        boton6.addActionListener(this);

    }
}
