
package Utilidades;

/**
 *
 * @author Daniel
 */
public interface Estructura <A> {
 
    public void add(A dato);
    public void addFinal(A dato);
    public boolean esVacia();
    public A buscar(A entrada);
    public void eliminarInicio();
    public void eliminarFinal();
    public void eliminarNodo(A entrada);
    
}
