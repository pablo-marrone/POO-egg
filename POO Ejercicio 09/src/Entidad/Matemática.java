package Entidad;

public class Matemática {

    private double numero1;
    private double numero2;
    private double mayor;
    private double menor;

    public Matemática() {
    }

    public Matemática(double numero1, double numero2, double mayor, double menor) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.mayor = mayor;
        this.menor = menor;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getMayor() {
        return mayor;
    }

    public void setMayor(double mayor) {
        this.mayor = mayor;
    }

    public double getMenor() {
        return menor;
    }

    public void setMenor(double menor) {
        this.menor = menor;
    }

    @Override
    public String toString() {
        return "Matem\u00e1tica{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
}
