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
public class PilaProd {
    //this
    private int max=50;
    private Producto v[]=new Producto[max+1];
    private int tope;
    
    PilaProd()
    {
        tope=0;
    }
    boolean esvacia ()
    {
	if (tope == 0)
	    return (true);
	return (false);
    }
    boolean esllena ()
    {
	if (tope == max)
	    return (true);
	return (false);
    }
    int nroelem ()
    {
	return (tope);
    }
    void adicionar (Producto elem)
    {
	if (!esllena ())
	{
	    tope++;
	    v [tope] = elem;
	}
	else
	    System.out.println ("Pila llena");
    }


    Producto eliminar ()
    {
	Producto elem = null;
	if (!esvacia ())
	{
	    elem = v [tope];
	    tope--;
	}
	else
	    System.out.println ("Pila vacia");
	return (elem);
    }
    void mostrar ()
    {//recursivo
	if(!esvacia())
        {
            Producto x=eliminar();
            x.mostrar();
            mostrar();
        }
    }

    void vaciar (PilaProd a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());

    }
    
}
