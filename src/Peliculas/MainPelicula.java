package Peliculas;

public class MainPelicula {

    public static String verPelicula(Pelicula pelicula, int edadEspectador) throws TooYoungException {
        if (edadEspectador < pelicula.getEdadMinima()) {
            throw new TooYoungException();
        }
        return "Has visto la película " + pelicula.getNombre();
    }

    public static void main(String[] args) {

        Pelicula pelicula1 = new Pelicula("Super Mario Galaxy", 7);
        Pelicula pelicula2 = new Pelicula("Insidious", 18);

        try {
            System.out.println(verPelicula(pelicula1, 10));
            System.out.println(verPelicula(pelicula2, 15));
        } catch (TooYoungException tye) {
            System.out.println("No tienes la edad mínima!! No puedes ver la película");
        }
    }
}
