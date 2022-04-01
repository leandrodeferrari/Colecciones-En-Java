
package ejercicioextra2.Servicios;

import ejercicioextra2.Entidades.CantanteFamoso;
import java.util.*;

public class ServicioCantanteFamoso {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<CantanteFamoso> listaDeCantantesFamosos;
    
   public ArrayList<CantanteFamoso> guardar5CantantesFamosos(){
       
       listaDeCantantesFamosos = new ArrayList();
       String nombreCantante;
       String nombreDiscoMasVendido;
       CantanteFamoso cantanteFamosoUsuario;
       
       for (int i = 0; i < 5; i++) {
           
           System.out.println("Ingrese el nombre del " + (i+1) + "° cantante famoso");
           nombreCantante = leer.next();
           System.out.println("Ingrese el nombre del disco más vendido del cantante " + nombreCantante);
           nombreDiscoMasVendido = leer.next();
           
           cantanteFamosoUsuario = new CantanteFamoso(nombreCantante,nombreDiscoMasVendido);
           
           listaDeCantantesFamosos.add(cantanteFamosoUsuario);
           
       }
       
       return listaDeCantantesFamosos;
       
   }
    
   public void mostarCantantesFamosos(ArrayList<CantanteFamoso> listaCantantesFamosos){
       
       System.out.println(listaCantantesFamosos.toString());
       
   }
    
}
