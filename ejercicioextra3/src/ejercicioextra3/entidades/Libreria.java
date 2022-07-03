package ejercicioextra3.entidades;

import java.util.HashSet;

public class Libreria {

    private HashSet<Libro> coleccionDeLibros;

    public Libreria() {
        coleccionDeLibros = new HashSet();
    }

    public Libreria(HashSet<Libro> coleccionDeLibros) {
        this.coleccionDeLibros = coleccionDeLibros;
    }

    public HashSet<Libro> getColeccionDeLibros() {
        return coleccionDeLibros;
    }

    public void setColeccionDeLibros(HashSet<Libro> coleccionDeLibros) {
        this.coleccionDeLibros = coleccionDeLibros;
    }

    @Override
    public String toString() {
        return "Libreria{" + "coleccionDeLibros=" + coleccionDeLibros + '}';
    }
    
}
