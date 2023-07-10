package poo.extras.pkg04;

import servicio.ServicioNIF;

public class POOExtras04 {

    public static void main(String[] args) {
        ServicioNIF sn = new ServicioNIF();
        sn.crearNif();
        sn.mostrar();
    }

}
