package EXA_EDA;

import ABB.Arbol;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Punto4_Test {
    
    public static void main(String[] args) {
        
        Punto4 punto = new Punto4();
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
        
        System.out.println("El arbol binario estricto?\n" + punto.esEstricto(arbol.getRaiz(), arbol));
        
    }

}
