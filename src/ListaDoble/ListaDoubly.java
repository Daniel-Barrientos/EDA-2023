package ListaDoble;

import Utilidades.Estructura;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class ListaDoubly<A> implements Estructura<A> {

    Node inicio;
    Node fin;

    @Override
    public void add(A dato) {
        Node nuevo = new Node();
        nuevo.setDato(dato);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    @Override
    public void addFinal(A dato) {
        Node nuevo = new Node();
        nuevo.setDato(dato);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);

            fin = nuevo;

        }
    }

    public void imprimir() {
        Node aux = inicio;
        while (aux != null) {
            System.out.println("Dato: " + aux.getDato());
            aux = aux.getSiguiente();
        }
    }

    @Override
    public boolean esVacia() {
        return (inicio == null);
    }

    //hacer un metodo Buscar que retorne lo que hay en el nodo dato, si está devolver el objeto y sino tiene que retornar null
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

    //hacer un metodo para eliminar nodo
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

    //Eliminar nodo al inicio
    @Override
    public void eliminarInicio() {
        inicio = inicio.getSiguiente();
        inicio.setAnterior(null);
    }

    //Eliminar nodo al Final
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
