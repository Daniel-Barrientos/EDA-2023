package Colas;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Cola<A> {

    Node<A> inicio;
    Node<A> fin;
    int size;

    public void encolar(A dato) {
        Node nuevo = new Node(dato, inicio);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        size = size++;
    }

    public A desencolar() {
        if (esVacia()) {
            return null;
        } else {
            A dato = inicio.getDato();
            inicio = inicio.getSiguiente();
            return dato;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void imprimir() {
        Node<A> aux = inicio;
        while (!esVacia()) {
            System.out.println("Dato: " + aux.getDato());
            aux = aux.getSiguiente();
        }
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public Node<A> getInicio() {
        return inicio;
    }

    public void setInicio(Node<A> inicio) {
        this.inicio = inicio;
    }

    public Node<A> getFin() {
        return fin;
    }

    public void setFin(Node<A> fin) {
        this.fin = fin;
    }

}
