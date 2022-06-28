package modelo;

import javax.swing.*;
import java.util.*;

public class Automotora {
    private ArrayList<Vehiculo> vehiculo = new ArrayList<>();
    private ArrayList<Vendedor> vendedor = new ArrayList<>();
    private ArrayList<Cliente> cliente = new ArrayList<>();
    public Automotora() {
        agregarCliente();
    }

    public ArrayList agregarVehiculo(){
        vehiculo.add(new Vehiculo(Marca.VOLVO,Color.NEGRO,2020,100,5000000));
        vehiculo.add(new Vehiculo(Marca.VOLVO,Color.BLANCO,2021,100,7000000));
        vehiculo.add(new Vehiculo(Marca.VOLVO,Color.NARANJO,2022,100,3000000));
        vehiculo.add(new Vehiculo(Marca.CHEVROLET,Color.GRIS,2018,100,2500000));
        vehiculo.add(new Vehiculo(Marca.FIAT,Color.ROJO,2019,100,4500000));
        return vehiculo;
    }

    public Vehiculo agregarVehiculo(ArrayList vehiculos, Object lista,Object lista1,
                                    JTextField texto,JTextField texto1,JTextField texto2){
        this.vehiculo = vehiculos;

        Marca marca = (Marca)lista;
        Color color = (Color)lista1;
        int año = Integer.valueOf(texto.getText());
        double kilometraje = Integer.valueOf(texto1.getText());
        int precio = Integer.valueOf(texto2.getText());

        return new Vehiculo(marca,color,año,kilometraje,precio);
    }

    public ArrayList buscarVehiculo(Object marca,ArrayList vehiculo){
        ArrayList<Vehiculo> vehiculoBuscado = new ArrayList<>();
        this.vehiculo = vehiculo;
        for (int i = 0; i < vehiculo.size(); i++) {
            if (this.vehiculo.get(i).getMarca() == marca) {
                vehiculoBuscado.add(this.vehiculo.get(i));
            }
        }

        return  vehiculoBuscado;
    }

    public ArrayList agregarVendedor(){
        vendedor.add(new Vendedor("A","1",28,24));
        vendedor.add(new Vendedor("C","2",26,12));
        vendedor.add(new Vendedor("B","3",28,24));
        vendedor.add(new Vendedor("D","1",27,10));
        vendedor.add(new Vendedor("E","4",27,10));
        vendedor.add(new Vendedor("F","5",27,10));
        vendedor.add(new Vendedor("G","6",27,10));

        return vendedor;
    }

    public void agregarCliente(){
        cliente.add(new Cliente("Juan","111111111",20,"Av.siempreViva",12345678,"CORREOJUAN"));
        cliente.add(new Cliente("Ana","222222222",28,"PENSILVANIA",87654321,"CORREOANA"));
        cliente.add(new Cliente("Ana","222222222",28,"PENSILVANIA",87654321,"CORREOANA"));
        cliente.add(new Cliente("Ana","222222222",28,"PENSILVANIA",87654321,"CORREOANA"));
        cliente.add(new Cliente("Ana","222222222",28,"PENSILVANIA",87654321,"CORREOANA"));
        cliente.add(new Cliente("Ana","222222222",28,"PENSILVANIA",87654321,"CORREOANA"));
        cliente.add(new Cliente("Ana","222222222",28,"PENSILVANIA",87654321,"CORREOANA"));
        cliente.add(new Cliente("Ana","222222222",28,"PENSILVANIA",87654321,"CORREOANA"));
    }

    public void agregarCliente(JTextField texto,JTextField texto1,JTextField texto2,JTextField texto3,JTextField texto4,JTextField texto5){
        String nombre = texto.getText();
        String rut = texto1.getText();
        int edad = Integer.valueOf(texto2.getText());
        String domicilio = texto3.getText();
        int telefono = Integer.valueOf(texto4.getText());
        String correo = texto5.getText();

        cliente.add(new Cliente(nombre,rut,edad,domicilio,telefono,correo));
        for (int i = 0; i < cliente.size(); i++) {
            System.out.print(cliente.get(i));
        }
    }

    public void eliminarCliente(int lugar){
        cliente.remove(lugar);
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public void modificarCliente(int lugar, Cliente clienteModificado){
        cliente.remove(lugar);
        cliente.add(lugar,clienteModificado);
    }
}
