import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import controllers.TicketController;
import models.Estudiante;
import models.Jugador;
import models.Ticket;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println(runEstudents());
        // System.out.println(runPlayers());
        // char[] entrada = {'a', 'b', 'c', 'a', 'd', 'b', 'e', 'a'};
        // System.out.println(runCharacters(entrada));
        // String [] palabrasUsuario = {"Hola", "Busco grupo", "Hola", "Alguien para mazmorra?"};
        // System.out.println(runWordsGame(palabrasUsuario));

        runAgrupar();
         runOrdenar();
    }

    private static void runAgrupar() {
        List<Ticket> tickets = new ArrayList<>();
        System.out.println("=========== ORDENADOS ===========");
        tickets. add (new Ticket ("TK-104", "Ana Torres", 5)) ;
        tickets. add (new Ticket ("TK-101","Luis Mora",2)) ;
        tickets. add (new Ticket ("TK-108","Carlos Vega", 4));
        tickets. add (new Ticket("tk-104","Ana Torres", 5));
        tickets. add (new Ticket ("TK-103","Luis Andrade", 3));
        tickets. add (new Ticket("TK-107","Mateo Rojas",1)) ;
        tickets. add (new Ticket("TK-102","Sofia Cordero", 4));
        tickets. add (new Ticket ("TK-106","Carlos Mendez", 5)) ;
        tickets.add (new Ticket ("TK-105","Ana Molina", 2));

        System.out.println(TicketController.filtrarYOrdenar(tickets, 1));
        
    }

    private static void runOrdenar() {
        System.out.println("========== AGRUPADOS ===========");
       List<Ticket> tickets = new ArrayList<>();
        tickets. add (new Ticket ("TK-104", "Ana Torres", 5)) ;
        tickets. add (new Ticket ("TK-101","Luis Mora",2)) ;
        tickets. add (new Ticket ("TK-108","Carlos Vega", 4));
        tickets. add (new Ticket("tk-104","Ana Torres", 5));
        tickets. add (new Ticket ("TK-103","Luis Andrade", 3));
        tickets. add (new Ticket("TK-107","Mateo Rojas",1)) ;
        tickets. add (new Ticket("TK-102","Sofia Cordero", 4));
        tickets. add (new Ticket ("TK-106","Carlos Mendez", 5)) ;
        tickets.add (new Ticket ("TK-105","Ana Molina", 2));
        System.out.println(TicketController.agruparCodigoPorPrioridad(tickets));
    }

    private static Set<String> runWordsGame(String[] palabrasUsuario) {
        Set<String> palabrasNoRepetidas = new LinkedHashSet<>();
        for(String palabra : palabrasUsuario){
            palabrasNoRepetidas.add(palabra);
        }
        return palabrasNoRepetidas;
    }

    private static Set<Character> runCharacters(char[] entrada) {
       Set<Character> unicos = new HashSet<>();
       for(char caracter: entrada){
         unicos.add(caracter);
       }

       return unicos;
    }

    private static Set<Jugador> runPlayers() {
        Set<Jugador> jugadores = new TreeSet<>(
            (c1,c2) -> {
                int comP = Integer.compare(c2.getPunto(),c1.getPunto());
                if(comP != 0)
                    return comP;
                return c2.getName().compareTo(c1.getName());

            }
        );
        jugadores.add(new Jugador("Pepe", 1500));
        jugadores.add(new Jugador("Maria", 2800));
        jugadores.add(new Jugador("Juan", 1500)); // Mismo puntaje que Pepe, desempata alfa
        jugadores.add(new Jugador("Ana", 4200));  // El puntaje más alto
        jugadores.add(new Jugador("Ana", 4200));

        return jugadores;
    }

    private static Set<Estudiante> runEstudents() {
        Set<Estudiante> ordenEstu = new LinkedHashSet<>();
        ordenEstu.add(new Estudiante("Juan",1));
        ordenEstu.add(new Estudiante("Maria",2));
        ordenEstu.add(new Estudiante("Pepe",3));
        ordenEstu.add(new Estudiante("Juan",4));
        ordenEstu.add(new Estudiante("Juan",1));
        return ordenEstu;

    }
    

    
}
