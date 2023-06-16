package EjerciciosABB;

import ABB.Arbol;
import ABB.Node;
import ListaDoble.ListaDoubly;

/**
 *
 * @author Daniel
 */
public class Ejercicio6Test {

    public static void main(String[] args) {

        Ejercicio6 ejercicio6 = new Ejercicio6();
        Arbol arbol = new Arbol();

        arbol.insertar(1);
        arbol.insertar(3);
        arbol.insertar(4);
        arbol.insertar(6);
        arbol.insertar(7);
        arbol.insertar(8);
        arbol.insertar(10);
        arbol.insertar(13);
        arbol.insertar(14);
        arbol.inorden(arbol.getRaiz());
        
        // Obtener la raíz del árbol
        Node<Integer> raiz = arbol.getRaiz();

        // Convertir el árbol en una lista doblemente enlazada ordenada
        ListaDoubly<Integer> listaOrdenada = ejercicio6.abbToListaDOrdenada(raiz);

        // Imprimir la lista ordenada
        System.out.println("Lista ordenada: " + listaOrdenada.toString());

    }

}
