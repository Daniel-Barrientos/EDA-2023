package ExamenFinal;

import ABB.Arbol;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Punto2_Test {

    public static void main(String[] args) {

        Punto2 punto = new Punto2();
        Arbol arbol = new Arbol();
        arbol.insertar(1);
        arbol.insertar(3);
        arbol.insertar(4);
        arbol.insertar(6);
        arbol.insertar(7);
        arbol.insertar(8);
        arbol.insertar(10);
        arbol.insertar(13);
        arbol.insertar(14);

        System.out.println("suma par: " + punto.sumaPar(arbol.getRaiz(), arbol));

    }

}
