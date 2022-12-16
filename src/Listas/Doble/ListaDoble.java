/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas.Doble;

/**
 *
 * @author Fernando Flores
 */
public class ListaDoble {

    private Nodo raiz;
    private Nodo ultimo;
    private int indice = 0;

    public void addUp(String n) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(n);
        nuevo.setSiguiente(raiz);
        if (raiz != null) {
            raiz.setAnterior(nuevo);
        } else {
            ultimo = nuevo;
        }
        raiz = nuevo;
        indice++;

    }

    public void addDown(String n) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(n);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            nuevo.setAnterior(ultimo);
            ultimo.setSiguiente(nuevo);
        }
        ultimo = nuevo;
        indice++;
    }

    public void eliminar(int i) {
        Nodo actual = raiz;
        int cont = 1;
        if (i == indice) {
            eliminarUltimo();
        } else if (i == 1) {
            eliminarPrimer();
        } else {
            while (cont != i) {
                actual = actual.getSiguiente();
                cont++;
            }
            actual.getAnterior().setSiguiente(actual.getSiguiente());
            actual.getSiguiente().setAnterior(actual.getAnterior());
        }
        indice--;
    }

    public String obtner(int i) {
        Nodo actual = raiz;

        for (int j = 1; j != i; j++) {
            actual = actual.getSiguiente();
        }

        return actual.getDato();
    }

    public boolean Buscar(String dato) {
        boolean ban = false;
        Nodo actual = raiz;
        while (actual != null) {
            if (actual.getDato().equals(dato)) {
                actual = null;
                ban = true;
            } else {
                actual = actual.getSiguiente();
            }
        }
        return ban;

    }

    private void eliminarPrimer() {
        Nodo actual = raiz;
        actual.getSiguiente().setAnterior(null);
        raiz = actual.getSiguiente();
    }

    private void eliminarUltimo() {
        ultimo.getAnterior().setSiguiente(null);
        ultimo = ultimo.getAnterior();
    }

    public void mostrar() {
        Nodo actual = raiz;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }

    }

    public void mInverso() {
        Nodo actual = raiz;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }

        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getAnterior();
        }

    }

}
