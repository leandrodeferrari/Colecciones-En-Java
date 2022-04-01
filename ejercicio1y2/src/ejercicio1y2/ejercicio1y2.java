
package ejercicio1y2;

import ejercicio1y2.Entidades.Perro;
import ejercicio1y2.Servicios.ServicioPerro;

public class ejercicio1y2 {

    public static void main(String[] args) {
        
        // 1 - Diseñar un programa que lea y guarde razas de perros en un 
        // ArrayList de tipo String. El programa pedirá una raza de perro en un 
        // bucle, el mismo se guardará en la lista y después se le preguntará al
        //  usuario si quiere guardar otro perro o si quiere salir. Si decide 
        // salir, se mostrará todos los perros guardados en el ArrayList.
        
        // 2. Continuando el ejercicio anterior, después de mostrar las razas, 
        // al usuario se le pedirá una raza y se recorrerá la lista con un 
        // Iterator, se buscará la raza en la lista.  Si la raza está en la 
        // lista, se eliminará la raza que ingresó el usuario y se mostrará la 
        // lista ordenada. Si la raza no se encuentra en la lista, se le 
        // informará al usuario y se mostrará la lista ordenada.
        
        ServicioPerro servicio = new ServicioPerro();
        
        Perro perroUsuario = servicio.guardarRazas();
        
        servicio.eliminarRaza();
        
    }

}
