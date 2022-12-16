/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas.Simple;

/**
 *
 * @author Fernando Flores
 */
public class Main {

    public static void main(String[] args) {
        ListaSimple<String> n = new ListaSimple<>();
        n.addUp("H");
        n.addUp("o");
        n.addUp("x");
        n.addUp("l");
        n.addUp("a");

//        n.addDown(12);
//        n.addDown(13);
//        n.addDown(128);
//        n.addDown(14);
//        n.addDown(15);
        n.eliminar(1);
        n.addUp("K");
//        n.addDown(78);
        n.ls();
    }

}
