package controllers;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Ticket;

public class TicketController {
    public static Set<Ticket> filtrarYOrdenar(List<Ticket> tickets,int prioridadMinima){
        Set<Ticket> ordenadoYFiltrado = new TreeSet<>(
            (c1,c2) -> {
                if (c1.getCodigo().equalsIgnoreCase(c2.getCodigo()) && c1.getPrioridad() == c2.getPrioridad()){
                    return 0;
                }
                int compP  = Integer.compare(c2.getPrioridad(), c1.getPrioridad());
                if(compP != 0 ){
                    return compP;
                }
                return c1.getTecnico().compareToIgnoreCase(c2.getTecnico());
            }
        );
        for(Ticket ticket : tickets){
            if(ticket.getPrioridad() >= prioridadMinima){
                ordenadoYFiltrado.add(ticket);
            }
        }
        return ordenadoYFiltrado;
    }

    public static Map<String,Set<String>> agruparCodigoPorPrioridad(List<Ticket> tickets){
        Map<String,Set<String>> agrupado = new TreeMap<>();

        agrupado.put("ALTA", new TreeSet<String>());
        agrupado.put("MEDIA", new TreeSet<String>());
        agrupado.put("BAJA", new TreeSet<String>());

         for(Ticket ticket:tickets){
            String numero = ticket.getCodigo().split("-")[1];
            if(ticket.getPrioridad() == 1){
               agrupado.get("BAJA").add(numero);
            }else if(ticket.getPrioridad() > 1 && ticket.getPrioridad() <=3){
                agrupado.get("MEDIA").add(numero);
            }else if(ticket.getPrioridad() >=4){
                agrupado.get("ALTA").add(numero);
            }
        }
        return agrupado;
    }
}
