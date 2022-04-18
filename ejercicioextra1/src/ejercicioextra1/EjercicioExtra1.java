package ejercicioextra1;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioExtra1 {

    public static void main(String[] args) {

        // 1. Diseñar un programa que lea una serie de valores numéricos enteros 
        // desde el teclado y los guarde en un ArrayList de tipo Integer. La 
        // lectura de números termina cuando se introduzca el valor -99. Este 
        // valor no se guarda en el ArrayList. A continuación, el programa 
        // mostrará por pantalla el número de valores que se han leído, su 
        // suma y su media (promedio).
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> listaNumeros = new ArrayList();
        Integer numero;
        int suma = 0;
        double promedio;
        
        do {

            System.out.println("Ingrese un número (Ingrese -99 para terminar)");
            numero = leer.nextInt();

            if (numero != (-99)) {
                
                suma+=numero;
                listaNumeros.add(numero);

            }

        } while(numero!=(-99));
        
        System.out.println("Cantidad de números ingresados: " + listaNumeros.size());
        System.out.println("La suma total de los números de la lista son: " + suma);
        
        promedio = suma / listaNumeros.size();
        System.out.println("El promedio de la lista es: " + promedio);
        
    }

}
