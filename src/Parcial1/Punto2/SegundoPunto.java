/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial1.Punto2;

import ListaDoble.ListaDoubly;
import ListaDoble.Node;

/**
 *
 * @author ramonm
 */
public class SegundoPunto {

    public SegundoPunto(ListaDoubly<Integer> l1, ListaDoubly<Integer> l2) {
    }
    
    
    ListaDoubly <Integer> salida;
    
    public ListaDoubly<Integer> ordenar(ListaDoubly <Integer> l1 , ListaDoubly <Integer> l2 ){
        Node datol1 = l1.getInicio();
        Node datol2 = l2.getInicio();
        while (l1 != null && l2 != null){
            
            if((int)datol1.getDato() < (int)datol2.getDato()){
                
                salida.add((int)datol1.getDato());
             
                datol1 = datol1.getSiguiente();
                       
            }
            
            else {
                salida.add((int)datol2.getDato());
                
                datol2 = datol2.getSiguiente();
            }
            
        }
            
    
        return salida;
        
        
    }
    
        public void imprimir() {
        Node aux = salida.getInicio();
        while (aux != null) {
            System.out.println("Dato: " + aux.getDato());
            aux = aux.getSiguiente();
        }
    }
}
