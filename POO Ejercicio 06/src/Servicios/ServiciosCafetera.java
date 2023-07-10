package Servicios;

import Entidad.Cafetera;
import java.util.Scanner;

public class ServiciosCafetera {

    Scanner leer = new Scanner(System.in);

    public Cafetera crearCafetera() {
        Cafetera c = new Cafetera();
        //System.out.println("Ingrese la cantidad maxima de cafe que puede tener la cafetera (en litros)");
        c.setCapacidadMaxima(2);
        return c;
    }

    public void llenarCafetera(Cafetera c) {
        c.setCantidadActual(c.getCapacidadMaxima());
        System.out.println("Cafetera llena.");
    }

    public void servirTaza(Cafetera c) {
        System.out.println("Tamaño de taza (en litros)");
        double taza = leer.nextDouble();
        if (taza > c.getCantidadActual()) {
            System.out.println("La cantidad de cafe no alcanza.");
            System.out.println("Se servira " + c.getCantidadActual() + " litros");
            c.setCantidadActual(0);
        } else {
            c.setCantidadActual(c.getCantidadActual() - taza);
            System.out.println("Taza llena");
        }
    }

    public void vaciarCafetera(Cafetera c) {
        c.setCantidadActual(0);
        System.out.println("Cafetera Vacia.");
    }

    public void agregarCafe(Cafetera c) {
        System.out.println("Cuanto cafe desea agregar?");
        double agregado = leer.nextDouble();
        if ((c.getCantidadActual() + agregado) > c.getCapacidadMaxima()) {
            System.out.println("Esta agregando demasiado cafe ");
            System.out.println("Sobran " + ((c.getCantidadActual()+agregado) - c.getCapacidadMaxima()) + " litros");
            c.setCantidadActual(c.getCapacidadMaxima());
        } else {
            c.setCantidadActual(c.getCantidadActual() + agregado);
            System.out.println("Actualmente hay " + c.getCantidadActual() + " litros de cafe.");
        }
    }

    public void cuantoCafe(Cafetera c) {
        System.out.println("En este momento hay " + c.getCantidadActual() + " litros de cafe.");
    }

}
