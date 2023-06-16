package EjerciciosABB;

import ABB.Node;
import ListaDoble.ListaDoubly;

/**
 *
 * @author Daniel
 */
public class Ejercicio6 {
    
    public ListaDoubly abbToListaDOrdenada(Node raiz) {
        ListaDoubly<Integer> lista = new ListaDoubly<>();

        if (raiz == null) {
            return lista;
        }

        ListaDoubly<Integer> listaIzquierda = abbToListaDOrdenada(raiz.getArbIzq());

        lista.addFinal((Integer) raiz.getDato());

        ListaDoubly<Integer> listaDerecha = abbToListaDOrdenada(raiz.getArbDer());

        if (!listaIzquierda.esVacia()) {
            listaIzquierda.getFin().setSiguiente(lista.getInicio());
            lista.getInicio().setAnterior(listaIzquierda.getFin());
            lista.setInicio(listaIzquierda.getInicio());
        }

        if (!listaDerecha.esVacia()) {
            lista.getFin().setSiguiente(listaDerecha.getInicio());
            listaDerecha.getInicio().setAnterior(lista.getFin());
            lista.setFin(listaDerecha.getFin());
        }

        return lista;
    }

}
