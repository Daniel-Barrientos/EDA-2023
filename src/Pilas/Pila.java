package Pilas;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Pila<A> {

    Node<A> cima;

    public Node<A> getCima() {
        return cima;
    }

    public void setCima(Node<A> cima) {
        this.cima = cima;
    }

    public void apilar(A dato) {
        Node nuevo = new Node(dato, cima);
        cima = nuevo;
    }

    public void imprimirPila() {
        Node<A> temp = cima;
        while (temp != null) {
            System.out.println(temp.getDato());
            temp = temp.getSiguiente();
        }
    }

    public A dePilar() {
        if (esVacia()) { //Comprobamos si la lista esta vacia
            throw new RuntimeException("La lista esta vacia");
        }
        A resultado;
        resultado = cima.getDato();
        cima = cima.getSiguiente();
        return resultado;
    }

    public A desapilar() {
        if (esVacia()) {
            return null;
        } else {
            A dato = cima.getDato();
            cima = cima.getSiguiente();
            return dato;
        }
    }

    public boolean esVacia() {
        return cima == null;
    }

}
