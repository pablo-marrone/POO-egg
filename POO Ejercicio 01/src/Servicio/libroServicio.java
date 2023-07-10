package Servicio;
import Entidad.Libro;
import java.util.Scanner;

public class libroServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro() {
        Libro l1 = new Libro();
        System.out.println("ISBN");
        l1.setIsbn(leer.nextInt());
        //int isbn = leer.nextInt();
        System.out.println("Título");
        l1.setTítulo(leer.next());
        //String titulo = leer.next();
        System.out.println("Autor");
        l1.setAutor(leer.next());
        //String autor = leer.next();
        System.out.println("Numero de paginas");
        l1.setNumeroPaginas(leer.nextInt());
        //int numeroPaginas = leer.nextInt();

        return l1;
        
    }

    public void mostrarLibro(Libro nombre) {
        System.out.println(nombre.toString());
    }

}
