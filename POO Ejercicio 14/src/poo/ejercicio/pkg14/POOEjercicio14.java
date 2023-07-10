package poo.ejercicio.pkg14;

import entidad.Movil;
import servicio.ServicioMovil;

public class POOEjercicio14 {

    public static void main(String[] args) {
        ServicioMovil sm = new ServicioMovil();
        Movil m = sm.cargarCelular();
        sm.ingresarCodigo(m);
        sm.muestra(m);
        
    }

}
