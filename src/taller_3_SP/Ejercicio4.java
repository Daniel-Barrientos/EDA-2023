package taller_3_SP;

import Pilas.*;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Ejercicio4 {

    Pila<Integer> pilaAux = new Pila();
    int menor, aux;

    public void insertSmallestOnBottom(Pila<Integer> pila) {
        menor = pila.getCima().getDato();
        while (!pila.esVacia()) {
            aux = pila.dePilar();
            if (aux < menor) {
                menor = aux;
            }
            pilaAux.apilar(aux);
        }
        pila.apilar(menor);
        while (!pilaAux.esVacia()) {
            aux = pilaAux.dePilar();
            if(aux!=menor)
            pila.apilar(aux);
        }

    }

}
