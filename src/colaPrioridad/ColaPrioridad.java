package colaPrioridad;

import java.util.PriorityQueue;

/**
 *
 * @author danie
 */
public class ColaPrioridad<E extends Comparable<E>> {

    private PriorityQueue<E> cola;

    public ColaPrioridad() {
        cola = new PriorityQueue<>();
    }

    public void agregarElemento(E elemento) {
        cola.offer(elemento);
    }

    public E obtenerElemento() {
        return cola.poll();
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }

    public int tamaño() {
        return cola.size();
    }

    public static void main(String[] args) {
        ColaPrioridad<Integer> colaPrioridad = new ColaPrioridad<>();
        colaPrioridad.agregarElemento(5);
        colaPrioridad.agregarElemento(2);
        colaPrioridad.agregarElemento(8);

        while (!colaPrioridad.estaVacia()) {
            System.out.println(colaPrioridad.obtenerElemento());
        }
    }
}
