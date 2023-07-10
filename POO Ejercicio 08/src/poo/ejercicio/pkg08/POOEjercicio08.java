package poo.ejercicio.pkg08;

import Entidad.Cadena;
import Servicios.ServicioCadena;


public class POOEjercicio08 {

    public static void main(String[] args) {
        
        ServicioCadena sc = new ServicioCadena();
        Cadena c = sc.crearCadena();
        System.out.println(c.toString());
        sc.mostrarVocales(c);
        sc.invertirFrase(c);
        sc.vecesRepetido(c);
        sc.compararLongitud(c);
        sc.unirFrases(c);
        sc.reemplazar(c);
        sc.contiene(c);
    }
}
