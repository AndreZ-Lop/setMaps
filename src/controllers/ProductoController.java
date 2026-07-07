package controllers;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import models.Producto;

public class ProductoController {
    public Set<Producto> filtrado(List<Producto> productos, double precioMinimo){
        Set<Producto> filtro = new TreeSet<>(
            (c1,c2) -> {
                int compPrecio = Double.compare(c2.getPrecio(),c1.getPrecio());
                if(compPrecio != 0)
                    return compPrecio;
                int compName = c1.getCodigo().compareToIgnoreCase(c2.getCodigo());
                return compName;
            }
        );
        for(Producto product: productos){
            if(product.getPrecio() >= precioMinimo){
                filtro.add(product);
            }
        }
        return filtro;
    }
}
