package ABB;

/**
 *
 * @author Daniel Barrientos - 1152143
 */

public class Node<E> {

    private Node arbIzq;
    private Node arbDer;
    private E dato;

    public Node() {
    }

    public Node(E dato) {
        this.dato = dato;
    }

    public Node getArbIzq() {
        return arbIzq;
    }

    public void setArbIzq(Node arbIzq) {
        this.arbIzq = arbIzq;
    }

    public Node getArbDer() {
        return arbDer;
    }

    public void setArbDer(Node arbDer) {
        this.arbDer = arbDer;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public void insertar(Integer elemento) {
        if (elemento < (Integer) dato) {

            if (arbIzq == null) {
                arbIzq = new Node(elemento);

            } else {
                arbIzq.insertar(elemento);
            }

        } else {

            if (arbDer == null) {
                arbDer = new Node(elemento);
            } else {
                arbDer.insertar(elemento);

            }
        }
    }
}
