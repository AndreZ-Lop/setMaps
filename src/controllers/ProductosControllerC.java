package controllers;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.ProductoC;

public class ProductosControllerC {
    public Map<String,Set<Integer>> agruparCodigosPorCategoria(List<ProductoC> productos){
        Map<String,Set<Integer>> agrupado = new TreeMap<>();
        int codigo = 0;
        String categoria = "";
        for(ProductoC producto:productos){
            codigo = Integer.parseInt(producto.getCodigo().split("-")[1]);
            if(producto.getPrecio() < 20){
                categoria = "ACCESIBLE";
            }else if(producto.getPrecio()>=20 && producto.getPrecio() < 100){
                categoria = "ESTADAR";
            }else if(producto.getPrecio() >= 100){
                categoria = "PREMIUM";
            }
            if(!agrupado.containsKey(categoria)){
                agrupado.put(categoria, new TreeSet<>());
            }
            agrupado.get(categoria).add(codigo);
        }
        return agrupado;
    }
}
