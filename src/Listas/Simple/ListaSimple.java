/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas.Simple;

/**
 *
 * @author Fernando Flores
 */
public class ListaSimple<T> {

    private Nodo<T> raiz;
    private Nodo<T> ultimo;
    private int indice = 0;

    public void addUp(T n) {
        Nodo<T> nuevo = new Nodo(n, raiz);
        ultimo = nuevo;
        raiz = nuevo;
        indice++;
    }

    public void addDown(T n) {
        Nodo<T> nuevo = new Nodo();
        nuevo.setDato(n);
        if (raiz != null) {
            ultimo.setSiguiente(nuevo);
        } else {
            raiz = nuevo;

        }
        ultimo = nuevo;
        indice++;

    }

    public void eliminar(int i) {
        Nodo<T> actual = raiz;
        if (i != 1) {
            for (int j = 1; j != i - 1; j++) {
                actual = actual.getSiguiente();
            }
            if (i == indice) {
                actual.setSiguiente(null);
                ultimo = actual;
            } else {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
            }
        } else {
            raiz = actual.getSiguiente();
        }
        indice--;

    }

    public void ls() {
        Nodo<T> apunta = raiz;
        while (apunta != null) {
            System.out.println(apunta.getDato());
            apunta = apunta.getSiguiente();
        }
    }

}
