package ABB;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Arbol<E> {

    private Node<E> raiz;

    public Node<E> getRaiz() {
        return raiz;
    }

    public void setRaiz(Node<E> raiz) {
        this.raiz = raiz;
    }

    public void insertar(Integer elemento) {
        if (raiz == null) {
            raiz = new Node(elemento);
        } else {
            raiz.insertar(elemento);
        }
    }

    public void inorden(Node raiz) {
        if (raiz == null) {
            return;

        } else {
            inorden(raiz.getArbIzq());
            System.out.println("dato: " + raiz.getDato());
            inorden(raiz.getArbDer());
        }
    }

    public void posorden(Node raiz) {
        if (raiz != null) {
            posorden(raiz.getArbIzq());
            posorden(raiz.getArbDer());
            System.out.println("dato: " + raiz.getDato());
        }
    }

}
