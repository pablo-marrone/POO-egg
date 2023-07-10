package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

public class RectanguloSV {

    Scanner leer = new Scanner(System.in);

    public Rectangulo crearRectangulo() {
        Rectangulo r = new Rectangulo();
        System.out.println("Ingrese la longitud de la base");
        r.setBase(leer.nextDouble());
        System.out.println("Ingrese la longitud de la altura");
        r.setAltura(leer.nextDouble());
        return r;
    }

    public void perimetro(Rectangulo r) {
        System.out.println("El perimetro del Rectangulo es de " + (r.getBase() * 2 + r.getAltura() * 2));
    }

    public void area(Rectangulo r) {
        System.out.println("El area del Rectangulo es de " + r.getBase() * r.getAltura());
    }
}
