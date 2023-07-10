package Servicio;

import Entidad.Cuenta;
import com.sun.org.apache.xml.internal.security.c14n.helper.C14nHelper;
import java.util.Scanner;

public class Datos {

    Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta() {
        Cuenta c1 = new Cuenta();
        System.out.println("Ingrese el numero de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI del cliente");
        c1.setDni(leer.nextLong());
        System.out.println("Ingrese el saldo actual");
        c1.setSaldoActual(leer.nextDouble());
        return c1;
    }

    public Cuenta ingresar(Cuenta c1) {
        System.out.println("Cantidad a ingresar");
        double ingreso = leer.nextDouble();
        c1.setSaldoActual(c1.getSaldoActual() + ingreso);
        return c1;
    }

    public Cuenta retirar(Cuenta c1) {
        System.out.println("Cantidad a retirar");
        double retiro = leer.nextDouble();
        c1.setSaldoActual(c1.getSaldoActual() - retiro);
        return c1;
    }

    public Cuenta extraccionRapida(Cuenta c1) {
        System.out.println("Cuanto desea extraer? *Recuerde extraer menos del 20% de su saldo");
        double extraccion = leer.nextDouble();
        double extPermitida = (c1.getSaldoActual() / 100) * 20;
        if (extraccion > extPermitida) {
            System.out.println("No tiene permitido una extraccion superior al 20% de su saldo.");
            return c1;
        } else {
            System.out.println("Retirando " + extraccion);
            c1.setSaldoActual(c1.getSaldoActual() - extraccion);
            return c1;
        }
    }

    public void consultarSaldo(Cuenta c1) {
        System.out.println("Su saldo actual es de ");
        System.out.println(c1.getSaldoActual());
    }

    public void consultarDatos(Cuenta c1) {
        System.out.println(c1.toString());
    }

}
