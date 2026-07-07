package controllers;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import models.Envio;

public class EnvioController {
    public Set<Envio> filtradoYOrdenado(List<Envio> envios,double pesoMinimo){
        Set<Envio> ordenado = new TreeSet<>(
            (c1,c2) -> {
                if(c1.getPeso() == c2.getPeso() && c1.getCodigoRastreo().equalsIgnoreCase(c2.getCodigoRastreo())){
                    return 0;
                }
                int compP = Double.compare(c2.getPeso(),c1.getPeso());
                if(compP != 0){
                    return compP;
                }
                return c1.getCiudadDestino().compareToIgnoreCase(c2.getCiudadDestino());
            }
        );
        for(Envio envio: envios){
            if(envio.getPeso() >= pesoMinimo){
                ordenado.add(envio);
            }
        }
         return ordenado;

    }
}
