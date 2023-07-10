package poo.ejercicio.pkg01;
import Entidad.Libro;
import Servicio.libroServicio;

public class POOEjercicio01 {

    public static void main(String[] args) {
        libroServicio datos = new libroServicio();
        Libro l1 = datos.crearLibro();
        datos.mostrarLibro(l1);

    }
}
