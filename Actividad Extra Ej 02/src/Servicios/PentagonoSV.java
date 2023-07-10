package Servicios;

import Entidades.Pentagono;
import java.util.Scanner;

public class PentagonoSV {

    Scanner leer = new Scanner(System.in);

    public Pentagono crearPentagono() {
        Pentagono p = new Pentagono();
        System.out.println("Ingrese la longitud del lado del pentagono");
        p.setLado(leer.nextDouble());
        return p;
    }

    public void perimetro(Pentagono p) {
        System.out.println("El perimetro del Pentagono es de " + (p.getLado() * 5));
    }

    public void area(Pentagono p) {
        double area = ((p.getLado() * p.getLado()) / 4) * (Math.sqrt(25 + 10 * Math.sqrt(5)));
        System.out.println("El area de un Pentagono es de " + area);
    }
}
