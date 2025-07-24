/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lba.arbolbinario;

/**
 *
 * @author Asus
 */
public class ArbolBinario {
    static void sol1(AB a, AB b){
        int c=0;
        
       
        PilaN p1=new PilaN();
        
        PilaN aux=new PilaN();
        
        p1.adicionar(a.getR());
       
        while(!p1.esVacia()){
            
            while(!p1.esVacia()){
                Nodo_A x=new Nodo_A();
                        x=p1.eliminar();
                PilaN p2=new PilaN(); 
                PilaN aux2=new PilaN();
                p2.adicionar(b.getR());
                while(!p2.esVacia()){
                    while(!p2.esVacia()){
                         Nodo_A y=new Nodo_A();
                         y=p2.eliminar();
                         
                         if(y.getDato()==x.getDato()){
                             c++;
                         }
                         if(y.getIzq()!=null){
                         aux2.adicionar(y.getIzq());
                        }
                        if(y.getDer()!=null){
                        aux2.adicionar(y.getDer());
                        }
                    }
                    p2.vaciar(aux2);
                }
                PilaN aux3=new PilaN();
                aux2.vaciar(aux3);
                if(x.getIzq()!=null){
                    aux.adicionar(x.getIzq());
                }
                if(x.getDer()!=null){
                aux.adicionar(x.getDer());
                }
            }
            p1.vaciar(aux);
        }
        if(c==a.nroElems()){
            System.out.println("Todos los elementos de A estan en B"+c);
        }else{
            System.out.println("No todos los elementos de A estan en B"+c);
        }
    }
    
   
    public static void main(String[] args) {
        AB a=new AB();
        a.crear();
        AB b=new AB();
        b.crear();
        a.recorridoNiveles();
        b.recorridoNiveles();
        sol1(a,b);
        a.hojas();
    }
}
