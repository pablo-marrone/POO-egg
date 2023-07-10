package poo.extras.pkg05;

import entidad.Meses;
import servicio.ServicioMeses;

public class POOExtras05 {

    public static void main(String[] args) {
        ServicioMeses sm = new ServicioMeses();
        Meses m = sm.crearMeses();
        sm.adivinarMes(m);
    }
}
