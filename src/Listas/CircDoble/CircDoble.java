/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas.CircDoble;

/**
 *
 * @author Fernando Flores
 */
public class CircDoble {

    private Nodo raiz;
    private Nodo ultimo;
    private int indice;

    public void addUp(String dato) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if (raiz != null) {
            nuevo.setSiguiente(raiz);
            raiz.setAnterior(nuevo);
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
        } else {
            nuevo.setSiguiente(nuevo);
            nuevo.setAnterior(nuevo);

            ultimo = nuevo;
        }
        raiz = nuevo;
        indice++;

    }

    public void addDown(String dato) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if (raiz != null) {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            nuevo.setSiguiente(raiz);
            raiz.setAnterior(nuevo);
        } else {
            nuevo.setSiguiente(nuevo);
            nuevo.setAnterior(nuevo);

            raiz = nuevo;
        }
        ultimo = nuevo;
        indice++;

    }

    public void eliminar(int id) {
        Nodo nuevo = raiz;
        if (id == 1) {
            Nodo aux = nuevo.getSiguiente();
            raiz = aux;
            aux.setAnterior(ultimo);
            ultimo.setSiguiente(aux);

        } else if (id == indice) {
            Nodo aux = ultimo.getAnterior();
            ultimo = aux;
            ultimo.setSiguiente(raiz);
            raiz.setAnterior(aux);

        } else {
            int i = 1;
            while (!nuevo.equals(ultimo) && i != id) {
                nuevo = nuevo.getSiguiente();
                i++;
            }
            nuevo.getAnterior().setSiguiente(nuevo.getSiguiente());
            nuevo.getSiguiente().setAnterior(nuevo.getAnterior());
        }

        indice--;
    }

    public void listar() {
        Nodo nuevo = raiz;
        while (!nuevo.equals(ultimo)) {
            System.out.println(nuevo.getDato());
            nuevo = nuevo.getSiguiente();
        }
        System.out.println(nuevo.getDato());

//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void mInverso() {
        Nodo actual = raiz;

        while (true) {

            actual = actual.getAnterior();
            System.out.println(actual.getDato());
        }

    }

}
