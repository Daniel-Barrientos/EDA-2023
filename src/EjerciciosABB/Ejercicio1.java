package EjerciciosABB;

import ABB.Node;

/**
 *
 * @author Daniel
 */
public class Ejercicio1 {

    public static Node encontrarMinimo(Node nodo) {
        if (nodo == null || nodo.getArbIzq() == null) {
            return nodo;
        }

        return encontrarMinimo(nodo.getArbIzq());
    }

}
