package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

public class RectanguloServicio {

    Scanner leer = new Scanner(System.in);

    public Rectangulo crearRectangulo() {
        Rectangulo rc = new Rectangulo();
        System.out.println("Ingrese la base del rectangulo");
        rc.setBase(leer.nextInt());
        System.out.println("ahora ingrese la altura");
        rc.setAltura(leer.nextInt());
        return rc;
    }
    public void perimetro(Rectangulo rc) {
        System.out.println("El perimetro del Rectangulo es de: " + ((rc.getBase() + rc.getAltura()) * 2));
    }
    public void area(Rectangulo rc) {
        System.out.println("El area del Rectangulo es de: " + rc.getBase() * rc.getAltura());
    }
    public void dibujo(Rectangulo rc){
        for (int i = 0; i < rc.getAltura(); i++) {
            for (int j = 0; j < rc.getBase(); j++) {
                if (i==0 || i==rc.getAltura()-1 || j==0 || j==rc.getBase()-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    

}
