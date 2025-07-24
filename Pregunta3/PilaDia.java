/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta3;
import java.util.*;

public class PilaDia {
    private int MAX = 100;
    private NodoDia v[] = new NodoDia[MAX];
    private int tope;

    Scanner s = new Scanner(System.in);

    public PilaDia() {
        tope = 0;
    }

    public boolean esVacia() {
        return (tope == 0);
    }

    public boolean esLlena() {
        return (tope == MAX);
    }

    public void adicionar(NodoDia e) {
        if (this.esLlena()) {
            System.out.println("Pila llena");
        } else {
            tope++;
            v[tope] = e;
        }
    }

    public NodoDia eliminar() {
        NodoDia e = new NodoDia();
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
            NodoDia m = new NodoDia();
            System.out.println("Introduzca un gasto");
            double g = s.nextDouble();
            m.setGasto(g);
            adicionar(m);
        }
    }

    public void mostrar() {
        NodoDia f;
        PilaDia aux = new PilaDia();
        while (!esVacia()) {
            f = eliminar();
            System.out.println(f.getGasto());
            aux.adicionar(f);
        }
        this.vaciar(aux);
    }

    public int nroElem() {
        return (tope);
    }

    public void vaciar(PilaDia p) {
        while (!p.esVacia()) {
            adicionar(p.eliminar());
        }
    }
}