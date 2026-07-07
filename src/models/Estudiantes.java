package models;

public class Estudiantes {
    private String nombre;
    private String registroAcademico;
    private String carrera;
    
    public Estudiantes(String nombre, String registroAcademico, String carrera) {
        this.nombre = nombre;
        this.registroAcademico = registroAcademico;
        this.carrera = carrera;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRegistroAcademico() {
        return registroAcademico;
    }
    public void setRegistroAcademico(String registroAcademico) {
        this.registroAcademico = registroAcademico;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    
}
