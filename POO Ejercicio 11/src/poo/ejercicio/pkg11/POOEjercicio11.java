package poo.ejercicio.pkg11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class POOEjercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Día: ");
        int dia = leer.nextInt();
        System.out.println("Mes: ");
        int mes = leer.nextInt();
        System.out.println("Año: ");
        int anio = leer.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);
        System.out.println(fecha);
        Date fechaActual = new Date();
        System.out.println(fechaActual);
    }
}
