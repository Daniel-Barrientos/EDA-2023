package Pilas;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Test {

    public static void main(String[] args) {
        Pila<String> p = new Pila();
        p.apilar("Gato");
        p.apilar("Perro");
        System.out.println("Dato de la pila: "+p.desapilar());
        System.out.println("Dato de la pila: "+p.desapilar());

    }

}
