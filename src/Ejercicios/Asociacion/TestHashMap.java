package Ejercicios.Asociacion;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class TestHashMap {
    
    public static void main(String[] args) {
        AsociacionTablaHash at = new AsociacionTablaHash();
        
        at.add(new Mascota("1", "Goliath", 4, "3820"));
        at.add(new Mascota("2", "Jaider", 3, "7920"));
        at.add(new Mascota("3", "Firulais", 8, "2028"));
        at.add(new Mascota("4", "Moi", 12, "9283"));
        at.add(new Mascota("5", "Lolo", 5, "9290"));
        
        System.out.println("Mascota: " + at.buscarId(new Mascota("3")).toString());
        System.out.println("Mascota: " + at.buscarPropietario(new Mascota()));

        //at.imprimir();
    }
}
