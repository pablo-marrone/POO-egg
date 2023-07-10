package poo.ejercicio.pkg04;

import Entidad.Rectangulo;
import Servicio.RectanguloServicio;

public class POOEjercicio04 {

    public static void main(String[] args) {
        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo r1 = rs.crearRectangulo();
        rs.perimetro(r1);
        rs.area(r1);
        rs.dibujo(r1);
    }
}
