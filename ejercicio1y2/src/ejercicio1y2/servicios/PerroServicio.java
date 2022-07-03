package ejercicio1y2.servicios;

import ejercicio1y2.entidades.Perro;
import ejercicio1y2.utilidades.Comparadores;
import java.util.*;

public class PerroServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<String> listaRazas;

    public PerroServicio() {
        this.listaRazas = new ArrayList<>();
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

            Collections.sort(listaRazas, Comparadores.ordenarRazas);
            
            System.out.println(listaRazas.toString());

        } else {

            System.out.println("La raza que ha ingresado, no se encuentra en la lista");
            Collections.sort(listaRazas, Comparadores.ordenarRazas);
            
            System.out.println(listaRazas.toString());

        }

    }

}
