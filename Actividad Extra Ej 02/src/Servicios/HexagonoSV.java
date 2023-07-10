package Servicios;

import Entidades.Hexagono;
import java.util.Scanner;

public class HexagonoSV {

    Scanner leer = new Scanner(System.in);

    public Hexagono crearHexagono() {
        Hexagono h = new Hexagono();
        System.out.println("Ingrese la longitud del lado");
        h.setLado(leer.nextDouble());
        return h;
    }

    public void perimetro(Hexagono h) {
        System.out.println("El perimetro del Hexagono es de " + (h.getLado() * 6));
    }

    public void area(Hexagono h) {
        double area = (3 * Math.sqrt(3) * h.getLado() * h.getLado()) / 2;
        System.out.println("El area de un Hexagono es de " + area);
    }
}
