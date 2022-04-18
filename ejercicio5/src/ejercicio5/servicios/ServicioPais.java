package ejercicio5.servicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ServicioPais {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    HashSet<String> listaPaises;

    public HashSet<String> guardarPaises() {

        listaPaises = new HashSet();
        String paisUsuario, opcion;

        do {

            System.out.println("Ingrese un país");
            paisUsuario = leer.next();

            listaPaises.add(paisUsuario);

            System.out.println("¿Desea ingresar otro país? SI/NO");
            opcion = leer.next();

        } while (!opcion.equalsIgnoreCase("no"));
        
        System.out.println(listaPaises.toString());
        
        return listaPaises;

    }

    public ArrayList<String> ordenarConjunto(HashSet<String> listaPaises){
        
        ArrayList<String> lista = new ArrayList(listaPaises);
        
        Collections.sort(lista);
        
        System.out.println(lista);
        
        return lista;
        
    }
    
    public HashSet<String> eliminarPais(HashSet<String> listaPaises){
        
        String paisUsuario;
        Iterator it = listaPaises.iterator();
        boolean bandera = false;
        
        System.out.println("Ingrese el país que desea eliminar");
        paisUsuario = leer.next();
        
        while (it.hasNext()){
            
            if (it.next().equals(paisUsuario)){
                
                it.remove();
                bandera = true;
                
            }
            
        }
        
        if (bandera){
            
            System.out.println(listaPaises);
            
        } else {
            
            System.out.println("Lo siento, el país no se encuentra en la lista");
            
        }
        
        return listaPaises;
        
    }
    
}
