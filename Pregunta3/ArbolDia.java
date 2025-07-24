/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta3;

/**
 *
 * @author HP
 */
import java.util.LinkedList;
import java.util.Queue;

public class ArbolDia {
    private NodoDia r;

    public ArbolDia() {
        r = null;
    }

    public NodoDia getR() {
        return r;
    }

    public void setR(NodoDia r) {
        this.r = r;
    }

    boolean esVacia() {
        return r == null;
    }

    // Recursive method to insert a predefined number of nodes, ensuring only left children are used
    public void insertarNodosSoloIzquierda(int count) {
        if (count > 0) {
            this.r = insertarNodosSoloIzquierdaRec(this.r, count, 1);
        }
    }

    private NodoDia insertarNodosSoloIzquierdaRec(NodoDia actual, int totalCount, int currentCount) {
        if (currentCount > totalCount) {
            return null;
        }

        NodoDia nuevo = new NodoDia();
        nuevo.setGasto(100.0 * currentCount); // Example gasto, can be randomized
        nuevo.setIzq(insertarNodosSoloIzquierdaRec(null, totalCount, currentCount + 1)); // Recursively set left child
        return nuevo;
    }

    void inorden() {
        inordenRec(r);
    }

    private void inordenRec(NodoDia nodo) {
        if (nodo != null) {
            inordenRec(nodo.getIzq());
            System.out.print(nodo.getGasto() + " ");
            inordenRec(nodo.getDer());
        }
    }

    void recorridoNiveles() {
        if (r == null) return;
        Queue<NodoDia> q = new LinkedList<>();
        q.add(r);
        while (!q.isEmpty()) {
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                NodoDia current = q.poll();
                System.out.print(current.getGasto() + "    ");
                if (current.getIzq() != null) {
                    q.add(current.getIzq());
                }
                if (current.getDer() != null) {
                    q.add(current.getDer());
                }
            }
            System.out.println();
        }
    }

    int nroElems() {
        return nroElemsRec(r);
    }

    private int nroElemsRec(NodoDia nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + nroElemsRec(nodo.getIzq()) + nroElemsRec(nodo.getDer());
    }
}   