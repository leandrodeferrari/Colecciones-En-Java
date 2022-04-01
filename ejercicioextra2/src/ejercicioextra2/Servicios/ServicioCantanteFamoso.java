package ejercicioextra2.Servicios;

import ejercicioextra2.Entidades.CantanteFamoso;
import java.util.*;

public class ServicioCantanteFamoso {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<CantanteFamoso> listaDeCantantesFamosos;

    public ArrayList<CantanteFamoso> guardar5CantantesFamosos() {

        listaDeCantantesFamosos = new ArrayList();
        String nombreCantante;
        String nombreDiscoMasVendido;
        CantanteFamoso cantanteFamosoUsuario;

        for (int i = 0; i < 5; i++) {

            System.out.println("Ingrese el nombre del " + (i + 1) + "° cantante famoso");
            nombreCantante = leer.next();
            System.out.println("Ingrese el nombre del disco más vendido del cantante " + nombreCantante);
            nombreDiscoMasVendido = leer.next();

            cantanteFamosoUsuario = new CantanteFamoso(nombreCantante, nombreDiscoMasVendido);

            listaDeCantantesFamosos.add(cantanteFamosoUsuario);

        }

        return listaDeCantantesFamosos;

    }

    public void mostrarCantantesFamosos(ArrayList<CantanteFamoso> listaCantantesFamosos) {

        System.out.println(listaCantantesFamosos.toString());

    }

    public ArrayList<CantanteFamoso> agregarCantanteFamoso(ArrayList<CantanteFamoso> listaCantantesFamosos) {

        String nombre;
        String DiscoConMasVentas;

        System.out.println("Ingrese el cantante famoso que desea agregar");
        nombre = leer.next();

        System.out.println("Ingrese el nombre del disco, con más ventas, de " + nombre);
        DiscoConMasVentas = leer.next();

        CantanteFamoso cantanteFamoso = new CantanteFamoso(nombre, DiscoConMasVentas);

        listaCantantesFamosos.add(cantanteFamoso);

        return listaCantantesFamosos;

    }

    public ArrayList<CantanteFamoso> eliminarCantanteFamoso(ArrayList<CantanteFamoso> listaCantantesFamosos) {

        String nombre;
        boolean bandera = false;
        
        System.out.println("Ingrese el nombre del cantante famoso que desea eliminar");
        nombre = leer.next();

        Iterator<CantanteFamoso> it = listaCantantesFamosos.iterator();
        
        while(it.hasNext()){
            
            if(it.next().getNombre().equals(nombre)){
                
                it.remove();
                bandera = true;
                System.out.println("Elemento eliminado");
                
            }
            
        }

        if(bandera==false){
            
            System.out.println("No hay ningun cantante con ese nombre");
            
        }
        
        return listaCantantesFamosos;

    }

    public void menuCantantesFamosos(ArrayList<CantanteFamoso> listaCantantesFamosos) {

        int opcion = 0;

        while (opcion != 4) {

            System.out.println("Menú:");
            System.out.println("1. Agregar cantante");
            System.out.println("2. Eliminar cantante");
            System.out.println("3. Mostrar cantantes");
            System.out.println("4. Salir");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1:

                    agregarCantanteFamoso(listaCantantesFamosos);
                    break;

                case 2:

                    eliminarCantanteFamoso(listaCantantesFamosos);
                    break;

                case 3:

                    mostrarCantantesFamosos(listaCantantesFamosos);
                    break;

                case 4:

                    System.out.println("¡Hasta la próxima!");
                    mostrarCantantesFamosos(listaCantantesFamosos);
                    break;

                default:

                    System.out.println("Lo siento, ha ingresado una opción incorrecta");
                    System.out.println("Vuelva a intentarlo");
                    opcion = 0;
                    break;

            }

        }

    }

}
