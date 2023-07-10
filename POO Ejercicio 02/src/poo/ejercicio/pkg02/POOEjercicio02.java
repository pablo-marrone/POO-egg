package poo.ejercicio.pkg02;

import Entidades.Circunferencia;
import Servicios.Calculos;

public class POOEjercicio02 {

    public static void main(String[] args) {
        Calculos calc = new Calculos();
        Circunferencia circulo = calc.crearCircunferencia();
        calc.area(circulo);
        calc.perimetro(circulo);
    }
}
