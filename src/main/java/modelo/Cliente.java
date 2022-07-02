package modelo;

public class Cliente extends Persona{
    private String domicilio;
    private int numTelefono;
    private String correo;

    public Cliente(String nombre, String rut, int edad, String domicilio, int numTelefono, String correo) {
        super(nombre, rut, edad);
        this.domicilio = domicilio;
        this.numTelefono = numTelefono;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "\r" + "Nombre:" + nombre + " Rut:" + rut + " Edad:" + edad + " Domicilio:" + domicilio + " Telefono:" + numTelefono + " Correo:" + correo;
    }
}
