package SegundoParcial;

import Pilas.Pila;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Ejercicio3 {

    public Pila reordenar(Pila pila) {
        Pila pares = new Pila();
        Pila impares = new Pila();
        Pila resultado = new Pila();

        // Separar los números pares e impares en pilas diferentes
        while (!pila.esVacia()) {
            int elemento = (int) pila.desapilar();
            if (elemento % 2 == 0) {
                pares.apilar(elemento);
            } else {
                impares.apilar(elemento);
            }
        }

        // Reorganizar los elementos en la pila original
        while (!impares.esVacia()) {
            pila.apilar(impares.desapilar());
        }
        while (!pares.esVacia()) {
            pila.apilar(pares.desapilar());
        }

        // Vaciar la pila de pares en la pila resultado
        while (!pares.esVacia()) {
            resultado.apilar(pares.desapilar());
        }

        // Vaciar la pila de impares en la pila resultado
        while (!impares.esVacia()) {
            resultado.apilar(impares.desapilar());
        }
        return resultado;

    }

}
