package models;

public class Envio {
    private String codigoRastreo;
    private double peso;
    private String ciudadDestino;
    
    public Envio(String codigoRastreo, double peso, String ciudadDestino) {
        this.codigoRastreo = codigoRastreo;
        this.peso = peso;
        this.ciudadDestino = ciudadDestino;
    }
    public String getCodigoRastreo() {
        return codigoRastreo;
    }
    public void setCodigoRastreo(String codigoRastreo) {
        this.codigoRastreo = codigoRastreo;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getCiudadDestino() {
        return ciudadDestino;
    }
    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    
}
