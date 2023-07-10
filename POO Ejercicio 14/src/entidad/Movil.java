package entidad;

import java.util.Arrays;

public class Movil {

    private String marca;
    private double precio;
    private String modelo;
    private int memRam;
    private int almacenamiento;
    private int[] codigo;

    public Movil() {
    }

    public Movil(String marca, double precio, String modelo, int memRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memRam = memRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemRam() {
        return memRam;
    }

    public void setMemRam(int memRam) {
        this.memRam = memRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Movil{" + "marca= " + marca + ", precio= $" + precio + ", modelo= " + modelo + ", memoria Ram= " + memRam + ", almacenamiento= " + almacenamiento + ", codigo= " + Arrays.toString(codigo) + '}';
    }

}
