package EjerciciosABB;

import ABB.Node;

/**
 *
 * @author Daniel
 */
public class Ejercicio3 {

    public static int obtenerAltura(Node nodo) {

        if (nodo == null) {
            return 0;
        }

        int alturaIzquierda = obtenerAltura(nodo.getArbIzq());
        int alturaDerecha = obtenerAltura(nodo.getArbDer());

        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }

}
