package Ejercicios.Asociacion;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class AsociacionTablaHash {

    Map<String, Mascota> mascotas;

    public AsociacionTablaHash() {
        this.mascotas = new HashMap<>();
    }

    public Mascota buscarId(Mascota mascota) {
        return mascotas.get(mascota.getId());
    }

    public Mascota buscarPropietario(Mascota mascota) {
        
        return null;
        
    }

    public void add(Mascota mascota) {
        mascotas.put(mascota.getId(), mascota);
    }

    public void imprimir() {
        for (String key : mascotas.keySet()) {

            Mascota mascota = mascotas.get(key);
            System.out.println("Nombre: " + mascota.getNombre());

        }
    }

}
