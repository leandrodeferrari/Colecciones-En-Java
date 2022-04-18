package ejercicio4.utilidades;

import java.util.Comparator;
import ejercicio4.entidades.Pelicula;

public class Comparadores {

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
