package Entidad;
//import java.util.Scanner;

public class Libro {
    //Scanner leer = new Scanner(System.in);
    public int isbn;
    public String título;
    public String autor;
    public int numeroPaginas;

    public Libro() {
    }

    public Libro(int isbn, String título, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.título = título;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;   
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", t\u00edtulo=" + título + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + '}';
    }

    

}
