/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas.CircSimple;

import Listas.Simple.*;

/**
 *
 * @author Fernando Flores
 */
public class Nodo {

    private String dato;
    private Nodo siguiente;

    public Nodo(String dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Nodo() {
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
