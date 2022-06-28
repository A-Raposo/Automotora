package modelo;

import modelo.Vendedor;

public class Venta{
    private Persona persona;
    private double precio;
    private int numVenta;

    public Venta(Persona persona, double precio, int numVenta) {
        this.persona = persona;
        this.precio = precio;
        this.numVenta = numVenta;
        double descuento = descuento(persona, precio, numVenta);
        System.out.println("Descuento: "+ descuento);
        System.out.println("Precio: " + (precio-descuento));
    }
    private double descuento(Persona persona, double precio, int numVenta){
        if (persona instanceof Vendedor){
            precio = precio*0.1;
            return precio;
        }else{
            if (numVenta > 1){
                return 0;
            }
            precio = precio*0.2;
            return precio;
        }
    }
}
