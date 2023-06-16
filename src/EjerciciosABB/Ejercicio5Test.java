package EjerciciosABB;

import ABB.Arbol;
import ABB.Node;

/**
 *
 * @author Daniel
 */
public class Ejercicio5Test {

    public static void main(String[] args) {

        Ejercicio5 ejercicio = new Ejercicio5();
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

        // Obtener la raíz y algunos nodos del árbol
        Node<Integer> raiz = arbol.getRaiz();
        Node<Integer> nodo1 = raiz.getArbIzq().getArbIzq();
        Node<Integer> nodo2 = raiz.getArbDer().getArbIzq();
        Node<Integer> nodo3 = raiz.getArbDer().getArbDer();

        // Calcular los antecesores de los nodos
        Node<Integer> antecesor1 = ejercicio.calcularAntecesor(raiz, nodo1);
        Node<Integer> antecesor2 = ejercicio.calcularAntecesor(raiz, nodo2);
        Node<Integer> antecesor3 = ejercicio.calcularAntecesor(raiz, nodo3);

        // Imprimir los resultados
        System.out.println("Antecesor de " + nodo1.getDato() + ": " + (antecesor1 != null ? antecesor1.getDato() : "Ninguno"));
        System.out.println("Antecesor de " + nodo2.getDato() + ": " + (antecesor2 != null ? antecesor2.getDato() : "Ninguno"));
        System.out.println("Antecesor de " + nodo3.getDato() + ": " + (antecesor3 != null ? antecesor3.getDato() : "Ninguno"));
    }

}
