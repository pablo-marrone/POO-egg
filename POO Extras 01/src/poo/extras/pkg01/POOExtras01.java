package poo.extras.pkg01;

import entidad.Canción;


public class POOExtras01 {

    public static void main(String[] args) {
        Canción c = new Canción();
        c.crearCanción();
        c.mostrarCancion(c);
    }

}
