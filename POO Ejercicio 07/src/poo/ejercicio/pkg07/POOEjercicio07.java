package poo.ejercicio.pkg07;

import Entidad.Persona;
import Servicio.ServicioPersona;

public class POOEjercicio07 {

    public static void main(String[] args) {
        ServicioPersona sp = new ServicioPersona();
        System.out.println("Ingrese los datos de la primer persona");
        Persona persona1 = sp.crearPersona();
        System.out.println("Ingrese los datos de la segunda persona");
        Persona persona2 = sp.crearPersona();
        System.out.println("Ingrese los datos de la tercer persona");
        Persona persona3 = sp.crearPersona();
        System.out.println("Ingrese los datos de la cuarta persona");
        Persona persona4 = sp.crearPersona();

        int[] imc = new int[4];
        boolean[] edad = new boolean[4];

        imc[0] = sp.calcularIMC(persona1);
        imc[1] = sp.calcularIMC(persona2);
        imc[2] = sp.calcularIMC(persona3);
        imc[3] = sp.calcularIMC(persona4);

        edad[0] = sp.esMayorDeEdad(persona1);
        edad[1] = sp.esMayorDeEdad(persona2);
        edad[2] = sp.esMayorDeEdad(persona3);
        edad[3] = sp.esMayorDeEdad(persona4);

        int bajoPeso = 0;
        int buenPeso = 0;
        int sobrePeso = 0;

        int mayorEdad = 0;
        int menorEdad = 0;

        for (int i = 0; i < 4; i++) {
            switch (imc[i]) {
                case -1:
                    bajoPeso += 1;
                    break;
                case 0:
                    buenPeso += 1;
                    break;
                case 1:
                    sobrePeso += 1;
                default:
                    break;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (edad[i] == true) {
                mayorEdad += 1;
            } else {
                menorEdad += 1;
            }
        }

        System.out.println("Porcentaje de gente con bajo peso: ");
        System.out.println((bajoPeso * 100 / 4) + "%");
        System.out.println("Porcentaje de gente con buen peso: ");
        System.out.println((buenPeso * 100 / 4) + "%");
        System.out.println("Porcentaje de gente con sobre peso: ");
        System.out.println((sobrePeso * 100 / 4) + "%");

        System.out.println("Porcentaje de mayores de edad :");
        System.out.println((mayorEdad * 100 / 4) + "%");
        System.out.println("Porcentaje de menores de edad :");
        System.out.println((menorEdad * 100 / 4) + "%");
    }
}
