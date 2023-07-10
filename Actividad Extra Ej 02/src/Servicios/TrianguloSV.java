package Servicios;

import Entidades.Triangulo;
import java.util.Scanner;



public class TrianguloSV {
    Scanner leer = new Scanner(System.in);

    public Triangulo crearTriangulo() {
        Triangulo t = new Triangulo();
        System.out.println("Ingrese la longitud de la base");
        t.setBase(leer.nextDouble());
        System.out.println("Ingrese la longitud de la altura");
        t.setAltura(leer.nextDouble());
        return t;
    }

    public void perimetro(Triangulo t) {
        System.out.println("El perimetro del Triangulo equilatero es " + t.getBase() * 3);
    }

    public void area(Triangulo t) {
        System.out.println("El area del Triangulo equilatero es de " + (t.getBase() * t.getAltura())/2);
        
    }

}
