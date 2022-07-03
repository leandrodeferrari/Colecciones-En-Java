package ejercicioextra3.servicios;

import ejercicioextra3.entidades.Libro;
import java.util.*;

public class LibreriaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public HashSet<Libro> guardarColeccionDeLibros() {

        HashSet<Libro> coleccionDeLibros = new HashSet();
        LibroServicio servicioLibro = new LibroServicio();
        Libro libroUsuario;
        String opcion;

        do {

            libroUsuario = servicioLibro.crearLibro();

            coleccionDeLibros.add(libroUsuario);

            System.out.println("¿Desea agregar un libro más a la coleción? SI/NO");
            opcion = leer.next();

        } while (!opcion.equalsIgnoreCase("no"));

        return coleccionDeLibros;

    }

    public boolean prestamo(HashSet<Libro> coleccionDeLibros) {

        String libroParaPrestar;
        boolean bandera = false;

        System.out.println("Ingrese el título del libro que desea prestar");
        libroParaPrestar = leer.next();

        for (Libro libro : coleccionDeLibros) {

            if (libroParaPrestar.equals(libro.getTitulo())) {

                if (estaDisponibleElLibro(libro)) {

                    System.out.println("Felicidades, tenemos el libro en stock. ¡Que lo disfrutes!");
                    libro.setNumeroDeEjemplaresPrestados(libro.getNumeroDeEjemplaresPrestados() + 1);
                    libro.setNumeroDeEjemplares(libro.getNumeroDeEjemplares() - 1);

                    bandera = true;

                } else {

                    System.out.println("Lo siento, no quedó ningun ejemplar del libro " + libroParaPrestar);

                    return false;
                }

            }

        }

        if (bandera == false) {

            System.out.println("Lo siento, no tenemos el libro que buscas");

        }

        return bandera;

    }

    public boolean estaDisponibleElLibro(Libro libroUsuario) {

        return (libroUsuario.getNumeroDeEjemplares() > 0);

    }

    public boolean devolucion(HashSet<Libro> coleccionDeLibros) {

        String libroParaDevolver;
        boolean bandera = false;

        System.out.println("Ingrese el título del libro que desea devolver");
        libroParaDevolver = leer.next();

        for (Libro libro : coleccionDeLibros) {

            if (libroParaDevolver.equals(libro.getTitulo())) {

                if (estaDisponibleElLibroPrestado(libro)) {

                    System.out.println("Muchas gracias por devolver el libro, ¡Hasta luego!");
                    libro.setNumeroDeEjemplaresPrestados(libro.getNumeroDeEjemplaresPrestados() - 1);
                    libro.setNumeroDeEjemplares(libro.getNumeroDeEjemplares() + 1);

                    bandera = true;

                } else {

                    System.out.println("Lo siento, no es posible efectuar la devolución. No hemos prestado este libro");

                    return false;
                }

            }

        }

        if (bandera == false) {

            System.out.println("Lo siento, no existe el libro que desea devolver, en nuestra coleccción");

        }

        return bandera;

    }

    public boolean estaDisponibleElLibroPrestado(Libro libroUsuario){
        
        return (libroUsuario.getNumeroDeEjemplaresPrestados()>0);
        
    }
    
    public void mostrarColeccionDeLibros(HashSet<Libro> coleccionDeLibros) {

        System.out.println(coleccionDeLibros.toString());
        
    }

}
