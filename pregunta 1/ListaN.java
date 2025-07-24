/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasimple;


import java.util.Scanner;

public class ListaN extends ListaS {
    Scanner s = new Scanner(System.in);

    public ListaN() {
        super();
    }

    public boolean esVacia() {
        return getP() == null;
    }

    public void adiUltimo(int d) {
        Nodo x = new Nodo();
        x.setDato(d);

        if (esVacia()) {
            setP(x);
        } else {
            Nodo y = getP();
            while (y.getSig() != null) {
                y = y.getSig();
            }
            y.setSig(x);
        }
    }

    public void leer2(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese un número para el nodo " + i + ": ");
            int d = s.nextInt();
            adiUltimo(d);
        }
    }

    public Nodo eliUltimo() {
        Nodo x = getP();
        Nodo y = getP();

        if (!esVacia()) {
            if (x.getSig() == null) { 
                setP(null);
            } else {
                while (x.getSig() != null) {
                    y = x;
                    x = x.getSig();
                }
                y.setSig(null);
            }
        }
        return x;
    }

    public void mostrar() {
        Nodo x = getP();
        if (esVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }
        System.out.println("--- DATO ---");
        while (x != null) {
            System.out.println(x.getDato());
            x = x.getSig();
        }
    }

    
    public int countNodesRecursive() {
        return countNodesRecursive(getP()); 
    }

    private int countNodesRecursive(Nodo current) {
        
        if (current == null) {
            return 0;
        }
        
        return 1 + countNodesRecursive(current.getSig());
    }
}