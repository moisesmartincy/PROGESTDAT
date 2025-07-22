/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividadpilascolas;

/**
 *
 * @author estudiante
 */
public class Venta {
    private String fecha;
    private int idProd,cantidad;
    
    Venta(String a, int b, int c)
    {
        fecha=a;
        idProd=b;
        cantidad=c;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void mostrar()
    {
        System.out.println(fecha+" "+idProd+" "+cantidad);
    }
}
