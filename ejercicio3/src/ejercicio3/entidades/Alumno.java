package ejercicio3.entidades;

import java.util.*;

public class Alumno {

    private String nombre;
    private ArrayList<Integer> notasAlumno;

    public Alumno() {
        notasAlumno = new ArrayList();

    }

    public Alumno(String nombre, ArrayList<Integer> notasAlumno) {
        this.nombre = nombre;
        this.notasAlumno = notasAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotasAlumno() {
        return notasAlumno;
    }

    public void setNotasAlumno(ArrayList<Integer> notasAlumno) {
        this.notasAlumno = notasAlumno;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notasAlumno=" + notasAlumno + '}';
    }

}
