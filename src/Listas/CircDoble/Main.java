/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas.CircDoble;

/**
 *
 * @author Fernando Flores
 */
public class Main {

    public static void main(String[] args) {
        CircDoble n = new CircDoble();
        n.addDown("H");
        n.addDown("o");
        n.addDown("x");
        n.addDown("l");
        n.addDown("P");

        n.eliminar(5);
        n.addDown("a");
        n.listar();
        System.out.println("");

//        n.mInverso();
    }

}
