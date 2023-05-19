package SegundoParcial;

import Pilas.Pila;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Test3 {

    public static void main(String[] args) {
        Pila<Integer> pila = new Pila();
        Ejercicio3 ejercicio = new Ejercicio3();

        pila.apilar(9);
        pila.apilar(2);
        pila.apilar(8);
        pila.apilar(6);
        pila.apilar(7);
        pila.apilar(5);
        pila.apilar(3);
        pila.apilar(2);
        pila.apilar(4);
        pila.apilar(3);
        pila.apilar(1);

        System.out.println("Dato: " + ejercicio.reordenar(pila).desapilar());

    }

}
