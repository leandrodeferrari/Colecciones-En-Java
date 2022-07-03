package ejercicio6.servicios;

import java.util.*;

public class ProductoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private HashMap<String, Double> listaProductos;

    public HashMap<String, Double> cargarProductos() {

        String producto, opcion;
        Double precio;
        listaProductos = new HashMap();

        do {

            System.out.println("Ingrese el nombre del producto");
            producto = leer.next();

            System.out.println("Ingrese el precio del producto");
            precio = leer.nextDouble();

            listaProductos.put(producto, precio);

            System.out.println("¿Desea ingresar un producto más? SI/NO");
            opcion = leer.next();

        } while (!opcion.equals("no"));

        return listaProductos;

    }

    public void mostrarProductos(HashMap<String, Double> listaProductos) {

        for (Map.Entry<String, Double> entry : listaProductos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();

            System.out.println("Producto: " + key + ", " + "Precio: " + value);

        }

    }

    public HashMap<String, Double> eliminarProducto(HashMap<String, Double> listaProductos) {

        String elemento_A_Eliminar;

        System.out.println("Ingrese el producto que desea eliminar:");
        elemento_A_Eliminar = leer.next();

        if (listaProductos.containsKey(elemento_A_Eliminar)){
            
            System.out.println("Procediendo a eliminar el producto");
            listaProductos.remove(elemento_A_Eliminar);
            mostrarProductos(listaProductos);
            
        } else {
            
            System.out.println("Lo siento, no se encuentra el producto a eliminar, en la lista");
            
        }    

        return listaProductos;

    }
    
    public HashMap<String, Double> modificarPrecio(HashMap<String, Double> listaProductos){
        
        String producto_A_Modificar;
        Double nuevoPrecio;
        
        System.out.println("¿De cuál producto desea modificar el precio?");
        producto_A_Modificar = leer.next();
        
        if(listaProductos.containsKey(producto_A_Modificar)){
            
            System.out.println("Ingrese el nuevo precio de " + producto_A_Modificar + ":");
            nuevoPrecio = leer.nextDouble();
            
            listaProductos.put(producto_A_Modificar, nuevoPrecio);
            mostrarProductos(listaProductos);
            
        } else {
            
            System.out.println("Lo siento, no se encuentra ese producto en la lista");
            
        }
        
        return listaProductos;
        
    }
    
}
