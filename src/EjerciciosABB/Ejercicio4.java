package EjerciciosABB;

import ABB.Arbol;
import ABB.Node;

/**
 *
 * @author Daniel
 */
public class Ejercicio4<E extends Comparable<E>> {

    private Arbol<E> arbol;

    public Ejercicio4(Arbol<E> arbol) {
        this.arbol = arbol;
    }

    public boolean isBalanceado() {
        return isBalanceadoRecursivo(arbol.getRaiz());
    }

    private boolean isBalanceadoRecursivo(Node<E> nodo) {
        if (nodo == null) {
            return true;
        }

        int alturaIzquierda = calcularAltura(nodo.getArbIzq());
        int alturaDerecha = calcularAltura(nodo.getArbDer());

        int diferenciaAlturas = Math.abs(alturaIzquierda - alturaDerecha);

        if (diferenciaAlturas > 1) {
            return false;
        }

        boolean izquierdaBalanceada = isBalanceadoRecursivo(nodo.getArbIzq());
        boolean derechaBalanceada = isBalanceadoRecursivo(nodo.getArbDer());

        return izquierdaBalanceada && derechaBalanceada;
    }

    private int calcularAltura(Node<E> nodo) {
        if (nodo == null) {
            return 0;
        }
        int alturaIzquierda = calcularAltura(nodo.getArbIzq());
        int alturaDerecha = calcularAltura(nodo.getArbDer());

        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }

}
