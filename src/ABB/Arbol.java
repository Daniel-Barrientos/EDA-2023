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

    public int contarHojas(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.getArbIzq() == null && node.getArbDer() == null) {
            return 1;
        }
        int cantidadNodosIzquierdo = contarHojas(node.getArbIzq());
        int cantidadNodosDerecha = contarHojas(node.getArbDer());

        return cantidadNodosIzquierdo + cantidadNodosDerecha;

    }

    public int tamanio(Node node) {

        if (node == null) {
            return 0;
        } else {

            int tamanoIzquierdo = tamanio(node.getArbIzq());
            int tamanoDerecho = tamanio(node.getArbDer());
            return 1 + tamanoIzquierdo + tamanoDerecho;

        }

    }

    public Node eliminarNodo(Node<Integer> node, int dato) {
        if (node == null) {
            return null; // El árbol está vacío, no hay nodos que eliminar
        }

        // Buscar el nodo a eliminar en el árbol
        if (dato < node.getDato()) {
            node.setArbIzq(eliminarNodo(node.getArbIzq(), dato)); // El nodo a eliminar está en el subárbol izquierdo
        } else if (dato > node.getDato()) {
            node.setArbDer(eliminarNodo(node.getArbDer(), dato)); // El nodo a eliminar está en el subárbol derecho
        } else {
            // Se encontró el nodo a eliminar

            // Caso 1: El nodo a eliminar no tiene hijos o es una hoja
            if (node.getArbIzq() == null && node.getArbDer() == null) {
                return null;
            }

            // Caso 2: El nodo a eliminar tiene un solo hijo (izquierdo o derecho)
            if (node.getArbIzq() == null) {
                return node.getArbDer();
            }
            if (node.getArbDer() == null) {
                return node.getArbIzq();
            }

            // Caso 3: El nodo a eliminar tiene dos hijos
            // En este caso, se busca el sucesor inorden o predecesor inorden para reemplazar el nodo a eliminar
            Node<Integer> sucesorInorden = encontrarSucesorInorden(node.getArbDer());
            node.setDato(sucesorInorden.getDato()); // Reemplazar el dato del nodo a eliminar por el dato del sucesor inorden
            node.setArbDer(eliminarNodo(node.getArbDer(), sucesorInorden.getDato())); // Eliminar el sucesor inorden
        }

        return node;
    }

    private Node encontrarSucesorInorden(Node node) {
        Node actual = node;
        while (actual.getArbIzq() != null) {
            actual = actual.getArbIzq();
        }
        return actual;
    }

    public static Node encontrarMinimo(Node nodo) {
        if (nodo == null || nodo.getArbIzq() == null) {
            return nodo;
        }

        return encontrarMinimo(nodo.getArbIzq());
    }

    public static Node encontrarMaximo(Node nodo) {
        if (nodo == null || nodo.getArbDer() == null) {
            return nodo;
        }

        return encontrarMaximo(nodo.getArbDer());
    }

    public static int obtenerAltura(Node nodo) {
        
    if (nodo == null) {
        return 0;
    }

    int alturaIzquierda = obtenerAltura(nodo.getArbIzq());
    int alturaDerecha = obtenerAltura(nodo.getArbDer());

    return Math.max(alturaIzquierda, alturaDerecha) + 1;
}


}
