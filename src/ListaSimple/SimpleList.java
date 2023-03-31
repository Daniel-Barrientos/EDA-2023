package ListaSimple;

import Utilidades.Estructura;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class SimpleList<A> implements Estructura<A> {

    Node inicio;
    Node fin;

    @Override
    public void add(Object dato) {
        Node nuevo = new Node();
        nuevo.setDato(dato);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;

        }
    }

    @Override
    public void addFinal(Object dato) {
        Node nuevo = new Node();
        nuevo.setDato(dato);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public void imprimir() {
        Node aux = inicio;
        while (aux != null) {
            System.out.println("El dato es " + aux.getDato());
            aux = aux.getSiguiente();
        }
    }

    @Override
    public boolean esVacia() {
        return (inicio == null);
    }

    @Override
    public A buscar(A entrada) {
        Node aux = inicio;
        while (aux != null) {
            if (aux.getDato().equals(entrada)) {
                return (A) aux.getDato();

            }
            aux = aux.getSiguiente();
        }

        return null;
    }

    @Override
    public void eliminarNodo(A entrada) {
        Node actual = inicio;
        Node anterior = null;

        while (actual != null) {
            if (actual.getDato().equals(entrada)) {
                if (anterior == null) {
                    // Si el nodo a eliminar es el primero, actualizamos el siguiente como primer nodo
                    eliminarInicio();
                } else {
                    // Si no es el primer nodo, actualizamos el siguiente del nodo anterior
                    anterior.setSiguiente(actual.getSiguiente());
                }
                break;
            }

            anterior = actual;
            actual = actual.getSiguiente();
        }

    }

    @Override
    public void eliminarInicio() {
        inicio = inicio.getSiguiente();
        inicio.setAnterior(null);

    }

    @Override
    public void eliminarFinal() {
        fin = fin.getAnterior();
        fin.setSiguiente(null);
    }

    public Node getInicio() {
        return inicio;
    }

    public void setInicio(Node inicio) {
        this.inicio = inicio;
    }

    public Node getFin() {
        return fin;
    }

    public void setFin(Node fin) {
        this.fin = fin;
    }
    
    
    

}
