package models;

public class Jugador {
    private String name;
    private int punto;

    
    public Jugador(String name, int punto) {
        this.name = name;
        this.punto = punto;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPunto() {
        return punto;
    }
    public void setPunto(int punto) {
        this.punto = punto;
    }

    @Override
    public String toString() {
        return "Jugador name: " + name + ", puntos:" + punto;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + punto;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Jugador other = (Jugador) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (punto != other.punto)
            return false;
        return true;
    }

    
    
    
}
