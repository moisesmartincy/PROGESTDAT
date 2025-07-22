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
public class PilaVen {
    private int max=100;
    private Venta v[]=new Venta[max+1];
    private int tope;
    
    PilaVen ()
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
    void adicionar (Venta elem)
    {
	if (!esllena ())
	{
	    tope++;
	    v [tope] = elem;
	}
	else
	    System.out.println ("Pila llena");
    }
    Venta eliminar ()
    {
	Venta elem = null;
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
	Venta elem;
	if (esvacia ())
	    System.out.println ("Pila vacia");
	else
	{
	    System.out.println ("\n Ventas de la Pila ");
	    PilaVen aux = new PilaVen ();
	    while (!esvacia ())
	    {
		elem = eliminar ();
		aux.adicionar (elem);
		elem.mostrar();
	    }
	    vaciar(aux);
	}
    }
    void vaciar (PilaVen a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());

    }
}
