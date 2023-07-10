package poo.ejercicio.pkg05;

import Entidad.Cuenta;
import Servicio.Datos;

public class POOEjercicio05 {

    public static void main(String[] args) {
        Datos info = new Datos();
        Cuenta c1 = info.crearCuenta();
        info.ingresar(c1);
        info.consultarSaldo(c1);
        info.retirar(c1);
        info.consultarSaldo(c1);
        info.extraccionRapida(c1);
        info.consultarSaldo(c1);
        info.consultarDatos(c1);
    }
}
