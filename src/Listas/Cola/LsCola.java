/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.EstructDtos.Cola;

/**
 *
 * @author Fernando Flores
 * @param <T>
 */
public class LsCola<T> {

    private Nodo<T> raiz;
    private Nodo<T> ultimaEntrada;
    private int elementosDefinidos;
    private int totalElementos;

    public LsCola() {
        raiz = null;
        ultimaEntrada = null;
        elementosDefinidos = 0;
        totalElementos = 0;
    }

    public LsCola(int ElementosDefinidos) {
        this.elementosDefinidos = ElementosDefinidos;
        totalElementos = 0;
    }

    public void push(T elemento) {
        if (totalElementos <= elementosDefinidos - 1 || elementosDefinidos == 0) {
            Nodo<T> nuevo = new Nodo();
            nuevo.setDato(elemento);

            if (raiz == null) {
                raiz = nuevo;
            } else {
                ultimaEntrada.setSiguiente(nuevo);
            }
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

    public void setDefinirElementos(int elementosDefinidos) {
        this.elementosDefinidos = elementosDefinidos;
    }

    public int getTotalElementos() {
        return totalElementos;
    }

    public LsCola<T> copy() {
        Nodo<T> actual = raiz;
        LsCola<T> copi = new LsCola<>(this.getTotalElementos());
        while (actual != null) {
            copi.push(actual.getDato());
            actual = actual.getSiguiente();
        }
        return copi;
    }

    public String[] toArray() {
        LsCola<T> colacy = this.copy();
        String[] str = new String[totalElementos];
        for (int i = 0; i <= totalElementos - 1; i++) {
            str[i] = (String) colacy.top();
            colacy.pop();
        }
        return str;
    }

}
