/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasimple;

/**
 *
 * @author HP
 */
public class Nodo {
    private int dato;
    private Nodo sig;
    public Nodo(){
        dato=0;
        sig=null;
    }

    public int getDato() {
        return dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
}
