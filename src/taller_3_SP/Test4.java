package taller_3_SP;

import Pilas.*;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Test4 {

    public static void main(String[] args) {
        Pila<Integer> P = new Pila<>();
        Ejercicio4 ejercicio = new Ejercicio4();

        P.apilar(5);
        P.apilar(3);
        P.apilar(4);
        P.apilar(2);
        P.apilar(2);
        P.apilar(3);
        P.apilar(4);

        System.out.println("Pila Inicial");
        System.out.println(P.toString());

        System.out.println("Pila Ordenada");
        ejercicio.insertSmallestOnBottom(P);
        System.out.println(P.toString());

    }
}
