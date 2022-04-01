package ejercicio4.Entidades;

import java.util.Comparator;

public class Pelicula {

    private String titulo;

    private String director;

    private Double duracionPeliculaEnHoras;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duracionPeliculaEnHoras) {
        this.titulo = titulo;
        this.director = director;
        this.duracionPeliculaEnHoras = duracionPeliculaEnHoras;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracionPeliculaEnHoras() {
        return duracionPeliculaEnHoras;
    }

    public void setDuracionPeliculaEnHoras(Double duracionPeliculaEnHoras) {
        this.duracionPeliculaEnHoras = duracionPeliculaEnHoras;
    }

    @Override
    public String toString() {
        return "ServicioPelicula{" + "titulo=" + titulo + ", director=" + director + ", duracionPeliculaEnHoras=" + duracionPeliculaEnHoras + '}';
    }

    public static Comparator<Pelicula> compararSegunDuracionAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p2.getDuracionPeliculaEnHoras().compareTo(p1.getDuracionPeliculaEnHoras());

        }

    };

    public static Comparator<Pelicula> compararSegunDuracionDescendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p1.getDuracionPeliculaEnHoras().compareTo(p2.getDuracionPeliculaEnHoras());

        }

    };

    public static Comparator<Pelicula> compararSegunTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p1.getTitulo().compareTo(p2.getTitulo());

        }

    };

    public static Comparator<Pelicula> compararSegunDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p1.getDirector().compareTo(p2.getDirector());

        }

    };

}
