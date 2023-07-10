package entidad;

public class Meses {

    private String[] mesAnio;
    private String mesSecreto;

    public Meses() {
    }

    public Meses(String[] mesAnio, String mesSecreto) {
        this.mesAnio = mesAnio;
        this.mesSecreto = mesSecreto;
    }

    public String[] getMesAnio() {
        return mesAnio;
    }

    public void setMesAnio(String[] mesAnio) {
        this.mesAnio = mesAnio;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

}
