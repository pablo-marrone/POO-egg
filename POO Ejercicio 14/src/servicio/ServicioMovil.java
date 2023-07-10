package servicio;

import entidad.Movil;
import java.util.Scanner;

public class ServicioMovil {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Movil m = new Movil();

    public Movil cargarCelular() {
        System.out.println("Marca: ");
        m.setMarca(leer.nextLine());
        System.out.println("Precio: $");
        m.setPrecio(leer.nextDouble());
        System.out.println("Modelo: ");
        leer.nextLine();
        m.setModelo(leer.nextLine());
        System.out.println("Cantidad de memoria RAM: ");
        m.setMemRam(leer.nextInt());
        System.out.println("Cantidad de almacenamiento: ");
        m.setAlmacenamiento(leer.nextInt());
        return m;
    }

    public void ingresarCodigo(Movil m) {
        System.out.println("Ingrese el codigo completo del Movil");
        int[] codigo = new int[7];
        for (int i = 0; i < 7; i++) {
            codigo[i] = leer.nextInt();
        }
        m.setCodigo(codigo);
    }

    public void muestra(Movil m) {
        System.out.println(m.toString());
    }

}
