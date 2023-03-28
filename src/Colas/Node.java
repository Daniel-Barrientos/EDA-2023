package Colas;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Node<A> {

    private A dato;
    private Node siguiente;

    public Node(A dato, Node siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public A getDato() {
        return dato;
    }

    public void setDato(A dato) {
        this.dato = dato;
    }

    public Node getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }

}
