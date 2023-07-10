package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

public class Calculos {

    Scanner leer = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {
        Circunferencia c1 = new Circunferencia();
        System.out.println("Ingrese el radio del circulo.");
        c1.setRadio(leer.nextDouble());
        return c1;
    }

    public void area(Circunferencia c1) {
        double area = Math.PI * c1.getRadio();
        System.out.println("el area del un circulo de radio " + c1.getRadio() + " es de " + area);
    }

    public void perimetro(Circunferencia c1) {
        double perimetro = 2 * Math.PI * c1.getRadio();
        System.out.println("Y su perimetro es de " + perimetro);
    }

}
