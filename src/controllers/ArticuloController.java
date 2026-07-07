package controllers;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import models.Articulo;

public class ArticuloController {
    public Map<String, Set<String>> ordenarPorPasillo(List<Articulo> articulos){
        Map<String,Set<String>> filtro = new TreeMap<>();
        for(Articulo articulo:articulos){
                // 1. Extraemos el primer nombre ("Martillo De Uña" -> "Martillo")
                String articuloName = articulo.getNombreCompleto().split(" ")[0];
                
                // 2. Obtenemos el código del pasillo (ej: "PASILLO-C")
                String pasillo = articulo.getCodigoPasillo();
                
                // 3. ASIGNACIÓN DINÁMICA: Si el pasillo no existe en el mapa, lo creamos en el acto
                if(!filtro.containsKey(pasillo)){
                    filtro.put(pasillo, new LinkedHashSet<>());
                }
                
                // 4. Recuperamos el Set de ese pasillo y le añadimos el nombre del artículo
                filtro.get(pasillo).add(articuloName);
            }
        return filtro;
    }
}
