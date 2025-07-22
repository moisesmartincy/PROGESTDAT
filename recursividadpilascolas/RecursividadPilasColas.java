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
public class RecursividadPilasColas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*RECURSIVIDAD: Sean las siguientes estructuras
        PILA DE PRODUCTOS(idProd, nombre,precio)
        COLA DE VENTAS(fecha, idProd, cantidad)
           */
        PilaProd A=new PilaProd();
        A.adicionar(new Producto(11,"cuaderno",35));
        A.adicionar(new Producto(15,"lapiz",1));
        A.adicionar(new Producto(21,"regla",5));
        A.adicionar(new Producto(19,"libro",35));
        A.adicionar(new Producto(10,"carpeta",12));
        //1.
        System.out.println("PROCEDIMIENTO1 RECURSIVO");
        PilaProd B=new PilaProd();
        mostrar2(A,B);
        System.out.println("PROCEDIMIENTO2 RECURSIVO");
        copiar(A,B);
        mostrar(A);
        //System.out.println("METODO RECURSIVO");
        //B.mostrar();
        copiar(B,A);
        //2. determinar el mayor precio y mostrar
        //productos con el mayor precio
        int m=mayor(A); 
        copiar(B,A);
        prodMayor(A,m);
        //3. Verificar si existe el producto con nombre X
        //4. Mostrar la Cola de Ventas Recursivamente
        //5. Mostrar la cantidad total vendida del 
        //producto con nombre X
        //5. Mostrar las ventas de cada producto
    }
    public static void copiar(PilaProd a, PilaProd b)
    {
        PilaProd aux=new PilaProd();
        aux.vaciar(a);
        while(!aux.esvacia())
        {
            Producto x=aux.eliminar();
            a.adicionar(x);
            b.adicionar(x);
        }
        
    }
    public static void mostrar(PilaProd a)
    {
        if(!a.esvacia())
        {
            Producto x=a.eliminar();
            x.mostrar();
            mostrar(a);
            
        }
    }
    public static void mostrar2(PilaProd a, PilaProd b)
    {
        if(!a.esvacia())
        {
            Producto x=a.eliminar();
            x.mostrar();
            b.adicionar(x);
            mostrar2(a,b);
        }
        else
            a.vaciar(b);
    }
    public static int mayor(PilaProd a)
    {
        if(!a.esvacia())
        {
            Producto x=a.eliminar();
            int may=mayor(a);
            if(x.getPrecio()>may)
                return x.getPrecio();
            return may;
        }
        else
            return 0;
    }
    public static void prodMayor(PilaProd a, int m)
    {
        if(!a.esvacia())
        {
            Producto x=a.eliminar();
            if(x.getPrecio()==m)
                x.mostrar();
            prodMayor(a,m);
        }
    }
}
