package Servicios;

import Entidades.Cuadrado;
import java.util.Scanner;

public class CuadradoSV {

    Scanner leer = new Scanner(System.in);

    public Cuadrado crearCuadrado() {
        Cuadrado c = new Cuadrado();
        System.out.println("Ingrese la longitud del lado del cuadrado. ");
        c.setLado(leer.nextDouble());
        return c;
    }

    public void perimetro(Cuadrado c) {
        System.out.println("El perimetro del cuadrado es de " + c.getLado() * 4);
    }

    public void area(Cuadrado c) {
        System.out.println("El area del cuadrado es de " + c.getLado() * c.getLado());
    }
}
