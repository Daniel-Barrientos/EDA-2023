package Ejercicios.Equipo;

import ListaDoble.ListaDoubly;
import ListaDoble.Node;

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

    public void addJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public Node<Jugador> buscarMenorEdad() {
        Node<Jugador> actual = jugadores.getInicio();
        Node<Jugador> menor = null;

        while (actual != null) {
            if (actual.getDato().getEdad() < menor.getDato().getEdad()) {
                menor = actual;
                actual = actual.getSiguiente();
            }
        }
        return menor;
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
