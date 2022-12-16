/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas.CircSimple;

/**
 *
 * @author Fernando Flores
 */
public class Main {

    public static void main(String[] args) {
        CircSimple n = new CircSimple();
        n.addDown("H");
        n.addDown("o");
        n.addDown("x");
        n.addDown("l");
        n.addDown("a");

        n.eliminar(4);
//        n.addDown("a");
        n.listar();

    }

}
