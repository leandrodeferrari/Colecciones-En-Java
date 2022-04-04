
package ejercicioextra4.Entidades;

import java.util.HashMap;


public class Ciudad {

    HashMap<String, String> listaCiudades;

    public Ciudad() {
        listaCiudades = new HashMap();
    }

    public Ciudad(HashMap<String, String> listaCiudades) {
        this.listaCiudades = listaCiudades;
    }

    public HashMap<String, String> getListaCiudades() {
        return listaCiudades;
    }

    public void setListaCiudades(HashMap<String, String> listaCiudades) {
        this.listaCiudades = listaCiudades;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "listaCiudades=" + listaCiudades + '}';
    }
    
}
