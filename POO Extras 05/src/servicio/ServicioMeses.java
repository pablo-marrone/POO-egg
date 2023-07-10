package servicio;

import entidad.Meses;
import java.util.Scanner;

public class ServicioMeses {

    Scanner leer = new Scanner(System.in);
    Meses m = new Meses();

    public Meses crearMeses() {
        String[] anio = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        m.setMesAnio(anio);
        m.setMesSecreto(anio[(int) (Math.random() * 10)]);
        return m;
    }

    public void adivinarMes(Meses m) {
        System.out.println("Uno de los doce meses fue asignado para que lo adivines. Intentalo. ");
        String respuesta;
        int cont = 0;
        do {
            respuesta = leer.next();
            cont += 1;
            if (!respuesta.equalsIgnoreCase(m.getMesSecreto())) {
                System.out.println("Ah, fallaste.");
            }
        } while (!respuesta.equalsIgnoreCase(m.getMesSecreto()));
        System.out.println("Lo lograste, la respuesta era '" + m.getMesSecreto() + "'");
        System.out.println("Y te tomo " + cont + " intento/s.");
    }

}
