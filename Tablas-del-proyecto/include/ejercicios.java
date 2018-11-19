package include;

public class ejercicios {
    private int id_ejercicio;
    private String nombre_ejercicio;
    private int puntaje;

    public ejercicios(int id_ejercicio, String nombre_ejercicio, int puntaje) {
        this.id_ejercicio = id_ejercicio;
        this.nombre_ejercicio = nombre_ejercicio;
        this.puntaje = puntaje;
    }

    public int getId_ejercicio() {
        return id_ejercicio;
    }

    public void setId_ejercicio(int id_ejercicio) {
        this.id_ejercicio = id_ejercicio;
    }

    public String getNombre_ejercicio() {
        return nombre_ejercicio;
    }

    public void setNombre_ejercicio(String nombre_ejercicio) {
        this.nombre_ejercicio = nombre_ejercicio;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
