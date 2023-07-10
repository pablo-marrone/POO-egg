package Entidad;

/**
 * @author Pablo
 */

public class Persona {

    public String nombre;
    public String DNI;
    public int edad;

    public Persona() {
    }

    public Persona(String nombre, String DNI, int edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", DNI=" + DNI + ", edad=" + edad + '}';
    }

}
