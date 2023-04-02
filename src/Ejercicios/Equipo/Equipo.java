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

    public String buscarJugador(String cedula) {
        Node<Jugador> aux = jugadores.getInicio();
        while (aux != null) {
            if (aux.getDato().getCedula().equals(cedula)) {
                return ("Jugador: " + aux.getDato().getNombre() + ". Edad: " + aux.getDato().getEdad() + ". Cedula: " + aux.getDato().getCedula());
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

    
    //Se imprime la lista de jugadores de la lista doble
    public void imprimirJugador() {
        Node<Jugador> aux = jugadores.getInicio();
        while (aux != null) {
            System.out.println("Jugador: [Nombre: " + aux.getDato().getNombre() + ". Edad: " + aux.getDato().getEdad() + ". Estatura: " + aux.getDato().getEstatura()
                    + ". Cedula: " + aux.getDato().getCedula() + ". Puntos: " + aux.getDato().getPuntos() + ".]");
            aux = aux.getSiguiente();
        }
    }

    
    //metodo generico para imprimir listas de ArrayList
    public void imprimiArrayList(ArrayList<Jugador> jugadores) {

        for (Jugador jugador : jugadores) {
            System.out.println("Jugador: [Nombre: " + jugador.getNombre() + ". Edad: " + jugador.getEdad() + ".]");
        }
    }

}
