package Servicios;

import Entidad.Alquiler;
import Entidad.Pelicula;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ServicioAlquiler {

    Scanner leer = new Scanner(System.in);
    ServicioPelicula sp = new ServicioPelicula();

    public Alquiler crearAlquiler(Pelicula[] peliculas) {
        Alquiler alq = new Alquiler();
        sp.mostrarPeliculasDisponibles(peliculas);
        int numPelicula;
        do {
            System.out.println("Elija la pelicula a alquilar. (por numero).");
            numPelicula = leer.nextInt();
        } while (numPelicula < 0 || numPelicula > peliculas.length);
        alq.setPelicula(peliculas[numPelicula]);
        alq.setInicio(new Date());
        System.out.println("Fecha de devolucion: ");
        System.out.println("dia");
        int dia = leer.nextInt();
        leer.nextLine();

        System.out.println("mes: ");
        int mes = leer.nextInt();
        leer.nextLine();

        System.out.println("año: ");
        int anio = leer.nextInt();

        System.out.println(anio + "/" + mes + "/" + dia);

        Date fecha = new Date(anio - 1900, mes, dia);
        alq.setFin(fecha);
        alq.setPrecio(calcularPrecio(alq));
        return alq;
    }

    private double calcularPrecio(Alquiler alq) {
        long diffInMillies = Math.abs(alq.getInicio().getTime() - alq.getFin().getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        double precio = 10;
        for (int i = 3; i < diff; i++) {
            precio = precio + precio * 0.1;
        }
        System.out.println("Debe pagar: $"+ precio);
        return precio;   
    }


}
