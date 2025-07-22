/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaobjetos;

/**
 *
 * @author estudiante
 */
public class Venta {
    private String fecha,cod;
    private int cantidad;
    
    Venta(String a, String b, int c)
    {
        fecha=a;
        cod=b;
        cantidad=c;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void mostrar()
    {
        System.out.println(fecha+" "+cod+" "+cantidad);
    }
    
}
