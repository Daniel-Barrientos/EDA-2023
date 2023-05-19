package taller_3_SP;

import Pilas.*;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Test2 {

    public static void main(String[] args) {
        Pila<Integer> P = new Pila<>();
        Ejercicio2 ejercicio2 = new Ejercicio2();

//         P.apilar(1);
//        P.apilar(3);
//        P.apilar(2);
        P.apilar(2);
        P.apilar(3);
        P.apilar(4);
        P.apilar(5);
        P.apilar(2);
        P.apilar(3);
        P.apilar(1);

        System.out.println("Pila Inicial");
        System.out.println(P.toString());

        System.out.println("Pila Sumada");
        System.out.println(ejercicio2.junta(P, 4).toString());

    }
}
