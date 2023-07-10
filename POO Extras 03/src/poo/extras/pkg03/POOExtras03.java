package poo.extras.pkg03;

import entidad.Raices;
import servicio.ServicioRaices;

public class POOExtras03 {

    public static void main(String[] args) {
        ServicioRaices sr = new ServicioRaices();
        Raices r = sr.creaRaices();
        sr.getDiscriminante(r);
        sr.calcular();
    }

}
