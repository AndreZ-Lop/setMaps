package models;

public class Articulo {
    private String nombreCompleto;
    private String codigoPasillo;

    public Articulo(String nombreCompleto, String codigoPasillo) {
        this.nombreCompleto = nombreCompleto;
        this.codigoPasillo = codigoPasillo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCodigoPasillo() {
        return codigoPasillo;
    }

    public void setCodigoPasillo(String codigoPasillo) {
        this.codigoPasillo = codigoPasillo;
    }
    
    
}
