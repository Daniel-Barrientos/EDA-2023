package ListaSimple;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Test {
    
    public static void main(String[] args) {
        SimpleList<String> nombres =  new SimpleList();
        System.out.println("Es vacia: " + nombres.esVacia());
        nombres.add("DANIELA");
        nombres.add("JONTHAN");
        nombres.add("SERGIO");
        nombres.add("KATERINE");
        nombres.add("FERNANDA"); 
        nombres.add("ANGEL");
        nombres.addFinal("ANDREA");
        nombres.imprimir();
        
        System.out.println("-------------" + "\nDespues de eliminar un nodo\n");
        nombres.eliminarNodo("ANGEL");
        nombres.eliminarNodo("KATERINE");
        nombres.imprimir();
        
    }

}
