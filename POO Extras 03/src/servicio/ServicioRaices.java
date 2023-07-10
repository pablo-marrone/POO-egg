package servicio;

import entidad.Raices;
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

public class ServicioRaices {

    Scanner leer = new Scanner(System.in);
    Raices r = new Raices();

    public Raices creaRaices() {
        System.out.println("a=");
        r.setA(leer.nextInt());
        System.out.println("b=");
        r.setB(leer.nextInt());
        System.out.println("c=");
        r.setC(leer.nextInt());
        return r;
    }

    public void getDiscriminante(Raices r) {
        double discriminante = (Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC()));
        r.setDiscriminante(discriminante);
    }

    public boolean tieneRaices() {
        if (r.getDiscriminante() >= 0) {
            System.out.println("tiene raices");
            return true;
        } else {
            //System.out.println("no tiene raices");
            return false;
        }
    }

    public boolean tieneRaiz() {
        if (r.getDiscriminante() == 0) {
            System.out.println("Tiene una unica raiz.");
            return true;
        } else {
            //System.out.println("no tiene raices");
            return false;
        }
    }

    public void obtenerRaices() {
        double raiz1 = ((-r.getB()) + (r.getDiscriminante())) / (2 * r.getA());
        System.out.println("raiz1:" + raiz1);
        double raiz2 = ((-r.getB()) - (r.getDiscriminante())) / (2 * r.getA());
        System.out.println("raiz2:" + raiz2);
    }

    public void obtenerRaiz() {
        double raizUnica = ((-r.getB()) / (2 * r.getA()));
        System.out.println("unica raiz:" + raizUnica);
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("no tiene soluciones");
        }
    }
}
