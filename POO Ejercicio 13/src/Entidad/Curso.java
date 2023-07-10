package Entidad;

import java.util.Arrays;


public class Curso {
    private String nombreCurso;
    private int cantHorasxDias;
    private int cantDiasxSemana;
    private String turno;
    private double precioHora;
    private String[] alumnos= new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, int cantHorasxDias, int cantDiasxSemana, String turno, double precioHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantHorasxDias = cantHorasxDias;
        this.cantDiasxSemana = cantDiasxSemana;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantHorasxDias() {
        return cantHorasxDias;
    }

    public void setCantHorasxDias(int cantHorasxDias) {
        this.cantHorasxDias = cantHorasxDias;
    }

    public int getCantDiasxSemana() {
        return cantDiasxSemana;
    }

    public void setCantDiasxSemana(int cantDiasxSemana) {
        this.cantDiasxSemana = cantDiasxSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", cantHorasxDias=" + cantHorasxDias + ", cantDiasxSemana=" + cantDiasxSemana + ", turno=" + turno + ", precioHora=" + precioHora + ", alumnos=" + Arrays.toString(alumnos) + '}';
    }

    
    

}
