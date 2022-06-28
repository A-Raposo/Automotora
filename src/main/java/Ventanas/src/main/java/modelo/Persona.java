package modelo;

import java.util.Objects;

public  class Persona {
    protected String nombre;
    protected String rut;
    protected int edad;

    public Persona(String nombre, String rut, int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
    }
}
