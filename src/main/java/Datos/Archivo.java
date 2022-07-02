package Datos;

import modelo.Automotora;
import modelo.Cliente;
import modelo.Vehiculo;

import java.util.ArrayList;

public class Archivo {
    private GestorArchivo ga = new GestorArchivo();
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public Archivo() {
    }

    public void guardarClientes(Automotora automotora){
        clientes = automotora.getCliente();
        archivarCliente();
    }
    private void archivarCliente(){
        ga.crearArchivo("Clientes.txt", clientes.toString().replace(",","").replace("[","").replace("]"," ").trim());
    }
    public void guardarVehiculos(Automotora automotora){
        vehiculos = automotora.getVehiculo();
        archivarVehiculo();
    }

    private void archivarVehiculo() {
        ga.crearArchivo("Vehiculos.txt", vehiculos.toString().replace(",","").replace("[","").replace("]"," ").trim());
    }
}
