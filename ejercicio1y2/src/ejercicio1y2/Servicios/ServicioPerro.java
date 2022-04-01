package ejercicio1y2.Servicios;

import ejercicio1y2.Entidades.Perro;
import ejercicio1y2.Utilidades.Comparador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPerro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<String> listaRazas;

    public ServicioPerro() {
        this.listaRazas = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Perro guardarRazas() {

        Perro perroUsuario = new Perro();
        String raza;
        String opcion;

        do {

            System.out.println("Ingrese una raza");
            raza = leer.next();

            listaRazas.add(raza);

            System.out.println("¿Desea ingresar una raza más? SI/NO");
            opcion = leer.next();

            if (opcion.equalsIgnoreCase("no")) {

                System.out.println(listaRazas.toString());

            }

        } while (!opcion.equalsIgnoreCase("no"));

        return perroUsuario;
    }

    public void eliminarRaza() {

        String raza;
        boolean bandera = false;

        System.out.println("Ingrese la raza que desea eliminar");
        raza = leer.next();
        Iterator it = listaRazas.iterator();

        while (it.hasNext()) {

            if (it.next().equals(raza)) {

                it.remove();
                bandera = true;

            }

        }

        if (bandera == true) {

            Collections.sort(listaRazas, Comparador.ordenarRazas);
            
            System.out.println(listaRazas.toString());

        } else {

            System.out.println("La raza que ha ingresado, no se encuentra en la lista");
            Collections.sort(listaRazas, Comparador.ordenarRazas);
            
            System.out.println(listaRazas.toString());

        }

    }

}
