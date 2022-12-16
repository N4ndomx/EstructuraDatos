/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.EstructDtos.Pila;


/**
 *
 * @author Fernando Flores
 */
class Nodo<T> {

    private T dato;
    private Nodo<T> siguiente;

    public Nodo() {
        dato = null;
        siguiente = null;
    }

    public Nodo(T dato, Nodo sig) {
        this.dato = dato;
        this.siguiente = sig;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
