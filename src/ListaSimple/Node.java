package ListaSimple;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Node<A> {

    private A dato;
    private Node siguiente;
    private Node anterior;

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

    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }

}
