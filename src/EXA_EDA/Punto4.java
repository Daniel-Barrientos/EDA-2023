package EXA_EDA;

import ABB.*;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Punto4 {

    public boolean esEstricto(Node nodo, Arbol arbol) {

        if (nodo == null) {
            return true;
        }

        if ((nodo.getArbIzq() == null && nodo.getArbDer() != null) || (nodo.getArbIzq() != null && nodo.getArbDer() == null)) {
            return false;
        }

        boolean izquierdaEstricta = esEstricto(nodo.getArbIzq(), arbol);
        boolean derechaEstricta = esEstricto(nodo.getArbDer(), arbol);

        // El árbol será estricto solo si tanto el subárbol izquierdo como el derecho son estrictos
        return izquierdaEstricta && derechaEstricta;
    }

}
