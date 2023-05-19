package SegundoParcial;

import Colas.Cola;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Test2 {

    public static void main(String[] args) {

        Cola<Integer> cola = new Cola();
        Ejercicio2 ejercicio = new Ejercicio2();

        cola.encolar(1);
        cola.encolar(10);
        cola.encolar(23);
        cola.encolar(4);
        cola.encolar(12);

        ejercicio.invierte(cola);
    }

}
