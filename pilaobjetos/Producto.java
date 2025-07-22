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
public class Producto {
    private String cod,nombre;
    private int precio,stock;
    
    Producto(String a, String b, int c, int d)
    {
        cod=a;
        nombre=b;
        precio=c;
        stock=d;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public void mostrar()
    {
        System.out.println(cod+" "+nombre+" "+precio+" "+stock);
    }
    
}
