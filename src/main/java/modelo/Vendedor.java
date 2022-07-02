package modelo;

public class Vendedor extends Persona {
    private int  certificado;

    public Vendedor(String nombre, String rut, int edad, int certificado) {
        super(nombre, rut, edad);
    }
}
