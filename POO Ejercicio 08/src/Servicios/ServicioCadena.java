package Servicios;

import Entidad.Cadena;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.Scanner;

public class ServicioCadena {

    Scanner leer = new Scanner(System.in).useDelimiter("\\n");

    public Cadena crearCadena() {
        Cadena c = new Cadena();
        System.out.println("Escriba una frase.");
        c.setFrase(leer.nextLine());
        c.setLongitud(c.getFrase().length());
        return c;
    }

    public void mostrarVocales(Cadena c) {
        int vocales = 0;
        int vocalA = 0;
        int vocalE = 0;
        int vocalI = 0;
        int vocalO = 0;
        int vocalU = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().substring(i, i + 1).equals("a") || c.getFrase().substring(i, i + 1).equals("A")) {
                vocales++;
                vocalA += 1;
            } else if (c.getFrase().substring(i, i + 1).equals("e") || c.getFrase().substring(i, i + 1).equals("E")) {
                vocales++;
                vocalE++;
            } else if (c.getFrase().substring(i, i + 1).equals("i") || c.getFrase().substring(i, i + 1).equals("I")) {
                vocales++;
                vocalI++;
            } else if (c.getFrase().substring(i, i + 1).equals("o") || c.getFrase().substring(i, i + 1).equals("O")) {
                vocales++;
                vocalO++;
            } else if (c.getFrase().substring(i, i + 1).equals("u") || c.getFrase().substring(i, i + 1).equals("U")) {
                vocales++;
                vocalU++;
            }
        }
        System.out.println("La frase tiene un total de " + vocales + " vocales");
        System.out.println("tiene " + vocalA + " veces la 'A'");
        System.out.println("tiene " + vocalE + " veces la 'E'");
        System.out.println("tiene " + vocalI + " veces la 'I'");
        System.out.println("tiene " + vocalO + " veces la 'O'");
        System.out.println("tiene " + vocalU + " veces la 'U'");
    }

    public void invertirFrase(Cadena c) {
        String cadenaInvertida = "";
        for (int i = c.getLongitud() - 1; i >= 0; i--) {
            cadenaInvertida += c.getFrase().charAt(i);
        }
        System.out.println(cadenaInvertida);
    }

    public void vecesRepetido(Cadena c) {
        System.out.println("caracter a bucar:");
        String repetido = leer.nextLine();
        int contador = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().substring(i, i + 1).equals(repetido)) {
                contador++;
            }
        }
        System.out.println("El caracter '" + repetido + "' se repite " + contador + " veces.");
    }

    public void compararLongitud(Cadena c) {
        System.out.println("Ingrese una nueva frase. ");
        String nuevaFrase = leer.nextLine();
        if (nuevaFrase.length() == c.getLongitud()) {
            System.out.println("Ambas frases tienen la misma longitud. ");
        } else if (nuevaFrase.length() > c.getLongitud()) {
            System.out.println("La nueva frase ingresada es mas larga que la anterior. ");
        } else {
            System.out.println("La frase anterior es mas larga que la nueva. ");
        }
    }

    public void unirFrases(Cadena c) {
        System.out.println("Ingrese frease para unir.");
        String unir = leer.nextLine();
        System.out.println("La frase completa es: ");
        System.out.println(c.getFrase().concat(" " + unir));
    }

    public void reemplazar(Cadena c) {
        System.out.println("Que letra desea cambiar?");
        char vieja = leer.nextLine().charAt(0);
        System.out.println("Por cual letra?");
        char nueva = leer.nextLine().charAt(0);
        System.out.println(c.getFrase().replace(vieja, nueva));
    }

    public void contiene(Cadena c) {
        System.out.println("Letra a buscar: ");
        char buscar = leer.nextLine().charAt(0);
        boolean existe = false;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().charAt(i) == buscar) {
                existe = true;
            }
        }
        System.out.println(existe);
    }
}
