package Servicios;

import Entidades.Circulo;
import java.util.Scanner;

public class CirculoSV {

    Scanner leer = new Scanner(System.in);

    public Circulo crearCirculo() {
        Circulo c = new Circulo();
        System.out.println("Ingrese el radio del circulo.");
        c.setRadio(leer.nextDouble());
        return c;
    }

    public void perimetro(Circulo c) {
        System.out.println("El perimetro del Circulo es de " + Math.PI * c.getRadio() * 2);
    }

    public void area(Circulo c) {
        System.out.println("El area del Circulo es de " + Math.PI * (c.getRadio()*c.getRadio()));
    }
}
