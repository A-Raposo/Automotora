package Ventanas;

import modelo.Automotora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaClientes extends Ventana implements ActionListener {
    private Automotora automotora = new Automotora();
    private JButton boton = new JButton("Agregar");
    private JButton boton1 = new JButton("Modificar");
    private JButton boton2 = new JButton("Eliminar");
    private JButton boton3 = new JButton("Atras");
    public VentanaClientes() {
        setLayout(new GridBagLayout());
        lamina();
        laminaAgregar();
        laminaModificar();
        laminaEliminar();
        lamina.setVisible(true);
        lamina1.setVisible(false);
        lamina2.setVisible(false);
        lamina3.setVisible(false);
        add(lamina);
        add(lamina1);
        add(lamina2);
        add(lamina3);
    }
    private void lamina() {
        lamina.add(boton,constraints);
        constraints.gridy = 1;
        lamina.add(boton1,constraints);
        constraints.gridy = 2;
        lamina.add(boton2,constraints);
        constraints.gridy = 3;
        lamina.add(boton3,constraints);

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
            lamina1.setVisible(true);
        }else if (seleccion == boton1){
            lamina.setVisible(false);
            lamina2.setVisible(true);

        }else if (seleccion == boton2){
            lamina.setVisible(false);
            lamina3.setVisible(true);
        }else if (seleccion == boton3) {
            new VentanaPrincipal();
            this.dispose();
        }else if (seleccion == boton4) {
            automotora.agregarCliente(texto,texto1,texto2,texto3,texto4,texto5);
            JOptionPane.showMessageDialog(lamina1,"Agregado exitosamente");
            texto.setText(null);
            texto1.setText(null);
            texto2.setText(null);
            texto3.setText(null);
            texto4.setText(null);
            texto5.setText(null);
        }else if (seleccion == boton5) {
            lamina1.setVisible(false);
            lamina.setVisible(true);
        }else if (seleccion == boton6) {
            JOptionPane.showMessageDialog(lamina2,"Modificado Exitosamente");
            texto.setText(null);
            texto1.setText(null);
            texto2.setText(null);
            texto3.setText(null);
            texto4.setText(null);
            texto5.setText(null);
        }else if (seleccion == boton7) {
            lamina2.setVisible(false);
            lamina.setVisible(true);
        }else if (seleccion == boton8) {
            JOptionPane.showMessageDialog(lamina3,"Eliminado exitosamente");
            automotora.eliminarCliente(lista.getSelectedIndex());
            lista.removeItemAt(lista.getSelectedIndex());
            area.setText(automotora.getCliente().toString());
        }else if (seleccion == boton9) {
            //lista.removeAllItems();
            lamina3.setVisible(false);
            lamina.setVisible(true);
        }
    }
    private JPanel lamina1 = new JPanel(new GridBagLayout());
    private JPanel laminabotones = new JPanel();

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
        lamina1.add(etiqueta,constraints);
        lamina1.add(texto,constraints);
        constraints.gridy = 1;
        lamina1.add(etiqueta1,constraints);
        lamina1.add(texto1,constraints);
        constraints.gridy = 2;
        lamina1.add(etiqueta2,constraints);
        lamina1.add(texto2,constraints);
        constraints.gridy = 3;
        lamina1.add(etiqueta3,constraints);
        lamina1.add(texto3,constraints);
        constraints.gridy = 4;
        lamina1.add(etiqueta4,constraints);
        lamina1.add(texto4,constraints);
        constraints.gridy = 5;
        lamina1.add(etiqueta5,constraints);
        lamina1.add(texto5,constraints);

        constraints.gridy = 6;
        constraints.gridwidth = 2;
        laminabotones.add(boton4);
        laminabotones.add(boton5);
        lamina1.add(laminabotones,constraints);

        boton4.addActionListener(this);
        boton5.addActionListener(this);

    }

    private JPanel lamina2 = new JPanel(new GridBagLayout());
    private JPanel laminabotones2 = new JPanel();

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
        lamina2.add(etiqueta6,constraints);
        lamina2.add(texto6,constraints);
        constraints.gridy = 1;
        lamina2.add(etiqueta7,constraints);
        lamina2.add(texto7,constraints);
        constraints.gridy = 2;
        lamina2.add(etiqueta8,constraints);
        lamina2.add(texto8,constraints);
        constraints.gridy = 3;
        lamina2.add(etiqueta9,constraints);
        lamina2.add(texto9,constraints);
        constraints.gridy = 4;
        lamina2.add(etiqueta10,constraints);
        lamina2.add(texto10,constraints);
        constraints.gridy = 5;
        lamina2.add(etiqueta11,constraints);
        lamina2.add(texto11,constraints);

        constraints.gridy = 6;
        constraints.gridwidth = 2;
        laminabotones2.add(boton6);
        laminabotones2.add(boton7);
        lamina2.add(laminabotones2,constraints);

        boton6.addActionListener(this);
        boton7.addActionListener(this);
    }

    private JPanel lamina3 = new JPanel(new GridBagLayout());
    private JPanel laminabotones3 = new JPanel();

    private JTextArea area = new JTextArea(20,40);
    private JScrollPane laminaArea = new JScrollPane(area);

    private JComboBox lista = new JComboBox<>();

    private JLabel etiqueta12 = new JLabel("Posición");

    private JButton boton8 =new JButton("eliminar");
    private JButton boton9 =new JButton("cancelar");

    private void laminaEliminar(){
        for (int i = 0; i < automotora.getCliente().size(); i++) {
            lista.addItem(automotora.getCliente().get(i));
        }
            area.setText(automotora.getCliente().toString());

        area.setEditable(false);
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        lamina3.add(laminaArea,constraints);
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        lamina3.add(etiqueta12,constraints);
        lamina3.add(lista,constraints);

        constraints.gridy = 2;
        constraints.gridwidth = 2;
        laminabotones3.add(boton8);
        laminabotones3.add(boton9);
        lamina3.add(laminabotones3,constraints);

        boton8.addActionListener(this);
        boton9.addActionListener(this);

    }
}