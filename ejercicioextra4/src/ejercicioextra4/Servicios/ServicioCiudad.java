package ejercicioextra4.Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServicioCiudad {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, String> listaCiudades;

    public HashMap<String, String> cargar10Ciudades() {

        listaCiudades = new HashMap();

        String codigoPostal, nombreCiudad;

        for (int i = 0; i < 10; i++) {

            System.out.println("Ingrese el nombre de la " + (i + 1) + "° ciudad");
            nombreCiudad = leer.next();

            System.out.println("Ingrese el código postal de " + nombreCiudad);
            codigoPostal = leer.next();

            listaCiudades.put(codigoPostal, nombreCiudad);

        }

        return listaCiudades;

    }

    public void mostrarCiudades(HashMap<String, String> listaCiudades) {

        for (Map.Entry<String, String> ciudad : listaCiudades.entrySet()) {
            String key = ciudad.getKey();
            String value = ciudad.getValue();

            System.out.println("Ciudad: " + value + ", Código postal: " + key);

        }

    }

    public void mostrarCiudadMedianteCodigoPostal(HashMap<String, String> listaCiudades) {

        String codigoPostalBuscado;
        boolean bandera = false;

        System.out.println("Ingrese el código postal que desea buscar");
        codigoPostalBuscado = leer.next();

        for (Map.Entry<String, String> ciudad : listaCiudades.entrySet()) {
            String key = ciudad.getKey();
            String value = ciudad.getValue();

            if (key.equals(codigoPostalBuscado)) {

                System.out.println("Ciudad: " + value);
                bandera = true;

            }

        }

        if (bandera == false) {

            System.out.println("Lo siento, no encontramos una ciudad con el código postal ingresado");

        }

    }

    public HashMap<String, String> agregarCiudad(HashMap<String, String> listaCiudades) {

        String codigoPostal, nombreCiudad;

        System.out.println("Ingrese la ciudad que desea agregar");
        nombreCiudad = leer.next();

        System.out.println("Ingrese el código postal de " + nombreCiudad);
        codigoPostal = leer.next();

        listaCiudades.put(codigoPostal, nombreCiudad);

        return listaCiudades;

    }

    public HashMap<String, String> eliminar3Ciudades(HashMap<String, String> listaCiudades) {

        String ciudadParaBorrar;
        
        for (int i = 0; i < 3; i++) {

            System.out.println("Ingrese la " + (i+1) + "° ciudad que desea eliminar");
            ciudadParaBorrar = leer.next();
            
            if (listaCiudades.containsValue(ciudadParaBorrar)){
                
                listaCiudades.remove(ciudadParaBorrar);
                
            }
            
        }

        return listaCiudades;

    }

}
