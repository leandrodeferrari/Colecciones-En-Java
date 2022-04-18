package ejercicio3.servicios;

import ejercicio3.entidades.Alumno;
import java.util.Scanner;
import java.util.ArrayList;

public class ServicioAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Alumno> crearAlumno() {

        ArrayList<Alumno> listaAlumnos = new ArrayList();
        ArrayList<Integer> notasAlumno;

        Integer nota;
        String opcion;

        do {

            notasAlumno = new ArrayList();
            Alumno alumnoUsuario = new Alumno();

            System.out.println("Ingrese su nombre");
            alumnoUsuario.setNombre(leer.next());

            for (int i = 0; i < 3; i++) {

                System.out.println("Ingrese su " + (i + 1) + "° nota");
                nota = leer.nextInt();

                notasAlumno.add(nota);

            }

            alumnoUsuario.setNotasAlumno(notasAlumno);

            listaAlumnos.add(alumnoUsuario);

            System.out.println("¿Desea agregar un alumno más? SI/NO");
            opcion = leer.next();

        } while (!opcion.equalsIgnoreCase("no"));

        return listaAlumnos;

    }

    public double notaFinal(ArrayList<Alumno> listaAlumnos) {

        String nombreAlumno;
        double promedio;
        ArrayList<Integer> notasParaPromediar = new ArrayList();

        System.out.println("Ingrese el nombre del alumno que desea buscar");
        nombreAlumno = leer.next();

        for (Alumno alumno : listaAlumnos) {

            if (alumno.getNombre().equals(nombreAlumno)) {

                notasParaPromediar.addAll(alumno.getNotasAlumno());

            }

        }

        if (notasParaPromediar.isEmpty()) {

            System.out.println("Lo siento, el nombre no está en la lista");
            promedio = -1;

        } else {

            System.out.println("El nombre está en la lista, procediendo a calcular su nota final");

            int suma = 0;

            for (Integer nota : notasParaPromediar) {

                suma += nota;

            }

            promedio = suma / notasParaPromediar.size();
            System.out.println("El promedio del alumno " + nombreAlumno + " es " + promedio);

        }

        return promedio;

    }

}
