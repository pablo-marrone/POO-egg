package poo.ejercicio.pkg06;

import Entidad.Cafetera;
import Servicios.ServiciosCafetera;
import java.util.Scanner;

public class POOEjercicio06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ServiciosCafetera servC = new ServiciosCafetera();
        Cafetera c = servC.crearCafetera();

        System.out.println(" 1 llenar Cafetera. "
                + " 2 Servir taza. "
                + " 3 Vaciar Cafetera. "
                + " 4 Agregar Cafe. "
                + " 5 Consulte cuanto cafe queda. "
                + " 0 Salir. ");
        int opcion = leer.nextInt();
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    servC.llenarCafetera(c);
                    break;
                case 2:
                    servC.servirTaza(c);
                    break;
                case 3:
                    servC.vaciarCafetera(c);
                    break;
                case 4:
                    servC.agregarCafe(c);
                    break;
                case 5:
                    servC.cuantoCafe(c);
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
            if (opcion != 0) {
                System.out.println("Ingrese la opcion nuevamente.");
                opcion = leer.nextInt();
            } else {
                System.out.println("Hasta luego");;
            }
        }
        System.out.println("Hasta luego.");
    }

}
