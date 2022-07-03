package ejercicio4;

import ejercicio4.servicios.PeliculaServicio;
import ejercicio4.entidades.Pelicula;
import java.util.ArrayList;

public class Ejercicio4 {

    public static void main(String[] args) {

        // 4. Un cine necesita implementar un sistema en el que se puedan cargar 
        // peliculas. Para esto, tendremos una clase Pelicula con el titulo, 
        // director y duración de la película (en horas). Implemente las clases 
        // y métodos necesarios para esta situación, teniendo en cuenta lo que 
        // se pide a continuación:
        // 
        // En el main deberemos tener un bucle que crea un objeto Pelicula 
        // pidiéndole al usuario todos sus datos y guardándolos en el objeto Pelicula.
        // 
        // Después, esa Pelicula se guarda una lista de Peliculas y se le 
        // pregunta al usuario si quiere crear otra Pelicula o no.
        // 
        // Después de ese bucle realizaremos las siguientes acciones:  
        //
        // a. Mostrar en pantalla todas las películas. 
        // b. Mostrar en pantalla todas las películas con una duración mayor a 1 hora. 
        // c. Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla. 
        // d. Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
        // e. Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
        // f. Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
        
        PeliculaServicio servicio = new PeliculaServicio();
        
        ArrayList<Pelicula> listaPeliculas = servicio.crearPeliculas();
        
        System.out.println(listaPeliculas.toString());
        
        servicio.mostrarPeliculas(listaPeliculas);
        
        servicio.mostrarPeliculasDeMasDeUnaHora(listaPeliculas);
        
        listaPeliculas = servicio.ordenarSegunDuracionAscendente(listaPeliculas);
        
        listaPeliculas = servicio.ordenarSegunDuracionDescendente(listaPeliculas);
        
        listaPeliculas = servicio.ordenarSegunTitulo(listaPeliculas);
        
        listaPeliculas = servicio.ordenarSegunDirector(listaPeliculas);
        
    }

}
