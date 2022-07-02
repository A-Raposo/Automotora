package modelo;

public class Vehiculo {
    private Marca marca;
    private Color color;
    private int año;
    private double kilometraje;
    private double precio;

    public Vehiculo(Marca marca,Color color, int año, double kilometraje, double precio) {
        this.marca = marca;
        this.color = color;
        this.año = año;
        this.kilometraje = kilometraje;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "\r"+"Marca:" + marca + " Color:" + color + " año:" + año +
                " KM:" + kilometraje + " Precio:" + precio;
    }

    public Marca getMarca() {
        return marca;
    }
}
