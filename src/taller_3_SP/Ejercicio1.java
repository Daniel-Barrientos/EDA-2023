package taller_3_SP;

import Colas.*;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Ejercicio1 {

    int datoInt;
    Cola<Integer> aux = new Cola<>();

    public void eliminar_valor(Cola<Integer> Q, int n) {
        while (!Q.esVacia()) {
            datoInt = Q.desencolar();
            if (datoInt != n) {
                aux.encolar(datoInt);
            }
        }
        while (!aux.esVacia()) {
            Q.encolar(aux.desencolar());
        }
    }

}
