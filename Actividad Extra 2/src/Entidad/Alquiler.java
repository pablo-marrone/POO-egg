package Entidad;

import java.util.Date;


public class Alquiler {
    private Pelicula pelicula;
    private Date inicio;
    private Date fin;
    private double precio;

    public Alquiler() {
    }

    public Alquiler(Pelicula pelicula, Date inicio, Date fin, double precio) {
        this.pelicula = pelicula;
        this.inicio = inicio;
        this.fin = fin;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    

}
