package controllers;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Estudiantes;

public class EstudiantesController {
    public Map<String,Set<String>> agruparEstudiantesPorFacultad(List<Estudiantes> estudiantes){
        Map<String,Set<String>> agrupado = new TreeMap<>();

        agrupado.put("ING", new TreeSet<>());
        agrupado.put("MED", new TreeSet<>());
        agrupado.put("OTRAS", new TreeSet<>());

        for(Estudiantes estudiante: estudiantes){
            String id = estudiante.getRegistroAcademico().split("-")[1];
            if(estudiante.getCarrera().equalsIgnoreCase("medicina")){
                agrupado.get("MED").add(id);
            }else if(estudiante.getCarrera().equalsIgnoreCase("ingenieria")){
                agrupado.get("ING").add(id);
            }else{
                agrupado.get("OTRAS").add(id);
            }
        }

        return agrupado;
    }
}
