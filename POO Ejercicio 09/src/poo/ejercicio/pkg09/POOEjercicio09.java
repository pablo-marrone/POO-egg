package poo.ejercicio.pkg09;

import Entidad.Matemática;
import Servicio.ServicioMatemática;

public class POOEjercicio09 {

    public static void main(String[] args) {
        ServicioMatemática sm = new ServicioMatemática();
        Matemática m = sm.crearMatemática();
        System.out.println(m.toString());
        sm.devolverMayor(m);
        sm.calcularPotencia(m);
        sm.calcularRaiz(m);
    }
}
