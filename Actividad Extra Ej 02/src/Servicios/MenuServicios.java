package Servicios;

import Entidades.Circulo;
import Entidades.Cuadrado;
import Entidades.Hexagono;
import Entidades.Pentagono;
import Entidades.Rectangulo;
import Entidades.Rombo;
import Entidades.Triangulo;
import java.util.Scanner;

public class MenuServicios {

    Scanner leer = new Scanner(System.in);

    public void menu() {
        System.out.println("Ingrese el numero correspondiente a la figura geometrica: "
                + " 1. Cuadrado -"
                + " 2. Rectangulo -"
                + " 3. Traingulo equilatero -"
                + " 4. Circulo -"
                + " 5. Hexagono -"
                + " 6. Pentagono -"
                + " 7. Rombo -"
                + " 0. Salir del Programa -");
        String continuar = "s";
        int opcion = leer.nextInt();
        while (opcion != 0 && continuar.equals("s")) {
            switch (opcion) {
                case 1:
                    CuadradoSV cuadS = new CuadradoSV();
                    Cuadrado c = cuadS.crearCuadrado();
                    cuadS.perimetro(c);
                    cuadS.area(c);
                    System.out.println("Continuar? s/n");
                    continuar = leer.next();
                    break;
                case 2:
                    RectanguloSV recS = new RectanguloSV();
                    Rectangulo r = recS.crearRectangulo();
                    recS.perimetro(r);
                    recS.area(r);
                    System.out.println("Continuar? s/n");
                    continuar = leer.next();
                    break;
                case 3:
                    TrianguloSV triS = new TrianguloSV();
                    Triangulo t = triS.crearTriangulo();
                    triS.perimetro(t);
                    triS.area(t);
                    System.out.println("Continuar? s/n");
                    continuar = leer.next();
                    break;
                case 4:
                    CirculoSV cirS = new CirculoSV();
                    Circulo circ = cirS.crearCirculo();
                    cirS.perimetro(circ);
                    cirS.area(circ);
                    System.out.println("Continuar? s/n");
                    continuar = leer.next();
                    break;
                case 5:
                    HexagonoSV hexS = new HexagonoSV();
                    Hexagono h = hexS.crearHexagono();
                    hexS.perimetro(h);
                    hexS.area(h);
                    System.out.println("Continuar? s/n");
                    continuar = leer.next();
                    break;
                case 6:
                    PentagonoSV penS = new PentagonoSV();
                    Pentagono p = penS.crearPentagono();
                    penS.perimetro(p);
                    penS.area(p);
                    System.out.println("Continuar? s/n");
                    continuar = leer.next();
                    break;
                case 7:
                    RomboSV romS = new RomboSV();
                    Rombo ro = romS.crearRombo();
                    romS.perimetro(ro);
                    romS.area(ro);
                    System.out.println("Continuar? s/n");
                    continuar = leer.next();
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    System.out.println("Continuar? s/n");
                    continuar = leer.next();
                    break;
            }
            if (continuar.equals("s") && opcion != 0) {
                System.out.println("Ingrese la opcion nuevamente.");
                opcion = leer.nextInt();
            } else {
                System.out.println("Hasta luego");;
            }
        }
    }
}
