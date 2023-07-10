package Entidades;

import java.util.Scanner;

public class Operacion {

    Scanner leer = new Scanner(System.in);

    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        System.out.println("Ingrese el primer numero");
        setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo numero");
        setNumero2(leer.nextInt());
    }

    public void sumar() {
        int suma = getNumero1() + getNumero2();
        System.out.println("La suma es " + suma);
    }

    public void restar() {
        int resta = getNumero1() - getNumero2();
        System.out.println("La resta es " + resta);
    }

    public void multiplicar() {
        int mult = getNumero1() * getNumero2();
        System.out.println("La multiplicacion es " + mult);
    }

    public void dividir() {
        if (numero2 == 0) {
            System.out.println("no se puede dividir por 0");
        } else {
            double div = getNumero1() / getNumero2();
            System.out.println("La division es " + div);
        }
    }
}
