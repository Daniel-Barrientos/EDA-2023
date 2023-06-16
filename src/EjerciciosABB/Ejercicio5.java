package EjerciciosABB;

import ABB.Arbol;
import ABB.Node;

/**
 *
 * @author Daniel
 */
public class Ejercicio5 {

    Arbol A = new Arbol();

    public Node<Integer> calcularAntecesor(Node<Integer> raiz, Node<Integer> nodo) {
        if (raiz == null || nodo == null) {
            return null;
        }

        if (nodo == raiz || nodo == raiz.getArbIzq() || nodo == raiz.getArbDer()) {
            // El antecesor del nodo raíz y sus hijos es null
            return null;
        }

        return buscarAntecesor(raiz, nodo);
    }

    private Node<Integer> buscarAntecesor(Node<Integer> actual, Node<Integer> nodo) {
        if (actual == null) {
            return null;
        }

        if ((actual.getArbIzq() != null && actual.getArbIzq() == nodo)
                || (actual.getArbDer() != null && actual.getArbDer() == nodo)) {
            return actual;
        }

        Node<Integer> antecesorIzquierdo = buscarAntecesor(actual.getArbIzq(), nodo);
        if (antecesorIzquierdo != null) {
            return antecesorIzquierdo;
        }

        Node<Integer> antecesorDerecho = buscarAntecesor(actual.getArbDer(), nodo);
        if (antecesorDerecho != null) {
            return antecesorDerecho;
        }

        return null;
    }

}
