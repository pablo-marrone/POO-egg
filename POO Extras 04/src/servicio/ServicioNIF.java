package servicio;

import entidad.NIF;
import java.util.Scanner;

public class ServicioNIF {

    Scanner leer = new Scanner(System.in);
    NIF nif = new NIF();

    public NIF crearNif() {
        System.out.println("ingrese el DNI: ");
        nif.setDni(leer.nextLong());
        return nif;
    }

    public void calcularLetra() {
        long posicion = nif.getDni() % 23;
        String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
        char[] tabla;
        tabla = cadena.toCharArray();
        for (int i = 0; i < 23; i++) {
            if (posicion == i) {
                nif.setNif(tabla[i]);
            }
        }
    }

    public void mostrar() {
        calcularLetra();
        System.out.println("NIF: " + nif.getDni() + "-" + nif.getNif());
    }
}
