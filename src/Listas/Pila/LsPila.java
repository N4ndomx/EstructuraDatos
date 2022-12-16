/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.EstructDtos.Pila;

/**
 *
 * @author Fernando Flores
 */
public class LsPila<T> {

    private Nodo<T> raiz;
    private Nodo<T> ultimaEntrada;
    private int elementosDefinidos;
    private int totalElementos;

    public LsPila() {
        raiz = null;
        ultimaEntrada = null;
        elementosDefinidos = 0;
        totalElementos = 0;
    }

    public LsPila(int ElementosDefinidos) {
        this.elementosDefinidos = ElementosDefinidos;
        totalElementos = 0;
    }

    public void push(T elemento) {

        if (totalElementos <= elementosDefinidos - 1 || elementosDefinidos == 0) {
            Nodo<T> nuevo = new Nodo(elemento, raiz);
            raiz = nuevo;
            ultimaEntrada = nuevo;
            totalElementos++;
        }
    }

    public void pop() {
        Nodo<T> aux = raiz.getSiguiente();
        raiz = aux;
        totalElementos--;
    }

    public boolean isEmpy() {
        return raiz == null;
    }

    public boolean isfull() {
        return raiz != null;
    }

    public void clear() {
        raiz = null;
        ultimaEntrada = null;
        totalElementos = 0;
    }

    public T top() {
        Nodo<T> actual = raiz;
        return actual.getDato();
    }

    public void view() {

        Nodo<T> actual = raiz;
        while (actual.getSiguiente() != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();

        }
        System.out.println(actual.getDato() + "\n");
    }

    public int getTamañoPila() {
        return elementosDefinidos;
    }

    public int getTotalElementos() {
        return totalElementos;
    }

    public LsPila<T> copy() {
        Nodo<T> actual = raiz;
        LsPila<T> copi = new LsPila<>(this.getTotalElementos());
        while (actual != null) {
            copi.push(actual.getDato());
            actual = actual.getSiguiente();
        }
        return copi;
    }

    public String[] toArray() {
        LsPila<T> pi = copy();
        String[] str = new String[totalElementos];
        for (int i = 0; i <= totalElementos - 1; i++) {
            str[i] = (String) pi.top();
            pi.pop();
        }
        return str;
    }

}
