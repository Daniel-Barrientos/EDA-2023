package EjerciciosABB;

import ABB.Arbol;

/**
 *
 * @author Daniel
 */
public class Ejercicio4Test {

    public static void main(String[] args) {

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

        Ejercicio4<Integer> ejercicio4 = new Ejercicio4<>(arbol);
        boolean balanceado = ejercicio4.isBalanceado();
        System.out.println("El árbol balanceado es balanceado?: " + balanceado);

    }

}
