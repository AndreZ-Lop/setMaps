package models;

public class Empleado {
    private String disciplina;
    private int puntaje;

    public Empleado(String disciplina, int puntaje) {
        this.disciplina = disciplina;
        this.puntaje = puntaje;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public int getPuntaje() {
        return puntaje;
    }
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    
}
