/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lba.arbolbinario;

/**
 *
 * @author Asus
 */
public class Nodo_A {
    private Nodo_A izq;
    private Nodo_A der;
    private int dato;
    public Nodo_A(){
        izq=der=null;
    }

    public Nodo_A getIzq() {
        return izq;
    }

    public Nodo_A getDer() {
        return der;
    }

    public int getDato() {
        return dato;
    }

    public void setIzq(Nodo_A izq) {
        this.izq = izq;
    }

    public void setDer(Nodo_A der) {
        this.der = der;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
}
