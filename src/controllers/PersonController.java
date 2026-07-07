package controllers;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Persona;
public class PersonController {
    public Set<Persona> filtrarYOrdenar(List<Persona> personas, int umbral ){
        Set<Persona> filtro = new TreeSet<>(
            (c1,c2) ->{
                int compE = Integer.compare(c2.getEdad(),c1.getEdad());
                if(compE!=0)
                    return compE; 
                int compN = c1.getNombre().compareToIgnoreCase(c2.getNombre());
                return compN;
            }
        );
        for(Persona personF:personas){
            if(personF.getEdad() >= umbral){
                filtro.add(personF);
            }
        }
        return filtro;
    }

    public Map<String,Set<String>> agruparPorEdad(List<Persona> personas){
        Map<String,Set<String>> mapa = new TreeMap<>();
        Set<String> joven = new LinkedHashSet<>();
        Set<String> adulto = new LinkedHashSet<>();
        Set<String> mayor = new LinkedHashSet<>();
        for(Persona persona: personas){
        String[] nombreCompleto = persona.getNombre().split(" ");
        String nombre = nombreCompleto[0];
           if(persona.getEdad() < 30){
                joven.add(nombre);
           }else if(persona.getEdad() >= 30 && persona.getEdad()<60){
                adulto.add(nombre);
           }else{
                mayor.add(nombre);
           }

        }
        mapa.put("JOVEN", joven);
        mapa.put("ADULTO", adulto);
        mapa.put("MAYOR", mayor);
        return mapa;
    }
}
