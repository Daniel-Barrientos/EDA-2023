package Ejercicios.Asociacion;

import ListaDoble.ListaDoubly;
import ListaDoble.Node;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Asociacion {

    ListaDoubly<Mascota> mascotas;

    public Asociacion() {
        mascotas = new ListaDoubly();
    }

    public void add(Mascota mascota) {
        mascotas.add(mascota);
    }

    public void imprimirMascota() {
        Node<Mascota> aux = mascotas.getInicio();
        while (aux != null) {
            System.out.println("Mascota: [" + "Id: " + aux.getDato().getId() + ". Nombre: " + aux.getDato().getNombre() + ". Edad: " + aux.getDato().getEdad()
                    + ". Cedula: " + aux.getDato().getCedula() + ".]");
            aux = aux.getSiguiente();
        }
    }

    public void eliminarMascota(Object mascota) {
        Node<Mascota> actual = mascotas.getInicio();
        Node<Mascota> anterior = null;

        while (actual != null) {
            if (actual.getDato().getNombre().equals(mascota)) {
                if (anterior == null) {
                    // Si el nodo a eliminar es el primero, actualizamos el siguiente como primer nodo
                    mascotas.eliminarInicio();
                } else {
                    // Si no es el primer nodo, actualizamos el siguiente del nodo anterior
                    anterior.setSiguiente(actual.getSiguiente());
                }
                break;
            }

            anterior = actual;
            actual = actual.getSiguiente();
        }
    }

}
