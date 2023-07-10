package Servicio;

import Entidad.Matemática;
import java.util.Scanner;

public class ServicioMatemática {

    Scanner leer = new Scanner(System.in);

    public Matemática crearMatemática() {
        Matemática m = new Matemática();
        m.setNumero1(Math.random() * 10);
        m.setNumero2(Math.random() * 10);
        m.setMayor(Math.max(m.getNumero1(), m.getNumero2()));
        m.setMenor(Math.min(m.getNumero1(), m.getNumero2()));
        return m;
    }

    public void devolverMayor(Matemática m) {
        System.out.println("El mayor entre ambos numeros es " + m.getMayor());
    }

    public void calcularPotencia(Matemática m) {
        double mayorRedondeado = Math.round(m.getMayor());
        double menorRedondeado = Math.round(m.getMenor());
        double potencia = Math.pow(mayorRedondeado, menorRedondeado);
        System.out.println("la potencia de " + mayorRedondeado + " elevado a " + menorRedondeado + " es: " + potencia);
    }

    public void calcularRaiz(Matemática m) {
        double raiz2 = Math.sqrt(Math.abs(m.getMenor()));
        System.out.println("La raiz cuadrada del valor absoluto de " + m.getMenor() + " es de " + raiz2);
    }
}
