package EXA_EDA;

import ABB.*;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Punto2 {

    public int sumaPar(Node nodo, Arbol arbol) {

        if (nodo == null) {
            return 0;
        }

        int suma = 0;

        if ((Integer) nodo.getDato() % 2 == 0) {
            suma += (Integer) nodo.getDato();
        }

        suma += sumaPar(nodo.getArbIzq(), arbol);
        suma += sumaPar(nodo.getArbDer(), arbol);

        return suma;

    }

}
