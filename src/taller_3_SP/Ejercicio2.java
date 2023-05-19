package taller_3_SP;

import Pilas.*;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Ejercicio2 {

    Pila<Integer> aux = new Pila<>();
    int suma;

    public Pila junta(Pila<Integer> p, int m) {

        for (int i = 0; i < m; i++) {
            if (p.esVacia()) {
                p.apilar(suma);
                return p;
            }
            aux.apilar(p.dePilar());
            suma = suma + aux.getCima().getDato();
        }
        p.apilar(suma);
        return p;
    }

}
