package Ejercicios.Asociacion;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class TestHashMap {
    
    public static void main(String[] args) {
        AsociacionTablaHash at = new AsociacionTablaHash();
        
        at.add(new Mascota("1", "Goliath", 4, "1004904242"));
        at.add(new Mascota("2", "Jaider", 3, "1004904242"));
        at.add(new Mascota("3", "Firulais", 8, "1004904242"));
        at.add(new Mascota("4", "Moi", 12, "1004904242"));
        at.add(new Mascota("5", "Lolo", 5, "1004904242"));
        
        System.out.println("Mascota: " + at.buscarId(new Mascota("3")).toString());
        
        //at.imprimir();
        
        
        
    }
}
