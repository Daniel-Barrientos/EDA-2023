/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial1.Punto2;

import ListaDoble.ListaDoubly;
import ListaSimple.SimpleList;

/**
 *
 * @author ramonm
 */
public class Test {
    
    public static void main(String[] args) {
        
         ListaDoubly<Integer> l1 =  new ListaDoubly();
         ListaDoubly<Integer> l2 =  new ListaDoubly();
       
        l1.add(1);
        l1.add(2);
        l1.add(4);
        l2.add(1);
        l2.add(3); 
        l2.add(4);
       
        SegundoPunto x = new SegundoPunto(l1,l2);
         ListaDoubly<Integer> l3 =  new ListaDoubly();
         l3=x.ordenar(l1, l2);
        x.imprimir();
        
    }
}
