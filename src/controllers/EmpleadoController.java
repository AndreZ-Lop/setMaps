package controllers;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import models.Empleado;

public class EmpleadoController {
    public Set<Empleado> procesarAtletas(List<Empleado> atletas, int puntajeMinimo){
        Set<Empleado> atletasFiltro = new TreeSet<>(
            (c1,c2) -> {
                int compD = c1.getDisciplina().compareToIgnoreCase(c2.getDisciplina());
                if(compD != 0)
                    return compD;
                int compP = Integer.compare(c2.getPuntaje(), c1.getPuntaje());
                return compP;
            }
        );

        for(Empleado emple:atletas){
            if(emple.getPuntaje() >= puntajeMinimo){
                atletasFiltro.add(emple);
            }
        }

        return atletasFiltro;

    }
}
