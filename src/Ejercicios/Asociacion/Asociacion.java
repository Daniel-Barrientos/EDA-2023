package Ejercicios.Asociacion;

import ListaDoble.ListaDoubly;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Asociacion {

    ListaDoubly<Mascota> mascotas;

    public Asociacion() {
        mascotas = new ListaDoubly();
    }

    public void add(Mascota mascota) {
        mascotas.add(mascota);
    }

}
