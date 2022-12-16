/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas.CircSimple;

/**
 *
 * @author Fernando Flores
 */
public class CircSimple {

    private Nodo raiz;
    private Nodo ultimo;
    private int indice = 0;

    public void addUp(String n) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(n);
        if (raiz != null) {
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(raiz);

        } else {
            nuevo.setSiguiente(nuevo);
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
            nuevo.setSiguiente(raiz);
        } else {
            raiz = nuevo;
            nuevo.setSiguiente(nuevo);
        }
        ultimo = nuevo;
        indice++;

    }

    public void listaCiclo() {
        Nodo nuevo = raiz;
        while (nuevo.getSiguiente() != null) {
            System.out.println(nuevo.getDato());
            nuevo = nuevo.getSiguiente();
        }
    }

    public void eliminar(int id) {
        Nodo nuevo = raiz;
        if (id == 1) {
            ultimo.setSiguiente(nuevo.getSiguiente());
            raiz = nuevo.getSiguiente();

        } else {
            for (int i = 1; i != id - 1; i++) {
                nuevo = nuevo.getSiguiente();
            }
            if (id == indice) {
                nuevo.setSiguiente(raiz);
                ultimo = nuevo;
            } else {
                nuevo.setSiguiente(nuevo.getSiguiente().getSiguiente());
            }
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
    }

}
