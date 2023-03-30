package Ejercicios.Asociacion;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Test {

    public static void main(String[] args) {
        Asociacion a = new Asociacion();
        a.add(new Mascota("1", "Goliath", 4, "1004904242"));
        a.add(new Mascota("2", "Jaider", 3, "1004904242"));
        a.add(new Mascota("3", "Firulais", 8, "1004904242"));
        a.add(new Mascota("4", "Moi", 12, "1004904242"));
        a.add(new Mascota("5", "Lolo", 5, "1004904242"));
        a.add(new Mascota("6", "Bruno", 1, "1004904242"));
        
        a.imprimirMascota();
        
        System.out.println("-------------");
        a.eliminarMascota("Jaider");
        a.imprimirMascota();
        
    }

}
