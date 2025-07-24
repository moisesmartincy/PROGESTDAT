/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta3;

import java.util.*;

public class PilaTotal {
    private int MAX = 100;
    private NodoTotal v[] = new NodoTotal[MAX];
    private int tope;

    Scanner s = new Scanner(System.in);

    public PilaTotal() {
        tope = 0;
    }

    public boolean esVacia() {
        return (tope == 0);
    }

    public boolean esLlena() {
        return (tope == MAX);
    }

    public void adicionar(NodoTotal e) {
        if (this.esLlena()) {
            System.out.println("Pila llena");
        } else {
            tope++;
            v[tope] = e;
        }
    }

    public NodoTotal eliminar() {
        NodoTotal e = new NodoTotal();
        if (!this.esVacia()) {
            e = v[tope];
            tope = tope - 1;
        } else {
            System.out.println("Pila vacia");
        }
        return (e);
    }

    public void leer(int n) {
        for (int i = 1; i <= n; i++) {
            NodoTotal m = new NodoTotal();
            System.out.println("Creando arbol dia para NodoTotal " + i);
            ABDia ab = new ABDia();
            ab.crearPredisenadoSoloIzquierda(3); // Create 3 NodoDia for each NodoTotal
            m.setAb(ab);
            m.setId(i); // Set an ID for the NodoTotal
            adicionar(m);
        }
    }

    public void mostrar() {
        NodoTotal f;
        PilaTotal aux = new PilaTotal();
        while (!esVacia()) {
            f = eliminar();
            System.out.println("Mostrando ArbolDia del NodoTotal con ID: " + f.getId());
            f.getAb().recorridoNiveles();
            aux.adicionar(f);
        }
        this.vaciar(aux);
    }

    public int nroElem() {
        return (tope);
    }

    public void vaciar(PilaTotal p) {
        while (!p.esVacia()) {
            adicionar(p.eliminar());
        }
    }
}