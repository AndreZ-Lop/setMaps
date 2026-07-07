package controllers;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import models.Paquete;

public class PaqueteController {
    public Map<String,Set<String>> filtro(List<Paquete> paquetes){
        Map<String, Set<String>> filtrados = new TreeMap<>();

        Set<String> costa = new LinkedHashSet<>();
        Set<String> sierra = new LinkedHashSet<>();
        Set<String> oriente = new LinkedHashSet<>();
        for(Paquete pack: paquetes){
            String ciudad = pack.getCiudadDestino().split("-")[0];
            if(pack.getRegion().equalsIgnoreCase("costa")){
                costa.add(ciudad);
            }else if(pack.getRegion().equalsIgnoreCase("sierra")){
                sierra.add(ciudad);
            }else{
                oriente.add(ciudad);
            }
        }
        filtrados.put("COSTA", costa);
        filtrados.put("SIERRA", sierra);
        filtrados.put("ORIENTE", oriente);
        return filtrados;
    }
}
