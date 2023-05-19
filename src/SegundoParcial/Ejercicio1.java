package SegundoParcial;

import Pilas.Pila;

/**
 *
 * @author Daniel Barrientos - 1152143
 */

public class Ejercicio1 {

    Pila<Integer> pila;

    public Ejercicio1() {
        pila = new Pila();
    }

    public void sacarFondo(Pila pila) {
        Pila<Integer> aux = new Pila();
        while (pila.getCima() != null) {
            if (pila.getCima().getSiguiente() == null) {
                pila.desapilar();
                break;
            }
            aux.apilar(this.pila.desapilar());
        }
        while (aux.getCima() != null) {
            pila.apilar(aux.desapilar());

        }
    }

    public void add(int dato) {
        pila.apilar(dato);
    }

    public void imprimir() {
        pila.imprimirPila();
    }
}
