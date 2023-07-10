package poo.ejercicio.pkg10;

import java.util.Arrays;

public class POOEjercicio10 {

    public static void main(String[] args) {
        //Arreglos a = new Arreglos();
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        for (int i = 0; i < 50; i++) {
            arregloA[i] = Math.random() * 10;
        }
        System.out.println("Arreglo A");
        imprimirArreglo(arregloA);

        Arrays.sort(arregloA);

        /*for (int i = 0; i < 10; i++) {
            arregloB[i]=arregloA[i];
        }*/
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        for (int i = 10; i < 20; i++) {
            arregloB[i] = 0.5;
        }
        System.out.println("Arreglo B");
        imprimirArreglo(arregloB);

    }

    public static void imprimirArreglo(double arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(" " + (i + 1) + "[" + arreglo[i] + "]");
        }
        System.out.println("");
    }

}
