package Ejercicios.Equipo;

import ListaDoble.ListaDoubly;
import ListaDoble.Node;
import java.util.ArrayList;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Equipo {

    private String nombre;
    ListaDoubly<Jugador> jugadores;

    public Equipo() {
        jugadores = new ListaDoubly();
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
        jugadores = new ListaDoubly();
    }

    public void addJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public ArrayList<Jugador> buscarMenorEdad() {
        Node<Jugador> actual = jugadores.getInicio();
        Integer edad = 200;
        ArrayList<Jugador> jugadoresMenores = new ArrayList();

        while (actual != null) {
            if (actual.getDato().getEdad() < edad) {
                jugadoresMenores.clear();
                jugadoresMenores.add(actual.getDato());
                edad = actual.getDato().getEdad();
            } else if (actual.getDato().getEdad() == edad) {
                jugadoresMenores.add(actual.getDato());
            }
            actual = actual.getSiguiente();
        }
        return jugadoresMenores;

    }

    public String buscarJugador(Object cedula) {
        Node<Jugador> aux = jugadores.getInicio();
        while (aux != null) {
            if (aux.getDato().getCedula().equals(cedula)) {
                return "Jugador: " + aux.getDato().getNombre() + ". Edad: " + aux.getDato().getEdad();
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    public void buscarMayorPuntaje() {
        Node<Jugador> actual = jugadores.getInicio();
        Node<Jugador> mayor = null;

        while (actual != null) {
            if (actual.getDato().getPuntos() > mayor.getDato().getPuntos()) {
                mayor = actual;
                actual = actual.getSiguiente();
            }
        }
        System.out.println("Jugador: " + mayor.getDato().getNombre() + ". Edad: " + mayor.getDato().getEdad());
    }

}
