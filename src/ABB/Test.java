package ABB;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Test {
    
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
        //arbol.posorden(arbol.getRaiz());
        
        //imprime la cantidad de hojas
        System.out.println("-----------------------");
        System.out.println("Cantidad de hojas: " + arbol.contarHojas(arbol.getRaiz()));
        
        //imprime el tamaño del arbol binario
        System.out.println("Tamaño: " + arbol.tamanio(arbol.getRaiz()));
        
        //elimina el nodo que se le pasa
        System.out.println("-----------------------\n");
        System.out.println("Se elimina un dato del arbol binario");
        arbol.eliminarNodo(arbol.getRaiz(), 8);
        
        //se imprime en posorden
        arbol.posorden(arbol.getRaiz());
        
        //imprime la cantidad de hojas
        System.out.println("\n-----------------------");
        System.out.println("Cantidad de hojas: " + arbol.contarHojas(arbol.getRaiz()));
        
        //imprime el tamaño del arbol binario
        System.out.println("Tamaño: " + arbol.tamanio(arbol.getRaiz()));
        System.out.println("-----------------------\n");
        
        //imprime el nodo minimo
        System.out.println("-----------------------");
        System.out.println("Nodo Minimo: " + Arbol.encontrarMinimo(arbol.getRaiz()).getDato());
        
        //imprime el nodo minimo
        System.out.println("-----------------------");
        System.out.println("Nodo Maximo: " + Arbol.encontrarMaximo(arbol.getRaiz()).getDato());
        
        //imprime la ltura del arbol
        System.out.println("-----------------------");
        System.out.println("Altura del arbol: " + arbol.obtenerAltura(arbol.getRaiz()));
        
    }
    
}
