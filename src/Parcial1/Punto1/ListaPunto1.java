package Parcial1.Punto1;

import ListaDoble.ListaDoubly;

/**
 *
 * @author Daniel
 */
public class ListaPunto1 {

    ListaDoubly<Integer> lista;
    private int valorX = 0;

    public ListaPunto1() {
        this.lista = new ListaDoubly<>();
    }

    public ListaPunto1(int valorX) {
        this.lista = new ListaDoubly<>();
        this.valorX = valorX;
    }

    public int getValorX() {
        return valorX;
    }

    public void setValorX(int valorX) {
        this.valorX = valorX;
    }

    // agregar datos a la lista
    public void add(int dato) {
        lista.add(dato);
    }

}
