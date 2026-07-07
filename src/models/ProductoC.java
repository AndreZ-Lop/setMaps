package models;

public class ProductoC {
    private String codigo; // Ejemplo: "PROD-502"
    private double precio; // Ejemplo: 120.50

    public ProductoC(String codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }
}