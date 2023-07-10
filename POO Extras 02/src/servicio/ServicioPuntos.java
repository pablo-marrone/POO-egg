package servicio;

import entidad.Puntos;
import java.util.Scanner;

public class ServicioPuntos {

    Scanner leer = new Scanner(System.in);
    Puntos p = new Puntos();

    public Puntos crearPuntos() {
        System.out.println("Ingrese las coordenadas del primer punto: ");
        System.out.println("Coordenadas en eje 'x' ");
        p.setX1(leer.nextInt());
        System.out.println("Coordenadas en eje 'y' ");
        p.setY1(leer.nextInt());
        System.out.println("Punto 1:");
        System.out.println("(" + p.getX1() + "," + p.getY1() + ")");
        System.out.println("Ingrese las coordenadas del segundo punto: ");
        System.out.println("Coordenadas en eje 'x' ");
        p.setX2(leer.nextInt());
        System.out.println("Coordenadas en eje 'y' ");
        p.setY2(leer.nextInt());
        System.out.println("Punto 2:");
        System.out.println("(" + p.getX2() + "," + p.getY2() + ")");

        return p;
    }

    public void calculoDistancia() {
        double distancia = Math.sqrt((Math.pow((p.getX2() - p.getX1()), 2)) + (Math.pow(p.getY2() - p.getY1(), 2)));
        System.out.println("La distancia entre los puntos ingresados es de: " + distancia);
    }
}
