package Servicios;

import Entidades.Rombo;
import java.util.Scanner;

public class RomboSV {

    Scanner leer = new Scanner(System.in);

    public Rombo crearRombo() {
        Rombo r = new Rombo();
        System.out.println("Ingrese la longitud de la Diagonal Mayor ");
        r.setDiagonalMayor(leer.nextDouble());
        System.out.println("Ingrese la longitud de la Diagonal menor ");
        r.setDiagonalMenor(leer.nextDouble());
        return r;
    }

    public void perimetro(Rombo r) {
        double perimetro = 2 * Math.sqrt(r.getDiagonalMayor() * r.getDiagonalMenor());
        System.out.println("El perimetro del Rombo es de " + perimetro);
    }

    public void area(Rombo r) {
        double area = (r.getDiagonalMayor() * r.getDiagonalMenor()) / 2;
        System.out.println("El area de un Rombo es de " + area);
    }
}
