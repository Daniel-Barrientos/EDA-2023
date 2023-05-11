package ABB;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Test {

    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.insertar(6);
        arbol.insertar(4);
        arbol.insertar(8);
        arbol.insertar(10);
        arbol.insertar(5);
        //arbol.inorden(arbol.getRaiz());
        arbol.posorden(arbol.getRaiz());
    }

}
