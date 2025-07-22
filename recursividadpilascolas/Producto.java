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
public class Producto {
    private int idProd,precio;
    private String nombre;
    
    Producto(int a, String b, int c)
    {
        idProd=a;
        nombre=b;
        precio=c;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrar()
    {
        System.out.println(idProd+" "+nombre+" "+precio);
    }
    
}
