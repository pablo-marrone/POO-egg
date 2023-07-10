package poo.ejercicio.pkg13;

import Entidad.Curso;
import Servicio.ServicioCurso;

public class POOEjercicio13 {

    public static void main(String[] args) {
        ServicioCurso sc = new ServicioCurso();
        Curso c = sc.crearCurso();
        sc.mostrarCurso(c);
        sc.calcularGanancias();
    }

}
