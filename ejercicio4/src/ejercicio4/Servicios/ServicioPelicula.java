package ejercicio4.Servicios;

import ejercicio4.Entidades.Pelicula;
import ejercicio4.Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Pelicula> crearPeliculas() {

        String tituloUsuario;
        String directorUsuario;
        Double duracionEnHorasUsuario;
        String opcion;

        ArrayList<Pelicula> listaPeliculas = new ArrayList();

        do {

            System.out.println("Ingrese el título de la película");
            tituloUsuario = leer.next();

            System.out.println("Ingrese el director de la película");
            directorUsuario = leer.next();

            System.out.println("Ingrese la duración de la película, en horas");
            duracionEnHorasUsuario = leer.nextDouble();

            Pelicula peliculaUsuario = new Pelicula(tituloUsuario, directorUsuario, duracionEnHorasUsuario);

            listaPeliculas.add(peliculaUsuario);

            System.out.println("¿Querés crear otra película? SI/NO");
            opcion = leer.next();

        } while (!opcion.equalsIgnoreCase("no"));

        return listaPeliculas;

    }

    public void mostrarPeliculas(ArrayList<Pelicula> listaPeliculas) {

        for (Pelicula peliculas : listaPeliculas) {
            System.out.print(peliculas.getTitulo() + " ");
        }

        System.out.println("");

    }

    public void mostrarPeliculasDeMasDeUnaHora(ArrayList<Pelicula> listaPeliculas) {

        for (Pelicula listaPelicula : listaPeliculas) {
            if (listaPelicula.getDuracionPeliculaEnHoras() >= 1) {

                System.out.print(listaPelicula.getTitulo() + " ");

            }
        }

        System.out.println("");

    }

    public ArrayList<Pelicula> ordenarSegunDuracionAscendente(ArrayList<Pelicula> listaPeliculas) {

        listaPeliculas.sort(Comparadores.compararSegunDuracionAscendente);

        System.out.println("Ordenando de forma ascendente:");
        System.out.println(listaPeliculas.toString());
        
        return listaPeliculas;

    }

    public ArrayList<Pelicula> ordenarSegunDuracionDescendente(ArrayList<Pelicula> listaPeliculas) {

        listaPeliculas.sort(Comparadores.compararSegunDuracionDescendente);

        System.out.println("Ordenando de forma descendente:");

        System.out.println(listaPeliculas.toString());

        return listaPeliculas;
        
    }

    public ArrayList<Pelicula> ordenarSegunTitulo(ArrayList<Pelicula> listaPeliculas) {

        listaPeliculas.sort(Comparadores.compararSegunTitulo);

        System.out.println("Ordenando por títulos");

        System.out.println(listaPeliculas.toString());

        return listaPeliculas;
        
    }

    public ArrayList<Pelicula> ordenarSegunDirector(ArrayList<Pelicula> listaPeliculas) {

        listaPeliculas.sort(Comparadores.compararSegunDirector);

        System.out.println("Ordenando por director");

        System.out.println(listaPeliculas.toString());

        return listaPeliculas;
        
    }

}
