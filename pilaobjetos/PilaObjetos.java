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
public class PilaObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PilaProd A=new PilaProd();
        A.adicionar(new Producto("p3","azucar",4,20));
        A.adicionar(new Producto("p1","fideo",2,40));
        
        A.adicionar(new Producto("p5","arroz",7,155));
        A.adicionar(new Producto("p6","pan",1,16));
        A.adicionar(new Producto("p9","aceite",10,67));
        A.mostrar();
        
        PilaVen B=new PilaVen();
        B.adicionar(new Venta("1/1/2025","p3",2));
        B.adicionar(new Venta("1/1/2025","p3",1));
        B.adicionar(new Venta("2/1/2025","p3",5));
        B.adicionar(new Venta("2/1/2025","p6",2));
        B.adicionar(new Venta("2/1/2025","p9",3));
        B.adicionar(new Venta("3/1/2025","p3",8));
        B.adicionar(new Venta("3/1/2025","p1",1));
        B.adicionar(new Venta("4/1/2025","p3",2));
        B.mostrar();
        System.out.println("problema 2");
        Problema2(A,B);
        System.out.println("problema 4");
        Problema4(A,B);
        A.mostrar();
        B.mostrar();
        Problema6(A,B,"pan","1/1/2025");
        /*
        PROBLEMAS
1.	Mostrar a los productos con el mayor stock
2.	Determinar la cantidad vendida de cada producto
3.	Mostrar a los productos que no se vendieron
4.	Llevar todas las ventas del primer producto al principio
5.	Calcular el costo del producto con nombre X
6.	Verificar si el producto con nombre X se vendió en la fecha Y

        */
    }
    public static void Problema2(PilaProd a, PilaVen b)
    {
        PilaProd aa=new PilaProd();
        PilaVen bb=new PilaVen();
        aa.vaciar(a);
        while(!aa.esvacia())
        {
            Producto x=aa.eliminar();
            int cant=0;
            while(!b.esvacia())
            {
                Venta y=b.eliminar();
                if(y.getCod().equals(x.getCod()))
                    cant=cant+y.getCantidad();
                bb.adicionar(y);
            }
            System.out.println("Producto :"+x.getNombre()+" Cantidad "+cant);
            b.vaciar(bb);
            a.adicionar(x);
        }
        
        
    }
    public static void Problema4(PilaProd a, PilaVen b)
    {
        PilaProd aa=new PilaProd();
        PilaVen bb=new PilaVen();
        PilaVen bbb=new PilaVen();
        aa.vaciar(a);
        Producto primer=aa.eliminar();
        while(!b.esvacia())
        {
            Venta v=b.eliminar();
            if(v.getCod().equals(primer.getCod()))
                bb.adicionar(v);
            else
                bbb.adicionar(v);
        }
        b.vaciar(bb);
        b.vaciar(bbb);
        a.adicionar(primer);
        a.vaciar(aa);
    }
    public static void Problema6(PilaProd a, PilaVen b, String x, String y)
    {
        boolean sw=false;
        String codi="";
        PilaProd aa=new PilaProd();
        PilaVen bb=new PilaVen();
        while(!a.esvacia())
        {
            Producto px=a.eliminar();
            if(px.getNombre().equals(x))
                codi=px.getCod();
            aa.adicionar(px);
        }
        while(!b.esvacia())
        {
            Venta vx=b.eliminar();
            if(vx.getCod().equals(codi) && vx.getFecha().equals(y))
                sw=true;
            bb.adicionar(vx);
        }
        a.vaciar(aa);
        b.vaciar(bb);
        if(sw)
            System.out.println("Existe..");
        else
            System.out.println("No existe..");
    }
}
