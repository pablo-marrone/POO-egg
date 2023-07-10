package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona p = new Persona();
        System.out.println("Nombre.");
        p.setNombre(leer.next());
        System.out.println("Edad:");
        p.setEdad(leer.nextInt());
        System.out.println("Sexo (H-> hombre. M-> mujer. O-> otro");
        String sexo = leer.next().toLowerCase();
        while (!sexo.equals("h") && !sexo.equals("m") && !sexo.equals("o")) {
            System.out.println("El dato ingresado es incorrecto");
            sexo = leer.next().toLowerCase();
        }
        System.out.println("Peso.");
        p.setPeso(leer.nextDouble());
        System.out.println("Altura.");
        p.setAltura(leer.nextDouble());
        return p;
    }

    public int calcularIMC(Persona p) {
        double pesoIdeal = p.getPeso() / (Math.pow(p.getAltura(), 2));
        if (pesoIdeal < 20) {
            return -1;
        } else if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(Persona p) {
        return p.getEdad() >= 18;
        //el ide propuso esto a cambio de un if
    }
    
}
