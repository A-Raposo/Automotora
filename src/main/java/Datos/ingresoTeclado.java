package Datos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ingresoTeclado implements KeyListener {
    private JTextField texto;

    public ingresoTeclado(JTextField texto) {
        this.texto = texto;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!Character.isDigit(c) && c != '.'){
            e.consume();
        }
        if (c == '.' && texto.getText().contains(".")){
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
