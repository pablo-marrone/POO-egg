package poo.ejercicio.pkg12;

import Entidad.Persona;
import Servicio.ServicioPersona;

public class POOEjercicio12 {

    public static void main(String[] args) {
        ServicioPersona sp = new ServicioPersona();
        Persona p = sp.crearPersona();
        System.out.println("Edad: " + sp.calcularEdad(p));
        System.out.println(sp.menorQue(p, 18));
        sp.mostrarPersona(p);
    }
}
