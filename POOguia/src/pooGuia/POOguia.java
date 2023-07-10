package pooGuia;

import Entidad.Persona;
import java.util.Scanner;

public class POOguia {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona primerPersona = new Persona();

        Persona segundaPersona = new Persona("Pedro ", " 25.015.654 ", 45);

        System.out.println(segundaPersona.nombre + segundaPersona.DNI + segundaPersona.edad);
        
        primerPersona.setNombre("Pablo");
        segundaPersona.getDNI();
        
        System.out.println(primerPersona.toString());
        System.out.println(segundaPersona.toString());
        
    }

}
