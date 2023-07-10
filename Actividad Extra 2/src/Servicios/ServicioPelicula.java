package Servicios;

import Entidad.Pelicula;
import java.util.Scanner;

public class ServicioPelicula {

    Scanner leer = new Scanner(System.in);

    public Pelicula crearPelicula() {
        Pelicula p = new Pelicula();
        System.out.println("Ingrese el Titulo de la Pelicula. ");
        String titulo = leer.nextLine();
        p.setTitulo(titulo);
        System.out.println("Ingrese el genero: ");
        String genero = leer.nextLine();
        p.setGenero(genero);
        int anio;
        do {
            System.out.println("Ingrese el año: ");
            anio = leer.nextInt();
        } while (anio < 1900 || anio > 2023);
        p.setAnio(anio);
        int duracion;
        do {
            System.out.println("Ingrese la duración: ");
            duracion = leer.nextInt();
        } while (duracion < 30 || duracion > 240);
        p.setDuracion(duracion);
        p.setAlquilada(false);
        return p;
    }

    public void mostrarPelicula(Pelicula p) {
        System.out.println(p.getTitulo());
        System.out.println(p.getGenero());
        System.out.println(p.getAnio());
        System.out.println(p.getDuracion());
    }

    public void mostrarPeliculas(Pelicula[] peliculas) {
        for (int i = 0; i < peliculas.length; i++) {
            System.out.println(i);
            mostrarPelicula(peliculas[i]);
            if (peliculas[i].isAlquilada()) {
                System.out.println("La pelicula se encuentra alquilada. ");
            } else {
                System.out.println("La pelicula se encuentra disponible. ");
            }
        }
    }

    public void mostrarPeliculasAlquiladas(Pelicula[] peliculas) {
        System.out.println("Las peliculas alquiladas son: ");
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i].isAlquilada()) {
                mostrarPelicula(peliculas[i]);
            }
        }
    }

    public void mostrarPeliculasDisponibles(Pelicula[] peliculas) {
        System.out.println("Las peliculas disponibles son: ");
        for (int i = 0; i < peliculas.length; i++) {
            if (!peliculas[i].isAlquilada()) {
                mostrarPelicula(peliculas[i]);
            }
        }
    }

    public boolean buscarPorTitulo(Pelicula[] peliculas) {
        System.out.println("Que pelicula esta buscando? ");
        String busqueda = leer.nextLine();
        for (int i = 0; i < peliculas.length; i++) {
            if (busqueda.equalsIgnoreCase(peliculas[i].getTitulo())) {
                return true;
            }
        }
        return false;
    }
    
    public boolean buscarPorGenero(Pelicula[] peliculas) {
        System.out.println("Que Genero de pelicula esta buscando? ");
        String busqueda = leer.nextLine();
        for (int i = 0; i < peliculas.length; i++) {
            if (busqueda.equalsIgnoreCase(peliculas[i].getGenero())) {
                return true;
            }
        }
        return false;
    }
}
