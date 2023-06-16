package EjerciciosABB;

import ABB.Arbol;

/**
 *
 * @author Daniel
 */
public class Ejercicio3Test {

    public static void main(String[] args) {

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
        arbol.inorden(arbol.getRaiz());

        //imprime la ltura del arbol
        System.out.println("-----------------------");
        System.out.println("Altura del arbol: " + Ejercicio3.obtenerAltura(arbol.getRaiz()));

    }

}
