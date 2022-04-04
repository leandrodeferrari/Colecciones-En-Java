
package ejercicioextra3.Servicios;

import ejercicioextra3.Entidades.Libro;
import java.util.Scanner;


public class ServicioLibro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Libro libroUsuario;
    
    public Libro crearLibro(){
        
        String titulo, autor;
        Integer numeroDeEjemplares, numeroDeEjemplaresPrestados;
        
        System.out.println("Ingrese el título del libro");
        titulo = leer.next();
        
        System.out.println("Ingrese el autor del libro");
        autor = leer.next();
        
        System.out.println("Ingrese la cantidad de números de ejemplares disponibles, del libro");
        numeroDeEjemplares = leer.nextInt();
        
        System.out.println("Ingrese la cantidad de números de ejemplares prestados, del libro");
        numeroDeEjemplaresPrestados = leer.nextInt();
        
        libroUsuario = new Libro(titulo, autor, numeroDeEjemplares, numeroDeEjemplaresPrestados);
        
        return libroUsuario;
        
    }
    
}
