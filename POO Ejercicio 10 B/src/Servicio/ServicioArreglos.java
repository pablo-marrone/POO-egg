package Servicio;

import Entidad.Arreglos;
import java.util.Arrays;

public class ServicioArreglos {

    public Arreglos crearArreglos() {
        Arreglos a = new Arreglos();

        double[] primero = new double[50];
        double[] segundo = new double[20];
        for (int i = 0; i < 50; i++) {
            primero[i] = Math.random() * 10;
        }
        a.setArregloA(primero);
        imprimirArreglo(a.getArregloA());
        Arrays.sort(a.getArregloA());
        System.arraycopy(primero, 0, segundo, 0, 10);
        for (int i = 10; i < 20; i++) {
            segundo[i] = 0.5;
        }
        a.setArregloB(segundo);
        imprimirArreglo(a.getArregloB());
        
        return a;
    }

    public void imprimirArreglo(double arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(" " + (i + 1) + "[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
}
