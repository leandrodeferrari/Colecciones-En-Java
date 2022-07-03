package ejercicio4.entidades;

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

}
