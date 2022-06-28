package modelo;

public class Vehiculo {
    private Marca marca;
    private Color color;
    private int año;
    private double kilometraje;
    private int precio;

    public Vehiculo(Marca marca,Color color, int año, double kilometraje, int precio) {
        this.marca = marca;
        this.color = color;
        this.año = año;
        this.kilometraje = kilometraje;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "Marca: " + marca + " Color: " + color + " año: " + año +
                " KM: " + kilometraje + " Precio: " + precio+"\n";
    }

    public Marca getMarca() {
        return marca;
    }
}
