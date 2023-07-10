package actividad.extra.pkg2;

import Entidad.Pelicula;
import Servicios.ServicioPelicula;


public class ActividadExtra2 {

    public static void main(String[] args) {
        Pelicula[] peliculas= new Pelicula[5];
        
        ServicioPelicula sp = new ServicioPelicula();
        for (int i = 0; i < 5; i++) {
            peliculas[i]=sp.crearPelicula();
        }   
    }
}
