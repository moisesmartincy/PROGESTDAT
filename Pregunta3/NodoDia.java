/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta3;

/**
 *
 * @author HP
 */
public class NodoDia {
    private double gasto;
    private NodoDia izq;
    private NodoDia der;

    public NodoDia() {
        izq = der = null;
        gasto = 0;
    }

    public NodoDia getDer() {
        return der;
    }

    public double getGasto() {
        return gasto;
    }

    public NodoDia getIzq() {
        return izq;
    }

    public void setDer(NodoDia der) {
        this.der = der;
    }

    public void setGasto(double gasto) {
        this.gasto = gasto;
    }

    public void setIzq(NodoDia izq) {
        this.izq = izq;
    }
}