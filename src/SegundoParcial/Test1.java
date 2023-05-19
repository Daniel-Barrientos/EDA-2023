package SegundoParcial;

import Pilas.Pila;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Test1 {

    public static void main(String[] args) {

        Pila<Integer> pila = new Pila();
        pila.apilar(5);
        pila.apilar(8);
        pila.apilar(10);
        pila.apilar(1);

        pila.imprimirPila();

        System.out.println("Desapilar: ");
        System.out.println("" + pila.desapilar());
        System.out.println("Nueva lista: ");
        pila.imprimirPila();
    }

}
