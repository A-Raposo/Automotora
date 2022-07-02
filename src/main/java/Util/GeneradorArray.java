package Util;

import modelo.Cliente;
import modelo.Color;
import modelo.Marca;
import modelo.Vehiculo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GeneradorArray {

    public ArrayList<Cliente> crearArregloClientes() {
        ArrayList<Cliente> clientes = new ArrayList<>();

        String nombre = "";
        String rut;
        String edad;
        String domicilio;
        String telefono;
        String correo;

        try {
            FileReader archivoClientes = new FileReader("Clientes.txt");
            BufferedReader bf = new BufferedReader(archivoClientes);

            String linea = "";
            int posicion = 0;
            while (linea != null) {
                linea = bf.readLine();
                if (linea != null) {
                    char[] c = linea.toCharArray();
                    posicion = 6;
                    nombre = ciclo(c, posicion);
                    posicion = posicion + nombre.length() + 5;
                    rut = ciclo(c,posicion);
                    posicion = posicion + rut.length() + 6;
                    edad = ciclo(c,posicion);
                    posicion = posicion + edad.length() + 11;
                    domicilio = ciclo(c,posicion);
                    posicion = posicion + domicilio.length() + 10;
                    telefono = ciclo(c,posicion);
                    posicion = posicion + telefono.length() + 8;
                    correo = ciclo(c,posicion);
                    posicion = 0;

                    clientes.add(new Cliente(nombre,rut,Integer.parseInt(edad),domicilio,Integer.parseInt(telefono),correo));
                }
            }

        } catch (IOException e) {

        }
        return clientes;
    }
    public ArrayList<Vehiculo> crearArregloVehiculos() {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        String marca = "";
        String color;
        String año;
        String km;
        String precio;

        try {
            FileReader archivoVehiculos = new FileReader("Vehiculos.txt");
            BufferedReader bf = new BufferedReader(archivoVehiculos);

            String linea = "";
            int posicion = 0;
            while (linea != null) {
                linea = bf.readLine();
                if (linea != null) {
                    char[] c = linea.toCharArray();
                    posicion = 5;
                    marca = ciclo(c, posicion);
                    posicion = posicion + marca.length() + 7;
                    color = ciclo(c,posicion);
                    posicion = posicion + color.length() + 5;
                    año = ciclo(c,posicion);
                    posicion = posicion + año.length() + 4;
                    km = ciclo(c,posicion);
                    posicion = posicion + km.length() + 8;
                    precio = ciclo(c,posicion);
                    posicion = 0;

                    vehiculos.add(new Vehiculo(Marca.valueOf(marca), Color.valueOf(color),Integer.valueOf(año),Double.valueOf(km),Double.valueOf(precio)));
                }
            }

        } catch (IOException e) {

        }
        return vehiculos;
    }

    private String ciclo(char[] c , int posicion){
        String incognita = "";
        for (int i = 0; i < c.length; i++) {
            if (i > posicion) {
                if (c[i] == 32 || c[i] == 9){
                    break;
                }
                incognita = incognita + c[i];
            }

        }
        return incognita;
    }
}
