package Servicio;

import Entidad.Curso;
import java.util.Scanner;

public class ServicioCurso {

    Scanner leer = new Scanner(System.in).useDelimiter("\\n");

    Curso c = new Curso();

    public String[] cargarAlumnos() {
        System.out.println("Ingrese el nombre de los alumnos: ");
        String[] alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            alumnos[i] = leer.next();
        }
        return alumnos;
    }

    public Curso crearCurso() {
        System.out.println("Nombre del Curso: ");
        c.setNombreCurso(leer.nextLine());
        System.out.println("Cuantas horas por día? ");
        c.setCantHorasxDias(leer.nextInt());
        System.out.println("Cuantos dias a la semana?");
        c.setCantDiasxSemana(leer.nextInt());
        System.out.println("Turno Mañana (M) o Turno Tarde (T)");
        String turno = "";
        do {
            turno = leer.next();
            if (!turno.equalsIgnoreCase("M") && !turno.equalsIgnoreCase("T")) {
                System.out.println("ingreso invalido. Intente de nuevo.");
            }
        } while (!turno.equalsIgnoreCase("M") && !turno.equalsIgnoreCase("T"));
        c.setTurno(turno);
        System.out.println("Precio por hora de cursada?");
        c.setPrecioHora(leer.nextDouble());
        c.setAlumnos(cargarAlumnos());
        return c;
    }

    public void calcularGanancias() {
        double gananciasSemanales;
        gananciasSemanales = c.getCantHorasxDias() * c.getCantDiasxSemana() * c.getPrecioHora();
        System.out.println("El costo del curso por semana sera de :$" + gananciasSemanales);
    }

    public void mostrarCurso(Curso c) {
        System.out.println("Curso: " + c.getNombreCurso());
        String[] alumnos = c.getAlumnos();
        System.out.println("Alumnos: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("alumno " + (i + 1) + " " + alumnos[i]);
        }
        System.out.println("Cantidad de horas por dia: " + c.getCantHorasxDias());
        System.out.println("Cantidad de dias a la semana: " + c.getCantDiasxSemana());
        if (c.getTurno().equals("m")) {
            System.out.println("Turno: Mañana");
        } else {
            System.out.println("Turno: Tarde");
        }
        System.out.println("Precio por hora de curso: " + c.getPrecioHora());
    }

}


