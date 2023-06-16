package EXA_EDA;

import ABB.*;

/**
 *
 * @author Daniel
 */
public class Punto1 {

    public int maximoPar(Node nodo, Arbol arbol) {
        if (nodo == null) {
            return Integer.MIN_VALUE;
        }

        int maximo = Integer.MIN_VALUE;

        if ((Integer) nodo.getDato() % 2 == 0 && (Integer) nodo.getDato() > maximo) {
            maximo = (Integer) nodo.getDato();
        }

        int maximoIzquierdo = maximoPar(nodo.getArbIzq(), arbol);
        int maximoDerecho = maximoPar(nodo.getArbDer(), arbol);

        if (maximoIzquierdo > maximo) {
            maximo = maximoIzquierdo;
        }
        if (maximoDerecho > maximo) {
            maximo = maximoDerecho;
        }

        return maximo;
    }

}
