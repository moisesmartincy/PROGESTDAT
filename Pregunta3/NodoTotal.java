/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta3;

/**
 *
 * @author HP
 */
public class NodoTotal {
    private ABDia ab;
    private NodoTotal izq;
    private NodoTotal der;
    private int id; // Added to store an identifier for the NodoTotal

    public NodoTotal() {
        izq = der = null;
        ab = new ABDia();
        id = 0; // Default ID
    }

    public ABDia getAb() {
        return ab;
    }

    public NodoTotal getDer() {
        return der;
    }

    public NodoTotal getIzq() {
        return izq;
    }

    public int getId() {
        return id;
    }

    public void setAb(ABDia ab) {
        this.ab = ab;
    }

    public void setDer(NodoTotal der) {
        this.der = der;
    }

    public void setIzq(NodoTotal izq) {
        this.izq = izq;
    }

    public void setId(int id) {
        this.id = id;
    }
}