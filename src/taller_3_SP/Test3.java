package taller_3_SP;

import Pilas.*;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Test3 {

    public static void main(String[] args) {
        Pila<Integer> P = new Pila<>();
        Ejercicio3 ejercicio = new Ejercicio3();

        P.apilar(5);
        P.apilar(2);
        P.apilar(3);
        P.apilar(4);
        P.apilar(2);

        System.out.println("Pila Inicial");
        System.out.println(P.toString());

        ejercicio.añadirOrganizado(P, 5);

        System.out.println("Elemento Anexado :");
        System.out.println(P.toString());

    }
}
