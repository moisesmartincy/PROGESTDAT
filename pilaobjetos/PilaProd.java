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
public class PilaProd {
    private int max=100;
    private Producto v[]=new Producto[max+1];
    private int tope;
    
    PilaProd ()
    {
	tope = 0;
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
    {
	Producto elem;
	if (esvacia ())
	    System.out.println ("Pila vacia");
	else
	{
	    System.out.println ("\n Productos de la Pila ");
	    PilaProd aux = new PilaProd ();
	    while (!esvacia ())
	    {
		elem = eliminar ();
		aux.adicionar (elem);
		elem.mostrar();
	    }
	    vaciar(aux);
	}
    }
    void vaciar (PilaProd a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());

    }
}
