package entidad;

import java.util.Scanner;

public class Canción {
    private String titulo;
    private String autor;

    public Canción() {
    }

    public Canción(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Canción crearCanción(){
        Canción c = new Canción();
        Scanner leer = new Scanner(System.in);
        System.out.println("Titulo: ");
        setTitulo(leer.nextLine());
        System.out.println("Autor: ");
        setAutor(leer.nextLine());
        return c;
    }
    public void mostrarCancion(Canción c){
        System.out.println(c.toString());
    }

    @Override
    public String toString() {
        return "Canci\u00f3n{" + "titulo=" + titulo + ", autor=" + autor + '}';
    }

    
}
