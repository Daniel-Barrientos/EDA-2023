package ListaDoble;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Test {

    public static void main(String[] args) {
        ListaDoubly lista = new ListaDoubly();
        lista.add("Maria");
        lista.add("Jose");
        lista.add("Daniel");
        lista.add("Sergio");
        lista.add("Saniel");
        lista.add("Santiago");
        lista.add("Jaider");
        lista.add("Moises");
        lista.addFinal("Juan");
        lista.imprimir();

        System.out.println("-------------");
        lista.eliminarNodo("Santiago");
        lista.imprimir();

    }

}
