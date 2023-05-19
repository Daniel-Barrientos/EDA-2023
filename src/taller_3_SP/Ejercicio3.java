package taller_3_SP;

import Pilas.*;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Ejercicio3 {

    Pila<Integer> pilaAux = new Pila();
    int n, aux;

    public void añadirOrganizado(Pila<Integer> pila, int n) {

        while (!pila.esVacia()) {
            aux = pila.dePilar();
            if (n != aux) {
                pilaAux.apilar(aux);
            }
        }
        while (!pilaAux.esVacia()) {
            pila.apilar(pilaAux.dePilar());
        }

        pila.apilar(n);
    }

}
