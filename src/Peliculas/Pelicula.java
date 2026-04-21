package Peliculas;

public class Pelicula {

    private String nombre;
    private int edadMinima;

    public Pelicula(String nombre, int edadMinima) {
        this.nombre = nombre;
        this.edadMinima = edadMinima;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdadMinima() {
        return edadMinima;
    }
}
