package ejercicio1y2.utilidades;

import java.util.Comparator;

public class Comparadores {

    public static Comparator<String> ordenarRazas = new Comparator<String>() {
        @Override
        public int compare(String t, String t1) {
            return t.compareTo(t1);
        }

    };
            
}
