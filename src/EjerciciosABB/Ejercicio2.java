package EjerciciosABB;

import ABB.Node;

/**
 *
 * @author Daniel
 */
public class Ejercicio2 {

    public static Node encontrarMaximo(Node nodo) {
        if (nodo == null || nodo.getArbDer() == null) {
            return nodo;
        }

        return encontrarMaximo(nodo.getArbDer());
    }

}
