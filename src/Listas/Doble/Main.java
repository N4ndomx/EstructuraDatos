/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas.Doble;

import Listas.Doble.ListaDoble;
import Listas.Simple.ListaSimple;

/**
 *
 * @author Fernando Flores
 */
public class Main {

    public static void main(String[] args) {
        ListaDoble n = new ListaDoble();

//        n.addUp("1");
//        n.addUp("2");
//        n.addUp("3");
//        n.addUp("4");
//        n.addUp("5");
        n.addDown("H");
        n.addDown("o");
        n.addDown("l");
        n.addDown("l");
        n.addDown("a");

        n.mostrar();
        System.out.println("Dato obp " + n.obtner(5));
        System.out.println(n.Buscar("l"));
//        n.addDown("W");
//        n.eliminar(5);
        System.out.println("\n");

        n.mInverso();
        n.mostrar();

    }
}
