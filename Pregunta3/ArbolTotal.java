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

public class ArbolTotal {
    private NodoTotal r;

    public ArbolTotal() {
        r = null;
    }

    public NodoTotal getR() {
        return r;
    }

    public void setR(NodoTotal r) {
        this.r = r;
    }

    boolean esVacia() {
        return r == null;
    }

    // Recursive method to insert a NodoTotal, ensuring only left children are used
    public void insertarNodoTotalSoloIzquierda(int id, int numNodosDia) {
        r = insertarNodoTotalSoloIzquierdaRec(r, id, numNodosDia);
    }

    private NodoTotal insertarNodoTotalSoloIzquierdaRec(NodoTotal actual, int id, int numNodosDia) {
        if (actual == null) {
            NodoTotal nuevo = new NodoTotal();
            nuevo.setId(id);
            // Create the predefined NodoDia tree with only left children
            nuevo.getAb().crearPredisenadoSoloIzquierda(numNodosDia);
            return nuevo;
        }
        // Always go to the left
        actual.setIzq(insertarNodoTotalSoloIzquierdaRec(actual.getIzq(), id, numNodosDia));
        return actual;
    }

    void inorden() {
        inordenRec(r);
    }

    private void inordenRec(NodoTotal nodo) {
        if (nodo != null) {
            inordenRec(nodo.getIzq());
            System.out.println("--- NodoTotal ID: " + nodo.getId() + " ---");
            System.out.println("ArbolDia en NodoTotal (Inorden):");
            nodo.getAb().inorden();
            System.out.println();
            inordenRec(nodo.getDer());
        }
    }

    void recorridoNiveles() {
        if (r == null) return;
        Queue<NodoTotal> q = new LinkedList<>();
        q.add(r);
        int level = 0;
        while (!q.isEmpty()) {
            System.out.println("\n--- Nivel " + level + " del ArbolTotal ---");
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                NodoTotal current = q.poll();
                System.out.println("NodoTotal ID: " + current.getId());
                System.out.println("  ArbolDia (Recorrido por niveles):");
                current.getAb().recorridoNiveles();
                if (current.getIzq() != null) {
                    q.add(current.getIzq());
                }
                if (current.getDer() != null) {
                    q.add(current.getDer());
                }
            }
            level++;
        }
    }

    int nroElems() {
        return nroElemsRec(r);
    }

    private int nroElemsRec(NodoTotal nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + nroElemsRec(nodo.getIzq()) + nroElemsRec(nodo.getDer());
    }
}