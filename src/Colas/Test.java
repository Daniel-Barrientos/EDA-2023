package Colas;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Test {

    public static void main(String[] args) {
        Cola<String> cola = new Cola();
        cola.encolar("Carro");
        cola.encolar("Moto");
        cola.encolar("Bicicleta");
        System.out.println("Desencolar: " + cola.desencolar());
        System.out.println("Desencolar: " + cola.desencolar());
    }

}
