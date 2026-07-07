package models;

public class Paquete {
    
    private String trackingCode; 
    private String ciudadDestino;
    private String region;
    private double peso;

    public Paquete(String trackingCode, String ciudadDestino, String region,double peso) {
        this.trackingCode = trackingCode;
        this.ciudadDestino = ciudadDestino;
        this.region = region;
        this.peso = peso;
    }
    
    
    public String getTrackingCode() {
        return trackingCode;
    }
    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }
    public String getCiudadDestino() {
        return ciudadDestino;
    }
    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }


    public String getRegion() {
        return region;
    }


    public void setRegion(String region) {
        this.region = region;
    }
    
    
}
