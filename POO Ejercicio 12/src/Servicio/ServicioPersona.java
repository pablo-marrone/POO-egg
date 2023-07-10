package Servicio;

import Entidad.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona p = new Persona();
        System.out.println("Ingrese el Nombre.");
        p.setNombre(leer.nextLine());
        System.out.println("Ingrese la fecha de nacimiento: ");
        System.out.println("Día: ");
        int dia = leer.nextInt();
        System.out.println("Mes: ");
        int mes = leer.nextInt();
        System.out.println("Año: ");
        int anio = leer.nextInt();
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        p.setFechaNacimiento(fecha);
        return p;
    }

    public int calcularEdad(Persona p) {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(p.getFechaNacimiento(), fechaActual);
        int edad = periodo.getYears();
        //System.out.println("la Edad es: " + edad);
        return edad;
    }

    public boolean menorQue(Persona p, int anios) {
        return calcularEdad(p) < anios;
    }
    
    public void mostrarPersona(Persona p){
        System.out.println(p);
    }
}
