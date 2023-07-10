package Servicio;

import Entidad.Vehiculo;
import java.util.Scanner;

public class VehiculoServicio {

    Scanner leer = new Scanner(System.in);

    public Vehiculo crearVehiculo() {
        Vehiculo v1 = new Vehiculo();
        System.out.println("Ingrese los datos");
        System.out.println("Marca: ");
        v1.setMarca(leer.next());
        System.out.println("Modelo");
        v1.setModelo(leer.next());
        System.out.println("Año");
        v1.setAño(leer.nextInt());
        System.out.println("Tipo");
        v1.setTipo(leer.next());
        return v1;
    }

    public int tiempo() {
        System.out.println("Ingrese el tiempo con el cual calcular (en segundos)");
        int segundos = leer.nextInt();
        return segundos;
    }

    public void moverse(Vehiculo v1, int segundos) {
        int distancia;
        switch (v1.getTipo().toLowerCase()) {
            case "bicicleta":
                distancia = 1 * segundos;
                System.out.println("Se dezplazo " + distancia + " metros");
                break;
            case "motocicleta":
                distancia = 2 * segundos;
                System.out.println("Se dezplazo " + distancia + " metros");
                break;
            case "automovil":
                distancia = 3 * segundos;
                System.out.println("Se dezplazo " + distancia + " metros");
                break;
            default:
                System.out.println("tipo de vehiculo equivocado");
        }
    }
    public void frenar(Vehiculo v1, int segundos){
        int distanciaTotal;
        switch (v1.getTipo().toLowerCase()) {
            case "bicicleta":
                distanciaTotal=1*segundos;
                System.out.println("Se dezplazo " + distanciaTotal + " metros");
                break;
            case "motocicleta":
                distanciaTotal = 2 * segundos + 2;
                System.out.println("Se dezplazo " + distanciaTotal + " metros");
                break;
            case "automovil":
                distanciaTotal = 3 * segundos + 2;
                System.out.println("Se dezplazo " + distanciaTotal + " metros");
                break;
            default:
                System.out.println("tipo de vehiculo equivocado");
        }
    }
    
}
