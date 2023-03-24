package Colas;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Cola<A> {

    Node<A> inicio;
    Node<A> fin;

    public void encolar(A dato) {
        Node nuevo = new Node(dato, null);
        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
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

    public boolean esVacia() {
        return (inicio == null);
    }

    void leerCola() throws NumberFormatException, IOException;

    void imprimirCola();

    void invertirCola( throws ColaVacia

    );
    int numElemCola();

    int primero() throws ColaVacia;

    void quitarPrimero() throws ColaVacia;

    void eliminarCola();

}
