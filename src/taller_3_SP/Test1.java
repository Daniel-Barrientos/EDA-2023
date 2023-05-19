package taller_3_SP;

import Colas.*;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Test1 {

    public static void main(String[] args) {
        Cola<Integer> Q = new Cola<>();
        Ejercicio1 ejercicio1 = new Ejercicio1();

        Q.encolar(1);
        Q.encolar(3);
        Q.encolar(5);
        Q.encolar(4);
        Q.encolar(2);
        Q.encolar(3);
        Q.encolar(7);
        Q.encolar(3);
        Q.encolar(5);
        
        System.out.println(Q.toString());
        
        ejercicio1.eliminar_valor(Q, 3);
        
        System.out.println(Q.toString());

    }
}
