package Ventanas;

import Datos.Archivo;
import modelo.Automotora;
import modelo.Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaClientes extends Ventana implements ActionListener {
    public VentanaClientes() {
        lamina.setVisible(true);
        laminaAgregar.setVisible(false);
        laminaModificar.setVisible(false);
        lamina();
        laminaAgregar();
        laminaModificar();
        add(lamina);
        add(laminaAgregar);
        add(laminaModificar);
    }

    private JPanel laminabotones = new JPanel();
    private JButton boton = new JButton("Agregar");
    private JButton boton1 = new JButton("Modificar");
    private JButton boton2 = new JButton("Eliminar");
    private JButton boton3 = new JButton("Atras");

    private JList lista = new JList<>(automotora.getCliente().toArray());
    private JScrollPane laminalista = new JScrollPane(lista);


    private void lamina(){
        lamina.add(laminalista,constraints);

        laminabotones.add(boton);
        laminabotones.add(boton1);
        laminabotones.add(boton2);
        laminabotones.add(boton3);

        constraints.gridy = 1;
        lamina.add(laminabotones,constraints);
        boton.addActionListener(this);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object seleccion = e.getSource();

        if(seleccion == boton){
            lamina.setVisible(false);
            laminaAgregar.setVisible(true);
        }else if (seleccion == boton1){
            lamina.setVisible(false);
            laminaModificar.setVisible(true);

        }else if (seleccion == boton2){
            automotora.eliminarCliente(lista.getSelectedIndex());
            lista.setListData(automotora.getCliente().toArray());
        }else if (seleccion == boton3) {
            new Archivo().guardarClientes(automotora);
            new Archivo().guardarVehiculos(automotora);
            new VentanaPrincipal();
            this.dispose();
        }else if (seleccion == boton4) {
            automotora.agregarCliente(texto,texto1,texto2,texto3,texto4,texto5);
            JOptionPane.showMessageDialog(laminaAgregar,"Agregado exitosamente");
            texto.setText(null);
            texto1.setText(null);
            texto2.setText(null);
            texto3.setText(null);
            texto4.setText(null);
            texto5.setText(null);
        }else if (seleccion == boton5) {
            lista.setListData(automotora.getCliente().toArray());
            laminaAgregar.setVisible(false);
            lamina.setVisible(true);
        }else if (seleccion == boton6) {
            automotora.modificarCliente(lista.getSelectedIndex(),texto6,texto7,texto8,texto9,texto10,texto11);
            JOptionPane.showMessageDialog(laminaModificar,"Modificado Exitosamente");
            texto.setText(null);
            texto1.setText(null);
            texto2.setText(null);
            texto3.setText(null);
            texto4.setText(null);
            texto5.setText(null);
        }else if (seleccion == boton7) {
            lista.setListData(automotora.getCliente().toArray());
            laminaModificar.setVisible(false);
            lamina.setVisible(true);
        }
    }
    private JPanel laminaAgregar = new JPanel(new GridBagLayout());
    private JPanel laminaboton = new JPanel();

    private JLabel etiqueta = new JLabel("Nombre:");
    private JLabel etiqueta1 = new JLabel("Rut:");
    private JLabel etiqueta2 = new JLabel("Edad:");
    private JLabel etiqueta3 = new JLabel("Domicilio:");
    private JLabel etiqueta4 = new JLabel("Telefono:");
    private JLabel etiqueta5 = new JLabel("Correo");

    private JTextField texto = new JTextField(10);
    private JTextField texto1 = new JTextField(10);
    private JTextField texto2 = new JTextField(10);
    private JTextField texto3 = new JTextField(10);
    private JTextField texto4 = new JTextField(10);
    private JTextField texto5 = new JTextField(10);

    private JButton boton4 = new JButton("agregar");
    private JButton boton5 = new JButton("cancelar");

    private void laminaAgregar(){
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        laminaAgregar.add(etiqueta,constraints);
        laminaAgregar.add(texto,constraints);
        constraints.gridy = 1;
        laminaAgregar.add(etiqueta1,constraints);
        laminaAgregar.add(texto1,constraints);
        constraints.gridy = 2;
        laminaAgregar.add(etiqueta2,constraints);
        laminaAgregar.add(texto2,constraints);
        constraints.gridy = 3;
        laminaAgregar.add(etiqueta3,constraints);
        laminaAgregar.add(texto3,constraints);
        constraints.gridy = 4;
        laminaAgregar.add(etiqueta4,constraints);
        laminaAgregar.add(texto4,constraints);
        constraints.gridy = 5;
        laminaAgregar.add(etiqueta5,constraints);
        laminaAgregar.add(texto5,constraints);

        constraints.gridy = 6;
        constraints.gridwidth = 2;
        laminaboton.add(boton4);
        laminaboton.add(boton5);
        laminaAgregar.add(laminaboton,constraints);

        boton4.addActionListener(this);
        boton5.addActionListener(this);

        texto2.addKeyListener(new Datos.ingresoTeclado(texto2));
        texto4.addKeyListener(new Datos.ingresoTeclado(texto4));

    }

    private JPanel laminaModificar = new JPanel(new GridBagLayout());
    private JPanel laminaboton2 = new JPanel();

    private JLabel etiqueta6 = new JLabel("Nombre:");
    private JLabel etiqueta7 = new JLabel("Rut:");
    private JLabel etiqueta8 = new JLabel("Edad:");
    private JLabel etiqueta9 = new JLabel("Domicilio:");
    private JLabel etiqueta10 = new JLabel("Telefono:");
    private JLabel etiqueta11 = new JLabel("Correo");

    private JTextField texto6 = new JTextField(10);
    private JTextField texto7 = new JTextField(10);
    private JTextField texto8 = new JTextField(10);
    private JTextField texto9 = new JTextField(10);
    private JTextField texto10 = new JTextField(10);
    private JTextField texto11 = new JTextField(10);

    private JButton boton6 = new JButton("modificar");
    private JButton boton7 = new JButton("cancelar");

    private void laminaModificar(){
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        laminaModificar.add(etiqueta6,constraints);
        laminaModificar.add(texto6,constraints);
        constraints.gridy = 1;
        laminaModificar.add(etiqueta7,constraints);
        laminaModificar.add(texto7,constraints);
        constraints.gridy = 2;
        laminaModificar.add(etiqueta8,constraints);
        laminaModificar.add(texto8,constraints);
        constraints.gridy = 3;
        laminaModificar.add(etiqueta9,constraints);
        laminaModificar.add(texto9,constraints);
        constraints.gridy = 4;
        laminaModificar.add(etiqueta10,constraints);
        laminaModificar.add(texto10,constraints);
        constraints.gridy = 5;
        laminaModificar.add(etiqueta11,constraints);
        laminaModificar.add(texto11,constraints);

        constraints.gridy = 6;
        constraints.gridwidth = 2;
        laminaboton2.add(boton6);
        laminaboton2.add(boton7);
        laminaModificar.add(laminaboton2,constraints);

        boton6.addActionListener(this);
        boton7.addActionListener(this);

        texto8.addKeyListener(new Datos.ingresoTeclado(texto8));
        texto10.addKeyListener(new Datos.ingresoTeclado(texto10));
    }
}