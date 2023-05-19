package SegundoParcial;

import Colas.*;
import Pilas.Pila;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Ejercicio2 {

    public void invierte(Cola<Integer> cola) {
        Pila<Integer> auxiliar = new Pila();

        // Vaciar la cola en la pila auxiliar
        while (!cola.esVacia()) {
            
            auxiliar.apilar(cola.desencolar());
            System.out.println("Dato: " + auxiliar.desapilar());
        }

        // Pasar los elementos de la pila auxiliar de vuelta a la cola (invertidos)
        while (!auxiliar.esVacia()) {
            cola.encolar(auxiliar.desapilar());

        }

    }
}
