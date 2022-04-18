package ejercicio6;

import ejercicio6.servicios.ServicioProducto;
import java.util.HashMap;

public class Ejercicio6 {

    public static void main(String[] args) {

        // 6. Se necesita una aplicación para una tienda en la cual queremos 
        // almacenar los distintos productos que venderemos y el precio que 
        // tendrán. Además, se necesita que la aplicación cuente con las funciones básicas.
        //
        // Estas las realizaremos en el main. Como, introducir un elemento, 
        // modificar su precio, eliminar un producto y mostrar los productos que 
        // tenemos con su precio (Utilizar Hashmap). El HashMap tendrá de llave 
        // el nombre del producto y de valor el precio. Realizar un menú para 
        // lograr todas las acciones previamente mencionadas.
        
        ServicioProducto servicio = new ServicioProducto();
        
        HashMap<String, Double> listaProductos = servicio.cargarProductos();
        
        servicio.mostrarProductos(listaProductos);
        
        listaProductos = servicio.eliminarProducto(listaProductos);
        
        listaProductos = servicio.modificarPrecio(listaProductos);
        
    }

}
