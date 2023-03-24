package Pilas;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Pila<A> {

    Node<A> cima;

    public Pila() {
    }

    public void apilar(A dato) {
        Node<A> nuevo;
        nuevo = new Node(dato, cima);
        cima = nuevo;
    }

    public A desencolar() {
        A resultado;
        if (esVacia()) {
            return null;
        } else {
            resultado = cima.getDato();
            cima = cima.getSiguiente();
            return resultado;
        }
    }

    public boolean esVacia() {
        return (cima == null);
    }

}
