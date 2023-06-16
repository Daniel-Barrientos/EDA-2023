package EXA_EDA;

import ABB.Arbol;
import ABB.Node;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Punto3 {

    public int nodoUnHijo(Node nodo, Arbol arbol) {

        if (nodo == null) {
            return 0;
        }

        int tmp = 0;

        if ((nodo.getArbIzq() != null && nodo.getArbDer() == null) || (nodo.getArbIzq() == null && nodo.getArbDer() != null)) {
            tmp++;
        }

        tmp += nodoUnHijo(nodo.getArbIzq(), arbol);
        tmp += nodoUnHijo(nodo.getArbDer(), arbol);

        return tmp;
    }

    public int sumaNodosUnHijo(Node nodo, Arbol arbol) {
        if (nodo == null) {
            return 0;
        }

        int suma = 0;

        if ((nodo.getArbIzq() != null && nodo.getArbDer() == null) || (nodo.getArbIzq() == null && nodo.getArbDer() != null)) {
            suma += (Integer) nodo.getDato();
        }

        suma += sumaNodosUnHijo(nodo.getArbIzq(), arbol);
        suma += sumaNodosUnHijo(nodo.getArbDer(), arbol);

        return suma;
    }

}
