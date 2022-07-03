
package ejercicioextra4;

import ejercicioextra4.entidades.Ciudad;
import ejercicioextra4.servicios.CiudadServicio;
import java.util.HashMap;

public class EjercicioExtra4 {

    public static void main(String[] args) {
        
        // 4. Almacena en un HashMap los códigos postales de 10 ciudades.
        // Nota: Poner el código postal sin la letra, solo el numero. 
        // a) Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.  
        // b) Muestra por pantalla los datos introducidos 
        // c) Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
        // d) Muestra por pantalla los datos 
        // e) Agregar una ciudad con su código postal correspondiente más al HashMap.
        // f) Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
        // g) Muestra por pantalla los datos.
        
        CiudadServicio servicio = new CiudadServicio();
        
        HashMap<String, String> listaCiudades = servicio.cargar10Ciudades();

        Ciudad ciudadUsuario = new Ciudad(listaCiudades);
        
        servicio.mostrarCiudades(ciudadUsuario.getListaCiudades());
        
        servicio.mostrarCiudadMedianteCodigoPostal(ciudadUsuario.getListaCiudades());
        
        servicio.mostrarCiudades(ciudadUsuario.getListaCiudades());
        
        servicio.agregarCiudad(ciudadUsuario.getListaCiudades());
        
        servicio.eliminar3Ciudades(ciudadUsuario.getListaCiudades());
        
        servicio.mostrarCiudades(ciudadUsuario.getListaCiudades());
        
    }

}
