package Ejercicios.Equipo;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Test {
    
    public static void main(String[] args) {
        
        Equipo equipo = new Equipo();
        
        //Agregar jugadores
        equipo.addJugador(new Jugador("Sergio", 24, 1.65, "123", 12));
        equipo.addJugador(new Jugador("Isaac", 20, 1.75, "124", 10));
        equipo.addJugador(new Jugador("Harold", 20, 1.63, "125", 4));
        equipo.addJugador(new Jugador("Moises", 26, 1.80, "126", 1));
        equipo.addJugador(new Jugador("Jaider", 23, 1.60, "152", 12));
        equipo.addJugador(new Jugador("Yofer", 21, 1.68, "136", 6));
        equipo.imprimirJugador();
        
        System.out.println("-------------");
        System.out.println("Se buscan los jugadores con menor edad");
        
        
        
    }

}
